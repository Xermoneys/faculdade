# Exercício 02
#  Faça um programa que cria uma matriz M 10 X 15, sendo que cada
#  elemento é um inteiro gerado aleatoriamente.
#  Então, exiba a matriz completa e, na sequência, somente os
#  elementos da primeira coluna da matriz.

from random import randint

#criação da matriz 
matriz = []
for num_linha in range(10):
    linha = []
    for num_coluna in range(15):
        linha.append(randint(0,100))
    matriz.append(linha)

#iimpressão da matriz
print("\nMatriz completa")
for linha in range (10):
    for coluna in range(15):
        print(f"{matriz[linha][coluna]}", end=" ")
    print()

#impressão da primeira linha
print("\nSelecionando os elementos da primeira linha: ")
for linha in range(15):
    print(f"{matriz[0][linha]}", end=" ") #seleção de coisas específicas da matriz matriz[linha][coluna]
print()

#impressão da primeira coluna
print("\nImprimindo a primeira coluna: ")
for coluna in range(10):
    print(f"{matriz[coluna][0]}", end=" ")
print()