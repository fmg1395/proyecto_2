SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema pizzeria
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `pizzeria` ;

-- -----------------------------------------------------
-- Schema pizzeria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `pizzeria` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci ;
USE `pizzeria` ;

-- -----------------------------------------------------
-- Table `pizzeria`.`usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `pizzeria`.`usuario` ;

CREATE TABLE IF NOT EXISTS `pizzeria`.`usuario` (
  `cedula` VARCHAR(15) NOT NULL,
  `nombre` VARCHAR(40) NOT NULL,
  `apellido` VARCHAR(20) NOT NULL,
  `direccion` VARCHAR(200) NOT NULL,
  `telefono` VARCHAR(15) NOT NULL,
  `contraseña` VARCHAR(15),
  `rol` VARCHAR(1),
  PRIMARY KEY (`cedula`))
ENGINE = InnoDB;

DROP TABLE IF EXISTS `pizzeria`.`items` ;

-- -----------------------------------------------------
-- Table `pizzeria`.`items`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`items` (
  `item_id` INT NOT NULL AUTO_INCREMENT,
  `item_name` VARCHAR(45) NOT NULL,
  `desc` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`item_id`))
ENGINE = InnoDB;

DROP TABLE IF EXISTS `item_options`;
 -- -----------------------------------------------------
-- Table `pizzeria`.`item_options`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`item_options` (
  `option_id` INT NOT NULL AUTO_INCREMENT,
  `item_id` INT(10) NOT NULL,
  `option_name` VARCHAR(45) NOT NULL,
  `price` FLOAT NOT NULL,
  PRIMARY KEY (`option_id`), foreign key (`item_id`) references
  `pizzeria`.`items`(`item_id`)
  ON DELETE NO ACTION
    ON UPDATE NO ACTION
    )
ENGINE = InnoDB;
DROP TABLE IF EXISTS `item_extras`;
 -- -----------------------------------------------------
-- Table `pizzeria`.`item_extras`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`item_extras`(
`extra_id` INT NOT NULL auto_increment,
`name` VARCHAR(20) NOT NULL,
`cost` float not null,
PRIMARY KEY(`extra_id`)
)
ENGINE = InnoDB;

DROP TABLE IF EXISTS `pedido`;
 -- -----------------------------------------------------
-- Table `pizzeria`.`pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pizzeria`.`pedido`(
`ticket_id` int not null auto_increment,
`estado` varchar(100) not null,
PRIMARY KEY(`ticket_id`)
)
ENGINE = InnoDB;
insert into `pizzeria`.`items` (`item_name`,`desc`) VALUES
('PIZZA SUPREMA','Increible pizza con aceitunas, jamon,queso,
,molida, salsa de tomate y orégano');
insert into `pizzeria`.`item_options` (`item_id`,`option_name`
,`price`) VALUES (1,'personal',2700),(1,'grande',4000),
(1,'familiar',5700);
insert into `pizzeria`.`usuario` (`cedula`,`nombre`,
  `apellido`,
  `direccion`,
  `telefono` ,
  `contraseña`,
  `rol`) VALUES('117570784','Jasson','Nuñez','Santa Bárbara',
  '85223412','123','A');