-Enunciado para a resolução do problema
Mostrar o nome dos passageiros, quantidade total de viagens que fizeram, o valor médio dos bilhetes que compraram e o número total de viagens que ocorreram em uma dia específica (exemplo: '2025-05-20'), filtrando somente passageiros que fizeram pelo menos 2 viagens nesse dia.

-Relevância
Essa cconsulta é útil para entender padrões de mobilidade, horários de pico e comportamento de usuários frequentes.


SELECT
    p.nome,
    COUNT(DISTINCT l.viagens_id) AS total_viagens,
    ROUND(AVG(b.valor), 2) AS valor_medio_bilhetes,
    (SELECT COUNT(*) 
     FROM viagens v
     JOIN locomocoes lc ON v.id_viagens = lc.viagens_id
     WHERE lc.data_de_uso = '2025-05-20') AS total_viagens_no_dia
FROM passageiros p
JOIN passagens ps ON p.id_passageiros = ps.passageiros_id
JOIN bilhetes b ON ps.bilhetes_id = b.id_bilhetes
JOIN locomocoes l ON p.id_passageiros = l.passageiros_id
JOIN viagens v ON l.viagens_id = v.id_viagens
WHERE l.data_de_uso = '2025-05-20'
GROUP BY p.id_passageiros, p.nome
HAVING COUNT(DISTINCT l.viagens_id) >= 2
ORDER BY total_viagens DESC;
