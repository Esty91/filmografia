CREATE DATABASE cine;

GRANT ALL ON filmografia.* TO filmografiauser@'%' IDENTIFIED BY 'pfilmografiauser';
GRANT ALL ON filmografia.* TO filmografiauser@localhost IDENTIFIED BY 'pfilmografiauser';

USE cine;

CREATE TABLE `pelicula`(
	`id` INT(5),
	`director` VARCHAR(40) NOT NULL,
	`titulo` VARCHAR(40) NOT NULL,
	`fecha` DATETIME NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `useradmin` (
	`nombreusuario` VARCHAR(20) NULL DEFAULT NULL,
	`clave` VARCHAR(4) NULL DEFAULT NULL,
	PRIMARY KEY (`nombreusuario`)
);