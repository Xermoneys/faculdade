
# Exercício 03
#  Faça um programa para receber uma matriz 3 X 3 (solicitar ao
#  usuário)
#  Apresentar a soma dos elementos da diagonal principal
#  Exemplo de execução:

#solicita 9 numeros para o usuário
M = []
for i in range(9):
    numeros = int(input(f"Digite o {i + 1}º número: "))
    M.append(numeros)

#transformar os numeros em matriz
matriz = []
contador = 0
for i in range(3):
    linha = []
    for j in range(3):
        linha.append(M[contador])
        contador += 1
    matriz.append(linha)

#imprime a matriz
print("\nMatriz:")
for linha in matriz:
    for elemento in linha:
        print(f'{elemento}',end=" ")
    print()

#soma os números na diagonal
soma_diagonal = 0
for i in range(3):
    soma_diagonal += matriz[i][i]
print(f"\nA soma da diagonal é: {soma_diagonal} ")


