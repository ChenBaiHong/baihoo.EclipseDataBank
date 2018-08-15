/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.15
Source Server Version : 50630
Source Host           : 192.168.1.15:3306
Source Database       : MybatisStuding

Target Server Type    : MYSQL
Target Server Version : 50630
File Encoding         : 65001

Date: 2018-07-20 21:06:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bh_brand
-- ----------------------------
DROP TABLE IF EXISTS `bh_brand`;
CREATE TABLE `bh_brand` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(40) DEFAULT NULL COMMENT '品牌名称',
  `description` varchar(220) DEFAULT NULL COMMENT '品牌描述',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bh_brand
-- ----------------------------
INSERT INTO `bh_brand` VALUES ('2', '京东到家', '哦哦哦', '2018-07-20 16:46:22', '2018-07-20 17:34:49');
INSERT INTO `bh_brand` VALUES ('3', '联邦蔬菜', '哦哦哦', '2018-07-20 17:34:56', '2018-07-20 17:35:01');

-- ----------------------------
-- Table structure for bh_cate
-- ----------------------------
DROP TABLE IF EXISTS `bh_cate`;
CREATE TABLE `bh_cate` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一识别主键',
  `p_Id` int(11) DEFAULT NULL COMMENT '父主键',
  `t_id` int(11) DEFAULT NULL COMMENT '隶属祖宗层主键',
  `name` varchar(40) NOT NULL COMMENT '分类名称',
  `layer` int(11) DEFAULT NULL COMMENT '分类层级',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`),
  KEY `FKnncc50mfc4qajm9ire5asd5rw` (`p_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bh_cate
-- ----------------------------
INSERT INTO `bh_cate` VALUES ('1', null, null, '豆类产品', '0', '2018-07-20 17:34:34', '2018-07-20 16:54:27');
INSERT INTO `bh_cate` VALUES ('2', null, null, '蔬菜产品', '0', '2018-07-20 17:34:28', '2018-07-20 16:54:56');
INSERT INTO `bh_cate` VALUES ('3', '2', '2', '生菜区', null, '2018-07-20 17:35:55', '2018-07-20 17:35:55');
INSERT INTO `bh_cate` VALUES ('4', '2', '2', '熟菜区', null, '2018-07-20 17:36:08', '2018-07-20 17:36:08');

-- ----------------------------
-- Table structure for bh_order_item
-- ----------------------------
DROP TABLE IF EXISTS `bh_order_item`;
CREATE TABLE `bh_order_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一识别主键',
  `buy_num` int(3) DEFAULT NULL COMMENT '购买商品数量',
  `price` decimal(8,2) DEFAULT NULL COMMENT '订单项产品单价',
  `subtotal` double DEFAULT NULL COMMENT '小计产品价钱',
  `p_id` int(11) DEFAULT NULL COMMENT '产品主键',
  `o_id` int(11) DEFAULT NULL COMMENT '订单主键',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `BH_ORDER_ITEM_OID_FK` (`o_id`),
  KEY `BH_ORDER_ITEM_PID_FK` (`p_id`),
  CONSTRAINT `BH_ORDER_ITEM_OID_FK` FOREIGN KEY (`o_id`) REFERENCES `bh_orders` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `BH_ORDER_ITEM_PID_FK` FOREIGN KEY (`p_id`) REFERENCES `bh_product` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bh_order_item
-- ----------------------------
INSERT INTO `bh_order_item` VALUES ('1', '1', '123.10', '123.1', '1', '1', '2018-07-20 17:11:27', '2018-07-20 17:11:27');
INSERT INTO `bh_order_item` VALUES ('2', '1', '123.10', '123.1', '2', '1', '2018-07-20 17:11:27', '2018-07-20 17:11:27');
INSERT INTO `bh_order_item` VALUES ('3', '1', '123.10', '123.1', '3', '2', '2018-07-20 17:11:27', '2018-07-20 17:11:27');
INSERT INTO `bh_order_item` VALUES ('4', '1', '123.10', '123.1', '4', '2', '2018-07-20 17:11:27', '2018-07-20 17:11:27');

-- ----------------------------
-- Table structure for bh_orders
-- ----------------------------
DROP TABLE IF EXISTS `bh_orders`;
CREATE TABLE `bh_orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一识别主键',
  `u_id` int(11) DEFAULT NULL COMMENT '订单用户',
  `order_Time` datetime DEFAULT NULL COMMENT '下单时间',
  `money` decimal(8,2) DEFAULT NULL COMMENT '订单总价',
  `state` tinyint(1) DEFAULT NULL COMMENT '订单状态',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `FKsgwj42spshwc3eestq5vk520j` (`u_id`),
  CONSTRAINT `BH_ORDERS_UID_FK` FOREIGN KEY (`u_id`) REFERENCES `bh_user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bh_orders
-- ----------------------------
INSERT INTO `bh_orders` VALUES ('1', '5', '2018-07-20 17:07:10', '246.20', '1', '2018-07-20 17:07:10', '2018-07-20 17:07:10');
INSERT INTO `bh_orders` VALUES ('2', '5', '2018-07-20 17:07:10', '246.20', '1', '2018-07-20 17:07:10', '2018-07-20 17:07:10');

-- ----------------------------
-- Table structure for bh_product
-- ----------------------------
DROP TABLE IF EXISTS `bh_product`;
CREATE TABLE `bh_product` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一识别主键',
  `name` varchar(100) NOT NULL COMMENT '产品名称',
  `price` decimal(8,1) DEFAULT NULL COMMENT '价格',
  `c_id` int(11) DEFAULT NULL COMMENT '关联分类',
  `b_id` int(11) DEFAULT NULL COMMENT '关联品牌',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  KEY `FKcbnyvs2x321b8yw2vi398b26h` (`b_id`),
  KEY `BH_PRODUCT_CID_FK` (`c_id`),
  CONSTRAINT `BH_PRODUCT_BID_FK` FOREIGN KEY (`b_id`) REFERENCES `bh_brand` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `BH_PRODUCT_CID_FK` FOREIGN KEY (`c_id`) REFERENCES `bh_cate` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bh_product
-- ----------------------------
INSERT INTO `bh_product` VALUES ('1', '豆豆', '123.1', '1', '2', '2018-07-20 17:01:18', '2018-07-20 17:01:18');
INSERT INTO `bh_product` VALUES ('2', '大米', '123.1', '2', '2', '2018-07-20 17:01:18', '2018-07-20 17:01:45');
INSERT INTO `bh_product` VALUES ('3', '香肠', '123.1', '1', '2', '2018-07-20 17:01:18', '2018-07-20 17:01:18');
INSERT INTO `bh_product` VALUES ('4', '火腿', '123.1', '2', '2', '2018-07-20 17:01:18', '2018-07-20 17:01:49');

-- ----------------------------
-- Table structure for bh_user
-- ----------------------------
DROP TABLE IF EXISTS `bh_user`;
CREATE TABLE `bh_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一识别主键',
  `username` varchar(25) DEFAULT NULL COMMENT '用户名称',
  `password` varchar(40) DEFAULT NULL COMMENT '用户密码',
  `address` varchar(225) DEFAULT NULL COMMENT '地址',
  `birth` date DEFAULT NULL COMMENT '生日',
  `sex` varchar(10) DEFAULT NULL COMMENT '性别',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bh_user
-- ----------------------------
INSERT INTO `bh_user` VALUES ('5', '蚩尤', '123', 'china', '2018-07-20', null, '2018-07-20 16:20:40', '2018-07-20 16:00:16');
INSERT INTO `bh_user` VALUES ('6', '白起', '123', 'china', '2018-07-20', null, '2018-07-20 16:03:55', '2018-07-20 16:03:55');
INSERT INTO `bh_user` VALUES ('7', '盖聂', '123', 'china', '2018-07-20', null, '2018-07-20 16:06:55', '2018-07-20 16:06:55');
INSERT INTO `bh_user` VALUES ('8', '卫庄', '123', 'china', '2018-07-20', null, '2018-07-20 16:09:01', '2018-07-20 16:09:01');
INSERT INTO `bh_user` VALUES ('9', '白宏', '123', 'china', '2018-07-20', null, '2018-07-20 16:10:40', '2018-07-20 16:10:40');

-- ----------------------------
-- Table structure for seller_info
-- ----------------------------
DROP TABLE IF EXISTS `seller_info`;
CREATE TABLE `seller_info` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `openid` varchar(64) NOT NULL COMMENT '微信openid',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='卖家信息表';

-- ----------------------------
-- Records of seller_info
-- ----------------------------
INSERT INTO `seller_info` VALUES ('2', '青衣居士', '123', '1236', '2018-07-18 13:34:29', '2018-07-19 10:24:03');
INSERT INTO `seller_info` VALUES ('3', '白起', '123', '123', '2018-07-18 13:34:57', '2018-07-18 13:35:05');
INSERT INTO `seller_info` VALUES ('4', '蓋聶', '123', '124', '2018-07-18 13:35:25', '2018-07-18 13:35:25');
INSERT INTO `seller_info` VALUES ('5', '韋莊', '123', '125', '2018-07-18 13:35:43', '2018-07-18 13:35:43');
INSERT INTO `seller_info` VALUES ('6', '白宏', '123', '1236', '2018-07-18 16:20:51', '2018-07-18 16:20:51');
INSERT INTO `seller_info` VALUES ('9', '白居易', '123', '1236', '2018-07-19 10:21:26', '2018-07-19 10:21:26');
