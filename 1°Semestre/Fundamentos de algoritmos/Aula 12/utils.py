# Exercício 03
# Crie um arquivo: “numeros.txt” que contenha 100 números
# aleatórios;
# Escreva uma função que leia uma sequência numérica do arquivo
# “numeros.txt” e salva os números na lista num.
# Escreva outra função que recebe a lista num como parâmetro e
# retorna uma nova lista num_unicos, sem os elementos repetidos.
# Escreva uma terceira função que recebe a lista num_unicos e
# grava os números no arquivo “numeros_unicos.txt”.

from random import randint

def main():          
        criar_numeros("numeros.txt")    
        numeros = ler_numeros("numeros.txt")
        num_unicos = numeros_unicos(numeros)
        salvar_numeros_unicos("numeros_unicos.txt", num_unicos)

def criar_numeros(arquivo):
    with open("numeros.txt", "w") as arquivo:
        for i in range(100):
            arquivo.write(f"{randint(1,100)} ")

def ler_numeros(arquivo):
    with open(arquivo,"r") as arquivo:
        numeros = arquivo.read().strip().split()

    for i in range(len(numeros)):
        numeros[i] = int(numeros[i])
    return sorted(numeros)

def numeros_unicos(numeros):
    numeros_unicos = []
    for numero in numeros:
        if numero not in numeros_unicos:
            numeros_unicos.append(numero)
    return numeros_unicos

def salvar_numeros_unicos(arquivo,numeros_unicos):
    with open(arquivo,"w") as arquivo:
        for numero in numeros_unicos:
            arquivo.write(f"{numero}\n")

main()