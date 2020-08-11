/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50556
Source Host           : 127.0.0.1:3306
Source Database       : translate

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2020-01-06 09:41:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(10) NOT NULL,
  `admin_code` varchar(10) NOT NULL,
  `admin_password` varchar(10) NOT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '管理员', 'admin', '12345');

-- ----------------------------
-- Table structure for author
-- ----------------------------
DROP TABLE IF EXISTS `author`;
CREATE TABLE `author` (
  `author_id` int(255) NOT NULL AUTO_INCREMENT,
  `author_name` varchar(100) CHARACTER SET gb2312 DEFAULT NULL,
  `author_image` varchar(255) DEFAULT NULL,
  `author_status` int(255) DEFAULT '1',
  PRIMARY KEY (`author_id`),
  KEY `author_name` (`author_name`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of author
-- ----------------------------
INSERT INTO `author` VALUES ('3', '星月组合', '5d8c3a7f-d46c-48ff-8dc0-cc60a22c7ba4untitled.png', '1');
INSERT INTO `author` VALUES ('5', '张学友', 'e1d4a5f4-dc97-4be4-b30a-3936aeeb7e4bzhang.png', '1');
INSERT INTO `author` VALUES ('6', '凤凰传奇', '43f748dc-6a58-49a4-8ac8-93bdc22075d9凤凰.jpg', '1');
INSERT INTO `author` VALUES ('7', '腾格尔', 'a518117f-f089-4fa2-b1ee-28378d09ade9w.jpg', '1');
INSERT INTO `author` VALUES ('8', '乌兰图雅', '5500e0b5-4769-4209-bb66-e57a05355688无图兰.jpg', '1');
INSERT INTO `author` VALUES ('9', '彭丽媛', '5560a07f-6ea7-4614-8c7e-cf4371627c75评理缘.png', '1');
INSERT INTO `author` VALUES ('10', '1', '0e878ba9-d188-42b9-85fe-4b9586bb8605w.jpg', '0');
INSERT INTO `author` VALUES ('11', '1', '73977e1d-75db-4dcf-adeb-064d1c50902dw.jpg', '0');

-- ----------------------------
-- Table structure for banner
-- ----------------------------
DROP TABLE IF EXISTS `banner`;
CREATE TABLE `banner` (
  `banner_id` int(11) NOT NULL AUTO_INCREMENT,
  `banner_weizhi` int(255) NOT NULL,
  `banner_image` varchar(100) NOT NULL,
  `banner_name` varchar(20) NOT NULL,
  `banner_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `banner_state` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`banner_id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of banner
-- ----------------------------
INSERT INTO `banner` VALUES ('33', '1', 'f8a9769f-96cb-42f1-a5ed-496ae0d9b01911.jpg', '1', '2020-01-05 13:35:38', '1');
INSERT INTO `banner` VALUES ('34', '2', '1ee38b7b-30fc-47c2-8c44-7212bfcf7c4d22.jpg', '2', '2020-01-05 13:32:40', '1');
INSERT INTO `banner` VALUES ('35', '3', 'd0f86232-59c8-466b-9729-0f4fd7881bf833.jpg', '3', '2020-01-05 13:32:47', '1');
INSERT INTO `banner` VALUES ('36', '4', '9350edd5-3892-45e9-a6b0-51b0506c082244.jpg', '4', '2020-01-05 13:32:55', '1');
INSERT INTO `banner` VALUES ('37', '5', 'a8814d2b-070a-4f85-aa27-7a3b09e21b3f55.jpg', '5', '2020-01-05 13:33:02', '1');

-- ----------------------------
-- Table structure for collect
-- ----------------------------
DROP TABLE IF EXISTS `collect`;
CREATE TABLE `collect` (
  `collect_id` int(255) NOT NULL AUTO_INCREMENT,
  `collect_music_id` int(255) NOT NULL,
  `collect_user_id` int(255) NOT NULL,
  PRIMARY KEY (`collect_id`),
  KEY `collect_music_id` (`collect_music_id`),
  KEY `collect_user_id` (`collect_user_id`),
  CONSTRAINT `collect_ibfk_1` FOREIGN KEY (`collect_music_id`) REFERENCES `musicmant` (`music_id`),
  CONSTRAINT `collect_ibfk_2` FOREIGN KEY (`collect_user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of collect
-- ----------------------------
INSERT INTO `collect` VALUES ('19', '33', '12');
INSERT INTO `collect` VALUES ('20', '36', '12');
INSERT INTO `collect` VALUES ('21', '35', '12');
INSERT INTO `collect` VALUES ('23', '37', '12');
INSERT INTO `collect` VALUES ('26', '38', '12');

-- ----------------------------
-- Table structure for discuss
-- ----------------------------
DROP TABLE IF EXISTS `discuss`;
CREATE TABLE `discuss` (
  `discuss_id` int(11) NOT NULL AUTO_INCREMENT,
  `discuss_user_id` int(11) NOT NULL,
  `discuss_content` varchar(100) NOT NULL,
  `discuss_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `discuss_music_id` int(11) NOT NULL,
  `discuss_status` int(255) NOT NULL DEFAULT '1',
  PRIMARY KEY (`discuss_id`),
  KEY `discuss_user_id` (`discuss_user_id`),
  KEY `discuss_music_id` (`discuss_music_id`),
  CONSTRAINT `discuss_ibfk_1` FOREIGN KEY (`discuss_user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `discuss_ibfk_2` FOREIGN KEY (`discuss_music_id`) REFERENCES `musicmant` (`music_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of discuss
-- ----------------------------
INSERT INTO `discuss` VALUES ('1', '6', '1', '2019-12-31 10:24:59', '33', '0');
INSERT INTO `discuss` VALUES ('2', '6', '2', '2019-12-31 10:24:59', '34', '0');
INSERT INTO `discuss` VALUES ('3', '9', '4', '2019-12-28 09:51:34', '33', '1');
INSERT INTO `discuss` VALUES ('4', '12', '123', '2019-12-29 11:13:33', '33', '1');
INSERT INTO `discuss` VALUES ('5', '12', '我的第一个评论', '2019-12-29 16:49:15', '35', '1');
INSERT INTO `discuss` VALUES ('6', '12', '123', '2019-12-31 10:18:54', '33', '1');
INSERT INTO `discuss` VALUES ('7', '12', '1213', '2019-12-31 14:16:12', '33', '1');
INSERT INTO `discuss` VALUES ('8', '12', 'dddd', '2020-01-03 20:34:44', '35', '1');
INSERT INTO `discuss` VALUES ('9', '12', '123123', '2020-01-04 22:59:52', '36', '1');
INSERT INTO `discuss` VALUES ('10', '12', '12312313', '2020-01-05 12:12:45', '37', '1');
INSERT INTO `discuss` VALUES ('11', '12', '喜欢凤凰传奇', '2020-01-05 20:41:52', '42', '1');

-- ----------------------------
-- Table structure for musicmant
-- ----------------------------
DROP TABLE IF EXISTS `musicmant`;
CREATE TABLE `musicmant` (
  `music_id` int(11) NOT NULL AUTO_INCREMENT,
  `music_name` varchar(20) NOT NULL,
  `music_image` varchar(100) NOT NULL,
  `music_music` varchar(100) NOT NULL,
  `music_author_id` int(255) NOT NULL,
  `music_type` int(255) NOT NULL,
  `music_collect` int(255) NOT NULL DEFAULT '0',
  `music_hot` int(255) NOT NULL DEFAULT '0',
  `music_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `music_status` int(255) NOT NULL DEFAULT '1',
  PRIMARY KEY (`music_id`),
  KEY `music_author_id` (`music_author_id`),
  CONSTRAINT `musicmant_ibfk_1` FOREIGN KEY (`music_author_id`) REFERENCES `author` (`author_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of musicmant
-- ----------------------------
INSERT INTO `musicmant` VALUES ('33', '请问权威', '724ca8ed-2f22-4b60-a8ba-aea80299144dnew修改.PNG', 'abce3ab1-f2f2-4426-b84b-41890528283eMi2 - 勇敢爱.mp3', '3', '1', '0', '1', '2020-01-05 17:34:22', '0');
INSERT INTO `musicmant` VALUES ('34', '2', '60bbf0fd-0ce6-43f9-8aa6-5fa9ede1980eadmin创立.PNG', 'acbb42f3-3fae-4bd1-b4b5-5a3bf38f8181Mi2 - 勇敢爱.mp3', '3', '4', '0', '1', '2020-01-05 17:34:22', '0');
INSERT INTO `musicmant` VALUES ('35', '123234234', '25c100d1-dd7d-4a7b-aa63-445084e45d98music创立.PNG', 'a4009f7b-19a9-4490-abda-8a9a6b4e872cMi2 - 勇敢爱.mp3', '3', '3', '0', '1', '2020-01-05 17:34:22', '0');
INSERT INTO `musicmant` VALUES ('36', '房荒川其', 'defbd930-7c68-485a-980b-dc5fa5eec69d1.png', 'a48a82b4-6709-4017-9640-fb55d7a0103e凤凰传奇 - 今生的缘.mp3', '6', '1', '0', '1', '2020-01-05 17:34:22', '1');
INSERT INTO `musicmant` VALUES ('37', '刘三姐', '0b9aeb27-7097-4c0a-b367-67946f825d302.jpg', '11aadcf2-207e-4434-9160-d1e5d0486908凤凰传奇 - 刘三姐.mp3', '6', '3', '0', '1', '2020-01-05 17:34:22', '1');
INSERT INTO `musicmant` VALUES ('38', '绿旋风', '7a9d35bc-6225-4fa8-b4e3-90eecee824723.jpg', 'd78c72f8-c7a7-4dc2-926e-421776b61196凤凰传奇 - 绿旋风.mp3', '6', '2', '0', '1', '2020-01-05 17:34:22', '1');
INSERT INTO `musicmant` VALUES ('39', '草原之夜', '2e9f18c9-21fc-424c-9cdc-8dea77bb4d72t1.jpg', '3ff563d6-21db-41b4-bd65-0a7815ee0e48腾格尔 - 草原之夜.mp3', '7', '2', '0', '4', '2020-01-06 07:26:02', '1');
INSERT INTO `musicmant` VALUES ('40', '天边的故乡', '891672f5-0c19-4fd2-83be-c4179f0d9382untitled2.png', '09b051e8-3460-4404-9083-48e7fe9d72f3凤凰传奇 - 天边的故乡.mp3', '6', '4', '0', '1', '2020-01-05 17:34:22', '1');
INSERT INTO `musicmant` VALUES ('41', '今生的缘', '24983964-9aba-4d49-840e-dfff136aa2b64.jpg', '9dadb51e-389c-4fb9-ab5d-2bf244d5b3e4凤凰传奇 - 今生的缘.mp3', '6', '1', '0', '1', '2020-01-05 17:34:22', '1');
INSERT INTO `musicmant` VALUES ('42', '拉萨雄鹰', '65e73b4b-1716-489e-bb42-2d120950013duntitled2.png', '08772001-a289-45e2-9442-e53bfe4d6434凤凰传奇 - 拉萨雄鹰.mp3', '6', '2', '0', '3', '2020-01-05 17:41:10', '1');
INSERT INTO `musicmant` VALUES ('43', '女驸马', '17e8ccdf-d5ee-4054-90f0-78059349d2d1w1.png', '9887b862-f76f-4730-ba04-3fd0dc466eb1乌兰图雅 - 女驸马.mp3', '8', '1', '0', '0', '2020-01-06 07:02:04', '1');
INSERT INTO `musicmant` VALUES ('44', '摇篮曲', '5f3fcd29-fcd6-4afa-96d4-b712e3f7191cw.jpg', '54d9a09a-f33b-47cb-a2c8-dc120e201d82腾格尔 - 摇篮曲.mp3', '7', '2', '0', '0', '2020-01-06 07:03:04', '1');
INSERT INTO `musicmant` VALUES ('45', '马兰花', '04cda72d-67ed-4d01-9e10-b1d5d4096b11无图兰.jpg', 'a4316b3e-e614-4187-a114-2a6c66394c1c乌兰图雅 - 马兰花.mp3', '8', '1', '0', '0', '2020-01-06 07:03:54', '1');
INSERT INTO `musicmant` VALUES ('46', '赞歌', '24ba6b70-6672-43f8-9063-6e6aa384231bw1.png', '2db99449-0cd2-4bd2-8f12-21ca13efc630乌兰图雅 - 赞歌.mp3', '8', '1', '0', '0', '2020-01-06 07:04:46', '1');
INSERT INTO `musicmant` VALUES ('47', '曼里', 'dfd2cc04-392f-473e-adbf-32818894ee87w2.jpg', '6a7e2cdb-d637-4ab5-a1cb-0cf46019228d乌兰图雅 - 曼莉.mp3', '8', '1', '0', '0', '2020-01-06 07:05:29', '1');
INSERT INTO `musicmant` VALUES ('48', '天路', '38f394f7-dcc6-4cf5-b1c3-b4684b929844评理缘.png', '4b8a44a3-3040-4242-af60-d222efc0113d彭丽媛 - 天路.mp3', '9', '1', '0', '0', '2020-01-06 07:06:15', '1');
INSERT INTO `musicmant` VALUES ('49', '乌兰图雅', 'fa5ceba1-f260-468a-a4ca-b1a734f5d63d无图兰.jpg', '249a2808-f459-4749-9f60-d00ef0eb84e9乌兰图雅 - 诺恩吉雅.mp3', '8', '1', '0', '0', '2020-01-06 07:11:53', '1');

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `news_id` int(11) NOT NULL AUTO_INCREMENT,
  `news_text` varchar(255) NOT NULL,
  `news_title` varchar(255) NOT NULL,
  `news_readstate` int(11) NOT NULL DEFAULT '0' COMMENT '阅读状态0未读1已读',
  `news_state` int(11) NOT NULL DEFAULT '1',
  `news_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `news_author_id` int(255) DEFAULT NULL,
  `news_type` int(255) DEFAULT NULL COMMENT '1代表歌手发布歌曲0代表其他消息',
  PRIMARY KEY (`news_id`),
  KEY `news_ibfk_1` (`news_author_id`),
  CONSTRAINT `news_ibfk_1` FOREIGN KEY (`news_author_id`) REFERENCES `author` (`author_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('19', '凤凰传奇发布了绿旋风', '凤凰传奇发布新歌了', '0', '1', '2020-01-05 13:21:02', '6', '1');
INSERT INTO `news` VALUES ('21', '腾格尔发布了新歌', '腾格尔发布新歌', '0', '1', '2020-01-05 13:02:50', '7', '1');
INSERT INTO `news` VALUES ('25', '凤凰传奇发布新歌是刘三姐', '凤凰传奇发布新歌', '0', '1', '2020-01-05 13:52:28', '6', '1');
INSERT INTO `news` VALUES ('32', '凤凰传奇发布天边的故乡      ', '凤凰传奇发布新歌', '0', '1', '2020-01-05 14:30:56', '6', '1');
INSERT INTO `news` VALUES ('50', '  1              ', '1', '0', '1', '2020-01-06 08:28:37', '8', '1');

-- ----------------------------
-- Table structure for relationship
-- ----------------------------
DROP TABLE IF EXISTS `relationship`;
CREATE TABLE `relationship` (
  `relationship_id` int(255) NOT NULL AUTO_INCREMENT,
  `relationship_user_id` int(255) DEFAULT NULL,
  `relationship_author_id` int(255) DEFAULT NULL,
  PRIMARY KEY (`relationship_id`),
  KEY `relationship_user_id` (`relationship_user_id`),
  KEY `relationship_author_id` (`relationship_author_id`),
  CONSTRAINT `relationship_ibfk_1` FOREIGN KEY (`relationship_user_id`) REFERENCES `user` (`user_id`) ON DELETE SET NULL ON UPDATE SET NULL,
  CONSTRAINT `relationship_ibfk_2` FOREIGN KEY (`relationship_author_id`) REFERENCES `author` (`author_id`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of relationship
-- ----------------------------
INSERT INTO `relationship` VALUES ('1', '6', '3');
INSERT INTO `relationship` VALUES ('29', '12', '3');
INSERT INTO `relationship` VALUES ('32', '14', '6');
INSERT INTO `relationship` VALUES ('42', '12', '6');
INSERT INTO `relationship` VALUES ('43', '14', '8');
INSERT INTO `relationship` VALUES ('44', '15', '8');

-- ----------------------------
-- Table structure for reply
-- ----------------------------
DROP TABLE IF EXISTS `reply`;
CREATE TABLE `reply` (
  `reply_id` int(11) NOT NULL AUTO_INCREMENT,
  `reply_user_id` int(11) NOT NULL,
  `reply_dis_user_id` int(11) DEFAULT NULL,
  `reply_content` varchar(100) NOT NULL,
  `reply_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `reply_reply_id` int(11) DEFAULT NULL COMMENT '防止评论重复',
  `reply_discuss_id` int(11) DEFAULT NULL,
  `reply_status` int(255) NOT NULL DEFAULT '1',
  `reply_read_status` int(255) DEFAULT '0',
  PRIMARY KEY (`reply_id`),
  KEY `reply_user_id` (`reply_user_id`),
  KEY `reply_dis_user_id` (`reply_dis_user_id`),
  KEY `reply_discuss_id` (`reply_discuss_id`),
  KEY `reply_reply_id` (`reply_reply_id`),
  CONSTRAINT `reply_ibfk_1` FOREIGN KEY (`reply_user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `reply_ibfk_2` FOREIGN KEY (`reply_dis_user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `reply_ibfk_3` FOREIGN KEY (`reply_discuss_id`) REFERENCES `discuss` (`discuss_id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reply
-- ----------------------------
INSERT INTO `reply` VALUES ('1', '6', '9', '2', '2020-01-04 21:25:08', '0', '4', '1', '0');
INSERT INTO `reply` VALUES ('2', '6', '11', '24', '2020-01-04 21:25:12', '1', '4', '1', '0');
INSERT INTO `reply` VALUES ('9', '12', '6', '大家好', '2020-01-04 21:25:15', '2', '4', '0', '0');
INSERT INTO `reply` VALUES ('11', '12', '6', '是多少', '2020-01-04 21:25:16', '1', '4', '0', '0');
INSERT INTO `reply` VALUES ('15', '12', '12', '12', '2020-01-05 14:03:35', '0', '4', '0', '1');
INSERT INTO `reply` VALUES ('16', '14', '12', '你评论什么啦', '2020-01-05 14:03:35', '0', '5', '0', '1');
INSERT INTO `reply` VALUES ('17', '12', '14', '管你什么是', '2020-01-04 21:25:20', '16', '5', '0', '0');
INSERT INTO `reply` VALUES ('18', '12', '12', '123123', '2020-01-05 14:03:35', '0', '7', '0', '1');
INSERT INTO `reply` VALUES ('19', '14', '12', '123123dddd', '2020-01-04 22:07:26', '18', '7', '0', '1');
INSERT INTO `reply` VALUES ('20', '13', '12', '123123', '2020-01-05 14:03:35', '0', '7', '1', '1');
INSERT INTO `reply` VALUES ('21', '13', '12', '123', '2020-01-04 22:07:23', '18', '7', '1', '1');
INSERT INTO `reply` VALUES ('22', '12', '12', '我喜欢这首歌', '2020-01-04 22:07:22', '0', '8', '0', '1');
INSERT INTO `reply` VALUES ('24', '12', '12', '123123123', '2020-01-05 14:03:35', '0', '9', '0', '1');
INSERT INTO `reply` VALUES ('25', '12', '12', '12313123', '2020-01-05 14:03:35', '0', '9', '0', '1');
INSERT INTO `reply` VALUES ('26', '12', '12', '123123', '2020-01-05 14:03:35', '0', '9', '1', '1');
INSERT INTO `reply` VALUES ('27', '12', '12', '123123123123ddddd', '2020-01-05 14:03:35', '26', '9', '1', '1');

-- ----------------------------
-- Table structure for touxiang
-- ----------------------------
DROP TABLE IF EXISTS `touxiang`;
CREATE TABLE `touxiang` (
  `touxiang_id` int(12) NOT NULL AUTO_INCREMENT,
  `touxiang_image` varchar(255) NOT NULL,
  `touxiang_state` int(255) NOT NULL DEFAULT '1',
  `touxiang_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`touxiang_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of touxiang
-- ----------------------------
INSERT INTO `touxiang` VALUES ('3', 'de3d13e2-deec-4054-8221-01551343c336music创立.PNG', '1', '2019-12-31 16:47:03');
INSERT INTO `touxiang` VALUES ('4', 'e4c6ce3a-c01c-4172-8585-7e481744bbdachangting.png', '1', '2019-12-31 17:14:08');
INSERT INTO `touxiang` VALUES ('6', '3c81fcc4-980b-474e-a2d8-1f912a447b0f3.jpg', '1', '2020-01-04 13:57:19');
INSERT INTO `touxiang` VALUES ('8', 'c72873b8-8f5f-4398-887c-29c788852fd2t1.jpg', '1', '2020-01-06 07:20:09');
INSERT INTO `touxiang` VALUES ('9', '5a8dacca-d77b-4cba-89a5-41506b04768at2.jpg', '1', '2020-01-06 07:20:19');
INSERT INTO `touxiang` VALUES ('10', '675d21ff-63f4-4953-bd1a-6ff62261ccbat4.png', '1', '2020-01-06 07:20:29');
INSERT INTO `touxiang` VALUES ('11', 'b6b4aae9-d4a0-42fb-a3b8-02579d2c7cd6t6.jpg', '1', '2020-01-06 07:20:41');
INSERT INTO `touxiang` VALUES ('12', '2579c789-32d6-4234-92ef-ce1e069910ebt8.jpg', '1', '2020-01-06 07:20:54');
INSERT INTO `touxiang` VALUES ('13', 'd99ff299-ed4e-4cc1-a02f-0e0d1e4ddedet9.jpg', '1', '2020-01-06 07:21:48');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(255) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(30) NOT NULL,
  `user_code` varchar(11) NOT NULL,
  `user_password` varchar(10) NOT NULL,
  `user_state` int(11) NOT NULL DEFAULT '1',
  `user_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `user_image_id` int(255) DEFAULT '4',
  `user_readcount` int(255) DEFAULT '0' COMMENT '阅读状态',
  PRIMARY KEY (`user_id`),
  KEY `user_image_id` (`user_image_id`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`user_image_id`) REFERENCES `touxiang` (`touxiang_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('6', '4', '4', '4', '0', '2020-01-05 23:38:46', '3', '0');
INSERT INTO `user` VALUES ('9', '1', '1111111111', '213', '3', '2020-01-05 14:25:24', '4', '0');
INSERT INTO `user` VALUES ('11', '1222', '12312312313', '12', '0', '2020-01-06 00:02:05', '3', '0');
INSERT INTO `user` VALUES ('12', '12312321313', '12312312351', '333333', '1', '2020-01-05 15:31:05', '6', '1');
INSERT INTO `user` VALUES ('13', '享是多少', '11111111111', '111111', '1', '2020-01-05 14:25:31', '4', '0');
INSERT INTO `user` VALUES ('14', '黄小伟', '17367949362', '214175', '1', '2020-01-06 08:28:37', '4', '4');
INSERT INTO `user` VALUES ('15', '夏娜', '12312312312', '123123', '1', '2020-01-06 08:28:37', '9', '1');
INSERT INTO `user` VALUES ('16', '小明', '17989999123', '000888', '1', '2020-01-06 00:31:15', '4', '0');

-- ----------------------------
-- Table structure for zan
-- ----------------------------
DROP TABLE IF EXISTS `zan`;
CREATE TABLE `zan` (
  `zan_id` int(11) NOT NULL AUTO_INCREMENT,
  `zan_user_id` int(11) NOT NULL,
  `zan_status` int(11) NOT NULL DEFAULT '1',
  `zan_music_id` int(11) NOT NULL,
  `zan_discuss_id` int(11) NOT NULL,
  PRIMARY KEY (`zan_id`),
  KEY `zan_user_id` (`zan_user_id`),
  KEY `zan_music_id` (`zan_music_id`),
  KEY `zan_discuss_id` (`zan_discuss_id`),
  CONSTRAINT `zan_ibfk_1` FOREIGN KEY (`zan_user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `zan_ibfk_2` FOREIGN KEY (`zan_music_id`) REFERENCES `musicmant` (`music_id`),
  CONSTRAINT `zan_ibfk_3` FOREIGN KEY (`zan_discuss_id`) REFERENCES `discuss` (`discuss_id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of zan
-- ----------------------------
INSERT INTO `zan` VALUES ('2', '9', '1', '33', '1');
INSERT INTO `zan` VALUES ('3', '9', '1', '33', '2');
INSERT INTO `zan` VALUES ('10', '13', '1', '33', '1');
INSERT INTO `zan` VALUES ('11', '13', '1', '33', '3');
INSERT INTO `zan` VALUES ('12', '13', '1', '33', '4');
INSERT INTO `zan` VALUES ('30', '12', '1', '33', '7');
INSERT INTO `zan` VALUES ('31', '12', '1', '33', '6');
INSERT INTO `zan` VALUES ('32', '12', '1', '33', '4');
INSERT INTO `zan` VALUES ('33', '14', '1', '33', '3');
INSERT INTO `zan` VALUES ('34', '14', '1', '33', '4');
INSERT INTO `zan` VALUES ('35', '14', '1', '33', '6');
INSERT INTO `zan` VALUES ('36', '12', '1', '36', '9');
INSERT INTO `zan` VALUES ('37', '12', '1', '37', '10');

-- ----------------------------
-- Table structure for zanry
-- ----------------------------
DROP TABLE IF EXISTS `zanry`;
CREATE TABLE `zanry` (
  `zanry_id` int(11) NOT NULL AUTO_INCREMENT,
  `zanry_user_id` int(11) NOT NULL,
  `zanry_status` int(11) NOT NULL DEFAULT '1',
  `zanry_reply_id` int(11) NOT NULL,
  `zanry_discuss_id` int(11) NOT NULL,
  PRIMARY KEY (`zanry_id`),
  KEY `zanry_user_id` (`zanry_user_id`),
  KEY `zanry_reply_id` (`zanry_reply_id`),
  KEY `zanry_discuss_id` (`zanry_discuss_id`),
  CONSTRAINT `zanry_ibfk_1` FOREIGN KEY (`zanry_user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `zanry_ibfk_4` FOREIGN KEY (`zanry_reply_id`) REFERENCES `reply` (`reply_id`),
  CONSTRAINT `zanry_ibfk_5` FOREIGN KEY (`zanry_discuss_id`) REFERENCES `discuss` (`discuss_id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of zanry
-- ----------------------------
INSERT INTO `zanry` VALUES ('1', '6', '1', '1', '4');
INSERT INTO `zanry` VALUES ('27', '12', '1', '9', '4');
INSERT INTO `zanry` VALUES ('44', '14', '1', '17', '5');
INSERT INTO `zanry` VALUES ('45', '14', '1', '18', '7');
INSERT INTO `zanry` VALUES ('46', '12', '1', '18', '7');
INSERT INTO `zanry` VALUES ('47', '12', '1', '19', '7');
INSERT INTO `zanry` VALUES ('48', '13', '1', '20', '7');
INSERT INTO `zanry` VALUES ('52', '12', '1', '1', '4');
