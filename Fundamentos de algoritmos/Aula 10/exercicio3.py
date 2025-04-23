
# Exercício 03
#  Faça um programa para receber uma matriz 3 X 3 (solicitar ao
#  usuário)
#  Apresentar a soma dos elementos da diagonal principal
#  Exemplo de execução:

M = []
for i in range(9):
    num = int(input(f'Digite o {i+1}º número: '))
    M.append(num)
    
# Converte a lista em uma matriz 3x3
matriz = []
contador = 0
for _ in range(3):
    linha = []
    for _ in range(3):
        linha.append(M[contador])
        contador += 1
    matriz.append(linha)

# Exibe a matriz
print("\nMatriz:")
for linha in matriz:
    for elemento in linha:
        print(f'{elemento:2d}', end=' ')
    print() # pula para a próxima linha
    
# Calcula a soma da diagonal principal
soma_diagonal = 0
for _ in range(3):
    soma_diagonal += matriz[_][_] # soma os elementos da diagonal principal
print(f'\nSoma da diagonal: {soma_diagonal}')