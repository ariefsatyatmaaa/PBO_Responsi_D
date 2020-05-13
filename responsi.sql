-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 13, 2020 at 06:30 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `responsi`
--

-- --------------------------------------------------------

--
-- Table structure for table `gajik`
--

CREATE TABLE `gajik` (
  `Idkaryawan` int(11) NOT NULL,
  `Nama` varchar(40) NOT NULL,
  `Posisi` varchar(20) NOT NULL,
  `Alamat` varchar(40) NOT NULL,
  `Nohp` int(11) NOT NULL,
  `Gajipokok` int(11) NOT NULL,
  `Jamlembur` int(11) NOT NULL,
  `Tunjangan` int(11) NOT NULL,
  `Pajak` int(11) NOT NULL,
  `Total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gajik`
--

INSERT INTO `gajik` (`Idkaryawan`, `Nama`, `Posisi`, `Alamat`, `Nohp`, `Gajipokok`, `Jamlembur`, `Tunjangan`, `Pajak`, `Total`) VALUES
(123, 'aa', 'Direktur', 'aa', 1234, 111, 11, 16500, 1, 16610);

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `Idkaryawana` int(11) NOT NULL,
  `Namaa` varchar(40) NOT NULL,
  `Posisia` varchar(40) NOT NULL,
  `Alamata` varchar(20) NOT NULL,
  `Nohpa` int(11) NOT NULL,
  `Totala` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `gajik`
--
ALTER TABLE `gajik`
  ADD PRIMARY KEY (`Idkaryawan`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`Idkaryawana`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `gajik`
--
ALTER TABLE `gajik`
  MODIFY `Idkaryawan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=124;

--
-- AUTO_INCREMENT for table `pegawai`
--
ALTER TABLE `pegawai`
  MODIFY `Idkaryawana` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
