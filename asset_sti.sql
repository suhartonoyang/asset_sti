-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3388
-- Waktu pembuatan: 23 Jan 2022 pada 08.07
-- Versi server: 10.1.37-MariaDB
-- Versi PHP: 7.0.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `asset_sti`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `device_broken_lost`
--

CREATE TABLE `device_broken_lost` (
  `id` int(11) NOT NULL,
  `employee_name` varchar(255) NOT NULL,
  `sub_unit` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `serial_number` varchar(255) NOT NULL,
  `brand` varchar(255) NOT NULL,
  `location` varchar(255) NOT NULL,
  `owner` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL,
  `notes` varchar(255) NOT NULL,
  `device_category` varchar(255) NOT NULL,
  `created_date` datetime NOT NULL,
  `modified_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `device_penalty`
--

CREATE TABLE `device_penalty` (
  `id` int(11) NOT NULL,
  `device_category` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `serial_number` varchar(255) NOT NULL,
  `year` varchar(4) NOT NULL,
  `total_penalty_day` int(11) NOT NULL,
  `status` varchar(255) NOT NULL,
  `created_date` date NOT NULL,
  `modified_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `device_rented`
--

CREATE TABLE `device_rented` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `serial_number` varchar(255) NOT NULL,
  `brand` varchar(255) NOT NULL,
  `tenant_name` varchar(255) NOT NULL,
  `unit` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL,
  `device_category` varchar(255) NOT NULL,
  `created_date` datetime NOT NULL,
  `modified_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `device_type`
--

CREATE TABLE `device_type` (
  `id` int(11) NOT NULL,
  `sub_unit` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `serial_number` varchar(255) DEFAULT NULL,
  `ip_address` varchar(255) DEFAULT NULL,
  `mac_address` varchar(255) DEFAULT NULL,
  `brand` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `year` varchar(4) DEFAULT NULL,
  `asset_number` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `total_port_rj45` int(11) DEFAULT NULL,
  `total_port_sfp` int(11) DEFAULT NULL,
  `total_port_qsfp` int(11) DEFAULT NULL,
  `owner` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `device_category` varchar(255) NOT NULL,
  `port` varchar(255) DEFAULT NULL,
  `manageable_switch` varchar(255) DEFAULT NULL,
  `os` varchar(255) DEFAULT NULL,
  `microprocessor` varchar(255) DEFAULT NULL,
  `ram` varchar(255) DEFAULT NULL,
  `storage` varchar(255) DEFAULT NULL,
  `display_card` varchar(255) DEFAULT NULL,
  `monitor` varchar(255) DEFAULT NULL,
  `interface` varchar(255) DEFAULT NULL,
  `laptop_year` varchar(4) DEFAULT NULL,
  `guaranted` varchar(255) DEFAULT NULL,
  `classification` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `antivirus` varchar(255) DEFAULT NULL,
  `harddisk` varchar(255) DEFAULT NULL,
  `wps` varchar(255) DEFAULT NULL,
  `webservice` varchar(255) DEFAULT NULL,
  `db` varchar(255) DEFAULT NULL,
  `konektifitas` varchar(255) DEFAULT NULL,
  `pemanfaatan_server` varchar(255) DEFAULT NULL,
  `printer_size` varchar(255) DEFAULT NULL,
  `ssid` varchar(255) DEFAULT NULL,
  `antena_gain` varchar(255) DEFAULT NULL,
  `created_date` datetime NOT NULL,
  `modified_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `nip` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `jabatan` varchar(255) NOT NULL,
  `unit_sub_unit` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `handphone_number` varchar(15) DEFAULT NULL,
  `is_admin` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `device_broken_lost`
--
ALTER TABLE `device_broken_lost`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `device_penalty`
--
ALTER TABLE `device_penalty`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `device_rented`
--
ALTER TABLE `device_rented`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `device_type`
--
ALTER TABLE `device_type`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `device_broken_lost`
--
ALTER TABLE `device_broken_lost`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `device_penalty`
--
ALTER TABLE `device_penalty`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `device_rented`
--
ALTER TABLE `device_rented`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `device_type`
--
ALTER TABLE `device_type`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
