-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-10-2019 a las 17:04:23
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
-- Base de datos: `universidad`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `id_alumno` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `nombre` varchar(1000) NOT NULL,
  `domicilio` varchar(1000) NOT NULL,
  `fechaNac` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`id_alumno`, `dni`, `nombre`, `domicilio`, `fechaNac`) VALUES
(1, 2345888, 'Julio Sosa', 'Junin 884', '1990-01-25 00:00:00'),
(2, 746768, 'Laura tica', 'cameHouse', '2002-12-01 00:00:00'),
(3, 5679892, 'Fernanda Fernandez', 'Colon 787', '1980-05-12 00:00:00'),
(4, 98738, 'Camilo Sexto', 'Rivadavia 564', '1995-03-22 00:00:00'),
(7, 35624, 'Carola Casini', 'Funes 42345', '2000-08-06 00:00:00'),
(8, 23548866, 'Ramiro Santillan', 'Roca 434 San Luis', '1997-05-17 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cursada`
--

CREATE TABLE `cursada` (
  `id_cursada` int(11) NOT NULL,
  `id_alumno` int(11) NOT NULL,
  `id_materia` int(11) NOT NULL,
  `nota` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cursada`
--

INSERT INTO `cursada` (`id_cursada`, `id_alumno`, `id_materia`, `nota`) VALUES
(1, 3, 5, 10),
(3, 3, 2, 10),
(4, 3, 6, 8),
(6, 1, 5, 10),
(7, 1, 6, 9),
(9, 1, 3, 10),
(10, 3, 3, 10),
(11, 2, 3, 8),
(12, 2, 6, 10),
(13, 2, 5, 9),
(14, 2, 2, 10),
(15, 4, 2, 10),
(16, 4, 3, 7),
(17, 4, 5, 6),
(18, 4, 6, 8),
(21, 7, 2, 8),
(22, 7, 3, 6),
(23, 7, 5, 5),
(24, 7, 6, 9),
(25, 7, 8, 2),
(27, 8, 5, 8),
(28, 8, 10, 10),
(29, 3, 8, 8),
(30, 3, 10, 9);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `id_materia` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `responsable` varchar(50) NOT NULL,
  `periodo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`id_materia`, `nombre`, `responsable`, `periodo`) VALUES
(2, 'Lengua', 'Jorge Asis', '1er Cuatrimestre'),
(3, 'Matematica', 'Alberto Gomez', '1er Cuatrimestre'),
(5, 'Historia', 'Felipe Pigna', '2do Cuatrimestre'),
(6, 'Ingles', 'Carlos Melconian', '2do Cuatrimestre'),
(8, 'Ciencias Naturales', 'John Lennon', '2do cuatrimestre'),
(10, 'Arte II', 'Pablo Picasso', '2do cuatrimestre');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`id_alumno`);

--
-- Indices de la tabla `cursada`
--
ALTER TABLE `cursada`
  ADD PRIMARY KEY (`id_cursada`),
  ADD KEY `id_alumno` (`id_alumno`),
  ADD KEY `id_materia` (`id_materia`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`id_materia`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumno`
--
ALTER TABLE `alumno`
  MODIFY `id_alumno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `cursada`
--
ALTER TABLE `cursada`
  MODIFY `id_cursada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT de la tabla `materia`
--
ALTER TABLE `materia`
  MODIFY `id_materia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cursada`
--
ALTER TABLE `cursada`
  ADD CONSTRAINT `cursada_ibfk_1` FOREIGN KEY (`id_alumno`) REFERENCES `alumno` (`id_alumno`),
  ADD CONSTRAINT `cursada_ibfk_2` FOREIGN KEY (`id_materia`) REFERENCES `materia` (`id_materia`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
