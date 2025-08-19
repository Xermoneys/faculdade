-- MOTORISTAS
INSERT INTO motoristas VALUES (1, 'Anderson Ferreira', '09876543210');
INSERT INTO motoristas VALUES (2, 'Beatriz Almeida', '12345098765');
INSERT INTO motoristas VALUES (3, 'Carlos Eduardo Ramos', '67890543210');
INSERT INTO motoristas VALUES (4, 'Daniela Martins', '78901234567');
INSERT INTO motoristas VALUES (5, 'Eduardo Gonçalves', '89012345678');

-- TELEFONES
INSERT INTO telefones VALUES (1, '(11)98547-1234');
INSERT INTO telefones VALUES (2, '(11)99658-2345');
INSERT INTO telefones VALUES (3, '(11)98769-3456');
INSERT INTO telefones VALUES (4, '(11)99870-4567');
INSERT INTO telefones VALUES (5, '(11)97981-5678');

-- VEÍCULOS
INSERT INTO veiculos VALUES ('SP-001', 'ônibus', 'BRA2C34', 42, 1);
INSERT INTO veiculos VALUES ('SP-002', 'metrô', 'MET9P56', 250, 2);
INSERT INTO veiculos VALUES ('SP-003', 'trem', 'TRM1X78', 320, 3);
INSERT INTO veiculos VALUES ('SP-004', 'ônibus', 'OBU5F90', 40, 4);
INSERT INTO veiculos VALUES ('SP-005', 'ônibus', 'OBU6K21', 48, 5);

-- ROTAS
INSERT INTO rotas VALUES (501, 'Paulista - Butantã', 'Ligação da Av. Paulista até Butantã');
INSERT INTO rotas VALUES (502, 'Sé - Santana', 'Ligação do centro da Sé até Santana');
INSERT INTO rotas VALUES (503, 'Lapa - Moema', 'Ligação entre os bairros da Lapa e Moema');
INSERT INTO rotas VALUES (504, 'Pinheiros - Tatuapé', 'Conexão entre Pinheiros e Tatuapé');
INSERT INTO rotas VALUES (505, 'Circular Centro', 'Rota circular pelas principais ruas do centro de SP');

-- TRAJETOS
INSERT INTO trajetos VALUES ('SP-001', 501, '06:00:00', '07:20:00');
INSERT INTO trajetos VALUES ('SP-002', 502, '07:30:00', '08:40:00');
INSERT INTO trajetos VALUES ('SP-003', 503, '09:00:00', '10:10:00');
INSERT INTO trajetos VALUES ('SP-004', 504, '10:30:00', '11:50:00');
INSERT INTO trajetos VALUES ('SP-005', 505, '12:10:00', '13:30:00');

-- PASSAGEIROS
INSERT INTO passageiros VALUES (201, 'Mariana Rocha', '321.654.987-00', 'mariana.rocha@gmail.com');
INSERT INTO passageiros VALUES (202, 'Gabriel Souza', '654.321.987-11', 'gabriel.souza@hotmail.com');
INSERT INTO passageiros VALUES (203, 'Fernanda Lima', '987.654.321-22', 'fernanda.lima@yahoo.com');
INSERT INTO passageiros VALUES (204, 'Rafael Nogueira', '159.753.486-33', 'rafael.nogueira@gmail.com');
INSERT INTO passageiros VALUES (205, 'Isabela Fernandes', '753.159.486-44', 'isabela.fernandes@gmail.com');
INSERT INTO passageiros VALUES (206, 'Lucas Mendes', '852.741.963-55', 'lucas.mendes@gmail.com');
INSERT INTO passageiros VALUES (207, 'Ana Clara Silva', '741.852.963-66', 'ana.clara@hotmail.com');
INSERT INTO passageiros VALUES (208, 'João Pedro Farias', '963.852.741-77', 'joao.pedro@yahoo.com');
INSERT INTO passageiros VALUES (209, 'Camila Ribeiro', '258.369.147-88', 'camila.ribeiro@gmail.com');
INSERT INTO passageiros VALUES (210, 'Bruno Oliveira', '147.258.369-99', 'bruno.oliveira@hotmail.com');
INSERT INTO passageiros VALUES (211, 'Patrícia Santos', '369.258.147-00', 'patricia.santos@gmail.com');
INSERT INTO passageiros VALUES (212, 'Felipe Costa', '456.789.123-11', 'felipe.costa@hotmail.com');
INSERT INTO passageiros VALUES (213, 'Larissa Almeida', '789.123.456-22', 'larissa.almeida@gmail.com');
INSERT INTO passageiros VALUES (214, 'Thiago Souza', '123.456.789-33', 'thiago.souza@yahoo.com');
INSERT INTO passageiros VALUES (215, 'Renata Lima', '987.321.654-44', 'renata.lima@gmail.com');


-- BILHETES
INSERT INTO bilhetes VALUES (6001, '2024-11-15', 4.40);
INSERT INTO bilhetes VALUES (6002, '2023-08-07', 5.10);
INSERT INTO bilhetes VALUES (6003, '2025-03-12', 6.50);
INSERT INTO bilhetes VALUES (6004, '2024-09-22', 4.70);
INSERT INTO bilhetes VALUES (6005, '2023-12-05', 5.30);
INSERT INTO bilhetes VALUES (6006, '2025-05-20', 4.50);
INSERT INTO bilhetes VALUES (6007, '2024-06-18', 5.20);
INSERT INTO bilhetes VALUES (6008, '2025-04-10', 6.00);
INSERT INTO bilhetes VALUES (6009, '2023-10-03', 4.90);
INSERT INTO bilhetes VALUES (6010, '2024-07-27', 5.40);
INSERT INTO bilhetes VALUES (6011, '2025-02-15', 4.70);
INSERT INTO bilhetes VALUES (6012, '2025-05-05', 5.30);
INSERT INTO bilhetes VALUES (6013, '2023-11-09', 6.10);
INSERT INTO bilhetes VALUES (6014, '2024-01-25', 4.60);
INSERT INTO bilhetes VALUES (6015, '2025-03-18', 5.50);

-- PASSAGENS
INSERT INTO passagens VALUES (201, 6001);
INSERT INTO passagens VALUES (202, 6002);
INSERT INTO passagens VALUES (203, 6003);
INSERT INTO passagens VALUES (204, 6004);
INSERT INTO passagens VALUES (205, 6005);
INSERT INTO passagens VALUES (206, 6006);
INSERT INTO passagens VALUES (207, 6007);
INSERT INTO passagens VALUES (208, 6008);
INSERT INTO passagens VALUES (209, 6009);
INSERT INTO passagens VALUES (210, 6010);
INSERT INTO passagens VALUES (211, 6011);
INSERT INTO passagens VALUES (212, 6012);
INSERT INTO passagens VALUES (213, 6013);
INSERT INTO passagens VALUES (214, 6014);
INSERT INTO passagens VALUES (215, 6015);
INSERT INTO passagens VALUES (211, 6002);
INSERT INTO passagens VALUES (211, 6005);
INSERT INTO passagens VALUES (212, 6004);
INSERT INTO passagens VALUES (212, 6009);


-- VIAGENS
INSERT INTO viagens VALUES (801, '06:00:00', '07:20:00', 40);
INSERT INTO viagens VALUES (802, '07:30:00', '08:40:00', 230);
INSERT INTO viagens VALUES (803, '09:00:00', '10:10:00', 310);
INSERT INTO viagens VALUES (804, '10:30:00', '11:50:00', 38);
INSERT INTO viagens VALUES (805, '12:10:00', '13:30:00', 45);

-- LOCOMOÇÕES
-- Passageiro 206 (Lucas Mendes): 3 viagens, 2 no mesmo dia, 1 em dia diferente
INSERT INTO locomocoes VALUES (206, 801, '2025-05-20');
INSERT INTO locomocoes VALUES (206, 802, '2025-05-20');
INSERT INTO locomocoes VALUES (206, 803, '2025-05-21');

-- Passageiro 207 (Ana Clara Silva): 2 viagens em dias diferentes
INSERT INTO locomocoes VALUES (207, 802, '2025-05-20');
INSERT INTO locomocoes VALUES (207, 803, '2025-05-21');

-- Passageiro 208 (João Pedro Farias): 1 viagem
INSERT INTO locomocoes VALUES (208, 804, '2025-05-22');

-- Passageiro 209 (Camila Ribeiro): 3 viagens, todas no mesmo dia
INSERT INTO locomocoes VALUES (209, 801, '2025-05-20');
INSERT INTO locomocoes VALUES (209, 802, '2025-05-20');
INSERT INTO locomocoes VALUES (209, 803, '2025-05-20');

-- Passageiro 210 (Bruno Oliveira): 2 viagens em dias diferentes
INSERT INTO locomocoes VALUES (210, 804, '2025-05-21');
INSERT INTO locomocoes VALUES (210, 805, '2025-05-22');

-- Passageiro 211 (Patrícia Santos): 1 viagem
INSERT INTO locomocoes VALUES (211, 805, '2025-05-22');

-- Passageiro 212 (Felipe Costa): 3 viagens, 1 no dia 20, 2 no dia 21
INSERT INTO locomocoes VALUES (212, 801, '2025-05-20');
INSERT INTO locomocoes VALUES (212, 802, '2025-05-21');
INSERT INTO locomocoes VALUES (212, 803, '2025-05-21');

-- Passageiro 213 (Larissa Almeida): 1 viagem
INSERT INTO locomocoes VALUES (213, 804, '2025-05-20');

-- Passageiro 214 (Thiago Souza): 2 viagens no mesmo dia
INSERT INTO locomocoes VALUES (214, 805, '2025-05-21');
INSERT INTO locomocoes VALUES (214, 801, '2025-05-21');

-- Passageiro 215 (Renata Lima): 1 viagem
INSERT INTO locomocoes VALUES (215, 802, '2025-05-22');


-- PARADAS
INSERT INTO paradas VALUES (3001, 'Parada Av. Paulista', 'Av. Paulista', '1578', 'Bela Vista', 'São Paulo');
INSERT INTO paradas VALUES (3002, 'Parada Sé', 'Praça da Sé', 'sn', 'Centro', 'São Paulo');
INSERT INTO paradas VALUES (3003, 'Parada Santana', 'Rua Voluntários da Pátria', '344', 'Santana', 'São Paulo');
INSERT INTO paradas VALUES (3004, 'Parada Pinheiros', 'Rua Teodoro Sampaio', '745', 'Pinheiros', 'São Paulo');
INSERT INTO paradas VALUES (3005, 'Parada Tatuapé', 'Rua Antonio de Barros', '1056', 'Tatuapé', 'São Paulo');

-- PONTOS DE PARADA
INSERT INTO pontos_de_parada VALUES (801, 3001);
INSERT INTO pontos_de_parada VALUES (801, 3004);
INSERT INTO pontos_de_parada VALUES (802, 3002);
INSERT INTO pontos_de_parada VALUES (802, 3003);
INSERT INTO pontos_de_parada VALUES (803, 3004);
INSERT INTO pontos_de_parada VALUES (803, 3005);
INSERT INTO pontos_de_parada VALUES (804, 3002);
INSERT INTO pontos_de_parada VALUES (804, 3005);
INSERT INTO pontos_de_parada VALUES (805, 3001);
INSERT INTO pontos_de_parada VALUES (805, 3003);
