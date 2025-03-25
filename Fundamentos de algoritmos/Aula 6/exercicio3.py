# Exercício 3
# Faça um programa que permita imprimir uma representação de um tabuleiro de xadrez utilizando os caracteres "o" e "x".
# O canto superior esquerdo do tabuleiro deve ser preenchido com o caractere "o".

tamanho = int(input("Digite o tamanho do quadrado de xadrez: "))

for linhas in range(tamanho):
    for coluna in range(tamanho):
        if (linhas + coluna) % 2 == 0:
            print(" O " ,end=" ")
        else: 
            print(" * " ,end=" ") 
    print()