-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-10-2018 a las 16:06:17
-- Versión del servidor: 10.1.35-MariaDB
-- Versión de PHP: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vuelo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asiento`
--

CREATE TABLE `asiento` (
  `id_asiento` int(11) NOT NULL,
  `precio` float NOT NULL,
  `ubicacion` char(5) NOT NULL,
  `disponibilidad` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad_destino`
--

CREATE TABLE `ciudad_destino` (
  `id_ciudad` int(11) NOT NULL,
  `pais` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad_origen`
--

CREATE TABLE `ciudad_origen` (
  `id_ciudad_or` int(11) NOT NULL,
  `pais_or` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `n_pasaporte` varchar(25) NOT NULL,
  `n_tarjeta` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `id_compra` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_asiento` int(11) NOT NULL,
  `fecha` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vuelo`
--

CREATE TABLE `vuelo` (
  `id` int(11) NOT NULL,
  `id_asiento` int(11) NOT NULL,
  `aerolinea` varchar(50) NOT NULL,
  `aeronave` varchar(50) NOT NULL,
  `fecha_llegada` datetime NOT NULL,
  `fecha_partida` datetime NOT NULL,
  `id_ciudad_destino` int(11) NOT NULL,
  `id_ciudad_origen` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asiento`
--
ALTER TABLE `asiento`
  ADD PRIMARY KEY (`id_asiento`);

--
-- Indices de la tabla `ciudad_destino`
--
ALTER TABLE `ciudad_destino`
  ADD PRIMARY KEY (`id_ciudad`);

--
-- Indices de la tabla `ciudad_origen`
--
ALTER TABLE `ciudad_origen`
  ADD PRIMARY KEY (`id_ciudad_or`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`id_compra`),
  ADD UNIQUE KEY `id_cliente` (`id_cliente`),
  ADD UNIQUE KEY `id_asiento` (`id_asiento`);

--
-- Indices de la tabla `vuelo`
--
ALTER TABLE `vuelo`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id_asiento` (`id_asiento`),
  ADD UNIQUE KEY `id_ciudad_destino` (`id_ciudad_destino`),
  ADD UNIQUE KEY `id_ciudad_origen` (`id_ciudad_origen`),
  ADD UNIQUE KEY `id_ciudad_origen_2` (`id_ciudad_origen`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asiento`
--
ALTER TABLE `asiento`
  MODIFY `id_asiento` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ciudad_destino`
--
ALTER TABLE `ciudad_destino`
  MODIFY `id_ciudad` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `id_compra` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `vuelo`
--
ALTER TABLE `vuelo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asiento`
--
ALTER TABLE `asiento`
  ADD CONSTRAINT `asiento_ibfk_1` FOREIGN KEY (`id_asiento`) REFERENCES `vuelo` (`id_asiento`);

--
-- Filtros para la tabla `ciudad_destino`
--
ALTER TABLE `ciudad_destino`
  ADD CONSTRAINT `ciudad_destino_ibfk_1` FOREIGN KEY (`id_ciudad`) REFERENCES `vuelo` (`id_ciudad_destino`);

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `compra_ibfk_1` FOREIGN KEY (`id_asiento`) REFERENCES `asiento` (`id_asiento`),
  ADD CONSTRAINT `compra_ibfk_2` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`);

--
-- Filtros para la tabla `vuelo`
--
ALTER TABLE `vuelo`
  ADD CONSTRAINT `vuelo_ibfk_1` FOREIGN KEY (`id_ciudad_origen`) REFERENCES `ciudad_origen` (`id_ciudad_or`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
