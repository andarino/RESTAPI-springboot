-- MariaDB dump 10.19  Distrib 10.7.3-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: projeto
-- ------------------------------------------------------
-- Server version	10.7.3-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES
(113);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_conta`
--

DROP TABLE IF EXISTS `tb_conta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_conta` (
  `num_conta` bigint(20) NOT NULL,
  `cpf` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `saldo` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`num_conta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_conta`
--

LOCK TABLES `tb_conta` WRITE;
/*!40000 ALTER TABLE `tb_conta` DISABLE KEYS */;
INSERT INTO `tb_conta` VALUES
(96,'10.100.100-90','654'),
(97,'30.300.330-30','43522452345'),
(98,'23.23.23-23','2121'),
(99,'340.3300.3330-330','896'),
(100,'12.34.56-78','1234'),
(110,'340.330.3330-330','8956'),
(112,'100.000.00-000','8953453456');
/*!40000 ALTER TABLE `tb_conta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_lancamento`
--

DROP TABLE IF EXISTS `tb_lancamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_lancamento` (
  `num_lancamento` bigint(20) NOT NULL,
  `data_lancamento` date DEFAULT NULL,
  `desc_lancamento` longtext COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `natureza_lancamento` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `valor_lancamento` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `num_conta` bigint(20) NOT NULL,
  PRIMARY KEY (`num_lancamento`),
  KEY `FKl40h9oinnfat530oo7b1exstq` (`num_conta`),
  CONSTRAINT `FKl40h9oinnfat530oo7b1exstq` FOREIGN KEY (`num_conta`) REFERENCES `tb_conta` (`num_conta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_lancamento`
--

LOCK TABLES `tb_lancamento` WRITE;
/*!40000 ALTER TABLE `tb_lancamento` DISABLE KEYS */;
INSERT INTO `tb_lancamento` VALUES
(34,NULL,'basa','C','123476',96),
(107,NULL,'santander','F','0.222',96),
(109,NULL,'oriundo','D','450.222',96),
(111,NULL,'bugando','C','450676222',96);
/*!40000 ALTER TABLE `tb_lancamento` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-10 22:22:32
