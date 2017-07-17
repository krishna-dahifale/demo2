CREATE DATABASE  IF NOT EXISTS `ofs` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `ofs`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: ofs
-- ------------------------------------------------------
-- Server version	5.7.18-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `feedback_report`
--

DROP TABLE IF EXISTS `feedback_report`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `feedback_report` (
  `feedback_id` int(10) DEFAULT NULL,
  `trainee_id` int(10) DEFAULT NULL,
  `question_id` varchar(10) DEFAULT NULL,
  `rating` int(10) DEFAULT NULL,
  KEY `trainee_id` (`trainee_id`),
  KEY `question_id` (`question_id`),
  CONSTRAINT `feedback_report_ibfk_1` FOREIGN KEY (`trainee_id`) REFERENCES `trainee` (`trainee_id`),
  CONSTRAINT `feedback_report_ibfk_2` FOREIGN KEY (`question_id`) REFERENCES `questions` (`question_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback_report`
--

LOCK TABLES `feedback_report` WRITE;
/*!40000 ALTER TABLE `feedback_report` DISABLE KEYS */;
INSERT INTO `feedback_report` VALUES (1,0,'1',3),(1,0,'2',3),(1,0,'3',4),(1,0,'4',3),(1,0,'5',4);
/*!40000 ALTER TABLE `feedback_report` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-31 12:04:22
