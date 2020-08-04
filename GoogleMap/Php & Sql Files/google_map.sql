-- phpMyAdmin SQL Dump
-- version 4.9.4
-- https://www.phpmyadmin.net/
--
-- Anamakine: localhost:3306
-- Üretim Zamanı: 04 Ağu 2020, 17:22:20
-- Sunucu sürümü: 5.6.48-cll-lve
-- PHP Sürümü: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `cancanbo_web_view`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `google_map`
--

CREATE TABLE `google_map` (
  `id` int(11) NOT NULL,
  `title` varchar(250) NOT NULL,
  `lat` float NOT NULL,
  `lot` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Tablo döküm verisi `google_map`
--

INSERT INTO `google_map` (`id`, `title`, `lat`, `lot`) VALUES
(1, 'Pirömerli Mahallesi', 37.0332, 34.6755);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `google_map`
--
ALTER TABLE `google_map`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `google_map`
--
ALTER TABLE `google_map`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
