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
  `nom` VARCHAR(100) NOT NULL,
  `prenom` VARCHAR(100)  NOT NULL,
  `telephone` VARCHAR(100)  NOT NULL,
  `sexe` CHAR(15) NOT NULL,
  `dateNaissance` DATE NOT NULL,
  `email` VARCHAR(100)  NOT NULL,
  `adresse` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`idperson`),
  UNIQUE INDEX `telephone` (`telephone` ASC) ,
  UNIQUE INDEX `email` (`email` ASC) )
ENGINE = InnoDB
AUTO_INCREMENT = 12
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `banque`.`role` (
  `idrole` INT(11) NOT NULL AUTO_INCREMENT,
  `libelle` VARCHAR(100)  NOT NULL,
  PRIMARY KEY (`idrole`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4;


CREATE TABLE IF NOT EXISTS `banque`.`utilisateur` (
  `idutilisateur` INT(11) NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(100)  NOT NULL,
  `mdp` VARCHAR(100)  NOT NULL,
  `idperson` INT(11) NOT NULL,
  `idrole` INT(11) NOT NULL,
  `statut` INT(11) NOT NULL DEFAULT 1,
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
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = utf8mb4;

-- -----------------------------------------------------
-- Table `banque`.`compte`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `banque`.`compte` (
  `idCompte` INT(11) NOT NULL,
  `numCp` INT(120) NOT NULL DEFAULT cast(rand() * 100000000 as signed),
  `solde` INT(50) NOT NULL DEFAULT 500,
  `libelleCp` VARCHAR(100)  NOT NULL DEFAULT 'visa',
  `numCarte` INT(120) NOT NULL DEFAULT cast(rand() * 100000000 as signed),
  `etat` TINYINT(4) NOT NULL,
  `opposition` TINYINT(1) NULL DEFAULT 1,
  `dateExpiration` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP(),
  `person_idperson` INT(11) NOT NULL,
  `TypeOperation` VARCHAR(45) NOT NULL,
  `dateOperation` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP(),
  `montantDecouvert` INT(11) NOT NULL,
  `operation` VARCHAR(45) NOT NULL DEFAULT 'Visa',
  PRIMARY KEY (`idCompte`),
  UNIQUE INDEX `numCarte_UNIQUE` (`numCarte` ASC) ,
  UNIQUE INDEX `numCp_UNIQUE` (`numCp` ASC) ,
  INDEX `fk_compte_person1_idx` (`person_idperson` ASC) ,
  CONSTRAINT `person_idperson`
    FOREIGN KEY (`person_idperson`)
    REFERENCES `banque`.`person` (`idperson`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `banque`.`historique`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `banque`.`historique` (
  `idOperation` INT(11) NOT NULL AUTO_INCREMENT,
  `typeOperation` VARCHAR(45) NOT NULL,
  `dateOperation` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP(),
  `MontantOperation` INT(11) NOT NULL,
  `person_idperson` INT(11) NOT NULL,
  PRIMARY KEY (`idOperation`),
  INDEX `fk_Historique_person1_idx` (`person_idperson` ASC) ,
  CONSTRAINT `fk_Historique_person1`
    FOREIGN KEY (`person_idperson`)
    REFERENCES `banque`.`person` (`idperson`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 16
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `banque`.`message`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `banque`.`message` (
  `idMessage` INT(11) NOT NULL AUTO_INCREMENT,
  `contenuMessage` VARCHAR(100)  NOT NULL,
  `dateMessage` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP(),
  `person_idperson` INT(11) NOT NULL,
  PRIMARY KEY (`idMessage`),
  INDEX `fk_message_person1_idx` (`person_idperson` ASC) ,
  CONSTRAINT `fk_message_person1`
    FOREIGN KEY (`person_idperson`)
    REFERENCES `banque`.`person` (`idperson`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


INSERT INTO `banque`.`person` (`nom`, `prenom`, `telephone`, `sexe`, `dateNaissance`, `email`, `adresse`) VALUES ('Admin', 'Admin', '4564545', 'f', '2021-03-25', 'admin@admin.fr', 'adminnadresse');
INSERT INTO `banque`.`person` (`nom`, `prenom`, `telephone`, `sexe`, `dateNaissance`, `email`, `adresse`) VALUES ('conseiller', 'conseiller', '4564545', 'f', '2021-03-25', 'conseiller@conseiller.fr', 'conseilleradrsse');
INSERT INTO `banque`.`person` (`nom`, `prenom`, `telephone`, `sexe`, `dateNaissance`, `email`, `adresse`) VALUES ('client', 'client', '4564545', 'f', '2021-03-25', 'client@client.f', 'clientadresse');


INSERT INTO `banque`.`utilisateur` (`login`, `mdp`, `idperson`, `idrole`) VALUES ('admin', '0000', '1', '1');
INSERT INTO `banque`.`utilisateur` (`login`, `mdp`, `idperson`, `idrole`) VALUES ('conseiller', '0000', '2', '2');
INSERT INTO `banque`.`utilisateur` (`login`, `mdp`, `idperson`, `idrole`) VALUES ('client', '0000', '8', '3');



INSERT INTO `banque`.`compte` (`person_idperson`, `TypeOperation`, `montantDecouvert`, `operation`) VALUES ('8', 'depot', '0', 'visa');

INSERT INTO `banque`.`historique` (`typeOperation`, `MontantOperation`, `person_idperson`) VALUES ('depot', '120', '8');

