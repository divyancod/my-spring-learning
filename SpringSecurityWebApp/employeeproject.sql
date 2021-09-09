-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Sep 09, 2021 at 06:59 PM
-- Server version: 5.7.26
-- PHP Version: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `employeeproject`
--
CREATE DATABASE IF NOT EXISTS `employeeproject` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `employeeproject`;

-- --------------------------------------------------------

--
-- Table structure for table `bugpriority`
--

DROP TABLE IF EXISTS `bugpriority`;
CREATE TABLE IF NOT EXISTS `bugpriority` (
  `priority` int(11) NOT NULL,
  `name` varchar(10) NOT NULL,
  PRIMARY KEY (`priority`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bugpriority`
--

INSERT INTO `bugpriority` (`priority`, `name`) VALUES
(1, 'Normal'),
(2, 'Low'),
(3, 'High'),
(4, 'Urgent');

-- --------------------------------------------------------

--
-- Table structure for table `bugs`
--

DROP TABLE IF EXISTS `bugs`;
CREATE TABLE IF NOT EXISTS `bugs` (
  `bugid` int(11) NOT NULL AUTO_INCREMENT,
  `bugname` varchar(50) DEFAULT NULL,
  `bugdesc` varchar(100) DEFAULT NULL,
  `priority` int(1) DEFAULT '1',
  `platform` varchar(10) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`bugid`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bugs`
--

INSERT INTO `bugs` (`bugid`, `bugname`, `bugdesc`, `priority`, `platform`, `status`) VALUES
(1, 'Test Bug Issue', 'Null Pointer Exception at line 50', 4, 'Android', 5),
(2, 'Test Bug 2', 'Null pointer exception', 4, 'Web', 5),
(3, 'TEST BUG -1 ', 'Bug Desciption - -1', 1, 'Android', 1);

-- --------------------------------------------------------

--
-- Table structure for table `bugstatus`
--

DROP TABLE IF EXISTS `bugstatus`;
CREATE TABLE IF NOT EXISTS `bugstatus` (
  `status` int(11) NOT NULL AUTO_INCREMENT,
  `state` varchar(15) NOT NULL,
  PRIMARY KEY (`status`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bugstatus`
--

INSERT INTO `bugstatus` (`status`, `state`) VALUES
(1, 'Open'),
(2, 'Resolved'),
(3, 'Conflict'),
(4, 'Duplicate'),
(5, 'Closed');

-- --------------------------------------------------------

--
-- Table structure for table `employeedetails`
--

DROP TABLE IF EXISTS `employeedetails`;
CREATE TABLE IF NOT EXISTS `employeedetails` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `location` varchar(100) DEFAULT NULL,
  `email` varchar(80) DEFAULT NULL,
  `college` text,
  `course` varchar(20) DEFAULT NULL,
  `batch` varchar(20) DEFAULT NULL,
  `tskills` varchar(50) DEFAULT NULL,
  `clearning` varchar(20) DEFAULT NULL,
  `position` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employeedetails`
--

INSERT INTO `employeedetails` (`id`, `name`, `phone`, `location`, `email`, `college`, `course`, `batch`, `tskills`, `clearning`, `position`) VALUES
(1, 'Test Kumar Verma', '9191919191', 'Java', 'test@hotmail.com', 'Hello World COllege', 'B.tech', '2018-2022', 'Java,CPP', '20000', 'Developer');

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
CREATE TABLE IF NOT EXISTS `roles` (
  `userid` int(11) NOT NULL,
  `role` varchar(20) NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `roles`
--

INSERT INTO `roles` (`userid`, `role`) VALUES
(1, 'admin'),
(2, 'user');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(100) NOT NULL,
  `password` varchar(150) NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`userid`, `email`, `password`, `enabled`) VALUES
(1, 'admin@test.com', '$2a$10$TfZnrrhpSBVdNOrPcXaCsuKJN1TSFz47MkB2h/mV42oUlCKANLplG', 1),
(2, 'user@test.com', '$2a$10$6x371mbjugIGxAWKKetwNugzvcJxuRmu5tt/T4.SXegokWPb2RO/W', 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
