# Exercício 4
# Faça um programa que permita imprimir uma represetação de tabela quadrada com $ e @. 
# Nesta tabela o triangulo inferior esquerdo deve ser preenchido com $ e o triângulo superior direito deve ser preenchido com @.

tamanho = int(input("Digite o tamanho do quadrado de xadrez: "))

for linhas in range(tamanho):
    for coluna in range(tamanho):
        if linhas == coluna or linhas < coluna:
            print(" @ " ,end=" ")
        else: 
            print(" $ " ,end=" ") 
    print()