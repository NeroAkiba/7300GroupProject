DROP TABLE IF EXISTS `HorseData`;
CREATE TABLE `HorseData` (
  `HorseName` varchar(255) DEFAULT NULL,
  `Speed` int DEFAULT NULL,
  `Stamina` int DEFAULT NULL,
  `Power` int DEFAULT NULL,
  `Guts` int DEFAULT NULL,
  `Knowledge` int DEFAULT NULL,
  `Proficent` varchar(255) DEFAULT NULL,
  `PreviousWinningRatio` decimal(10,2) DEFAULT NULL,
  `RaceDate` varchar(20) DEFAULT NULL,
  `RaceGround` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`HorseName`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4;

LOCK TABLES `HorseData` WRITE;
INSERT INTO `HorseData` VALUES ('SpecialWeek',83,88,98,90,91,'Meadow',13.50,04-05-2023,'ShaTin'),
('ToukaiTeio',90,89,83,92,96,'Meadow',22.60,04-09-2023,'PaoMaDai'),
('MruzenSukii',96,68,86,100,100,'Meadow',18.62,04-13-2023,'PaoMaDai'),
('OguriKyappu',101,66,106,84,93,'Mud',15.33,04-09-2023,'ShaTin'),
('GoldenShip',82,96,100,77,70,'Meadow',14.28,04-17-2023,'PaoMaDai'),
('GrandWonder',91,70,99,74,91,'Meadow',16.18,04-25-2023,'ShaTin'),
('MejiroMakkuin',71,111,71,103,94,'Meadow',21.55,04-05-2023,'PaoMaDai'),
('ErukonnderuPassa',85,76,80,93,91,'Mud',20.69,04-25-2023,'ShaTin'),
('ShinboriRudorufu',86,91,83,96,94,'Meadow',24.18,04-13-2023,'PaoMaDai'),
('SeiunnSky',98,98,88,83,83,'Meadow',17.58,04-17-2023,'PaoMaDai');
UNLOCK TABLES;