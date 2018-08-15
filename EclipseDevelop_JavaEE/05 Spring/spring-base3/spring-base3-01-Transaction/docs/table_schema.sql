CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT comment'唯一识别ID',
  `name` varchar(20) NOT NULL comment'用户名称',
  `money` double DEFAULT NULL comment'账户金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;