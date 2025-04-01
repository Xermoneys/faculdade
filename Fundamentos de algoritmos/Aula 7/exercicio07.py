# Existem restrições para que uma pessoa possa doar sangue. Uma
# delas é relativa ao peso. Mulheres tem que pesar no mínimo
# 50kg e homens no mínimo 60kg. Faça uma função para informar
# se uma pessoa está ou não apta a doar sangue sabendo seu sexo
# e seu peso.
# O programa principal deve ler as entradas, acionar a função e
# exibir a resposta.

def doar_sangue (sexo, peso):
    if sexo == "M" and peso >= 60:
         return True
    elif sexo == "F" and peso >= 50:
         return True
    elif sexo == "M" and peso < 60:
         return False
    elif sexo == "F" and peso < 50:
         return False
    
sexo = input("Digite o sexo da pessoa (M/F): ")
peso = float(input("Digite o peso da pessoa: "))

print(doar_sangue(sexo,peso))
