distancia = int(input("Digite a distância que deseja percorrer em km:"))
viagemcurta = distancia * 0.5
viagemlonga = distancia * 0.45
if distancia <= 200:
    print("Você terá que pagar: %.2f" %viagemcurta)
else:
    print ("Você terá que pagar: %.2f" %viagemlonga)