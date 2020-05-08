-- -----------------------------------------------------
-- Schema NexosPrueba
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `NexosPrueba` ;

-- -----------------------------------------------------
-- Schema NexosPrueba
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `NexosPrueba` DEFAULT CHARACTER SET utf8 ;
USE `NexosPrueba` ;

-- -----------------------------------------------------
-- Table `NexosPrueba`.`CITY`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `NexosPrueba`.`CITY` (
  `CITY_ID` INT NOT NULL AUTO_INCREMENT,
  `CREATED` DATETIME NOT NULL,
  `CREATED_BY` INT NOT NULL,
  `UPDATED` DATETIME NULL,
  `UPDATED_BY` INT NULL,
  `NAME` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`CITY_ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `NexosPrueba`.`PROFESSION`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `NexosPrueba`.`PROFESSION` (
  `PROFESSION_ID` INT NOT NULL AUTO_INCREMENT,
  `CREATED` DATETIME NOT NULL,
  `CREATED_BY` INT NOT NULL,
  `UPDATED` DATETIME NULL,
  `UPDATED_BY` INT NULL,
  `NAME` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`PROFESSION_ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `NexosPrueba`.`PERSON`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `NexosPrueba`.`PERSON` (
  `PERSON_ID` INT NOT NULL AUTO_INCREMENT,
  `CREATED` DATETIME NOT NULL,
  `CREATED_BY` INT NOT NULL,
  `UPDATED` DATETIME NULL,
  `UPDATED_BY` INT NULL,
  `NOMBRES` VARCHAR(150) NOT NULL,
  `PRIMER_APELLIDO` VARCHAR(25) NOT NULL,
  `SEGUNDO_APELLIDO` VARCHAR(25) NULL,
  `FECHA_NACIMIENTO` DATETIME NOT NULL,
  `EDAD` INT NULL,
  `CIUDAD_NACIMIENTO_ID` INT NOT NULL,
  `PROFESSION_ID` INT NULL,
  PRIMARY KEY (`PERSON_ID`),
  CONSTRAINT `CITY_ID`
    FOREIGN KEY (`CIUDAD_NACIMIENTO_ID`)
    REFERENCES `NexosPrueba`.`CITY` (`CITY_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `PROFESSION_ID`
    FOREIGN KEY (`PROFESION_ID`)
    REFERENCES `NexosPrueba`.`PROFESSION` (`PROFESSION_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `CITY_ID_idx` ON `NexosPrueba`.`PERSON` (`CIUDAD_NACIMIENTO_ID` ASC) VISIBLE;

CREATE INDEX `PROFESSION_ID_idx` ON `NexosPrueba`.`PERSON` (`PROFESION_ID` ASC) VISIBLE;