# Exercício 04
#  Solicitar dados de uma matriz 4 X 4
#  Montar uma lista de 4 elementos com a soma dos elementos
#  ímpares de cada linha da matriz

from random import randint

M = []
for num_linha in range(4):
    linha = []
    for num_coluna in range(4):
        linha.append(randint(0,16))
    M.append(linha)

# Exibe a matriz
print("\nMatriz:")
for linha in M:
    for elemento in linha:
        print(f'{elemento}', end=' ')
    print() # pula para a próxima linha


soma_impares = []
for i in range(4):
    soma = 0
    for j in range(4):
        if elemento [i][j] % 2 != 0:
            soma += elemento[i][j]
    soma_impares.append(soma)
print(f"\nSoma dos elementos ímpares: {soma_impares} ")