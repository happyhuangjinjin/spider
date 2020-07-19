package com.spider.cnGovMnr.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.alibaba.fastjson.JSON;

/**
 * @author 2230
 *
 */
@Table(name="cn_gov_mnr_hbgd1")
public class Hbgd1DetailDto {

	//信息网址
	@Id
	@Column(name="url")
	private String url;

	//行政区
	@Column(name="city")
	private String city;
	
	//项目名称
	@Column(name="project_name")
	private String projectName;
	
	//项目位置
	@Column(name="position")
	private String position;
	
	//供应面积(公顷)
	@Column(name="area")
	private String area;
	
	//土地用途
	@Column(name="use_type")
	private String useType;
	
	//土地使用年限
	@Column(name="use_year")
	private Integer useYear;
	
	//土地级别
	@Column(name="level")
	private String level;
	
	//分期支付约定  支付期号
	@Column(name="pay_code")
	private String payCode;
	
	//分期支付约定   约定支付日期
	@Column(name="pay_date")
	private String payDate;
	
	// 约定支付金额(万元)
	@Column(name="pay_count")
	private String payCount;
	
	//分期支付约定   备注
	@Column(name="remark")
	private String remark;
	
	//土地使用权人
	@Column(name="use_user")
	private String useUser;
	
	//约定容积率 下限
	@Column(name="container_up")
	private String containerUp;
	
	//约定容积率  上限
	@Column(name="container_down")
	private String containerDown;
	
	//约定开工时间
	@Column(name="appointment_date")
	private String appointmentDate;
	
	//实际开工时间
	@Column(name="real_date")
	private String realDate;
	
	//批准单位
	@Column(name="approve_unit")
	private String approveUnit;
	
	// 存量面积(公顷)
	@Column(name="stock_area")
	private String stockArea;
	
	//供地方式
	@Column(name="type")
	private String type;
	
	//行业分类
	@Column(name="industry")
	private String industry;
	
	//成交价格(万元)
	@Column(name="price")
	private String price;
	
	//约定交地时间
	@Column(name="appointment_provide_date")
	private String appointmentProvideDate;
	
	//约定竣工时间
	@Column(name="appointment_end_date")
	private String appointmentEndDate;
	
	//实际竣工时间
	@Column(name="real_end_date")
	private String realEndDate;
	
	//合同签订日期
	@Column(name="sign_date")
	private String signDate;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	

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

