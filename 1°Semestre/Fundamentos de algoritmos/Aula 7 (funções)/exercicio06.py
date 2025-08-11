# Exercício 06
# Faça um programa que:
# ▶ Leia três números e apresente o resultado do seguinte cálculo:
# √n1 +√n2 +√n3 + (n1 +n2)/2+ (n2 +n3)/2 + (n1 +n3)/2
# Import a função sqrt do módulo math se necessário.

def soma_raiz(n1,n2,n3):
    from math import sqrt
    return sqrt(n1) + sqrt(n2) + sqrt(n3) + (n1 + n2)/2 + (n2 + n3)/2 + (n1 + n3)/2

print(soma_raiz(10,20,30))
print(soma_raiz(30,40,50))
print(soma_raiz(15,25,35))