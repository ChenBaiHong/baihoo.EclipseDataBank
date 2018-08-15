/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.15
Source Server Version : 50630
Source Host           : 192.168.1.15:3306
Source Database       : hibernate_study

Target Server Type    : MYSQL
Target Server Version : 50630
File Encoding         : 65001

Date: 2018-07-12 09:54:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for BH_CUSTOMER
-- ----------------------------
DROP TABLE IF EXISTS `BH_CUSTOMER`;
CREATE TABLE `BH_CUSTOMER` (
  `C_ID` int(11) NOT NULL AUTO_INCREMENT,
  `AGE` int(11) DEFAULT NULL,
  `BIRTH_DATE` time DEFAULT NULL,
  `C_DESC` longtext,
  `C_NAME` varchar(20) NOT NULL,
  `C_SALARY` double DEFAULT NULL,
  `VERSION` int(11) DEFAULT NULL,
  PRIMARY KEY (`C_ID`),
  UNIQUE KEY `UK_7xpu8aj2yalijw24x3qh20ti2` (`C_NAME`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of BH_CUSTOMER
-- ----------------------------
INSERT INTO `BH_CUSTOMER` VALUES ('1', null, null, null, '五更', null, '2');
INSERT INTO `BH_CUSTOMER` VALUES ('2', null, null, null, 'baihoo.Google', null, null);

-- ----------------------------
-- Table structure for BH_ORDER
-- ----------------------------
DROP TABLE IF EXISTS `BH_ORDER`;
CREATE TABLE `BH_ORDER` (
  `O_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ADDR` varchar(20) NOT NULL,
  `VERSION` int(11) DEFAULT NULL,
  `C_NO` int(11) DEFAULT NULL,
  PRIMARY KEY (`O_ID`),
  UNIQUE KEY `UK_koq7am56wv7b832qheb1xiaos` (`ADDR`),
  KEY `FK_800q7bfq8266b09yje7m1nje3` (`C_NO`),
  CONSTRAINT `FK_800q7bfq8266b09yje7m1nje3` FOREIGN KEY (`C_NO`) REFERENCES `BH_CUSTOMER` (`C_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of BH_ORDER
-- ----------------------------
INSERT INTO `BH_ORDER` VALUES ('1', '南天门1', '0', '1');
INSERT INTO `BH_ORDER` VALUES ('2', '南天门2', '0', '1');
INSERT INTO `BH_ORDER` VALUES ('3', '南天门3', '0', '1');
INSERT INTO `BH_ORDER` VALUES ('4', '南天门4', '0', '1');
INSERT INTO `BH_ORDER` VALUES ('5', '南天门5', '0', '1');
INSERT INTO `BH_ORDER` VALUES ('6', '南天门6', '0', '1');
INSERT INTO `BH_ORDER` VALUES ('7', '南天门7', '0', '1');
INSERT INTO `BH_ORDER` VALUES ('8', '南天门8', '0', '1');
INSERT INTO `BH_ORDER` VALUES ('9', '南天门9', '0', '1');
INSERT INTO `BH_ORDER` VALUES ('10', '南天门10', '0', '1');
INSERT INTO `BH_ORDER` VALUES ('11', '南天门11', '0', '1');
INSERT INTO `BH_ORDER` VALUES ('12', '南天门12', '0', '1');
INSERT INTO `BH_ORDER` VALUES ('13', '南天门13', '0', '1');
INSERT INTO `BH_ORDER` VALUES ('14', '南天门14', '0', '1');
INSERT INTO `BH_ORDER` VALUES ('15', '南天门15', '0', '1');
INSERT INTO `BH_ORDER` VALUES ('16', '南天门16', '0', '1');
INSERT INTO `BH_ORDER` VALUES ('17', '南天门17', '0', '1');
INSERT INTO `BH_ORDER` VALUES ('18', '南天门18', '0', '1');
INSERT INTO `BH_ORDER` VALUES ('19', '南天门19', '0', '1');
INSERT INTO `BH_ORDER` VALUES ('20', '南天门20', '0', '1');

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1', 'baiHoo', '25');
