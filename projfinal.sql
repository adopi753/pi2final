-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 23/05/2024 às 20:51
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `projfinal`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `produto`
--

CREATE TABLE `produto` (
  `idProduto` varchar(10) NOT NULL,
  `categoria` varchar(10) NOT NULL,
  `produto` varchar(100) NOT NULL,
  `tipo` varchar(10) NOT NULL,
  `quantidade` int(10) NOT NULL,
  `vlCompra` float NOT NULL,
  `icms` float NOT NULL,
  `vlVenda` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `produto`
--

INSERT INTO `produto` (`idProduto`, `categoria`, `produto`, `tipo`, `quantidade`, `vlCompra`, `icms`, `vlVenda`) VALUES
('1', 'Alvenaria', 'CIMENTO', 'SC', 10, 50, 12, 80);

-- --------------------------------------------------------

--
-- Estrutura para tabela `users`
--

CREATE TABLE `users` (
  `cpf` varchar(15) NOT NULL,
  `perfil` varchar(20) NOT NULL,
  `nome` varchar(80) NOT NULL,
  `celular` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `senha` varchar(10) NOT NULL,
  `rua` varchar(150) NOT NULL,
  `numero` varchar(7) NOT NULL,
  `complemento` varchar(50) DEFAULT NULL,
  `bairro` varchar(80) NOT NULL,
  `cidade` varchar(80) NOT NULL,
  `estado` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Despejando dados para a tabela `users`
--

INSERT INTO `users` (`cpf`, `perfil`, `nome`, `celular`, `email`, `senha`, `rua`, `numero`, `complemento`, `bairro`, `cidade`, `estado`) VALUES
('222.333.111-00', 'Usuário', 'EDNA SENA DA SILVA', '(11) 92223-3111', 'essouza@gmail.com', '12345', 'RUA NOVA', '153', 'CASA C', 'SANTO AMARO', 'SÃO PAULO', 'SP'),
('222.333.111-22', 'Administrador', 'SABRINA REGINA DE SOUZA', '(11) 92233-0011', 'srmartins@gmail.com', '123', 'RUA 3', '30', 'CASA 3', 'NOVA CONQUISTA', 'SÃO PAULO', 'SP');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`idProduto`) USING BTREE,
  ADD UNIQUE KEY `produto` (`produto`);

--
-- Índices de tabela `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`cpf`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
