

DELIMITER $$
DROP PROCEDURE IF EXISTS `spBuscarEmpresaId`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `spBuscarEmpresaId` (IN `id_empresa` INT(11))   BEGIN
    SELECT id, nit, nombre, direccion, email, estado
    FROM ads_empresas
    WHERE id = id_empresa;
END$$

DROP PROCEDURE IF EXISTS `spBuscarEmpresaoId`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `spBuscarEmpresaoId` (IN `id_empresa` INT(11))   BEGIN
    SELECT id, nit, nombre, direccion, email, estado FROM ads_empresas
    WHERE id = id_empresa;
END$$

DROP PROCEDURE IF EXISTS `spInsertarEmpresa`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `spInsertarEmpresa` (IN `new_nit` VARCHAR(15), IN `new_nombre` VARCHAR(150), IN `new_direccion` VARCHAR(255), IN `new_email` VARCHAR(30), IN `new_estado` VARCHAR(10))   BEGIN
    INSERT INTO ads_empresas (nit, nombre, direccion, email, estado) VALUES (new_nit,new_nombre,new_direccion,new_email,new_estado);
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ads_empresas`
--

DROP TABLE IF EXISTS `ads_empresas`;
CREATE TABLE IF NOT EXISTS `ads_empresas` (
                                              `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
                                              `nit` varchar(15) COLLATE utf8mb4_spanish_ci NOT NULL,
                                              `nombre` varchar(150) COLLATE utf8mb4_spanish_ci NOT NULL,
                                              `direccion` varchar(255) COLLATE utf8mb4_spanish_ci NOT NULL,
                                              `email` varchar(30) COLLATE utf8mb4_spanish_ci NOT NULL,
                                              `estado` varchar(10) COLLATE utf8mb4_spanish_ci NOT NULL DEFAULT 'Activo',
                                              PRIMARY KEY (`id`),
                                              UNIQUE KEY `nombre` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

DROP TABLE IF EXISTS `categorias`;
CREATE TABLE IF NOT EXISTS `categorias` (
                                            `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
                                            `nit` varchar(15) COLLATE utf8mb4_spanish_ci NOT NULL,
                                            `nombre` varchar(150) COLLATE utf8mb4_spanish_ci NOT NULL,
                                            `estado` varchar(10) COLLATE utf8mb4_spanish_ci NOT NULL DEFAULT 'Activo',
                                            PRIMARY KEY (`id`),
                                            UNIQUE KEY `nombre` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `ads_empresas`
--

INSERT INTO `ads_empresas` (`id`, `nit`, `nombre`, `direccion`, `email`, `estado`) VALUES
                                                                                       (1, '9001312690', 'Global SAS', 'Centro histórico', 'global@gmail.com', 'Activo'),
                                                                                       (2, '8909990', 'Celta Web', 'Manga', 'celta@yahoo.com', 'Activo'),
                                                                                       (3, '7896000', 'Dell', 'Los Caracoles', 'james@gmail.com', 'Activo');

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `view_empresas`
-- (Véase abajo para la vista actual)
--
DROP VIEW IF EXISTS `view_empresas`;
CREATE TABLE IF NOT EXISTS `view_empresas` (
    `id` int unsigned
    ,`nit` varchar(15)
    ,`nombre` varchar(150)
    ,`direccion` varchar(255)
    ,`email` varchar(30)
    ,`estado` varchar(10)
);

-- --------------------------------------------------------

--
-- Estructura para la vista `view_empresas`
--
DROP TABLE IF EXISTS `view_empresas`;

/*View empresas: */

CREATE VIEW `view_empresas` AS
SELECT `ads_empresas`.`id` AS`id`,
       `ads_empresas`.`nit` AS `nit`,
       `ads_empresas`.`nombre` AS `nombre`,
       `ads_empresas`.`direccion` AS `direccion`,
       `ads_empresas`.`email` AS `email`,
       `ads_empresas`.`estado` AS `estado`
FROM `ads_empresas`;

/*Tabla categorías*/

DROP TABLE IF EXISTS `categorias`;
CREATE TABLE IF NOT EXISTS `categorias` (
    `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
    `nit` varchar(15) COLLATE utf8mb4_spanish_ci NOT NULL,
    `nombre` varchar(150) COLLATE utf8mb4_spanish_ci NOT NULL,
    `estado` varchar(10) COLLATE utf8mb4_spanish_ci NOT NULL DEFAULT 'Activo',
    PRIMARY KEY (`id`),
    UNIQUE KEY `nombre` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;