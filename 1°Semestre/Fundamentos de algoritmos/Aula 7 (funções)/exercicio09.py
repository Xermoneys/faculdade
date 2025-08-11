# Exercício 09
# Use a função criada no exercício anterior
# Exiba todas as datas mágicas do século XX.
# Ou seja, do ano 1901 à 2000

def data_magica(dia,mes ,ano):
    if dia * mes == ano % 100:
        return True
    else:
        return False
print("Datas mágicas do século XX:")
def anos_magicos (ano_inicio,ano_fim):
    for ano in range(1901,2001):
        for dia in range(1,13):
            for mes in range(1,32):
                if data_magica(dia,mes,ano) == True:
                    print(f"Data mágica: {dia}/{mes}/{ano}")
anos_magicos(1901,2000)