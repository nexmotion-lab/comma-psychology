-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: test
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dairy`
--

DROP TABLE IF EXISTS `dairy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dairy` (
  `dairy_no` int NOT NULL AUTO_INCREMENT,
  `member_id` int DEFAULT NULL,
  `dairy_contents` text,
  `dairy_coretag` varchar(255) DEFAULT NULL,
  `dairy_date` date DEFAULT NULL,
  PRIMARY KEY (`dairy_no`),
  KEY `member_id` (`member_id`),
  CONSTRAINT `dairy_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dairy`
--

LOCK TABLES `dairy` WRITE;
/*!40000 ALTER TABLE `dairy` DISABLE KEYS */;
/*!40000 ALTER TABLE `dairy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emotion`
--

DROP TABLE IF EXISTS `emotion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `emotion` (
  `emotion_no` int NOT NULL AUTO_INCREMENT,
  `emotion_name` varchar(255) DEFAULT NULL,
  `emotion_xvalue` float DEFAULT NULL,
  `emotion_yvalue` float DEFAULT NULL,
  PRIMARY KEY (`emotion_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emotion`
--

LOCK TABLES `emotion` WRITE;
/*!40000 ALTER TABLE `emotion` DISABLE KEYS */;
/*!40000 ALTER TABLE `emotion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event_tags`
--

DROP TABLE IF EXISTS `event_tags`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `event_tags` (
  `member_id` int NOT NULL,
  `event_tag` varchar(255) NOT NULL,
  PRIMARY KEY (`member_id`,`event_tag`),
  CONSTRAINT `event_tags_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event_tags`
--

LOCK TABLES `event_tags` WRITE;
/*!40000 ALTER TABLE `event_tags` DISABLE KEYS */;
/*!40000 ALTER TABLE `event_tags` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member` (
  `member_id` int NOT NULL AUTO_INCREMENT,
  `member_name` varchar(255) NOT NULL,
  `member_auth` enum('ADMIN','USER') NOT NULL,
  `member_phone` varchar(20) DEFAULT NULL,
  `member_nickname` varchar(255) DEFAULT NULL,
  `member_birth` date DEFAULT NULL,
  `member_gender` enum('남','여') DEFAULT NULL,
  `member_google_email` varchar(255) DEFAULT NULL,
  `member_naver_email` varchar(255) DEFAULT NULL,
  `member_kakao_email` varchar(255) DEFAULT NULL,
  `member_facebook_email` varchar(255) DEFAULT NULL,
  `member_expired_yn` char(1) DEFAULT NULL,
  PRIMARY KEY (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `psy_center`
--

DROP TABLE IF EXISTS `psy_center`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `psy_center` (
  `psy_center_no` int NOT NULL AUTO_INCREMENT,
  `psy_center_name` varchar(255) NOT NULL,
  `psy_center_description` text,
  `psy_center_logo` varchar(255) DEFAULT NULL,
  `psy_center_method` varchar(255) DEFAULT NULL,
  `psy_center_subject` varchar(255) DEFAULT NULL,
  `psy_center_time` varchar(255) DEFAULT NULL,
  `psy_center_category` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`psy_center_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `psy_center`
--

LOCK TABLES `psy_center` WRITE;
/*!40000 ALTER TABLE `psy_center` DISABLE KEYS */;
/*!40000 ALTER TABLE `psy_center` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `psy_info`
--

DROP TABLE IF EXISTS `psy_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `psy_info` (
  `psy_info_no` int NOT NULL AUTO_INCREMENT,
  `psy_info_title` varchar(255) NOT NULL,
  `psy_info_contents` text NOT NULL,
  `psy_info_image` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`psy_info_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `psy_info`
--

LOCK TABLES `psy_info` WRITE;
/*!40000 ALTER TABLE `psy_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `psy_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `psy_test`
--

DROP TABLE IF EXISTS `psy_test`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `psy_test` (
  `psy_test_no` int NOT NULL AUTO_INCREMENT,
  `psy_test_title` varchar(255) NOT NULL,
  `psy_test_contents` text NOT NULL,
  `psy_test_target` varchar(255) DEFAULT NULL,
  `psy_test_time` varchar(100) DEFAULT NULL,
  `psy_test_method` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`psy_test_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `psy_test`
--

LOCK TABLES `psy_test` WRITE;
/*!40000 ALTER TABLE `psy_test` DISABLE KEYS */;
/*!40000 ALTER TABLE `psy_test` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `selected_emotion_tags`
--

DROP TABLE IF EXISTS `selected_emotion_tags`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `selected_emotion_tags` (
  `selected_emotion_tags_no` int NOT NULL AUTO_INCREMENT,
  `member_id` int DEFAULT NULL,
  `selected_emotion_tag` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`selected_emotion_tags_no`),
  KEY `member_id` (`member_id`),
  CONSTRAINT `selected_emotion_tags_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `selected_emotion_tags`
--

LOCK TABLES `selected_emotion_tags` WRITE;
/*!40000 ALTER TABLE `selected_emotion_tags` DISABLE KEYS */;
/*!40000 ALTER TABLE `selected_emotion_tags` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-20 20:33:38
