/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.15
Source Server Version : 50630
Source Host           : 192.168.1.15:3306
Source Database       : springbootStudying

Target Server Type    : MYSQL
Target Server Version : 50630
File Encoding         : 65001

Date: 2018-07-28 00:29:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bh_book
-- ----------------------------
DROP TABLE IF EXISTS `bh_book`;
CREATE TABLE `bh_book` (
  `id` int(11) NOT NULL,
  `author` varchar(25) DEFAULT NULL,
  `book_name` varchar(125) DEFAULT NULL,
  `pub_date` datetime DEFAULT NULL,
  `sell_price` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bh_book
-- ----------------------------
INSERT INTO `bh_book` VALUES ('1', 'baihoo', '天下第二', '2018-07-27 17:53:00', '123.23');
INSERT INTO `bh_book` VALUES ('2', 'baihoo', '金梅瓶', '2018-07-27 17:54:02', '123.34');
INSERT INTO `bh_book` VALUES ('3', 'baihoo', '金梅瓶', '2018-07-27 17:54:00', '123.23');
INSERT INTO `bh_book` VALUES ('4', 'baihoo', '金梅瓶', '2018-07-27 17:54:00', '123.23');
INSERT INTO `bh_book` VALUES ('5', 'baihoo', '金梅瓶', '2018-07-27 17:54:00', '124.34');
INSERT INTO `bh_book` VALUES ('6', 'baihoo', '山海經', '2018-07-11 13:50:00', '123.23');
INSERT INTO `bh_book` VALUES ('7', 'baihoo', '山海經', '2018-07-25 17:55:00', '122.23');
INSERT INTO `bh_book` VALUES ('8', 'baihoo', '天下第一', '2018-07-10 17:45:00', '123.12');
INSERT INTO `bh_book` VALUES ('9', 'baihoo', '天下第三', '2018-07-19 14:50:00', '123.45');

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES ('10');
