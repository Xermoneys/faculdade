-Enunciado para o problema
A empresa de transporte deseja obter uma lista de todos os veículos cadastrados, seus respectivos motoristas e os tipos de veículos, para verificar quais motoristas estão conduzindo ônibus, metrôs ou trens. A listagem deve estar organizada em ordem alfabética pelo nome do motorista.

-Relevância da consulta
Essa consulta permite à administração ter uma visão clara da frota de veículos e de qual motorista está associado a cada veículo. Isso é importante para gestão operacional, organização de escalas, planejamento de manutenções e controle de alocação dos motoristas.

SELECT 
    m.nome AS nome_motorista,
    v.id_veiculos,
    v.tipo,
    v.placa,
    v.capacidade
FROM 
    veiculos v
INNER JOIN 
    motoristas m ON v.motoristas_id = m.id_motoristas
WHERE 
    v.tipo IN ('ônibus', 'trem', 'metrô')
ORDER BY 
    m.nome;
