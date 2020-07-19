package com.spider.cnGovMnr.page.vo;

import com.alibaba.fastjson.JSON;
import com.xuxueli.crawler.annotation.PageFieldSelect;
import com.xuxueli.crawler.annotation.PageSelect;

@PageSelect(cssQuery = "body > div.gu-wrap > div > div.gu-art-con > table > tbody")
public class Hbgd1DetailPageVo {

	//行政区
	@PageFieldSelect(cssQuery = "tr:nth-child(2) > td:nth-child(2)")
	private String city;
	
	//项目名称
	@PageFieldSelect(cssQuery = "tr:nth-child(3) > td:nth-child(2)")
	private String projectName;
	
	//项目位置
	@PageFieldSelect(cssQuery = "tr:nth-child(4) > td:nth-child(2)")
	private String position;
	
	//供应面积(公顷)
	@PageFieldSelect(cssQuery = "tr:nth-child(5) > td:nth-child(2)")
	private String area;
	
	//土地用途
	@PageFieldSelect(cssQuery = "tr:nth-child(6) > td:nth-child(2)")
	private String useType;
	
	//土地使用年限
	@PageFieldSelect(cssQuery = "tr:nth-child(7) > td:nth-child(2)")
	private Integer useYear;
	
	//土地级别
	@PageFieldSelect(cssQuery = "tr:nth-child(8) > td:nth-child(2)")
	private String level;
	
	//分期支付约定  支付期号
	@PageFieldSelect(cssQuery = "tr:nth-child(9) > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(1)")
	private String payCode;
	
	//分期支付约定   约定支付日期
	@PageFieldSelect(cssQuery = "tr:nth-child(9) > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(2)")
	private String payDate;
	
	// 约定支付金额(万元)
	@PageFieldSelect(cssQuery = "tr:nth-child(9) > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3)")
	private String payCount;
	
	//分期支付约定   备注
	@PageFieldSelect(cssQuery = "tr:nth-child(9) > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(4)")
	private String remark;
	
	//土地使用权人
	@PageFieldSelect(cssQuery = "tr:nth-child(10) > td:nth-child(2)")
	private String useUser;
	
	//约定容积率 下限
	@PageFieldSelect(cssQuery = "tr:nth-child(11) > td:nth-child(2) > table > tbody > tr > td:nth-child(2)")
	private String containerUp;
	
	//约定容积率  上限
	@PageFieldSelect(cssQuery = "tr:nth-child(11) > td:nth-child(2) > table > tbody > tr > td:nth-child(4)")
	private String containerDown;
	
	//约定开工时间
	@PageFieldSelect(cssQuery = "tr:nth-child(12) > td:nth-child(2)")
	private String appointmentDate;
	
	//实际开工时间
	@PageFieldSelect(cssQuery = "tr:nth-child(13) > td:nth-child(2)")
	private String realDate;
	
	//批准单位
	@PageFieldSelect(cssQuery = "tr:nth-child(14) > td:nth-child(2)")
	private String approveUnit;
	
	// 存量面积(公顷)
	@PageFieldSelect(cssQuery = "tr:nth-child(5) > td:nth-child(4)")
	private String stockArea;
	
	//供地方式
	@PageFieldSelect(cssQuery = "tr:nth-child(6) > td:nth-child(4)")
	private String type;
	
	//行业分类
	@PageFieldSelect(cssQuery = "tr:nth-child(7) > td:nth-child(4)")
	private String industry;
	
	//成交价格(万元)
	@PageFieldSelect(cssQuery = "tr:nth-child(8) > td:nth-child(4)")
	private String price;
	
	//约定交地时间
	@PageFieldSelect(cssQuery = "tr:nth-child(11) > td:nth-child(4)")
	private String appointmentProvideDate;
	
	//约定竣工时间
	@PageFieldSelect(cssQuery = "tr:nth-child(12) > td:nth-child(4)")
	private String appointmentEndDate;
	
	//实际竣工时间
	@PageFieldSelect(cssQuery = "tr:nth-child(13) > td:nth-child(4)")
	private String realEndDate;
	
	//合同签订日期
	@PageFieldSelect(cssQuery = "tr:nth-child(14) > td:nth-child(4)")
	private String signDate;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
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

	public String getPayCode() {
		return payCode;
	}

	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}

	public String getPayDate() {
		return payDate;
	}

	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public String getPayCount() {
		return payCount;
	}

	public void setPayCount(String payCount) {
		this.payCount = payCount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUseUser() {
		return useUser;
	}

	public void setUseUser(String useUser) {
		this.useUser = useUser;
	}

	public String getContainerUp() {
		return containerUp;
	}

	public void setContainerUp(String containerUp) {
		this.containerUp = containerUp;
	}

	public String getContainerDown() {
		return containerDown;
	}

	public void setContainerDown(String containerDown) {
		this.containerDown = containerDown;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getRealDate() {
		return realDate;
	}

	public void setRealDate(String realDate) {
		this.realDate = realDate;
	}

	public String getApproveUnit() {
		return approveUnit;
	}

	public void setApproveUnit(String approveUnit) {
		this.approveUnit = approveUnit;
	}

	public String getStockArea() {
		return stockArea;
	}

	public void setStockArea(String stockArea) {
		this.stockArea = stockArea;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAppointmentProvideDate() {
		return appointmentProvideDate;
	}

	public void setAppointmentProvideDate(String appointmentProvideDate) {
		this.appointmentProvideDate = appointmentProvideDate;
	}

	public String getAppointmentEndDate() {
		return appointmentEndDate;
	}

	public void setAppointmentEndDate(String appointmentEndDate) {
		this.appointmentEndDate = appointmentEndDate;
	}

	public String getRealEndDate() {
		return realEndDate;
	}

	public void setRealEndDate(String realEndDate) {
		this.realEndDate = realEndDate;
	}

	public String getSignDate() {
		return signDate;
	}

	public void setSignDate(String signDate) {
		this.signDate = signDate;
	}
	
	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
	
}
