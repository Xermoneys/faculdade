-Enunciado para a resolução do problema
A empresa deseja saber quantos passageiros utilizaram cada viagem, além de informações da rota associada a essa viagem, para avaliar a demanda de cada trajeto e otimizar o planejamento dos transportes.

-Relevância da consulta
Esse tipo de análise é fundamental para entender quais viagens têm maior ou menor demanda. A partir desses dados, a empresa pode tomar decisões sobre aumento de frota, ajuste de horários, reforço nas linhas mais cheias ou redução em rotas pouco utilizadas.

SELECT
    v.id_viagens,
    COUNT(DISTINCT l.passageiros_id) AS total_passageiros,
    SUM(b.valor) AS soma_valor_bilhetes
FROM viagens v

JOIN locomocoes l ON v.id_viagens = l.viagens_id

JOIN passagens p ON l.passageiros_id = p.passageiros_id

JOIN bilhetes b ON p.bilhetes_id = b.id_bilhetes

GROUP BY v.id_viagens

ORDER BY v.id_viagens;


