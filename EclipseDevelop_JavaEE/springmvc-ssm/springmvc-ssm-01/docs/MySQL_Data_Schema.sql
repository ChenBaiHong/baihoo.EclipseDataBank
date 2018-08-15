/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.15
Source Server Version : 50630
Source Host           : 192.168.1.15:3306
Source Database       : SpringmvcStudying

Target Server Type    : MYSQL
Target Server Version : 50630
File Encoding         : 65001

Date: 2018-07-23 17:49:12
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
-- Table structure for bh_product
-- ----------------------------
DROP TABLE IF EXISTS `bh_product`;
CREATE TABLE `bh_product` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一识别主键',
  `name` varchar(100) NOT NULL COMMENT '产品名称',
  `price` decimal(8,1) DEFAULT NULL COMMENT '价格',
  `c_id` int(11) DEFAULT NULL COMMENT '关联分类',
  `b_id` int(11) DEFAULT NULL COMMENT '关联品牌',
  `shelf_time` datetime DEFAULT NULL,
  `description` varchar(625) DEFAULT NULL COMMENT '商品描述',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  KEY `FKcbnyvs2x321b8yw2vi398b26h` (`b_id`),
  KEY `BH_PRODUCT_CID_FK` (`c_id`),
  CONSTRAINT `BH_PRODUCT_BID_FK` FOREIGN KEY (`b_id`) REFERENCES `bh_brand` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `BH_PRODUCT_CID_FK` FOREIGN KEY (`c_id`) REFERENCES `bh_cate` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
