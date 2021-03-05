-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema banque
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema banque
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `banque` DEFAULT CHARACTER SET utf8mb4 ;
USE `banque` ;

-- -----------------------------------------------------
-- Table `banque`.`person`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `banque`.`person` (
  `idperson` INT(11) NOT NULL AUTO_INCREMENT,
  `nom` CHAR(15) NOT NULL,
  `prenom` CHAR(15) NOT NULL,
  `telephone` VARCHAR(11) NOT NULL,
  `sexe` CHAR(15) NOT NULL,
  `dateNaissance` DATE NOT NULL,
  `email` CHAR(15) NOT NULL,
  `adresse` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`idperson`),
  UNIQUE INDEX `telephone` (`telephone` ASC) ,
  UNIQUE INDEX `email` (`email` ASC) )
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `banque`.`compte`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `banque`.`compte` (
  `idCompte` INT NOT NULL,
  `numCp` VARCHAR(20) NOT NULL,
  `solde` INT(50) NOT NULL DEFAULT 500,
  `libelleCp` VARCHAR(20) NOT NULL,
  `numCarte` VARCHAR(45) NOT NULL,
  `etat` TINYBLOB NOT NULL,
  `operation` VARCHAR(45) NULL,
  `dateExpiration` VARCHAR(45) NOT NULL,
  `client_idperson` INT(11) NOT NULL,
  `person_idperson` INT(11) NOT NULL,
  `typeOperation` VARCHAR(45) NOT NULL,
  `dateOperation` VARCHAR(45) NOT NULL,
  `montant` INT NOT NULL,
  PRIMARY KEY (`idCompte`),
  INDEX `fk_compte_person1_idx` (`person_idperson` ASC) ,
  CONSTRAINT `fk_compte_person1`
    FOREIGN KEY (`person_idperson`)
    REFERENCES `banque`.`person` (`idperson`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `banque`.`role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `banque`.`role` (
  `idrole` INT(11) NOT NULL AUTO_INCREMENT,
  `libelle` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idrole`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `banque`.`utilisateur`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `banque`.`utilisateur` (
  `idutilisateur` INT(11) NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(45) NOT NULL,
  `mdp` VARCHAR(45) NOT NULL,
  `statut` TINYBLOB NOT NULL DEFAULT 0,
  `idperson` INT(11) NOT NULL,
  `idrole` INT(11) NOT NULL,
  PRIMARY KEY (`idutilisateur`),
  INDEX `fk_identification_person1_idx` (`idperson` ASC) ,
  INDEX `fk_identification_role1_idx` (`idrole` ASC) ,
  CONSTRAINT `fk_identification_person1`
    FOREIGN KEY (`idperson`)
    REFERENCES `banque`.`person` (`idperson`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_identification_role1`
    FOREIGN KEY (`idrole`)
    REFERENCES `banque`.`role` (`idrole`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `banque`.`message`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `banque`.`message` (
  `idtype` INT NOT NULL AUTO_INCREMENT,
  `contenu` VARCHAR(45) NOT NULL,
  `date_message` DATETIME NOT NULL,
  `person_idperson` INT(11) NOT NULL,
  PRIMARY KEY (`idtype`),
  INDEX `fk_message_person1_idx` (`person_idperson` ASC) ,
  CONSTRAINT `fk_message_person1`
    FOREIGN KEY (`person_idperson`)
    REFERENCES `banque`.`person` (`idperson`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `banque`.`Historique`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `banque`.`Historique` (
  `idHistorique` INT NOT NULL,
  `contenue` VARCHAR(45) NOT NULL,
  `date` DATETIME NOT NULL,
  `person_idperson` INT(11) NOT NULL,
  PRIMARY KEY (`idHistorique`),
  INDEX `fk_Historique_person1_idx` (`person_idperson` ASC) ,
  CONSTRAINT `fk_Historique_person1`
    FOREIGN KEY (`person_idperson`)
    REFERENCES `banque`.`person` (`idperson`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
