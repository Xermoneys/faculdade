# Exercício 03
#  Faça um programa para receber uma matriz 3 X 3 (solicitar ao
#  usuário)
#  Apresentar a soma dos elementos da diagonal principal
#  Exemplo de execução:


M = []
for i in range(16):
    num = int(input(f"Digite o {i+1}º número: "))
    M.append(num)

#transformando a matriz   
matriz = []
contador = 0
for i in range(4):
    linha = []
    for j in range(4):
        linha.append(M[contador])
        contador += 1
    matriz.append(linha)

# imprimindo a matriz
print("\nMatriz: ")
for linha in matriz:
    for elemento in linha:
        print(f"{elemento}", end=" ")
    print()


soma_diagonal = 0
for i in range(4):
    soma_diagonal += matriz[i][i]
print(f"A soma das diagonais será: {soma_diagonal}")