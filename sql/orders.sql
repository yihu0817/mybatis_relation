/*
Navicat MySQL Data Transfer

Source Server         : 192.168.2.4
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : scxh

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2017-06-07 11:51:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `orders`
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `orderId` varchar(36) NOT NULL,
  `orderNumber` varchar(20) DEFAULT NULL,
  `orderPrice` int(11) DEFAULT NULL,
  `pid` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`orderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('O_00001', '00001', '100', '001');
INSERT INTO `orders` VALUES ('O_00002', '00002', '200', '001');

-- ----------------------------
-- Table structure for `person`
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `personId` varchar(36) NOT NULL,
  `personName` varchar(64) DEFAULT NULL,
  `personAddress` varchar(128) DEFAULT NULL,
  `personTel` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`personId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('001', 'Jack', 'Wuhan', '1234567');
