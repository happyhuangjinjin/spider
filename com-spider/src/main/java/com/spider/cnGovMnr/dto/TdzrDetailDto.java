package com.spider.cnGovMnr.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.alibaba.fastjson.JSON;

/**
 * 土地转让
 * 
 * @author 2230
 *
 */
@Table(name="cn_gov_mnr_tdzr")
public class TdzrDetailDto {
	
	//宗地编号
	@Column(name="code")
	private String code;
	
	//宗地座落
	@Column(name="address")
	private String address;
	
	//原土地使用权人
	@Column(name="src_user")
	private String srcUser;
	
	//土地面积(公顷)
	@Column(name="area")
	private String area;
	
	//土地使用权类型
	@Column(name="addr_type")
	private String addrType;
	
	//土地利用状况
	@Column(name="status")
	private String status;
	
	//转让方式
	@Column(name="type")
	private String type;
	
	//成交日期 
	@Column(name="deal_date")
	private String dealDate;
	
	//所在行政区
	@Column(name="city")
	private String city;
	
	//现土地使用权人
	@Column(name="target_user")
	private String targetUser;
	
	//土地用途
	@Column(name="use_type")
	private String useType;
	
	//土地使用年限
	@Column(name="use_year")
	private Integer useYear;
	
	//土地级别
	@Column(name="level")
	private String level;
	
	//转让价格(万元)
	@Column(name="price")
	private String price;
	
	//信息网址
	@Column(name="url")
	@Id
	private String url;

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
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
}
