/*
Navicat MySQL Data Transfer

Source Server         : MySql
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : cosmeticestore

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-03-09 21:11:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` varchar(40) NOT NULL,
  `adminname` varchar(25) NOT NULL,
  `imgLocal` varchar(500) DEFAULT NULL,
  `password` varchar(40) NOT NULL,
  `description` varchar(225) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `adminname` (`adminname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('4dc1aa6a5952474986a393232f888f66', 'superAdmin', 'F:\\Eclipse DataBank\\EclipseDevelop_JavaEE\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\baiHoo.estore1.1-master\\WEB-INF\\uploadFile/6/9/eb875ff8-c372-4bec-97b9-dbe671a59400.jpg', '123456', '');
INSERT INTO `admin` VALUES ('4f543683-41a3-4c62-bc65-b30185a268e7', 'baiHoo', 'F:\\Eclipse DataBank\\EclipseDevelop_JavaEE\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\baiHoo.estore1.1-master\\WEB-INF\\uploadFile/2/4/95ea3c1b-e199-4271-9473-12031103e5f0.jpg', '123456', '');
INSERT INTO `admin` VALUES ('879db496-c9bf-4e7b-b277-f3389c97fef6', 'linNa', 'F:\\Eclipse DataBank\\EclipseDevelop_JavaEE\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\baiHoo.estore1.1-master\\WEB-INF\\uploadFile/10/3/824d7c41-3dc5-44ec-8163-fed3bfec21ee.jpg', '123456', '');
INSERT INTO `admin` VALUES ('8ea35ea5-0ccf-4c1f-9b0c-512d97d9ea93', 'master', 'F:\\Eclipse DataBank\\EclipseDevelop_JavaEE\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\baiHoo.estore1.1-master\\WEB-INF\\uploadFile/10/10/15f87540-0599-41eb-904f-68617e7e4fc3.jpg', '123456', '');
INSERT INTO `admin` VALUES ('cc2fddd9-cf58-41a1-9d5b-1188a47362a5', '李白', 'F:\\Eclipse DataBank\\EclipseDevelop_JavaEE\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\baiHoo.estore1.1-master\\WEB-INF\\uploadFile/7/15/89483bc0-8183-4078-8b7a-386fb0895b96.jpg', '123456', '');
INSERT INTO `admin` VALUES ('ce666809-9648-44cf-83b3-21a150c8c25c', 'kermit', 'F:\\Eclipse DataBank\\EclipseDevelop_JavaEE\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\baiHoo.estore1.1-master\\WEB-INF\\uploadFile/4/14/53fce895-8c60-46a6-881f-6687208bab24.jpg', '123456', '');

-- ----------------------------
-- Table structure for admin_role
-- ----------------------------
DROP TABLE IF EXISTS `admin_role`;
CREATE TABLE `admin_role` (
  `admin_id` varchar(40) NOT NULL,
  `role_id` varchar(40) NOT NULL,
  PRIMARY KEY (`admin_id`,`role_id`),
  KEY `role_id` (`role_id`),
  CONSTRAINT `admin_role_ibfk_1` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`id`),
  CONSTRAINT `admin_role_ibfk_2` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin_role
-- ----------------------------
INSERT INTO `admin_role` VALUES ('4f543683-41a3-4c62-bc65-b30185a268e7', '668aafcf-4a60-4a65-8aa5-a80a3fe6f5f2');
INSERT INTO `admin_role` VALUES ('ce666809-9648-44cf-83b3-21a150c8c25c', '668aafcf-4a60-4a65-8aa5-a80a3fe6f5f2');
INSERT INTO `admin_role` VALUES ('cc2fddd9-cf58-41a1-9d5b-1188a47362a5', '96541d6a-c0af-4a78-833d-8c3cb7f4d20a');
INSERT INTO `admin_role` VALUES ('4f543683-41a3-4c62-bc65-b30185a268e7', 'c45d41de-4e50-4fc6-b591-206d02130113');
INSERT INTO `admin_role` VALUES ('879db496-c9bf-4e7b-b277-f3389c97fef6', 'c45d41de-4e50-4fc6-b591-206d02130113');
INSERT INTO `admin_role` VALUES ('8ea35ea5-0ccf-4c1f-9b0c-512d97d9ea93', 'c45d41de-4e50-4fc6-b591-206d02130113');
INSERT INTO `admin_role` VALUES ('ce666809-9648-44cf-83b3-21a150c8c25c', 'c45d41de-4e50-4fc6-b591-206d02130113');
INSERT INTO `admin_role` VALUES ('8ea35ea5-0ccf-4c1f-9b0c-512d97d9ea93', 'cc8a817a-6722-4195-bbfd-7fd8583cfee8');
INSERT INTO `admin_role` VALUES ('cc2fddd9-cf58-41a1-9d5b-1188a47362a5', 'cc8a817a-6722-4195-bbfd-7fd8583cfee8');
INSERT INTO `admin_role` VALUES ('4f543683-41a3-4c62-bc65-b30185a268e7', 'db7347eb-1f02-4f1e-8e06-8d6c553c719a');
INSERT INTO `admin_role` VALUES ('879db496-c9bf-4e7b-b277-f3389c97fef6', 'db7347eb-1f02-4f1e-8e06-8d6c553c719a');
INSERT INTO `admin_role` VALUES ('8ea35ea5-0ccf-4c1f-9b0c-512d97d9ea93', 'db7347eb-1f02-4f1e-8e06-8d6c553c719a');

-- ----------------------------
-- Table structure for brand
-- ----------------------------
DROP TABLE IF EXISTS `brand`;
CREATE TABLE `brand` (
  `id` varchar(40) NOT NULL,
  `name` varchar(40) DEFAULT NULL,
  `description` varchar(220) DEFAULT NULL,
  `brandImg` longtext,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of brand
-- ----------------------------
INSERT INTO `brand` VALUES ('4028800b620417c60162042c73530006', '潮牌', '', 'F:/amusementItem/upload/c0c4dbed108bb9a4c9e94dd8ca72044c.jpg');
INSERT INTO `brand` VALUES ('4028800b620417c60162042c988e0007', '库奇', '', 'F:/amusementItem/upload/0bedcc81945515dc224f9cc12528d3c5.jpg');
INSERT INTO `brand` VALUES ('4028800b620417c60162042cac1f0008', '范思哲', '', 'F:/amusementItem/upload/032ddde0f1c6513f5fc7eb050679082a.jpg');
INSERT INTO `brand` VALUES ('4028800b620417c60162042cd7320009', '古奇', '', 'F:/amusementItem/upload/5853943b2cdd513c60d0bf5bfd6cdb20.jpg');
INSERT INTO `brand` VALUES ('4028800b620417c60162042cf16c000a', '派克', '', 'F:/amusementItem/upload/84d205a4def0e221f4da463c104fe093.jpg');
INSERT INTO `brand` VALUES ('4028800b620417c60162042e4eb8000b', '龙灵', '', 'F:/amusementItem/upload/a27e515f978578b1383a18d860b713bc.jpg');
INSERT INTO `brand` VALUES ('4028800b620417c60162042e7658000c', '神临', '', 'F:/amusementItem/upload/f575f85c8ac33f878577fc50178023fc.jpg');
INSERT INTO `brand` VALUES ('4028800b620417c60162042ee753000d', '古剑坊', '', 'F:/amusementItem/upload/cb2a3f015757bf7b021827dd24b73fa8.jpg');
INSERT INTO `brand` VALUES ('4028800b620417c60162042f2e6f000e', '剑灵阁', '', 'F:/amusementItem/upload/a6f1f58c7091a4666524d8951f93af7c.jpg');

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `cid` varchar(40) NOT NULL,
  `name` varchar(40) NOT NULL,
  `layer` int(11) DEFAULT NULL,
  `parentId` varchar(40) DEFAULT NULL,
  `profile` varchar(50) DEFAULT NULL,
  `profileImg` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cid`),
  UNIQUE KEY `name` (`name`),
  KEY `FKnncc50mfc4qajm9ire5asd5rw` (`parentId`),
  CONSTRAINT `FKnncc50mfc4qajm9ire5asd5rw` FOREIGN KEY (`parentId`) REFERENCES `category` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('4028800b620417c6016204237b7d0000', '店内服饰', '0', null, '32', null);
INSERT INTO `category` VALUES ('4028800b620417c601620424245d0001', '潮牌卫衣', '1', '4028800b620417c6016204237b7d0000', '', null);
INSERT INTO `category` VALUES ('4028800b620417c60162042490630003', '中国风刺绣卫衣', '2', '4028800b620417c601620424245d0001', '', null);
INSERT INTO `category` VALUES ('4028800b620417c601620425d0000004', '图纹卫衣', '2', '4028800b620417c601620424245d0001', '', null);
INSERT INTO `category` VALUES ('4028800b620417c6016204260f630005', '图案卫衣', '2', '4028800b620417c601620424245d0001', '', null);
INSERT INTO `category` VALUES ('4028800b620417c60162043389a9000f', '古奇名品', '1', '4028800b620417c6016204237b7d0000', '', null);
INSERT INTO `category` VALUES ('4028800b620417c601620433b3470010', '范思哲', '1', '4028800b620417c6016204237b7d0000', '', null);
INSERT INTO `category` VALUES ('4028800b620417c601620433fc530011', '剑灵阁', '2', '4028800b620417c6016204237b7d0000', '', null);
INSERT INTO `category` VALUES ('4028800b620417c601620434649e0012', '龙灵古风首饰', '1', '4028800b620417c6016204237b7d0000', '', null);
INSERT INTO `category` VALUES ('4028800b620439690162043efb1c0000', '商务皮带', '2', '4028800b620417c60162043389a9000f', '', null);
INSERT INTO `category` VALUES ('4028800b620439690162043f6d410001', '商务西装', '2', '4028800b620417c60162043389a9000f', '', null);
INSERT INTO `category` VALUES ('4028800b620439690162043f9db20002', '商务皮鞋', '2', '4028800b620417c60162043389a9000f', '', null);
INSERT INTO `category` VALUES ('4028800b62043969016204404b890003', '海妖纹饰卫衣', '2', '4028800b620417c601620433b3470010', '', null);
INSERT INTO `category` VALUES ('4028800b62043969016204408f360004', '纹饰腰带', '2', '4028800b620417c601620433b3470010', '', null);
INSERT INTO `category` VALUES ('4028800b62043969016204434fc90005', '弘扬百世汉服', '2', '4028800b620417c601620433fc530011', '', null);
INSERT INTO `category` VALUES ('4028800b6204396901620443b3bb0006', '汉服睡衣', '3', '4028800b620417c601620433fc530011', '', null);
INSERT INTO `category` VALUES ('4028800b6204396901620443eeea0007', '装饰古剑', '2', '4028800b620417c601620434649e0012', '', null);
INSERT INTO `category` VALUES ('4028800b620439690162044472a70008', '貔貅纳财', '2', '4028800b620417c601620434649e0012', '', null);

-- ----------------------------
-- Table structure for orderitem
-- ----------------------------
DROP TABLE IF EXISTS `orderitem`;
CREATE TABLE `orderitem` (
  `id` varchar(40) NOT NULL,
  `buyQuantity` int(11) NOT NULL,
  `price` decimal(8,2) NOT NULL,
  `product_id` varchar(40) DEFAULT NULL,
  `orders_id` varchar(40) DEFAULT NULL,
  `subtotal` double DEFAULT NULL,
  `color` varchar(255) DEFAULT NULL,
  `size` varchar(255) DEFAULT NULL,
  `oid` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `orders_id` (`orders_id`),
  KEY `FKg23j1vs750x8lkx2aesfk6n2` (`product_id`),
  KEY `FKchl6e7ulrg9l0ikn7i1pox017` (`oid`),
  CONSTRAINT `FKchl6e7ulrg9l0ikn7i1pox017` FOREIGN KEY (`oid`) REFERENCES `orders` (`id`),
  CONSTRAINT `FKg23j1vs750x8lkx2aesfk6n2` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`),
  CONSTRAINT `orderitem_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`),
  CONSTRAINT `orderitem_ibfk_2` FOREIGN KEY (`orders_id`) REFERENCES `orders` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderitem
-- ----------------------------

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` varchar(40) NOT NULL,
  `orderTime` datetime NOT NULL,
  `receiverinfo` varchar(250) DEFAULT NULL,
  `state` tinyint(1) NOT NULL,
  `money` decimal(8,2) NOT NULL,
  `user_id` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKsgwj42spshwc3eestq5vk520j` (`user_id`),
  CONSTRAINT `FKsgwj42spshwc3eestq5vk520j` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------

-- ----------------------------
-- Table structure for privilege
-- ----------------------------
DROP TABLE IF EXISTS `privilege`;
CREATE TABLE `privilege` (
  `id` varchar(40) NOT NULL,
  `name` varchar(25) NOT NULL,
  `description` varchar(225) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of privilege
-- ----------------------------
INSERT INTO `privilege` VALUES ('57adc89a-e564-4bf1-8660-57298878e621', '更新管理员', '更新管理员');
INSERT INTO `privilege` VALUES ('908e790d-65a9-420c-bf1d-b29946de8456', '查询所有用户', '查询所有用户');
INSERT INTO `privilege` VALUES ('b32cfff5-b878-45b7-a389-4eb207158869', '查询用户', '查询用户');

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` varchar(40) NOT NULL,
  `name` varchar(100) NOT NULL,
  `price` decimal(8,1) NOT NULL,
  `iconurl` varchar(225) NOT NULL,
  `quantity` int(11) NOT NULL,
  `totalSaleNum` int(11) DEFAULT NULL,
  `description` varchar(225) DEFAULT NULL,
  `category_id` varchar(40) DEFAULT NULL,
  `brand_id` varchar(40) DEFAULT NULL,
  `salePrice` double DEFAULT NULL,
  `inletPrice` double DEFAULT NULL,
  `produceLocal` varchar(255) DEFAULT NULL,
  `productCompany` varchar(255) DEFAULT NULL,
  `inletDate` varchar(40) DEFAULT NULL,
  `putawayDate` varchar(40) DEFAULT NULL,
  `paramIconurl` longtext,
  PRIMARY KEY (`id`),
  KEY `FKcbnyvs2x321b8yw2vi398b26h` (`brand_id`),
  CONSTRAINT `FKcbnyvs2x321b8yw2vi398b26h` FOREIGN KEY (`brand_id`) REFERENCES `brand` (`id`),
  CONSTRAINT `PRO_FK_WITH_BRA_0` FOREIGN KEY (`brand_id`) REFERENCES `brand` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------

-- ----------------------------
-- Table structure for prod_cate
-- ----------------------------
DROP TABLE IF EXISTS `prod_cate`;
CREATE TABLE `prod_cate` (
  `pno_id` varchar(40) NOT NULL,
  `cno_id` varchar(40) NOT NULL,
  `cno` varchar(255) NOT NULL,
  `pno` varchar(40) NOT NULL,
  PRIMARY KEY (`pno_id`,`cno_id`),
  KEY `cno_id` (`cno_id`),
  KEY `FKqnbrl31om5b651rohx184ae50` (`pno`),
  KEY `FKru5a30udjwpuxxe7vxqbfokl7` (`cno`),
  CONSTRAINT `FKqnbrl31om5b651rohx184ae50` FOREIGN KEY (`pno`) REFERENCES `product` (`id`),
  CONSTRAINT `FKru5a30udjwpuxxe7vxqbfokl7` FOREIGN KEY (`cno`) REFERENCES `category` (`cid`),
  CONSTRAINT `prod_cate_ibfk_1` FOREIGN KEY (`pno_id`) REFERENCES `product` (`id`),
  CONSTRAINT `prod_cate_ibfk_2` FOREIGN KEY (`cno_id`) REFERENCES `category` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of prod_cate
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` varchar(40) NOT NULL,
  `name` varchar(20) NOT NULL,
  `description` varchar(225) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('45437866-c76c-4536-89f0-495be8a74c81', '八部', '');
INSERT INTO `role` VALUES ('668aafcf-4a60-4a65-8aa5-a80a3fe6f5f2', '小红', '成功的角色');
INSERT INTO `role` VALUES ('96541d6a-c0af-4a78-833d-8c3cb7f4d20a', '小明', '成功的角色');
INSERT INTO `role` VALUES ('c45d41de-4e50-4fc6-b591-206d02130113', '小四', '');
INSERT INTO `role` VALUES ('cc8a817a-6722-4195-bbfd-7fd8583cfee8', '小龙', '');
INSERT INTO `role` VALUES ('db7347eb-1f02-4f1e-8e06-8d6c553c719a', '小三', '');

-- ----------------------------
-- Table structure for role_privilege
-- ----------------------------
DROP TABLE IF EXISTS `role_privilege`;
CREATE TABLE `role_privilege` (
  `role_id` varchar(40) NOT NULL,
  `privilege_id` varchar(40) NOT NULL,
  PRIMARY KEY (`role_id`,`privilege_id`),
  KEY `privilege_id` (`privilege_id`),
  CONSTRAINT `role_privilege_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
  CONSTRAINT `role_privilege_ibfk_2` FOREIGN KEY (`privilege_id`) REFERENCES `privilege` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_privilege
-- ----------------------------
INSERT INTO `role_privilege` VALUES ('45437866-c76c-4536-89f0-495be8a74c81', '57adc89a-e564-4bf1-8660-57298878e621');
INSERT INTO `role_privilege` VALUES ('668aafcf-4a60-4a65-8aa5-a80a3fe6f5f2', '57adc89a-e564-4bf1-8660-57298878e621');
INSERT INTO `role_privilege` VALUES ('96541d6a-c0af-4a78-833d-8c3cb7f4d20a', '57adc89a-e564-4bf1-8660-57298878e621');
INSERT INTO `role_privilege` VALUES ('cc8a817a-6722-4195-bbfd-7fd8583cfee8', '57adc89a-e564-4bf1-8660-57298878e621');
INSERT INTO `role_privilege` VALUES ('668aafcf-4a60-4a65-8aa5-a80a3fe6f5f2', '908e790d-65a9-420c-bf1d-b29946de8456');
INSERT INTO `role_privilege` VALUES ('c45d41de-4e50-4fc6-b591-206d02130113', '908e790d-65a9-420c-bf1d-b29946de8456');
INSERT INTO `role_privilege` VALUES ('cc8a817a-6722-4195-bbfd-7fd8583cfee8', '908e790d-65a9-420c-bf1d-b29946de8456');
INSERT INTO `role_privilege` VALUES ('db7347eb-1f02-4f1e-8e06-8d6c553c719a', '908e790d-65a9-420c-bf1d-b29946de8456');
INSERT INTO `role_privilege` VALUES ('c45d41de-4e50-4fc6-b591-206d02130113', 'b32cfff5-b878-45b7-a389-4eb207158869');
INSERT INTO `role_privilege` VALUES ('cc8a817a-6722-4195-bbfd-7fd8583cfee8', 'b32cfff5-b878-45b7-a389-4eb207158869');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(40) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(40) NOT NULL,
  `nickname` varchar(25) NOT NULL,
  `email` varchar(60) NOT NULL,
  `cellphone` varchar(25) NOT NULL,
  `address` varchar(225) NOT NULL,
  `state` tinyint(1) NOT NULL,
  `activecode` varchar(599) DEFAULT NULL,
  `updatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `realname` varchar(40) DEFAULT NULL,
  `identicalId` varchar(20) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `birthday` varchar(20) DEFAULT NULL,
  `payCode` varchar(7) DEFAULT NULL,
  `iconHead` longtext,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
