-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 21, 2015 at 03:52 AM
-- Server version: 5.1.41
-- PHP Version: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `parkir`
--

-- --------------------------------------------------------

--
-- Table structure for table `kkeluar`
--

CREATE TABLE IF NOT EXISTS `kkeluar` (
  `nplat` varchar(15) NOT NULL,
  `jmask` time NOT NULL,
  `jkluar` time NOT NULL,
  `biaya` int(11) NOT NULL,
  `idpetugas` varchar(4) NOT NULL,
  `kodejenis` varchar(2) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kkeluar`
--

INSERT INTO `kkeluar` (`nplat`, `jmask`, `jkluar`, `biaya`, `idpetugas`, `kodejenis`) VALUES
('T506BD', '10:14:46', '01:37:52', 2000, '1011', '2'),
('F68B4I', '10:30:18', '01:36:50', 2000, '1011', '2'),
('h', '05:10:32', '05:11:17', 1000, '1011', '1'),
('A87AB1', '10:14:46', '02:31:38', 1000, '1011', '1'),
('K60F4F', '10:14:46', '02:31:24', 1000, '1011', '1'),
('LK98T', '08:17:53', '02:31:04', 1000, '1011', '1'),
('stean', '11:37:42', '02:30:50', 1000, '1011', '1');

-- --------------------------------------------------------

--
-- Table structure for table `km`
--

CREATE TABLE IF NOT EXISTS `km` (
  `nplat` varchar(15) NOT NULL,
  `jmask` time NOT NULL,
  `idpetugas` varchar(4) NOT NULL,
  `kodejenis` varchar(2) NOT NULL,
  PRIMARY KEY (`nplat`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `km`
--

INSERT INTO `km` (`nplat`, `jmask`, `idpetugas`, `kodejenis`) VALUES
('J595DA', '10:14:46', '1011', '2'),
('A56VF', '10:14:46', '1011', '1'),
('F5067D', '10:14:46', '1011', '2'),
('F96AB', '10:14:46', '1011', '2'),
('D98LG', '10:14:46', '1011', '2'),
('F87IL', '10:14:46', '1011', '3'),
('L98BF', '10:14:46', '1011', '1'),
('TG98BA', '11:55:00', '1011', '1'),
('F87BA', '11:55:00', '1011', '1'),
('F67GB', '12:04:23', '1011', '1'),
('F89BN', '02:28:11', '1011', '1');

-- --------------------------------------------------------

--
-- Table structure for table `kuota`
--

CREATE TABLE IF NOT EXISTS `kuota` (
  `id` varchar(3) NOT NULL,
  `kouta` int(12) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kuota`
--

INSERT INTO `kuota` (`id`, `kouta`) VALUES
('A', 82);

-- --------------------------------------------------------

--
-- Table structure for table `tbljnskendaraan`
--

CREATE TABLE IF NOT EXISTS `tbljnskendaraan` (
  `kodejenis` varchar(2) NOT NULL,
  `jenis` varchar(10) NOT NULL,
  `tarif` int(11) NOT NULL,
  PRIMARY KEY (`kodejenis`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbljnskendaraan`
--

INSERT INTO `tbljnskendaraan` (`kodejenis`, `jenis`, `tarif`) VALUES
('1', 'Motor', 1000),
('2', 'Mobil', 2000),
('3', 'Bus', 4000),
('4', 'TNI', 0);

-- --------------------------------------------------------

--
-- Table structure for table `tblpetugas`
--

CREATE TABLE IF NOT EXISTS `tblpetugas` (
  `idpetugas` varchar(4) NOT NULL,
  `nmpetugas` varchar(60) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `tlpn` varchar(15) NOT NULL,
  PRIMARY KEY (`idpetugas`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblpetugas`
--

INSERT INTO `tblpetugas` (`idpetugas`, `nmpetugas`, `alamat`, `tlpn`) VALUES
('1011', 'Ihsan Abdurahman', 'Kp.Ciawun Pelabuhanratu', '0864857465');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_login`
--

CREATE TABLE IF NOT EXISTS `tbl_login` (
  `idpetugas` varchar(4) NOT NULL,
  `password` varchar(60) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_login`
--

INSERT INTO `tbl_login` (`idpetugas`, `password`) VALUES
('1011', '02030405ab');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
