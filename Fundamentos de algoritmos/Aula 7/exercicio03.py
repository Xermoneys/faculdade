# Exercício 03
# Escreva uma função com parâmetros que retorne o maior de dois
# números.
# ▶ A função deve se chamar maximo(x, y)

def maximo (x,y):
    if x > y :
        return x 
    else:
        return y

print(f"O maior número é {maximo(5, 20)}")