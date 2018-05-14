-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-05-2018 a las 00:58:47
-- Versión del servidor: 5.6.17
-- Versión de PHP: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `elsolecito`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `id_clientes` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) NOT NULL,
  `Monto` double NOT NULL,
  `folio` varchar(11) NOT NULL,
  PRIMARY KEY (`id_clientes`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=40 ;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id_clientes`, `Nombre`, `Monto`, `folio`) VALUES
(37, 'Luis', 80, '010'),
(33, 'Manuel', 120, '003'),
(26, 'Luis Ángel', 120, '002'),
(34, 'Moisés', 90, '007'),
(38, 'Antonio', 15, '011'),
(39, 'Omar', 15, '05');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compras`
--

CREATE TABLE IF NOT EXISTS `compras` (
  `id_compras` int(11) NOT NULL AUTO_INCREMENT,
  `Fecha` varchar(20) NOT NULL,
  `folio` varchar(11) NOT NULL,
  `TotalCompras` float NOT NULL,
  PRIMARY KEY (`id_compras`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=68 ;

--
-- Volcado de datos para la tabla `compras`
--

INSERT INTO `compras` (`id_compras`, `Fecha`, `folio`, `TotalCompras`) VALUES
(66, '2018-4-1', '0.0', 0),
(65, '2018-4-1', '0.0', 0),
(64, '2018-4-1', '001', 26),
(63, '2018-4-1', '0.0', 0),
(62, '2018-4-1', '0.0', 0),
(61, '2018-4-1', '0.0', 0),
(60, '2018-4-1', '0.0', 0),
(59, '2018-4-1', '005', 98),
(55, '2018-4-1', '004', 130),
(53, '2018-4-1', '002', 187),
(54, '2018-4-1', '003', 144),
(52, '2018-4-1', '001', 52),
(58, '2018-4-1', '0.0', 0),
(67, '', '0.0', 0),
(15, '07/05/2018', '0.0', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_compra`
--

CREATE TABLE IF NOT EXISTS `detalle_compra` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `Folio` int(11) NOT NULL,
  `producto` varchar(50) NOT NULL,
  `Cantidad` float NOT NULL,
  `Precio` float NOT NULL,
  `PagaPorCantidad` float NOT NULL,
  `TotalAPagar` float NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=62 ;

--
-- Volcado de datos para la tabla `detalle_compra`
--

INSERT INTO `detalle_compra` (`id_detalle`, `Folio`, `producto`, `Cantidad`, `Precio`, `PagaPorCantidad`, `TotalAPagar`) VALUES
(55, 1, 'Donitas Bimbo', 4, 13, 0, 0),
(56, 2, 'Coca - Cola', 11, 17, 0, 0),
(57, 3, 'Pepsi', 9, 16, 0, 0),
(58, 4, 'Jugo', 10, 13, 0, 0),
(59, 5, 'Naranjada', 7, 14, 0, 0),
(15, 1, 'maruchan', 2, 10, 0, 0),
(25, 7, 'jabon liquido', 1, 13, 0, 0),
(26, 7, 'tomate', 2, 14, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_venta`
--

CREATE TABLE IF NOT EXISTS `detalle_venta` (
  `id_detalle_venta` int(11) NOT NULL AUTO_INCREMENT,
  `Folio` int(11) NOT NULL,
  `Cantida` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `Precio` float NOT NULL,
  `NombreDeProducto` varchar(255) NOT NULL,
  `PagaPorCantidad` float NOT NULL,
  `TotalAPagar` float NOT NULL,
  `id_venta` int(11) NOT NULL,
  PRIMARY KEY (`id_detalle_venta`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=32 ;

--
-- Volcado de datos para la tabla `detalle_venta`
--

INSERT INTO `detalle_venta` (`id_detalle_venta`, `Folio`, `Cantida`, `id_producto`, `Precio`, `NombreDeProducto`, `PagaPorCantidad`, `TotalAPagar`, `id_venta`) VALUES
(15, 0, 3, 2, 17, '', 0, 0, 13),
(14, 0, 1, 1, 13, '', 0, 0, 12),
(25, 3, 2, 25, 12, 'ManzanitaSol', 0, 0, 23),
(26, 3, 4, 33, 30, 'redbull', 0, 0, 32),
(30, 9, 3, 18, 15, 'fabuloso', 0, 0, 31),
(31, 9, 1, 20, 22, 'suavitel', 0, 0, 32);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE IF NOT EXISTS `productos` (
  `id_producto` int(11) NOT NULL AUTO_INCREMENT,
  `Desc_producto` varchar(200) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Precio` float NOT NULL,
  `Codigo` varchar(11) NOT NULL,
  PRIMARY KEY (`id_producto`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id_producto`, `Desc_producto`, `Nombre`, `Precio`, `Codigo`) VALUES
(1, 'Donitas', 'Donitas Bimbo', 13, '001'),
(2, 'Bebida', 'Coca - Cola', 17, '002'),
(4, 'Bebida', 'Pepsi', 16, '003'),
(5, 'Sabor nara', 'Jugo', 13, '004'),
(6, 'Bebida', 'Naranjada', 14, '005'),
(7, 'Botana', 'Sabritas', 7, '006');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `provedorees`
--

CREATE TABLE IF NOT EXISTS `provedorees` (
  `id_proveedor` int(11) NOT NULL AUTO_INCREMENT,
  `Marca` varchar(50) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `folio` varchar(11) NOT NULL,
  PRIMARY KEY (`id_proveedor`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=16 ;

--
-- Volcado de datos para la tabla `provedorees`
--

INSERT INTO `provedorees` (`id_proveedor`, `Marca`, `Nombre`, `folio`) VALUES
(10, 'Pepsi', 'Moisés', '003'),
(6, 'Barcel', 'Estefanía Fernández', '002'),
(9, 'Zucaritas', 'Luis', '001'),
(11, 'Modelo', 'Fernanda E.', '004'),
(13, 'Genérica', 'Luis Noyola', '005'),
(14, 'La estrellita', 'Alfredo Molina', '006'),
(15, 'Coca - Cola', 'Luis Mendes', '007');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recargas`
--

CREATE TABLE IF NOT EXISTS `recargas` (
  `id_recarga` int(11) NOT NULL AUTO_INCREMENT,
  `Monto` float NOT NULL,
  `NumeroTelefonico` varchar(50) NOT NULL,
  `Compania` varchar(11) NOT NULL,
  PRIMARY KEY (`id_recarga`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `recargas`
--

INSERT INTO `recargas` (`id_recarga`, `Monto`, `NumeroTelefonico`, `Compania`) VALUES
(1, 100, '4981165718', 'Unefon'),
(2, 100, '4981165718', 'Movistar'),
(3, 90, '4989876543', 'Unefon');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE IF NOT EXISTS `ventas` (
  `id_venta` int(11) NOT NULL AUTO_INCREMENT,
  `Fecha` varchar(11) NOT NULL,
  `Total` float NOT NULL,
  `folio` varchar(11) NOT NULL,
  PRIMARY KEY (`id_venta`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`id_venta`, `Fecha`, `Total`, `folio`) VALUES
(14, '2018-4-1', 0, ''),
(13, '2018-4-1', 51, '002'),
(12, '2018-4-1', 13, '001');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
