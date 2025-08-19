# Exercício 13
# Escreva uma função chamada exponencial que recebe um valor n
# como parâmetro. Sua função deve encontrar e retornar b e k tal
# que b^k = n e b seja o menor possível.

def exponencial(n):
    b = 2
    k = 1
    while b**k < n:
        b = b + 1
        k = 1
        while b**k < n:
            k = k + 1
    return b, k
n = int(input("Digite um valor: "))
b , k = exponencial(n)
print(f"b: {b} e k: {k}")