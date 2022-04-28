CREATE DATABASE  IF NOT EXISTS `hotel_information_system` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `hotel_information_system`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: hotel_information_system
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `apartments`
--

DROP TABLE IF EXISTS `apartments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `apartments` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `apartment_number` varchar(10) NOT NULL,
  `floor_number` int NOT NULL,
  `number_of_rooms` int NOT NULL,
  `occupied` int NOT NULL,
  `price` int NOT NULL,
  `payment` int DEFAULT NULL,
  `payment_datetime` varchar(20) DEFAULT NULL,
  `rent_start_date` varchar(20) DEFAULT NULL,
  `rent_end_date` varchar(20) DEFAULT NULL,
  `renter_national_id` varchar(20) DEFAULT NULL,
  `renter_name` varchar(40) DEFAULT NULL,
  `creationDateTime` datetime NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `apartments`
--

LOCK TABLES `apartments` WRITE;
/*!40000 ALTER TABLE `apartments` DISABLE KEYS */;
INSERT INTO `apartments` VALUES (1,'1',0,3,0,1500,NULL,NULL,NULL,NULL,NULL,NULL,'2022-04-22 21:54:02'),(2,'2',0,3,0,1500,NULL,NULL,NULL,NULL,NULL,NULL,'2022-04-22 21:55:07'),(3,'1',1,2,1,1000,1000,'22 04 2022','22 04 2022','30 04 2022','1112223334','Wael Alghamdi','2022-04-22 21:57:00'),(4,'2',1,4,0,2000,NULL,NULL,NULL,NULL,NULL,NULL,'2022-04-22 21:59:07'),(5,'1',3,3,0,1500,NULL,NULL,NULL,NULL,NULL,NULL,'2022-04-22 21:59:28'),(6,'1',4,3,0,1500,NULL,NULL,NULL,NULL,NULL,NULL,'2022-04-22 21:59:38'),(7,'1',5,3,0,1500,NULL,NULL,NULL,NULL,NULL,NULL,'2022-04-22 21:59:43'),(8,'1',6,3,0,1500,NULL,NULL,NULL,NULL,NULL,NULL,'2022-04-22 21:59:47'),(9,'2',6,3,0,1500,1500,'22 04 2022','22 04 2022','30 04 2022','4443332221','Abdulaziz Alsolime','2022-04-22 22:13:47'),(10,'3',6,3,0,1500,NULL,NULL,NULL,NULL,NULL,NULL,'2022-04-22 22:42:54'),(11,'4',6,3,1,1500,1500,'23 04 2022','23 04 2022','23 04 2022','4413312211','Ahmad Ali','2022-04-23 01:24:10');
/*!40000 ALTER TABLE `apartments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedbacks`
--

DROP TABLE IF EXISTS `feedbacks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedbacks` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `email` varchar(30) NOT NULL,
  `subject` varchar(40) NOT NULL,
  `type` varchar(20) NOT NULL,
  `message` varchar(1000) NOT NULL,
  `creationDateTime` datetime NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedbacks`
--

LOCK TABLES `feedbacks` WRITE;
/*!40000 ALTER TABLE `feedbacks` DISABLE KEYS */;
INSERT INTO `feedbacks` VALUES (1,'Wael Ahmad Ali Alghamdi','0503997477','s438002939@st.uqu.edu.sa','Help','Help','I have problem','2022-04-22 22:03:37'),(2,'Abdulaziz Talaq Alsolime','0541190275','s438002122@st.uqu.edu.sa','Help','Help','I have problem...','2022-04-22 22:05:44'),(3,'Ahmad a','0505555555','mr.ahmad@gmail.com','Idea','Idea','I have an idea...','2022-04-22 22:45:54'),(4,'Ahmad Ali','966505555555','Mr.AhmadAli@gmail.com','Help','Help','I need help...','2022-04-23 02:48:54');
/*!40000 ALTER TABLE `feedbacks` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-23  5:07:35
