-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 02, 2015 at 08:58 PM
-- Server version: 5.5.32
-- PHP Version: 5.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `eventmanager`
--
CREATE DATABASE IF NOT EXISTS `eventmanager` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `eventmanager`;

-- --------------------------------------------------------

--
-- Table structure for table `event`
--

CREATE TABLE IF NOT EXISTS `event` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(350) NOT NULL,
  `day_start` date NOT NULL,
  `day_end` date NOT NULL,
  `hours` varchar(150) NOT NULL,
  `location_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `event_ibfk_1` (`location_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=23 ;

--
-- Dumping data for table `event`
--

INSERT INTO `event` (`id`, `description`, `day_start`, `day_end`, `hours`, `location_id`) VALUES
(20, 'Έκθεση – Γιορτή Κρητικών Προϊόντων, Οικοτεχνίας και Χειροτεχνίας', '2015-08-01', '2015-08-04', '10:00-22:00', 25),
(21, 'Έκθεση ζωγραφικής, χειροτεχνίας και λογοτεχνίας', '2015-08-01', '2015-08-03', ' 09:00 - 14:00 & 18:00 - 21:00', 2),
(22, 'Η τραγωδία του Ευριπίδη «Τρωάδες»', '2018-08-02', '2018-08-02', '21.30-00:00', 23);

-- --------------------------------------------------------

--
-- Table structure for table `location`
--

CREATE TABLE IF NOT EXISTS `location` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(150) NOT NULL,
  `address` varchar(250) NOT NULL,
  `latitude` varchar(150) NOT NULL,
  `longitude` varchar(150) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=27 ;

--
-- Dumping data for table `location`
--

INSERT INTO `location` (`id`, `name`, `address`, `latitude`, `longitude`) VALUES
(1, 'Αίθουσα Ανδρόγεω', 'Ανδρόγεω 2 Ηράκλειο Κρήτης', '35.339409', '25.1343932'),
(2, 'Πύλη Βιτούρι', '25 Παρ. 3η Πεδιάδος Βίγλας', '35.334279', '25.1347117'),
(22, 'Πύλη Βηθλεέμ', 'Θεατρο Σκιων\r\nΗράκλειο Κρήτη', '35.3345449', '25.1277602'),
(23, 'Κηποθέατρο Μάνος Χατζιδάκις ', 'Λεωφόρος Πλαστήρα', '35.3397518', '25.1340181'),
(24, 'Κηποθέατρο Ν.Καζαντζάκη', 'Πλατεία Κύπρου, Ηράκλειο, 71306, ΗΡΑΚΛΕΙΟΥ\r\n', '35.332105', '25.131702'),
(25, 'Πλατεία Ελευθερίας', 'Πλατεία Ελευθερίας', '35.3380048', '25.1359151'),
(26, 'Πολυχώρος Παλιάς Λαχαναγοράς', 'Βενιζέλου Σοφοκλή & Σκορδύλων, Ηράκλειο - Παλιά Λαχαναγορά, 71202, ΗΡΑΚΛΕΙΟΥ', '35.3415486', '25.1256997');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `username` varchar(40) NOT NULL,
  `email` varchar(150) NOT NULL,
  `password` varchar(40) NOT NULL,
  `role` enum('user','admin') NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=26 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `name`, `username`, `email`, `password`, `role`) VALUES
(2, 'administrator', 'admin', 'admin@yahoo.com', 'admin', 'admin'),
(3, 'myapos', 'myapos', 'myapos@yahoo.com', 'myapos', 'user'),
(6, 'myros', 'myros', 'myapos@yahoo.com', 'myros', 'user'),
(25, 'test', 'test', 'test@test.com', 'test', 'user');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `event`
--
ALTER TABLE `event`
  ADD CONSTRAINT `event_ibfk_1` FOREIGN KEY (`location_id`) REFERENCES `location` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
