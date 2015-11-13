-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 07, 2015 at 09:06 AM
-- Server version: 5.6.26
-- PHP Version: 5.5.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `struts_training`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE IF NOT EXISTS `customer` (
  `ID` int(11) NOT NULL,
  `EMAIL` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `FIRSTNAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `LASTNAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `PREFERRED_CARRIER` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `CAN_RECV_MAIL` tinyint(1) NOT NULL,
  `ADDRESS1` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ADDRESS2` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `CITY` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `STATE` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ZIPCODE` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`ID`, `EMAIL`, `FIRSTNAME`, `LASTNAME`, `PREFERRED_CARRIER`, `CAN_RECV_MAIL`, `ADDRESS1`, `ADDRESS2`, `CITY`, `STATE`, `ZIPCODE`) VALUES
(1, 'abc@google.com', 'aaa', 'aaa', 'aaa', 1, 'aaa', 'aaa', 'aaa', 'aaa', 'aaa');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
