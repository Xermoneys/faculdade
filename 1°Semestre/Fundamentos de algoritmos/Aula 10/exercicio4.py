# Exercício 04
#  Solicitar dados de uma matriz 4 X 4
#  Montar uma lista de 4 elementos com a soma dos elementos
#  ímpares de cada linha da matriz

from random import randint
#pedir os numeros 
M = []
for i in range(16):
    numeros = int(input(f"Digite o {i + 1}º número: "))
    M.append(numeros)

matriz = []
contador = 0
for i in range(4):
    linha = []
    for j in range(4):
        linha.append(M[contador])
        contador += 1
    matriz.append(linha)

# Exibe a matriz
print("\nMatriz:")
for linha in matriz:
    for elemento in linha:
        print(f'{elemento}', end=' ')
    print() # pula para a próxima linha

soma_impares = 0
for linha in matriz:
    for num in linha:
        if num % 2 != 0:  # Verifica se o número é ímpar
            soma_impares += num
print(f"\nSoma dos elementos ímpares: {soma_impares} ")