# Exercício 05
#  Faça um programa que cria um matriz A 10 X 5 com números
#  inteiros aleatórios e, então, exiba a matriz transposta de
#  A(At)
#  Determinar a transposta de uma matriz é reescrevê-la de forma
#  que suas linhas e colunas troquem de posições ordenadamente,
#  isto é, a primeira linha é reescrita como a primeira coluna, a
#  segunda linha é reescrita como a segunda coluna e assim por
#  diante, até que se termine de reescrever todas as linhas na
#  forma de coluna.Exercício 05
#  Faça um programa que cria um matriz A 10 X 5 com números
#  inteiros aleatórios e, então, exiba a matriz transposta de
#  A(At)
#  Determinar a transposta de uma matriz é reescrevê-la de forma
#  que suas linhas e colunas troquem de posições ordenadamente,
#  isto é, a primeira linha é reescrita como a primeira coluna, a
#  segunda linha é reescrita como a segunda coluna e assim por
#  diante, até que se termine de reescrever todas as linhas na
#  forma de coluna.

from random import randint
#forma de fazer uma matriz de forma reduzida
matriz = [[randint(0,100) for _ in range(5)]for _ in range(10)]

#impressão da matriz
print("\n Matriz completa")

for linha in matriz:
    for elemento in linha:
        print(f"{elemento:5}",end=" ")
    print()

print("\n Matriz transposta:")
for linha in range(5):
    for coluna in range(10):
        print(f"{matriz[coluna][linha]:5}",end=" ")
    print()
