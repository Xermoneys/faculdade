# Exercício 04
# Escreva uma função com parâmetros chamada multiplo(x, y).
# ▶ Esta função deve receber dois números
# ▶ Retornar True se o primeiro for múltiplo do segundo número;
# ▶ Retornar False caso contrário.

def multiplo (x,y):
    if x % y == 0:
        return True
    else:
        return False

print (multiplo(10,5))
print (multiplo(11,5))
print (multiplo(20,6))
print (multiplo(21,7))