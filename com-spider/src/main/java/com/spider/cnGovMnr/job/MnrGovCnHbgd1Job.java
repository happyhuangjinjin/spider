package com.spider.cnGovMnr.job;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.spider.cnGovMnr.dto.Hbgd1DetailDto;
import com.spider.cnGovMnr.mapper.Hbgd1DetailMapper;
import com.spider.cnGovMnr.page.vo.Hbgd1DetailPageVo;
import com.spider.cnGovMnr.page.vo.Hbgd1ListPageVo;
import com.xuxueli.crawler.XxlCrawler;
import com.xuxueli.crawler.parser.PageParser;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;

/**
 * 划拨供地
 * 
 * http://landchina.mnr.gov.cn/land/jggg/hbgd1/
 * 
 * @author 2230
 *
 */
@Component
public class MnrGovCnHbgd1Job {

	private Logger logger = LoggerFactory.getLogger(MnrGovCnTdzrJob.class);
	
	//列表页数据获取
	String baseListURL = "http://landchina.mnr.gov.cn/land/jggg/hbgd1/";
	//详细页数据获取
	String baseDetailUrl = "http://landchina.mnr.gov.cn/land/jggg/hbgd1/";
	
	//开始页数
	int startPageNum = 0;
	
	//结束页数
	int endPageNum = 1;
	
	@Autowired
	private Hbgd1DetailMapper hbgd1DetailMapper;
	
	@XxlJob("doMnrGovCnHbgd1Job")
    public ReturnT<String> doMnrGovCnHbgd1Job(String param) throws Exception {
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
    	List<Hbgd1ListPageVo> hbgd1ListPageVoList = new ArrayList<Hbgd1ListPageVo>();
    	
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
        		    .setPageParser(new PageParser<Hbgd1ListPageVo>() {
        		        @Override
        		        public void parse(Document html, Element pageVoElement, Hbgd1ListPageVo hbgd1ListPageVo) {
        		            // 解析封装 PageVo 对象
        		            logger.info("pageUrl: " + html.baseUri());
        		            logger.info("tdcrPageVo: " + hbgd1ListPageVo);
        		            hbgd1ListPageVoList.add(hbgd1ListPageVo);
        		        }
        		    })
        		    .build();
        	crawler.start(true);
        	
        	try {
				Thread.sleep(5000);
			} catch (Exception e) {
			}
    	}
    	
    	//详细页数据获取
    	for(int i=0; i<hbgd1ListPageVoList.size(); i++){
    		Hbgd1ListPageVo hbgd1ListPageVo = hbgd1ListPageVoList.get(i);
    		String url = baseDetailUrl + hbgd1ListPageVo.getUrl().substring(2);
        	XxlCrawler crawler = new XxlCrawler.Builder()
        		    .setUrls(url)
        		    .setAllowSpread(false) //允许扩散爬取，将会以现有URL为起点扩散爬取整站
        		    .setThreadCount(1)
        		    .setPageParser(new PageParser<Hbgd1DetailPageVo>() {
        		        @Override
        		        public void parse(Document html, Element pageVoElement, Hbgd1DetailPageVo hbgd1DetailPageVo) {
        		            // 解析封装 PageVo 对象
        		        	logger.info("pageUrl: " + html.baseUri());
        		        	logger.info("hbgd1DetailPageVo: " + hbgd1DetailPageVo);
        		        	
        		        	Hbgd1DetailDto record = new Hbgd1DetailDto();
        		        	try {
        		        		record.setUrl(html.baseUri());
								BeanUtils.copyProperties(record, hbgd1DetailPageVo);
								hbgd1DetailMapper.insert(record);
							} catch (Exception e) {
								logger.error("hbgd1DetailPageVo parse：", e);
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
    	
    	logger.info("tdcrPageVoList size: " + hbgd1ListPageVoList.size());
		
		return ReturnT.SUCCESS;
	}
	
}
