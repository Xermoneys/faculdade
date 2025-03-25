# Exercício 1
# Faça um programa que receba uma série de n;umeros naturaus e contabilize quantos desses números são primos. 
# Um número primo x é primo se x > 1 e seus únicos divisores são 1 e x.

numero = int(input("Digite a quantidade de números a serem testados: "))
primos = 0
for i in range(numero):
    n = int(input(f"Digite o número {i + 1}: "))
    if n >1: 
        eh_primo = True
        for j in range(2, n):
            if n % j == 0:
                eh_primo = False
        
        if eh_primo == True:
            print("É primo.")
            primos = primos + 1
        else:
            print("Não é primo.")
print(f"Você digitou {primos} numero(s) primo(s) de {n} números!")