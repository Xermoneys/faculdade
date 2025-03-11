horainicial = int(input("Digite a hora inicial: "))

minutoinicial = int(input("Digite o minuto inicial: "))

horafinal = int(input("Digite a hora final: "))

minutofinal = int(input("Digite o minuto final: "))

tempoinicial = horainicial * 60 + minutoinicial
tempofinal = horafinal * 60 + minutofinal

if tempofinal > tempoinicial:
    duracao = tempofinal - tempoinicial
elif tempofinal == tempoinicial:
    duracao = 24 * 60
else:
    duracao = (24 * 60 - tempoinicial) + tempofinal

duraçãohoras = duracao // 60
duraçãominutos = duracao % 60

print(f"O jogo durou {duraçãohoras} hora(s) e {duraçãominutos} minutos(s)")