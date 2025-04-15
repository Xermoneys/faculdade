# Exercício 1. Faça um programa que leia uma quantidade indeterminada de
# números positivos e conte quantos deles estão nos seguintes
# intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada
# de dados deverá terminar quando for lido um número negativo

intervalos = [0,0,0,0]

while True:
    number = int(input("Digite um número positivo: "))
    if number < 0:
        break
    elif number <= 25:
        intervalos[0] += 1
    elif number <= 50:
        intervalos [1] += 1
    elif number <= 75:
        intervalos[2] += 1
    elif number <= 100:
        intervalos[3] += 1

print(f"Os número digitados entre [0-25] serão: {intervalos[0]}")
print(f"Os número digitados entre [26-50]serão: {intervalos[1]}")
print(f"Os número digitados entre [51-75]serão: {intervalos[2]}")
print(f"Os número digitados entre [76-100] serão: {intervalos[3]}")