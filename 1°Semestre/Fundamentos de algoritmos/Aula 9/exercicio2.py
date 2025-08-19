# Exercício 2. Uma empresa de pesquisas precisa tabular os resultados da
# seguinte enquete feita a um grande quantidade de organizações:
# "Qual o melhor Sistema Operacional para uso em servidores?"
# As possíveis respostas são:
# 1- Windows Server
# 2- Unix
# 3- Linux
# 4- Netware
# 5- Mac OS
# 6- Outro

# Você foi contratado para desenvolver um programa que leia o
# resultado da enquete e informe ao final o resultado da mesma.
# O programa deverá ler os valores até ser informado o valor 0,
# que encerra a entrada dos dados. Não deverão ser aceitos
# valores além dos válidos para o programa (0 a 6). Os valores
# referentes a cada uma das opções devem ser armazenados num
# vetor. Após os dados terem sido completamente informados, o
# programa deverá calcular a percentual de cada um dos
# concorrentes e informar o vencedor da enquete. O formato da
# saída foi dado pela empresa, e é o seguinte:

# O Sistema Operacional mais votado foi o Unix, com 3500 votos,
# correspondendo a 40% dos votos.

votos = [0,0,0,0,0,0]

print("1- Windows Server")
print("2- Unix")
print("3- Linux")
print("4- Netware")
print("5- Mac OS")
print("6- Outro")

while True:
    n = int(input("Digite o número para votar: "))
    if n == 0:
        break
    elif n < 0 or n > 6:
        print("Número inválido, digite outro número.")
    elif n == 1: #windows server
        votos[0] += 1
    elif n == 2: #unix
        votos[1] += 1
    elif n == 3: #Linux
        votos[2] += 1
    elif n == 4: #Netware
        votos[3] += 1
    elif n == 5: #Mac Os
        votos[4] += 1
    elif n == 6: #Outro
        votos [5] += 1

total_votos = sum(votos)
print(f"{'Sistema operacional ':25}{'Votos':<9}{'%':>7}")
print("--------------------------------------------------------")
print(f"{'Windows Server: ':25}{votos[0]:<9} {(votos[0]/total_votos) * 100:6.1f}")
print(f"{'Unix: ':25}{votos[1]:<9} {(votos[1]/total_votos) * 100:6.1f}")
print(f"{'Linux: ':25}{votos[2]:<9} {(votos[2]/total_votos) * 100:6.1f}")
print(f"{'Netware: ':25}{votos[3]:<9} {(votos[3]/total_votos) * 100:6.1f}")
print(f"{'Mac OS: ':25}{votos[4]:<9} {(votos[4]/total_votos) * 100:6.1f}")
print(f"{'Outro: ':25}{votos[5]:<9} {(votos[5]/total_votos) * 100:6.1f}")
print("--------------------------------------------------------")
print(f"Total de votos {total_votos}")

