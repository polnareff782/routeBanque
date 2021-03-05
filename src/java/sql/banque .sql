-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  ven. 05 mars 2021 à 12:38
-- Version du serveur :  10.4.10-MariaDB
-- Version de PHP :  7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `banque`
--

-- --------------------------------------------------------

--
-- Structure de la table `compte`
--

DROP TABLE IF EXISTS `compte`;
CREATE TABLE IF NOT EXISTS `compte` (
  `idCompte` int(11) NOT NULL,
  `numCp` varchar(20) NOT NULL,
  `solde` int(50) NOT NULL DEFAULT 500,
  `libelleCp` varchar(20) NOT NULL,
  `numCarte` varchar(45) NOT NULL,
  `etat` tinyblob NOT NULL,
  `operation` varchar(45) DEFAULT NULL,
  `dateExpiration` varchar(45) NOT NULL,
  `client_idperson` int(11) NOT NULL,
  `person_idperson` int(11) NOT NULL,
  `typeOperation` varchar(45) NOT NULL,
  `dateOperation` varchar(45) NOT NULL,
  `montant` int(11) NOT NULL,
  PRIMARY KEY (`idCompte`),
  KEY `fk_compte_person1_idx` (`person_idperson`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `historique`
--

DROP TABLE IF EXISTS `historique`;
CREATE TABLE IF NOT EXISTS `historique` (
  `idHistorique` int(11) NOT NULL,
  `contenue` varchar(45) NOT NULL,
  `date` datetime NOT NULL,
  `person_idperson` int(11) NOT NULL,
  PRIMARY KEY (`idHistorique`),
  KEY `fk_Historique_person1_idx` (`person_idperson`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `message`
--

DROP TABLE IF EXISTS `message`;
CREATE TABLE IF NOT EXISTS `message` (
  `idtype` int(11) NOT NULL AUTO_INCREMENT,
  `contenu` varchar(45) NOT NULL,
  `date_message` datetime NOT NULL,
  `person_idperson` int(11) NOT NULL,
  PRIMARY KEY (`idtype`),
  KEY `fk_message_person1_idx` (`person_idperson`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `person`
--

DROP TABLE IF EXISTS `person`;
CREATE TABLE IF NOT EXISTS `person` (
  `idperson` int(11) NOT NULL AUTO_INCREMENT,
  `nom` char(15) NOT NULL,
  `prenom` char(15) NOT NULL,
  `telephone` varchar(11) NOT NULL,
  `sexe` char(15) NOT NULL,
  `dateNaissance` date NOT NULL,
  `email` char(150) NOT NULL,
  `adresse` varchar(60) NOT NULL,
  PRIMARY KEY (`idperson`),
  UNIQUE KEY `telephone` (`telephone`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `role`
--

DROP TABLE IF EXISTS `role`;
CREATE TABLE IF NOT EXISTS `role` (
  `idrole` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(45) NOT NULL,
  PRIMARY KEY (`idrole`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE IF NOT EXISTS `utilisateur` (
  `idutilisateur` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(45) NOT NULL,
  `mdp` varchar(45) NOT NULL,
  `idperson` int(11) NOT NULL,
  `idrole` int(11) NOT NULL,
  `statut` int(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`idutilisateur`),
  KEY `fk_identification_person1_idx` (`idperson`),
  KEY `fk_identification_role1_idx` (`idrole`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `compte`
--
ALTER TABLE `compte`
  ADD CONSTRAINT `fk_compte_person1` FOREIGN KEY (`person_idperson`) REFERENCES `person` (`idperson`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `historique`
--
ALTER TABLE `historique`
  ADD CONSTRAINT `fk_Historique_person1` FOREIGN KEY (`person_idperson`) REFERENCES `person` (`idperson`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `message`
--
ALTER TABLE `message`
  ADD CONSTRAINT `fk_message_person1` FOREIGN KEY (`person_idperson`) REFERENCES `person` (`idperson`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD CONSTRAINT `fk_identification_person1` FOREIGN KEY (`idperson`) REFERENCES `person` (`idperson`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_identification_role1` FOREIGN KEY (`idrole`) REFERENCES `role` (`idrole`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
