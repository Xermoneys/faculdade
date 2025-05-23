-- MOTORISTAS
CREATE TABLE motoristas (
    id_motoristas INT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cnh VARCHAR(20) NOT NULL UNIQUE
);

-- TELEFONES
CREATE TABLE telefones (
    id_motoristas INT,
    telefone VARCHAR(15) NOT NULL,
    PRIMARY KEY (id_motoristas, telefone),
    FOREIGN KEY (id_motoristas) REFERENCES motoristas(id_motoristas)
);

-- VEÍCULOS
CREATE TABLE veiculos (
    id_veiculos VARCHAR(20) PRIMARY KEY,
    tipo VARCHAR(20) NOT NULL CHECK (tipo IN ('ônibus', 'trem', 'metrô')),
    placa VARCHAR(10) NOT NULL UNIQUE,
    capacidade INT NOT NULL CHECK (capacidade > 0),
    motoristas_id INT NOT NULL,
    FOREIGN KEY (motoristas_id) REFERENCES motoristas(id_motoristas)
);

-- ROTAS
CREATE TABLE rotas (
    id_rotas INT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT
);

-- TRAJETOS
CREATE TABLE trajetos (
    veiculos_id VARCHAR(20),
    rotas_id INT,
    horario_saida TIME NOT NULL,
    horario_chegada TIME NOT NULL,
    PRIMARY KEY (veiculos_id, rotas_id),
    FOREIGN KEY (veiculos_id) REFERENCES veiculos(id_veiculos),
    FOREIGN KEY (rotas_id) REFERENCES rotas(id_rotas)
);

-- PASSAGEIROS
CREATE TABLE passageiros (
    id_passageiros INT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL UNIQUE
);

-- BILHETES
CREATE TABLE bilhetes (
    id_bilhetes INT PRIMARY KEY,
    data_emissao DATE NOT NULL,
    valor DECIMAL(6,2) NOT NULL CHECK (valor >= 0)
);

-- PASSAGENS
CREATE TABLE passagens (
    passageiros_id INT,
    bilhetes_id INT,
    PRIMARY KEY (passageiros_id, bilhetes_id),
    FOREIGN KEY (passageiros_id) REFERENCES passageiros(id_passageiros),
    FOREIGN KEY (bilhetes_id) REFERENCES bilhetes(id_bilhetes)
);

-- VIAGENS
CREATE TABLE viagens (
    id_viagens INT PRIMARY KEY,
    horario_partida TIME NOT NULL,
    horario_chegada TIME NOT NULL,
    lotacao INT NOT NULL CHECK (lotacao >= 0)
);

-- LOCOMOÇÕES
CREATE TABLE locomocoes (
    passageiros_id INT,
    viagens_id INT,
    data_de_uso DATE NOT NULL,
    PRIMARY KEY (passageiros_id, viagens_id),
    FOREIGN KEY (passageiros_id) REFERENCES passageiros(id_passageiros),
    FOREIGN KEY (viagens_id) REFERENCES viagens(id_viagens)
);

-- PARADAS
CREATE TABLE paradas (
    id_paradas INT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    rua VARCHAR(100) NOT NULL,
    numero VARCHAR(10) NOT NULL,
    bairro VARCHAR(50) NOT NULL,
    cidade VARCHAR(50) NOT NULL
);

-- PONTOS DE PARADA
CREATE TABLE pontos_de_parada (
    viagens_id INT,
    paradas_id INT,
    PRIMARY KEY (viagens_id, paradas_id),
    FOREIGN KEY (viagens_id) REFERENCES viagens(id_viagens),
    FOREIGN KEY (paradas_id) REFERENCES paradas(id_paradas)
);
