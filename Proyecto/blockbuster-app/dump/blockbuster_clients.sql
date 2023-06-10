-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: blockbuster
-- ------------------------------------------------------
-- Server version	8.0.32
DROP USER IF EXISTS 'blockbusterappuser'@'localhost';
CREATE USER IF NOT EXISTS 'blockbusterappuser'@'localhost' IDENTIFIED BY 'blockbusterapppass';
GRANT SELECT, INSERT, UPDATE, DELETE, EXECUTE ON blockbuster.* TO 'blockbusterappuser'@'localhost';

SET autocommit = OFF;

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
-- Table structure for table `clients`
--

DROP TABLE IF EXISTS `clients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clients` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `cedula` int NOT NULL,
  `telefono` int NOT NULL,
  `direccion` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clients`
--

LOCK TABLES `clients` WRITE;
/*!40000 ALTER TABLE `clients` DISABLE KEYS */;
INSERT INTO `clients` VALUES (1,'Frank','Suarez',209870899,87995678,'Alajuela'),(2,'Pablo','Ramirez',890456788,89567810,'San jose'),(3,'Xavier','Villanueva',210908928,67891090,'Guanacaste'),(4,'Jimmy','Cervantes',890184567,78892314,'Limon'),(5,'Olga','Vargas',834589010,65709009,'Heredia'),(6,'Maria','Peña',210345670,89592740,'Cartago'),(7,'Juan','Espinoza',256789030,86775302,'Puntarenas'),(8,'Belia','Santamaria',278980017,89305679,'Alajuela'),(9,'Leonardo','Benavides',756789000,76891023,'Limon'),(10,'Yasmin','Sanchez',410234257,81478002,'San jose'),(11,'Frank','Suarez',209870899,87995678,'Alajuela'),(12,'Pablo','Ramirez',890456788,89567810,'San jose'),(13,'Xavier','Villanueva',210908928,67891090,'Guanacaste'),(14,'Jimmy','Cervantes',890184567,78892314,'Limon'),(15,'Olga','Vargas',834589010,65709009,'Heredia'),(16,'Maria','Peña',210345670,89592740,'Cartago'),(17,'Juan','Espinoza',256789030,86775302,'Puntarenas'),(18,'Belia','Santamaria',278980017,89305679,'Alajuela'),(19,'Leonardo','Benavides',756789000,76891023,'Limon'),(20,'Yasmin','Sanchez',410234257,81478002,'San jose');
/*!40000 ALTER TABLE `clients` ENABLE KEYS */;
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
