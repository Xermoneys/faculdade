# Exercício 02
#  Faça um programa que cria uma matriz M 10 X 15, sendo que cada
#  elemento é um inteiro gerado aleatoriamente.
#  Então, exiba a matriz completa e, na sequência, somente os
#  elementos da primeira coluna da matriz.


def imprimir_coluna(matriz, coluna):
    for linha in range(len(M)):
        print(f"{matriz[linha][coluna]:3}", end=" ")
    print()
def imprimir_primeira_coluna(matriz):
    print("Elementos da primeira coluna:")
    for linha in range(len(M)):
        print(f"{matriz[linha][0]:3}", end=" ")
    print()

from random import randint
M = [[randint(0, 100) for _ in range(15)] for _ in range(10)]
