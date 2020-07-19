package com.spider.cnGovMnr.page.vo;

import com.alibaba.fastjson.JSON;
import com.xuxueli.crawler.annotation.PageFieldSelect;
import com.xuxueli.crawler.annotation.PageSelect;
import com.xuxueli.crawler.conf.XxlCrawlerConf.SelectType;

@PageSelect(cssQuery = "body > div.gu-wrap > div > div.gu-sidebar_r.fr > div.gu-ky-list > ul > li")
public class Hbgd1ListPageVo {
	
	@PageFieldSelect(cssQuery = "a")
	private String title;

	@PageFieldSelect(cssQuery = "a", selectType = SelectType.ATTR, selectVal = "href")
	private String url;

	@PageFieldSelect(cssQuery = "span")
	private String sdate;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	
	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
}
