-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 03, 2018 at 07:53 AM
-- Server version: 10.1.26-MariaDB
-- PHP Version: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `Acc` int(11) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Dob` varchar(255) NOT NULL,
  `Pin` int(11) NOT NULL,
  `Acc_type` varchar(255) NOT NULL,
  `Nationality` varchar(255) NOT NULL,
  `Caste` varchar(255) NOT NULL,
  `Gender` varchar(255) NOT NULL,
  `Mobile` int(11) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `Secq` varchar(255) NOT NULL,
  `Seca` varchar(255) NOT NULL,
  `Balance` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`Acc`, `Name`, `Dob`, `Pin`, `Acc_type`, `Nationality`, `Caste`, `Gender`, `Mobile`, `Address`, `Secq`, `Seca`, `Balance`) VALUES
(1, 'Simran', '1998-01-23', 2580, 'saving', 'Nepali', 'Rijal', 'female', 98030338, 'sinamangal', 'What is your kachuwa name?', 'kohinoor', 85000),
(2, 'Shivam', '1996-12-02', 2555, 'saving', 'Indian', 'sharma', 'male', 980825600, 'Bafal', 'What is your dog name?', 'Hero', 100000),
(6663, 'sujesh', '1996-01-01', 1236, 'saving', 'nepali', 'manandhar', 'male', 984313437, 'sitapaila', 'who is your gf', 'soni', 150000),
(8613, 'aava', '1996-1-4', 1234, 'current', 'nepali', 'singh', 'female', 1234569, 'dashin dhoka', 'boyfrend name', 'biplus', 50000);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `accountNo` int(11) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`accountNo`, `password`) VALUES
(1, 'shivam');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`Acc`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`accountNo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `account`
--
ALTER TABLE `account`
  MODIFY `Acc` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8614;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `accountNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
