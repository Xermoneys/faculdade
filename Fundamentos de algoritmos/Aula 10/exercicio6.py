# Exercício 06
# Cria uma matriz m[12][12] com números inteiros aleatórios.
# Em seguida, calcule e mostre a soma ou a média considerando
# somente aqueles elementos que estão abaixo da diagonal
# principal da matriz, conforme ilustrado abaixo (área verde).
# A entrada do programa deve ser um único caractere maiúsculo
# ’S’ ou ’M’, indicando a operação (Soma ou Média) que deverá
# ser realizada com os elementos da matriz.

from random import randint

matriz = []
soma = 0 
contador = 0
#geração da matriz
for num_linha in range(12):
    linha = []
    for num_coluna in range(12):
        linha.append(randint(0,100))
        if num_linha > num_coluna:
            soma = soma + matriz[num_coluna][num_linha]
            contador += 1
    matriz.append(linha)
#print da matriz
print("\n Matriz")
for linha in matriz:
    for elemento in linha:
        print(f"{elemento:3}",end=" ")
    print()

#perguntar se quer a soma ou a média
opcao = input("Digite 'S' para a soma ou 'M' para a média.")
if opcao == "S":
    print(f"A soma será {soma}.")
elif opcao == "M":
    media = soma / contador
    print(f"A média será {media:.2f}")
else:
    print("Opção inválida.Tente novamente")


