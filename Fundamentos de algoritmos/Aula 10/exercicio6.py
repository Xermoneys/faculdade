# Exercício 06
# Cria uma matriz m[12][12] com números inteiros aleatórios.
# Em seguida, calcule e mostre a soma ou a média considerando
# somente aqueles elementos que estão abaixo da diagonal
# principal da matriz, conforme ilustrado abaixo (área verde).
# A entrada do programa deve ser um único caractere maiúsculo
# ’S’ ou ’M’, indicando a operação (Soma ou Média) que deverá
# ser realizada com os elementos da matriz.

from random import randint

M = []
soma = 0
contador = 0

for num_linha in range(12):
    linha = []
    for num_coluna in range(12):
        linha.append(randint(0,100))
        if num_linha > num_coluna:
            soma = soma + M[num_coluna][num_linha]
            contador = contador + 1
print("\nMatriz:")
for linha in M:
    for elemento in linha:
        print(f'{elemento:2d}', end=' ')
    print() # pula para a próxima linha

operacao = input("Digite 'S' para soma ou 'M' para média: ")
if operacao == 'S':
    print(f"Soma dos elementos abaixo da diagonal principal: {soma}")
elif operacao == 'M':
    if contador > 0:
        media = soma / contador
else:
    media = 0

print(f"A média dos elementos vai ser: {media:.2f}")
