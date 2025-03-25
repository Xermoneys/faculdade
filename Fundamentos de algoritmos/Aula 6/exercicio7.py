# Exercício 7
# Crie um porgama que permita verificar se um número pertence a sequência de Fibonacci.
# A sequência de Fibonacci é uma sequência de números inteiros, começando normalmente por 0 e 1, na qual, cada termo subsequente corresponde à soma dos dois anteriores.
# Entrada: O programa recebe um número inteiro, N, maior que zero.
# Saída: O programa deve imprimir "verdadeiro" se o número N pertence ou "Falso" caso não pertença à sequência de Fibonacci.

numero = int(input("Digite um número inteiro maior ou igual a zero: "))
a = 0 
b = 1
while b < numero:
    temporaria = a 
    a = b 
    b = temporaria + b

if numero == 0 or numero == 1:
    print("Verdadeiro")
elif b == numero:
    print("Verdadeiro")
else: 
    print("Falso")