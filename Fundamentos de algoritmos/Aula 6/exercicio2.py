# Exercício 2
# Faça um porgrama que permita imprimir apenas as bordas de um retângulo. 
# O programa deve receber dois números inteiros L > 0 e C > 0, que representam a quantidade de linhas e colunas do retângulo, respectivamente.

L = int(input("Digite a quantidade de linhas para o retângulo: "))
C = int(input("Digite a quantidade de colunas para o retângulo: "))

for linha in range (L):
    for coluna in range(C):
        if linha == 0 or linha == L - 1 or coluna == 0 or coluna == C - 1:
            print("x", end=" ")
        else:
            print(" ", end=" ")
    print()