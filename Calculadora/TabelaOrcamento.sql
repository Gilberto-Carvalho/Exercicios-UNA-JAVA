CREATE TABLE `calculadora`.`tabelaorcamento` (
  `idTabelaOrcamento` INT NOT NULL AUTO_INCREMENT,
  `QuantidadeTelasEntSai` INT NOT NULL,
  `QuantidadeTelasCons` INT NOT NULL,
  `QuantidadeTelasGrav` INT NOT NULL,
  `TotalHoras` DECIMAL(45) NOT NULL,
  `ValorTotal` DECIMAL(45) NULL,
  PRIMARY KEY (`idTabelaOrcamento`));