# Exercício 5
# Faça um programa que permita imprimir uma representação da tabela quadrada seguindo o padrão. 

tamanho = int(input("Digite o tamanho do quadrado de xadrez: "))

for linhas in range(tamanho):
    for coluna in range(tamanho):
        if linhas % 2 == 0 and coluna % 2 == 0:
            print(" X " ,end=" ")
        elif linhas % 2 == 1 and coluna % 2 == 0 : 
            print(" $ " ,end=" ") 
        elif linhas % 2 == 0 and coluna % 2 == 1:
            print ("%", end=" ")
        elif linhas % 2 == 1 and coluna % 2 == 1:
            print ("#", end=" ")
    print()