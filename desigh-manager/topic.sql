/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : desigh

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2018-05-19 16:30:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for topic
-- ----------------------------
DROP TABLE IF EXISTS `topic`;
CREATE TABLE `topic` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `course` varchar(255) DEFAULT NULL COMMENT '课程',
  `stem_name` varchar(255) DEFAULT NULL COMMENT '题干',
  `knowpoint` varchar(255) DEFAULT NULL COMMENT '知识点',
  `answer` varchar(255) DEFAULT NULL COMMENT '参考答案',
  `number` int(100) DEFAULT NULL COMMENT '出现次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of topic
-- ----------------------------
INSERT INTO `topic` VALUES ('2', 'C', '22222', '集合', '2222', '2');
INSERT INTO `topic` VALUES ('3', 'python', '33', '爬虫', '33', '1');
INSERT INTO `topic` VALUES ('4', 'C', '1', '输出', '1', '1');
INSERT INTO `topic` VALUES ('5', 'java', '3433', '数组', '3433', '1');
