/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50718
Source Host           : 127.0.0.1:3306
Source Database       : spider

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2020-07-19 19:29:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cn_gov_mnr_hbgd1
-- ----------------------------
DROP TABLE IF EXISTS `cn_gov_mnr_hbgd1`;
CREATE TABLE `cn_gov_mnr_hbgd1` (
  `url` varchar(255) NOT NULL COMMENT '信息网址',
  `city` varchar(255) DEFAULT NULL COMMENT '行政区',
  `project_name` varchar(500) DEFAULT NULL COMMENT '项目名称',
  `position` varchar(500) DEFAULT NULL COMMENT '项目位置',
  `area` varchar(32) DEFAULT NULL COMMENT '供应面积(公顷)',
  `use_type` varchar(255) DEFAULT NULL COMMENT '土地用途',
  `use_year` int(10) DEFAULT NULL COMMENT '土地使用年限',
  `level` varchar(10) DEFAULT NULL COMMENT '土地级别',
  `pay_code` varchar(255) DEFAULT NULL COMMENT '分期支付约定  支付期号',
  `pay_date` varchar(32) DEFAULT NULL COMMENT '分期支付约定   约定支付日期',
  `pay_count` varchar(32) DEFAULT NULL COMMENT '约定支付金额(万元)',
  `remark` text COMMENT '分期支付约定   备注',
  `use_user` varchar(255) DEFAULT NULL COMMENT '土地使用权人',
  `container_up` varchar(32) DEFAULT NULL COMMENT '约定容积率 下限',
  `container_down` varchar(32) DEFAULT NULL COMMENT '约定容积率  上限',
  `appointment_date` varchar(32) DEFAULT NULL COMMENT '约定开工时间',
  `real_date` varchar(32) DEFAULT NULL COMMENT '实际开工时间',
  `approve_unit` varchar(255) DEFAULT NULL COMMENT '批准单位',
  `stock_area` varchar(32) DEFAULT NULL COMMENT '存量面积(公顷)',
  `type` varchar(64) DEFAULT NULL COMMENT '供地方式',
  `industry` varchar(255) DEFAULT NULL COMMENT '行业分类',
  `price` varchar(20) DEFAULT NULL COMMENT '成交价格(万元)',
  `appointment_provide_date` varchar(32) DEFAULT NULL COMMENT '约定交地时间',
  `appointment_end_date` varchar(32) DEFAULT NULL COMMENT '约定竣工时间',
  `real_end_date` varchar(32) DEFAULT NULL COMMENT '实际竣工时间',
  `sign_date` varchar(32) DEFAULT NULL COMMENT '合同签订日期',
  PRIMARY KEY (`url`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='划拨供地';

-- ----------------------------
-- Table structure for cn_gov_mnr_tdzr
-- ----------------------------
DROP TABLE IF EXISTS `cn_gov_mnr_tdzr`;
CREATE TABLE `cn_gov_mnr_tdzr` (
  `code` varchar(255) DEFAULT NULL COMMENT '宗地编号',
  `address` varchar(500) DEFAULT NULL COMMENT '宗地座落',
  `src_user` varchar(500) DEFAULT NULL COMMENT '原土地使用权人',
  `area` varchar(20) DEFAULT NULL COMMENT '土地面积(公顷)',
  `addr_type` varchar(64) DEFAULT NULL COMMENT '土地使用权类型',
  `status` varchar(32) DEFAULT NULL COMMENT '土地利用状况',
  `type` varchar(64) DEFAULT NULL COMMENT '转让方式',
  `deal_date` varchar(20) DEFAULT NULL COMMENT '成交日期 ',
  `city` varchar(255) DEFAULT NULL COMMENT '所在行政区',
  `target_user` varchar(500) DEFAULT NULL COMMENT '现土地使用权人',
  `use_type` varchar(64) DEFAULT NULL COMMENT '土地用途',
  `use_year` int(10) DEFAULT NULL COMMENT '土地使用年限',
  `level` varchar(64) DEFAULT NULL COMMENT '土地级别',
  `price` varchar(20) DEFAULT NULL COMMENT '转让价格(万元)',
  `url` varchar(255) NOT NULL COMMENT '信息网址',
  PRIMARY KEY (`url`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='土地转让';
