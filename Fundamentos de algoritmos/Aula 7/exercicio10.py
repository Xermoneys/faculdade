# Exercício 10
# Refaça os exercícios 3, 4, e 5 utilizando função lambda

#ex 3
def maximo (x,y):
    if x > y :
        return x 
    else:
        return y
maximo = lambda x: x if x > y else y

#ex4
def multiplo (x,y):
    if x % y == 0:
        return True
    else:
        return False

multiplo = lambda x,y: True if x % y == 0 else False

#ex5
def area_trinagulo(base,altura):
    return (base*altura)/2

area_trinagulo = lambda base,altura: (base*altura)/2