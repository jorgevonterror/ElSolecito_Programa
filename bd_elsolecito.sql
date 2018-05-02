-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:8889
-- Tiempo de generación: 02-05-2018 a las 01:41:39
-- Versión del servidor: 5.6.38-log
-- Versión de PHP: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Base de datos: `BD_ElSolecito`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id_clientes` int(11) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Monto` double NOT NULL,
  `folio` varchar(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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

CREATE TABLE `compras` (
  `id_compras` int(11) NOT NULL,
  `Fecha` varchar(20) NOT NULL,
  `folio` varchar(11) NOT NULL,
  `TotalCompras` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
(58, '2018-4-1', '0.0', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_compra`
--

CREATE TABLE `detalle_compra` (
  `id_detalle` int(11) NOT NULL,
  `producto` varchar(50) NOT NULL,
  `Cantidad` float NOT NULL,
  `Precio` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalle_compra`
--

INSERT INTO `detalle_compra` (`id_detalle`, `producto`, `Cantidad`, `Precio`) VALUES
(55, 'Donitas Bimbo', 4, 13),
(56, 'Coca - Cola', 11, 17),
(57, 'Pepsi', 9, 16),
(58, 'Jugo', 10, 13),
(59, 'Naranjada', 7, 14),
(60, 'Donitas Bimbo', 2, 13);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_venta`
--

CREATE TABLE `detalle_venta` (
  `id_detalle_venta` int(11) NOT NULL,
  `Cantida` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `Precio` float NOT NULL,
  `id_venta` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalle_venta`
--

INSERT INTO `detalle_venta` (`id_detalle_venta`, `Cantida`, `id_producto`, `Precio`, `id_venta`) VALUES
(15, 3, 2, 17, 13),
(14, 1, 1, 13, 12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id_producto` int(11) NOT NULL,
  `Desc_producto` varchar(200) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Precio` float NOT NULL,
  `Codigo` varchar(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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

CREATE TABLE `provedorees` (
  `id_proveedor` int(11) NOT NULL,
  `Marca` varchar(50) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `folio` varchar(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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

CREATE TABLE `recargas` (
  `id_recarga` int(11) NOT NULL,
  `Monto` float NOT NULL,
  `NumeroTelefonico` varchar(50) NOT NULL,
  `Compania` varchar(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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

CREATE TABLE `ventas` (
  `id_venta` int(11) NOT NULL,
  `Fecha` varchar(11) NOT NULL,
  `Total` float NOT NULL,
  `folio` varchar(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`id_venta`, `Fecha`, `Total`, `folio`) VALUES
(14, '2018-4-1', 0, ''),
(13, '2018-4-1', 51, '002'),
(12, '2018-4-1', 13, '001');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_clientes`);

--
-- Indices de la tabla `compras`
--
ALTER TABLE `compras`
  ADD PRIMARY KEY (`id_compras`);

--
-- Indices de la tabla `detalle_compra`
--
ALTER TABLE `detalle_compra`
  ADD PRIMARY KEY (`id_detalle`);

--
-- Indices de la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  ADD PRIMARY KEY (`id_detalle_venta`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id_producto`);

--
-- Indices de la tabla `provedorees`
--
ALTER TABLE `provedorees`
  ADD PRIMARY KEY (`id_proveedor`);

--
-- Indices de la tabla `recargas`
--
ALTER TABLE `recargas`
  ADD PRIMARY KEY (`id_recarga`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`id_venta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id_clientes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT de la tabla `compras`
--
ALTER TABLE `compras`
  MODIFY `id_compras` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=67;

--
-- AUTO_INCREMENT de la tabla `detalle_compra`
--
ALTER TABLE `detalle_compra`
  MODIFY `id_detalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=61;

--
-- AUTO_INCREMENT de la tabla `detalle_venta`
--
ALTER TABLE `detalle_venta`
  MODIFY `id_detalle_venta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `provedorees`
--
ALTER TABLE `provedorees`
  MODIFY `id_proveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `recargas`
--
ALTER TABLE `recargas`
  MODIFY `id_recarga` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `id_venta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
