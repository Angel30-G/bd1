-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: blockbuster
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `blockbuster_log`
--

DROP TABLE IF EXISTS `blockbuster_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `blockbuster_log` (
  `id` int NOT NULL AUTO_INCREMENT,
  `table_names` varchar(50) NOT NULL,
  `created_on` datetime NOT NULL,
  `entry_text` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blockbuster_log`
--

LOCK TABLES `blockbuster_log` WRITE;
/*!40000 ALTER TABLE `blockbuster_log` DISABLE KEYS */;
INSERT INTO `blockbuster_log` VALUES (1,'Juan','2003-06-19 00:00:00','Me gustan las peliculas de terror'),(2,'María','1998-02-12 00:00:00','Me encanta el cine de ciencia ficción'),(3,'Pedro','2005-09-30 00:00:00','Prefiero las películas de comedia romántica'),(4,'Ana','1995-07-08 00:00:00','Soy fanática de los filmes de acción'),(5,'Luis','2001-04-23 00:00:00','Disfruto viendo películas de drama'),(6,'Carolina','2008-11-16 00:00:00','Me apasionan las películas de aventuras'),(7,'Laura','2004-03-27 00:00:00','Suelo emocionarme con las películas románticas'),(8,'Isabel','1997-01-18 00:00:00','Me encantan los clásicos del cine');
/*!40000 ALTER TABLE `blockbuster_log` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-09 18:55:57
