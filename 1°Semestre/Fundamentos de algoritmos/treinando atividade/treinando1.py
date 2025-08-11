escolha = input("Você deseja calcular o volume do dodecaedro ou icosaedro: ")
a = float(input("Digite o valor da aresta a em metros: "))
volume_dodecaedro = (15 + 7 * (5** (1/2))) / 4 * (a ** 3)
volume_icosaedro = (5 * (3 + (5** (1/2)))) / 12 * (a ** 3)

if escolha == "dodecaedro":
    print(f"O volume de um dodecaedro regular com {a:.2f} de aresta é: {volume_dodecaedro:.2f}")
elif escolha == "icosaedro":
    print(f"O volume de um icosaedro regular com {a:.2f} de aresta é: {volume_icosaedro:.2f}")
else:
    print("Opção inválida. Por favor, digite 'dodecaedro' ou 'icosardro'. ")