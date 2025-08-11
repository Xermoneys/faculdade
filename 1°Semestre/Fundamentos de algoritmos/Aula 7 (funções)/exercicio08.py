# Exercício 08
# Uma data é considerada mágica quando o dia multiplicado pelo
# mês é igual ao ano de dois dígitos.
# Por exemplo, 10 de junho de 1960 é uma data mágica porque
# junho é o sexto mês e 6 vezes 10 é 60, o que equivale ao ano
# de dois dígitos.
# Escreva uma função que determine se uma data é ou não uma data
# mágica.

def data_magica(dia,mes ,ano):
    if dia * mes == ano % 100:
        return True
    else:
        return False
 
dia = int(input("Digite o dia: "))
mes = int(input("Digite o mês: "))
ano = int(input("Digite o ano: "))

if data_magica(dia,mes,ano) == True:
    print(f"Data mágica: {dia}/{mes}/{ano}") 
        