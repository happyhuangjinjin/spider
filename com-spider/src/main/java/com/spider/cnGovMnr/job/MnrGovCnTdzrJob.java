package com.spider.cnGovMnr.job;

import java.util.ArrayList;
import java.util.List;import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.spider.cnGovMnr.dto.TdzrDetailDto;
import com.spider.cnGovMnr.mapper.TdzrDetailMapper;
import com.spider.cnGovMnr.page.vo.TdzrDetailPageVo;
import com.spider.cnGovMnr.page.vo.TdzrListPageVo;
import com.xuxueli.crawler.XxlCrawler;
import com.xuxueli.crawler.parser.PageParser;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;

/**
 * 土地转让
 * 
 * @author 2230
 *
 */
@Component
public class MnrGovCnTdzrJob {

	private Logger logger = LoggerFactory.getLogger(MnrGovCnTdzrJob.class);
	
	//列表页数据获取
	String baseListURL = "http://landchina.mnr.gov.cn/scjy/tdzr/";
	//详细页数据获取
	String baseDetailUrl = "http://landchina.mnr.gov.cn/scjy/tdzr/";
	
	//开始页数
	int startPageNum = 0;
	
	//结束页数
	int endPageNum = 1;
	
	@Autowired
	private TdzrDetailMapper tdzrDetailMapper;
	
	/**
	 * 土地转让
	 * 
	 * http://landchina.mnr.gov.cn/scjy/tdzr/
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
    @XxlJob("doMnrGovCnTdzrJob")
    public ReturnT<String> doMnrGovCnTdzrJob(String param) throws Exception {
    	if(!StringUtils.isEmpty(param)){
    		Map<String, String> map = JSON.parseObject(param, Map.class);
    		try {
    			startPageNum = Integer.parseInt(map.get("startPageNum"));
			} catch (Exception e) {
			}
    		
    		try {
    			endPageNum = Integer.parseInt(map.get("endPageNum"));
			} catch (Exception e) {
			}
    	}
    	List<TdzrListPageVo> tdzrListPageVoList = new ArrayList<TdzrListPageVo>();
    	//列表页数据获取
    	for(int i=startPageNum; i<=endPageNum; i++){
    		String url = null;
    		if(i==0){
    			url = baseListURL + "index.htm";
    		}else{
    			url = baseListURL + "index_" + i + ".htm";
    		}
        	XxlCrawler crawler = new XxlCrawler.Builder()
        		    .setUrls(url)
        		    .setAllowSpread(false) //允许扩散爬取，将会以现有URL为起点扩散爬取整站
        		    .setThreadCount(1)
        		    .setPageParser(new PageParser<TdzrListPageVo>() {
        		        @Override
        		        public void parse(Document html, Element pageVoElement, TdzrListPageVo tdzrListPageVo) {
        		            // 解析封装 PageVo 对象
        		            logger.info("pageUrl: " + html.baseUri());
        		            logger.info("tdcrPageVo: " + tdzrListPageVo);
        		            tdzrListPageVoList.add(tdzrListPageVo);
        		        }
        		    })
        		    .build();
        	crawler.start(true);
        	
        	try {
				Thread.sleep(5000);
			} catch (Exception e) {
			}
    	}
    	
    	logger.info("tdcrPageVoList size: " + tdzrListPageVoList.size());
    	
    	//详细页数据获取
    	for(int i=0; i<tdzrListPageVoList.size(); i++){
    		TdzrListPageVo tdcrPageVo = tdzrListPageVoList.get(i);
    		String url = baseDetailUrl + tdcrPageVo.getUrl().substring(2);
        	XxlCrawler crawler = new XxlCrawler.Builder()
        		    .setUrls(url)
        		    .setAllowSpread(false) //允许扩散爬取，将会以现有URL为起点扩散爬取整站
        		    .setThreadCount(1)
        		    .setPageParser(new PageParser<TdzrDetailPageVo>() {
        		        @Override
        		        public void parse(Document html, Element pageVoElement, TdzrDetailPageVo tdzrDetailPageVo) {
        		            // 解析封装 PageVo 对象
        		        	logger.info("pageUrl: " + html.baseUri());
        		        	logger.info("tdzrDetailPageVo: " + tdzrDetailPageVo);
        		        	
        		        	TdzrDetailDto record = new TdzrDetailDto();
        		        	try {
        		        		record.setUrl(html.baseUri());
								BeanUtils.copyProperties(record, tdzrDetailPageVo);
								tdzrDetailMapper.insert(record);
							} catch (Exception e) {
								logger.error("tdzrDetailPageVo parse：", e);
							}
        		        }
        		    })
        		    .build();
        	crawler.start(true);
        	
        	try {
				Thread.sleep(5000);
			} catch (Exception e) {
			}
    	}
    	
        return ReturnT.SUCCESS;
    }
    
    public static void main(String[] args) {
    	MnrGovCnTdzrJob mm = new MnrGovCnTdzrJob();
    	try {
			mm.doMnrGovCnTdzrJob(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
}
