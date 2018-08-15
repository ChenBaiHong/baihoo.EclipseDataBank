/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.15
Source Server Version : 50630
Source Host           : 192.168.1.15:3306
Source Database       : MybatisStuding

Target Server Type    : MYSQL
Target Server Version : 50630
File Encoding         : 65001

Date: 2018-07-18 13:39:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for seller_info
-- ----------------------------
DROP TABLE IF EXISTS `seller_info`;
CREATE TABLE `seller_info` (
  `id` varchar(32) NOT NULL,
  `username` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `openid` varchar(64) NOT NULL COMMENT '微信openid',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='卖家信息表';

-- ----------------------------
-- Records of seller_info
-- ----------------------------
INSERT INTO `seller_info` VALUES ('1', 'baihoo', '123', '121', '2018-07-18 13:34:02', '2018-07-18 13:35:00');
INSERT INTO `seller_info` VALUES ('2', '李白', '123', '122', '2018-07-18 13:34:29', '2018-07-18 13:35:02');
INSERT INTO `seller_info` VALUES ('3', '白起', '123', '123', '2018-07-18 13:34:57', '2018-07-18 13:35:05');
INSERT INTO `seller_info` VALUES ('4', '蓋聶', '123', '124', '2018-07-18 13:35:25', '2018-07-18 13:35:25');
INSERT INTO `seller_info` VALUES ('5', '韋莊', '123', '125', '2018-07-18 13:35:43', '2018-07-18 13:35:43');
