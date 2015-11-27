/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : icss

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2015-11-26 21:06:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `AABB02A`
-- ----------------------------
DROP TABLE IF EXISTS `AABB02A`;
CREATE TABLE `AABB02A` (
  `AABB02A010` varchar(36) NOT NULL COMMENT '编号',
  `AABB02A020` int(11) DEFAULT NULL COMMENT '用户类型',
  `AABB02A030` varchar(500) DEFAULT NULL COMMENT '姓名',
  `AABB02A040` varchar(500) DEFAULT NULL COMMENT '用户名',
  `AABB02A050` varchar(500) DEFAULT NULL COMMENT '密码',
  `AABB02A060` varchar(500) DEFAULT NULL COMMENT '邮箱',
  `AABB02A070` varchar(500) DEFAULT NULL COMMENT '手机号码',
  `AABB02A080` varchar(500) DEFAULT NULL COMMENT '我的推荐码',
  `AABB02A090` varchar(500) DEFAULT NULL COMMENT '谁推荐我的 用户ID或者为空',
  `AABB02A100` double DEFAULT NULL COMMENT '返利余额',
  `AABB02A110` varchar(500) DEFAULT NULL COMMENT '推荐链接',
  `AABB02A120` varchar(500) DEFAULT NULL COMMENT '注册时间',
  PRIMARY KEY (`AABB02A010`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of AABB02A
-- ----------------------------
