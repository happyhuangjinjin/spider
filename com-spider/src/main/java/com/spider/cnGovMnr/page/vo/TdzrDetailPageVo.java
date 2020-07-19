package com.spider.cnGovMnr.page.vo;

import com.alibaba.fastjson.JSON;
import com.xuxueli.crawler.annotation.PageFieldSelect;
import com.xuxueli.crawler.annotation.PageSelect;

@PageSelect(cssQuery = "body > div.gu-wrap > div > div.gu-art-con > table > tbody")
public class TdzrDetailPageVo {
	
	//宗地编号
	@PageFieldSelect(cssQuery = "tr:nth-child(2) > td:nth-child(2)")
	private String code;
	
	//宗地座落
	@PageFieldSelect(cssQuery = "tr:nth-child(3) > td:nth-child(2)")
	private String address;
	
	//原土地使用权人
	@PageFieldSelect(cssQuery = "tr:nth-child(4) > td:nth-child(2)")
	private String srcUser;
	
	//土地面积(公顷)
	@PageFieldSelect(cssQuery = "tr:nth-child(5) > td:nth-child(2)")
	private String area;
	
	//土地使用权类型
	@PageFieldSelect(cssQuery = "tr:nth-child(6) > td:nth-child(2)")
	private String addrType;
	
	//土地利用状况
	@PageFieldSelect(cssQuery = "tr:nth-child(7) > td:nth-child(2)")
	private String status;
	
	//转让方式
	@PageFieldSelect(cssQuery = "tr:nth-child(8) > td:nth-child(2)")
	private String type;
	
	//成交日期 
	@PageFieldSelect(cssQuery = "tr:nth-child(9) > td:nth-child(2)")
	private String dealDate;
	
	//所在行政区
	@PageFieldSelect(cssQuery = "tr:nth-child(2) > td:nth-child(4)")
	private String city;
	
	//现土地使用权人
	@PageFieldSelect(cssQuery = "tr:nth-child(4) > td:nth-child(4)")
	private String targetUser;
	
	//土地用途
	@PageFieldSelect(cssQuery = "tr:nth-child(5) > td:nth-child(4)")
	private String useType;
	
	//土地使用年限
	@PageFieldSelect(cssQuery = "tr:nth-child(6) > td:nth-child(4)")
	private Integer useYear;
	
	//土地级别
	@PageFieldSelect(cssQuery = "tr:nth-child(7) > td:nth-child(4)")
	private String level;
	
	//转让价格(万元)
	@PageFieldSelect(cssQuery = "tr:nth-child(8) > td:nth-child(4)")
	private String price;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSrcUser() {
		return srcUser;
	}

	public void setSrcUser(String srcUser) {
		this.srcUser = srcUser;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAddrType() {
		return addrType;
	}

	public void setAddrType(String addrType) {
		this.addrType = addrType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDealDate() {
		return dealDate;
	}

	public void setDealDate(String dealDate) {
		this.dealDate = dealDate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTargetUser() {
		return targetUser;
	}

	public void setTargetUser(String targetUser) {
		this.targetUser = targetUser;
	}

	public String getUseType() {
		return useType;
	}

	public void setUseType(String useType) {
		this.useType = useType;
	}

	public Integer getUseYear() {
		return useYear;
	}

	public void setUseYear(Integer useYear) {
		this.useYear = useYear;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
}
