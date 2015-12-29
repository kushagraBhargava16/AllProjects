/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.5.27 : Database - trainingmanagement
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`trainingmanagement` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `trainingmanagement`;

/*Table structure for table `courses` */

DROP TABLE IF EXISTS `courses`;

CREATE TABLE `courses` (
  `courses_id` int(4) NOT NULL AUTO_INCREMENT,
  `description` varchar(100) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `refrenceCode` varchar(30) DEFAULT NULL,
  `courseTitle` varchar(15) DEFAULT NULL,
  `user_id` int(5) DEFAULT NULL,
  PRIMARY KEY (`courses_id`),
  KEY `fk_userId` (`user_id`),
  CONSTRAINT `fk_userId` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

/*Data for the table `courses` */

insert  into `courses`(`courses_id`,`description`,`status`,`refrenceCode`,`courseTitle`,`user_id`) values (4,'creating UI at its best',1,'HTML2015','HTML',5),(19,'learning the advance java ',1,'advance2015','ADVANCED JAVA',5);

/*Table structure for table `designation` */

DROP TABLE IF EXISTS `designation`;

CREATE TABLE `designation` (
  `designation_id` int(1) NOT NULL,
  `designation_type` varchar(15) NOT NULL,
  PRIMARY KEY (`designation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `designation` */

insert  into `designation`(`designation_id`,`designation_type`) values (1,'manager'),(2,'trainer'),(3,'trainee');

/*Table structure for table `heading` */

DROP TABLE IF EXISTS `heading`;

CREATE TABLE `heading` (
  `heading_id` int(4) NOT NULL AUTO_INCREMENT,
  `heading` varchar(30) DEFAULT NULL,
  `courses_id` int(4) DEFAULT NULL,
  PRIMARY KEY (`heading_id`),
  KEY `heading_ibfk_1` (`courses_id`),
  CONSTRAINT `heading_ibfk_1` FOREIGN KEY (`courses_id`) REFERENCES `courses` (`courses_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=latin1;

/*Data for the table `heading` */

insert  into `heading`(`heading_id`,`heading`,`courses_id`) values (32,'table',4),(35,'HTML5',4),(38,'form',4),(42,'border',4),(43,'css',4),(47,'javascript',4),(48,'servlet',19),(49,'jsp',19);

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `role_id` int(1) NOT NULL,
  `role_type` varchar(10) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `role` */

insert  into `role`(`role_id`,`role_type`) values (1,'admin'),(2,'user'),(3,'guest');

/*Table structure for table `status` */

DROP TABLE IF EXISTS `status`;

CREATE TABLE `status` (
  `status_id` int(1) NOT NULL,
  `status_type` varchar(10) NOT NULL,
  PRIMARY KEY (`status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `status` */

insert  into `status`(`status_id`,`status_type`) values (0,'block'),(1,'active');

/*Table structure for table `subheading` */

DROP TABLE IF EXISTS `subheading`;

CREATE TABLE `subheading` (
  `subheading_id` int(4) NOT NULL AUTO_INCREMENT,
  `subheading` varchar(30) DEFAULT NULL,
  `heading_id` int(4) DEFAULT NULL,
  `status` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`subheading_id`),
  KEY `subheading_ibfk_1` (`heading_id`),
  CONSTRAINT `subheading_ibfk_1` FOREIGN KEY (`heading_id`) REFERENCES `heading` (`heading_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

/*Data for the table `subheading` */

insert  into `subheading`(`subheading_id`,`subheading`,`heading_id`,`status`) values (13,'input data',38,'COMPLETED'),(14,'hello',38,'NOT-COMPLETED');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `contact` varchar(10) DEFAULT NULL,
  `emailid` varchar(30) DEFAULT NULL,
  `designation` int(1) DEFAULT NULL,
  `status` int(1) NOT NULL,
  `role` int(1) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(12) NOT NULL,
  PRIMARY KEY (`user_id`),
  KEY `fk_designation` (`designation`),
  KEY `fk_role` (`role`),
  KEY `fk_status` (`status`),
  CONSTRAINT `fk_designation` FOREIGN KEY (`designation`) REFERENCES `designation` (`designation_id`),
  CONSTRAINT `fk_role` FOREIGN KEY (`role`) REFERENCES `role` (`role_id`),
  CONSTRAINT `fk_status` FOREIGN KEY (`status`) REFERENCES `status` (`status_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert  into `user`(`user_id`,`name`,`contact`,`emailid`,`designation`,`status`,`role`,`username`,`password`) values (1,'nikhil','9926930080','nikhilesh.sadhav@yash.com',2,1,2,'nikhil.s','nikhil'),(2,'kushagra','9479359375','kush.b@yash.com',3,1,3,'t','t'),(5,'k','k','k',1,1,2,'m','m'),(6,'pratik sethia','8989898989','pra@p.com',2,1,3,'tr','tr');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
