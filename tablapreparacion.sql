-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-12-2024 a las 05:03:18
-- Versión del servidor: 10.1.25-MariaDB
-- Versión de PHP: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `baserecetas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tablapreparacion`
--

CREATE TABLE `tablapreparacion` (
  `nombre` varchar(25) NOT NULL,
  `ingredientes` varchar(150) NOT NULL,
  `tipo` varchar(25) NOT NULL,
  `porciones` int(2) NOT NULL,
  `tiempopreparacion` int(3) NOT NULL,
  `idpreparacion` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tablapreparacion`
--

INSERT INTO `tablapreparacion` (`nombre`, `ingredientes`, `tipo`, `porciones`, `tiempopreparacion`, `idpreparacion`) VALUES
('123412', 'hola', 'Plato principal', 24, 214, 2),
('1234123', '123124', 'Postre', 213124, 3123, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tablapreparacion`
--
ALTER TABLE `tablapreparacion`
  ADD PRIMARY KEY (`nombre`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
