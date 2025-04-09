# Exercício 1
# Faça um programa que:
# - Leia 5 valores do usuário e armazene-os em uma lista
# - Imprima a lista completa
# - Imprima o primeiro e o último elemento da lista

L = []
for i in range(5):
    n  = int(input("Coloque um número: "))
    L.append(n)

print(L)
print(L[0])
print(L[4])