USE BloodDB;

CREATE TABLE `Patient` (
  `PatientId` INT AUTO_INCREMENT,
  `FirstName` VARCHAR(20) NULL,
  `LastName` VARCHAR(20) NULL,
  `Age` INT NULL,
  `Gender` VARCHAR(30) NULL,
  `BloodGroup` VARCHAR(45) NULL,
  `City` VARCHAR(45) NULL,
  `PhoneNumber` INT NULL,
  PRIMARY KEY (`PatientId`)); 


CREATE TABLE `BloodBank` (
  `BloodBankId` INT AUTO_INCREMENT,
  `BloodBankName` VARCHAR(100) NULL,
  `Address` VARCHAR(100) NULL,
  `City` VARCHAR(100) NULL,
  `PhoneNumber` INT NULL,
  `Website` VARCHAR(100) NULL,
  `Email` VARCHAR(100) NULL,
  PRIMARY KEY (`BloodBankId`)); 
  
  
  
CREATE TABLE `BloodStock` (
  `BloodStockId` INT AUTO_INCREMENT,
  `BloodGroup` VARCHAR(25) NULL,
  `Quantity` INT NULL,
  `BestBefore` DATE NULL,
  `Status` VARCHAR(100) NULL,
  PRIMARY KEY (`BloodStockId`)); 
  