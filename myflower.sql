-- MySQL dump 10.13  Distrib 5.6.10, for Win64 (x86_64)
--
-- Host: localhost    Database: flowershop
-- ------------------------------------------------------
-- Server version	5.6.10

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
-- Current Database: `flowershop`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `flowershop` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `flowershop`;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cart` (
  `cfid` int(11) DEFAULT NULL,
  `ccount` int(11) DEFAULT NULL,
  `cname` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
INSERT INTO `cart` VALUES (27,3,'18710804025'),(15,1,'18210804022'),(23,1,'18710804022'),(5,5,'18710804022'),(8,1,'18710804066'),(10,3,'18710804066'),(2,2,'18711122244');
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `client` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(20) DEFAULT NULL,
  `cpass` varchar(20) DEFAULT NULL,
  `ctel` varchar(30) DEFAULT NULL,
  `cmail` varchar(40) DEFAULT NULL,
  `caddr` varchar(60) DEFAULT NULL,
  `ccart` varchar(40) DEFAULT NULL,
  `corder` varchar(40) DEFAULT NULL,
  `ca` varchar(20) DEFAULT NULL,
  `cb` varchar(20) DEFAULT NULL,
  `cc` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (3,'dsafdsf','ssssss','18711122244','sdfsdaf@qq.com',NULL,NULL,NULL,NULL,NULL,NULL),(6,'chenquan','ssssss','18710804022','18710804111@qq.com',NULL,NULL,NULL,NULL,NULL,NULL),(7,'zhansan','qwerty','18710804066','111111111@qq.com',NULL,NULL,NULL,NULL,NULL,NULL),(8,'zhansan','qwerty','18710804066','111111111@qq.com',NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flower`
--

DROP TABLE IF EXISTS `flower`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `flower` (
  `fid` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(20) DEFAULT NULL,
  `fprice` varchar(20) DEFAULT NULL,
  `ftid` int(11) DEFAULT NULL,
  `fgroup` varchar(40) DEFAULT NULL,
  `fcolor` varchar(40) DEFAULT NULL,
  `fstyle` varchar(40) DEFAULT NULL,
  `fnote` varchar(40) DEFAULT NULL,
  `fnum` int(11) DEFAULT NULL,
  `fbrand` varchar(40) DEFAULT NULL,
  `ftype` varchar(40) DEFAULT NULL,
  `fimgs` varchar(40) DEFAULT NULL,
  `fimg1` varchar(40) DEFAULT NULL,
  `fimg2` varchar(40) DEFAULT NULL,
  `fimg3` varchar(40) DEFAULT NULL,
  `fimg4` varchar(40) DEFAULT NULL,
  `fimg5` varchar(40) DEFAULT NULL,
  `fa` varchar(40) DEFAULT NULL,
  `fb` varchar(40) DEFAULT NULL,
  `fc` varchar(40) DEFAULT NULL,
  `fd` varchar(40) DEFAULT NULL,
  `fe` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`fid`),
  KEY `FK_fk` (`ftid`),
  CONSTRAINT `FK_fk` FOREIGN KEY (`ftid`) REFERENCES `type` (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flower`
--

LOCK TABLES `flower` WRITE;
/*!40000 ALTER TABLE `flower` DISABLE KEYS */;
INSERT INTO `flower` VALUES (1,'玫瑰111','111',3,'经典111','红色','手捧','好看111',300011,'roseonly','鲜花玫瑰','tougelan_03.jpg','14375552607278555.png','14295239608532493.jpg','14375552607278555.png','14295239608532493.jpg','14401497219486362.png',NULL,NULL,NULL,NULL,NULL),(2,'红玫瑰','50000',2,'经典','白色','手捧','好看',300,'roseonly','鲜花玫瑰','tougelan_03.jpg','14352182232678477.png','14371044178771361.png','14371044179361651.png','14371044179959421.png','14401497219486362.png',NULL,NULL,NULL,NULL,NULL),(3,'开心玫瑰','200',2,'多彩绚烂','蓝色','玫瑰手捧','套装',200,'roseonly','永生玫瑰','tougelan_03.jpg','14375552607278555.png','14375552607278555.png','14375552607278555.png','14375552607278555.png','14375552607278555.png',NULL,NULL,NULL,NULL,NULL),(4,'开心玫瑰222','20022',1,'多彩绚烂22','蓝色','玫瑰手捧','套装22',20022,'roseonly','鲜花玫瑰','tougelan_03.jpg','14375552607278555.png','14375552607278555.png','14375552607278555.png','14375552607278555.png','14375552607278555.png',NULL,NULL,NULL,NULL,NULL),(5,'经典玫瑰','1666',2,'音乐玫瑰','彩色','玫瑰长盒','经典典藏',100,'roseonly','永生玫瑰','tougelan_03.jpg','14371044182375622.png','14371044181852278.png','14371044182711930.png','14401497219486362.png','14332135201738236.png',NULL,NULL,NULL,NULL,NULL),(6,'呵呵玫瑰','8888',2,'好看系列','彩色','玫瑰手捧','就是好看',200,'roseonly','永生玫瑰','tougelan_03.jpg','14358179636236241.png','14371044178771361.png','14371044179959421.png','14371044179361651.png','14401497219486362.png',NULL,NULL,NULL,NULL,NULL),(7,'美丽玫瑰','9999',1,'多彩绚烂','蓝色','玫瑰长盒','25支',288,'roseonly','鲜花玫瑰','tougelan_03.jpg','14291759440222994.png','14371044180471919.png','14371044180827716.png','14375551997575049.png','14401497219486362.png',NULL,NULL,NULL,NULL,NULL),(8,'长长久久','888',2,'音乐玫瑰','黄色','音乐盒','旋转',299,'roseonly','永生玫瑰','tougelan_03.jpg','14536858715428628.png','14534570599749285.png','14534569274778081.png','14534570352719271.png','14557858492967267.png',NULL,NULL,NULL,NULL,NULL),(9,'钻石玫瑰','29999',3,'珠宝','金色','52g','贵重',20,'roseonly','玫瑰珠宝','tougelan_03.jpg','14592239795617562.png','14592327899947570.png','14592239795617562.png','123123qweqw.png','123123qweqw.png',NULL,NULL,NULL,NULL,NULL),(10,'宝石玫瑰','30000',3,'宝石','祖母绿','项链','贵重',20,'roseonly','玫瑰珠宝','tougelan_03.jpg','14592323032542554.png','14592323032542554.png','14592323032542554.png','14592323032542554.png','dprm_03.jpg',NULL,NULL,NULL,NULL,NULL),(11,'宝玫瑰','25100',3,'珠宝','彩色','珠宝','贵重',30,'roseonly','玫瑰珠宝','tougelan_03.jpg','14543838299975467.png','14592327899947570.png','14592327899947570.png','14592327899947570.png','14652881667111097.jpg',NULL,NULL,NULL,NULL,NULL),(12,'好玫瑰','30000',3,'珠宝','红色','珠宝','贵重',20,'roseonly','玫瑰珠宝','tougelan_03.jpg','14592329905436995.png','14592329905436995.png','14592240643249359.png','14592329905436995.png','14592329905436995.png',NULL,NULL,NULL,NULL,NULL),(13,'玫瑰花朵','2000',4,'项链','金色','项链','贵重',20,'roseonly','玫瑰饰品','tougelan_03.jpg','123123qweqw.png','123123qweqw.png','123123qweqw.png','123123qweqw.png','123123qweqw.png',NULL,NULL,NULL,NULL,NULL),(14,'爱之赞礼','5000',4,'珠宝','金色','项链','贵重',30,'roseonly','玫瑰饰品','tougelan_03.jpg','14752054449767660.jpg','14685770366333480.jpg','14752054449767660.jpg','14752054449767660.jpg','14752054449767660.jpg',NULL,NULL,NULL,NULL,NULL),(15,'玫瑰项链','6000',4,'珠宝','金色','项链','贵重',40,'roseonly','玫瑰饰品','tougelan_03.jpg','14697831639031901.png','14712315327414689.png','14712315327414689.png','14697831639031901.png','14697831639031901.png',NULL,NULL,NULL,NULL,NULL),(16,'珍贵项链','6000',4,'珠宝','红色','珠宝','贵重',50,'roseonly','玫瑰饰品','tougelan_03.jpg','14712315327414689.png','14712315327414689.png','14712315327414689.png','14712315327414689.png','14712315327414689.png',NULL,NULL,NULL,NULL,NULL),(17,'玫瑰','2000',1,'鲜花','彩色','鲜花','好看',200,'roseonly','鲜花玫瑰','tougelan_03.jpg','14291759440222994.png','14352182232897744.png','14371044180471919.png','14371044180827716.png','14401497219486362.png',NULL,NULL,NULL,NULL,NULL),(18,'鲜花','3000',1,'鲜花','彩色','鲜花','鲜花',800,'roseonly','鲜花玫瑰','tougelan_03.jpg','14358179636236241.png','14371044178771361.png','14371044179959421.png','14352182232678477.png','14401497219486362.png',NULL,NULL,NULL,NULL,NULL),(19,'玫瑰花','200',1,'鲜花','彩色','鲜花','20支',200,'roseonly','鲜花玫瑰','tougelan_03.jpg','14371044182711930.png','14371044182375622.png','14371044181852278.png','14375551997575049.png','14401497219486362.png',NULL,NULL,NULL,NULL,NULL),(20,'好看的玫瑰花','500',1,'鲜花','彩色','鲜花','手捧',300,'roseonly','鲜花玫瑰','tougelan_03.jpg','14291759440222994.png','14332135201738236.png','14371044180471919.png','14375551997575049.png','14401497220285524.png',NULL,NULL,NULL,NULL,NULL),(21,'一直爱','4444',2,'全世爱','彩色','手捧','好看',50,'roseonly','永生玫瑰','tougelan_03.jpg','14444669782533355.png','14444670935235681.png','14534568441756180.png','14557858492967267.png','14534569066586419.png',NULL,NULL,NULL,NULL,NULL),(22,'音乐玫瑰','500',2,'音乐盒','蓝色','音乐盒','好看',30,'roseonly','永生玫瑰','tougelan_03.jpg','14534568441756180.png','14444669782533355.png','14444670935235681.png','14557858492967267.png','14555346744312522.png',NULL,NULL,NULL,NULL,NULL),(23,'多彩玫瑰','400',2,'音乐盒','彩色','音乐盒','好看',50,'roseonly','永生玫瑰','tougelan_03.jpg','14557858492967267.png','14534568441756180.png','14555346744312522.png','14534569274778081.png','14444669782533355.png',NULL,NULL,NULL,NULL,NULL),(24,'永生花','500',2,'全世爱','彩色','音乐盒','好看',400,'roseonly','永生玫瑰','tougelan_03.jpg','14557858492967267.png','14534568441756180.png','14536858715428628.png','14557858492967267.png','14534570352719271.png',NULL,NULL,NULL,NULL,NULL),(25,'生肖项链','2000',3,'生肖','银色','项链','好看',50,'roseonly','玫瑰珠宝','tougelan_03.jpg','14543847204134704.png','14543847204134704.png','14543847204134704.png','14543847204134704.png','14543847204134704.png',NULL,NULL,NULL,NULL,NULL),(26,'项链生肖','5000',3,'生肖','银色','项链','好看',40,'roseonly','玫瑰珠宝','tougelan_03.jpg','14543838299975467.png','14543838299975467.png','14543838299975467.png','14543838299975467.png','14543838299975467.png',NULL,NULL,NULL,NULL,NULL),(27,'精美珠宝','5000',3,'珠宝','金色','项链','好看',90,'roseonly','玫瑰珠宝','tougelan_03.jpg','123123qweqw.png','123123qweqw.png','14676304925179346.png','14697831639031901.png','14688344757087979.jpg',NULL,NULL,NULL,NULL,NULL),(28,'贵重玫瑰','40000',3,'珠宝','金色','项链','贵重',40,'roseonly','玫瑰珠宝','tougelan_03.jpg','14418755491952020.png','14676304925179346.png','14703051165155486.png','14676296239706611.png','14676296239706611.png',NULL,NULL,NULL,NULL,NULL),(29,'精美饰品','3000',4,'饰品','金色','项链','好看',50,'roseonly','玫瑰饰品','tougelan_03.jpg','14592322205727416.png','14592327899947570.png','14592323032542554.png','14592329905436995.png','14592323032542554.png',NULL,NULL,NULL,NULL,NULL),(30,'美丽饰品','4000',4,'饰品','金色','项链','好看',60,'roseonly','玫瑰饰品','tougelan_03.jpg','14703858625685852.jpg','14732181213765216.png','14592240643249359.png','14592329905436995.png','14697831639031901.png',NULL,NULL,NULL,NULL,NULL),(31,'彩色饰品','300',4,'饰品','金色','项链','好看',50,'roseonly','玫瑰饰品','tougelan_03.jpg','14703049691425802.png','14703049691425802.png','14676304925179346.png','14676304925179346.png','14697831639031901.png',NULL,NULL,NULL,NULL,NULL),(32,'玫瑰金项链','2000',4,'项链','金色','项链','好看',59,'roseonly','玫瑰饰品','tougelan_03.jpg','14697831639031901.png','14697831639031901.png','14676296239706611.png','14697831639031901.png','14697831031738711.png',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `flower` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordermes`
--

DROP TABLE IF EXISTS `ordermes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ordermes` (
  `oname` varchar(45) DEFAULT NULL,
  `otel` varchar(45) DEFAULT NULL,
  `oaddr` varchar(70) DEFAULT NULL,
  `ocode` varchar(45) DEFAULT NULL,
  `oid` int(11) DEFAULT NULL,
  `omood` varchar(45) DEFAULT NULL,
  `oprice` double DEFAULT NULL,
  `odate` varchar(45) DEFAULT NULL,
  `orname` varchar(45) DEFAULT NULL,
  `odid` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`odid`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordermes`
--

LOCK TABLES `ordermes` WRITE;
/*!40000 ALTER TABLE `ordermes` DISABLE KEYS */;
INSERT INTO `ordermes` VALUES ('18710804025','18710804022','西安市','710038',11,'申请退货',75300,'17092809225965','张三',1),('18710804025','18710804022','西安市','710038',6,'已发货',26664,'17092809225965','张三',2),('18710804025','18710804022','西安市','710038',3,'已退货',200,'17092809225965','张三',3),('18710804025','18710804022','西安市','710038',22,'已发货',1000,'17092809225965','张三',4),('18710804025','18710804022','西安市','710038',24,'已发货',8000,'17092809225965','张三',5),('18710804025','18710804022','西安市','710038',9,'申请退货',29999,'17092809225965','张三',6),('18710804025','18710101010','西安','',27,'待发货',15000,'170929085804830','葛强',8),('18210804022','15555555555','西安','710038',15,'待发货',6000,'170929091731119','张三',9),('18210804022','15555555555','西安','710038',15,'待发货',6000,'1709290919137','张三',10),('18210804022','15555555555','西安','710038',15,'待发货',6000,'170929091938139','张三',11),('18210804022','15555555555','西安','710038',5,'申请退货',1666,'170929091938139','张三',12),('18711122244','18710804022','ssss','sssss',8,'待发货',888,'170929094149773','zs',13),('18711122244','18710804022','ssss','sssss',26,'待发货',10000,'170929094149773','zs',14),('18711122244','18710804022','ssss','sssss',14,'待发货',5000,'170929094149773','zs',15),('18711122244','18710804022','ssss','sssss',5,'待发货',4998,'170929094149773','zs',16),('18711122244','18710804022','ssss','sssss',12,'待发货',30000,'170929094149773','zs',17),('18711122244','18710804022','ssss','sssss',7,'待发货',9999,'170929094149773','zs',18),('18711122244','18710804022','ssss','sssss',16,'已发货',6000,'170929094149773','zs',19),('18711122244','18710804022','ssss','sssss',11,'待发货',25100,'170929094149773','zs',20),('18711122244','18710804022','xian','710038',12,'待发货',30000,'170929104008722','123',22),('18711122244','18710804022','xian','710038',7,'待发货',9999,'170929104008722','123',23),('18711122244','18710804022','xian','710038',16,'待发货',6000,'170929104008722','123',24),('18711122244','18710804022','xian','710038',11,'待发货',100400,'170929104008722','123',25),('18710804022','123','123','123',6,'待发货',8888,'170929105916362','123',26),('18710804022','123','123','123',5,'待发货',1666,'170929105916362','123',27),('18710804022','234','234','234',5,'已发货',6664,'170929110002390','324',28),('18711122244','555','555','555',11,'待发货',125500,'170929110306255','555',29),('18710804022','wer','wer','wer',11,'待发货',25100,'170929111306337','er',30),('18710804022','wer','wer','wer',23,'待发货',400,'170929111306337','er',31),('18710804022','11','11','11',11,'已退货',25100,'170929113222545','111',32),('18710804022','11','11','11',23,'待发货',400,'170929113222545','111',33),('18710804022','11','11','11',5,'待发货',6664,'170929113222545','111',34),('18710804066','222','222','22',9,'待发货',29999,'170929113959998','222',38),('18710804066','333','3333','333',9,'已退货',29999,'170929114012927','333',39),('18710804066','333','3333','333',3,'待发货',600,'170929114012927','333',40),('18711122244','123','123','123',2,'待发货',8000,'170929045910797','123',52);
/*!40000 ALTER TABLE `ordermes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `type`
--

DROP TABLE IF EXISTS `type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `type` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `tname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `type`
--

LOCK TABLES `type` WRITE;
/*!40000 ALTER TABLE `type` DISABLE KEYS */;
INSERT INTO `type` VALUES (1,'鲜花玫瑰'),(2,'永生玫瑰'),(3,'玫瑰珠宝'),(4,'玫瑰饰品');
/*!40000 ALTER TABLE `type` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-29 17:49:25
