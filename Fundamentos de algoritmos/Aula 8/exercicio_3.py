# Exercício 3
# Faça um programa que:
# ▶ Peça 10 números reais do usuário.
# ▶ Armazene-os em uma lista e diga qual o índice do maior e seu valor

lista = []
for i in range(10):
    n = float(input("Coloque um número: "))
    lista.append(n)
print(lista)
print(f"O maior número é:", max(lista), "e seu indice é:", lista.index(max(lista)))