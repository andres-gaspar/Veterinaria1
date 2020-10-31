-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-10-2020 a las 18:44:43
-- Versión del servidor: 10.1.31-MariaDB
-- Versión de PHP: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `veterinaria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `cod_cli` int(10) NOT NULL,
  `nom_cli` varchar(30) NOT NULL,
  `direc_cli` varchar(30) NOT NULL,
  `tel_cli` varchar(8) NOT NULL,
  `nomMascota` varchar(50) NOT NULL,
  `Observaciones` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`cod_cli`, `nom_cli`, `direc_cli`, `tel_cli`, `nomMascota`, `Observaciones`) VALUES
(10, 'B', 'S', '12', 'FS', 'FDF'),
(12, 'Carlos Papaya', 'zona 13', '11111111', 'negrito', 'esta muy gordito'),
(16, 'jajaja123', 'JHGFD', '7654', 'LKJHGF', 'LKJHGFD'),
(19, 'jose lopez ', 'soloma ', '45454545', 'chispas ', 'esta muy gordito'),
(21, 'Carlos Perez 12345', 'zona 3', '12345678', 'perri', 'esta sarnudo'),
(22, 'Carlos ', 'zona 4', '12345678', 'perri', 'esta sarnudo'),
(23, 'francis', 'ixtenam', '12341234', 'rex', 'esta sarnudo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`cod_cli`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `cod_cli` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
