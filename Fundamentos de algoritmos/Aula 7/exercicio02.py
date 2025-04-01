# Exercício 2
# Adapte a função para calcular a média criada anteriormente.
#  ▶ Faça com que ela retorne o resultado da média para o chamador da
#  função.

def media (x:float,y:float):
    """
    Calcula a média de dois números 

    Args: 
        x (float)= Primeiro número 
        y (float)= Segundo número 

    Return:
        res (float)= Média dos dois números
    """
    res:float = (x+y)/2
    return res
print(f"A média de 10 e 20 é {media(10,20)}")
print(f"A média de 3.1 e 5.7 é {media(3.1,5.7)}")