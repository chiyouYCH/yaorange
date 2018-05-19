/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : desigh

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2018-05-19 16:30:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for knowpoint
-- ----------------------------
DROP TABLE IF EXISTS `knowpoint`;
CREATE TABLE `knowpoint` (
  `knowpointI_id` int(20) NOT NULL AUTO_INCREMENT,
  `knowpoint_name` varchar(255) DEFAULT NULL,
  `course_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`knowpointI_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of knowpoint
-- ----------------------------
INSERT INTO `knowpoint` VALUES ('1', '集合', 'java');
INSERT INTO `knowpoint` VALUES ('2', '数组', 'java');
INSERT INTO `knowpoint` VALUES ('3', '输出', 'C');
INSERT INTO `knowpoint` VALUES ('4', '爬虫', 'python');
