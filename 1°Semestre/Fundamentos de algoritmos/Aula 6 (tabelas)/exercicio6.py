# Exercício 6
# Crie um progama que leia um número natural positivo N e determine quantos dígitos possui o número.
# Entrada: O programa recebe um número inteiro, N, maior que zero. 
# Saída: O programa deve imprimir a quantidade de dígitos do número N.

numero = int(input("Digite um número natural positivo: "))
digitos = 0

while numero > 0:
    numero = numero // 10
    digitos = digitos + 1

print(f"O número tem {digitos} dígitos")
