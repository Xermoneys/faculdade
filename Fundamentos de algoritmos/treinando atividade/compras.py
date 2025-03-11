codigo = int(input("Digite o código do produto:"))
quantidade = int(input("Digite a quantidade do produto:"))

if codigo == 1:
    valor_total = quantidade * 6.00
    item = "Cachorro Quente"
elif codigo == 2:
    valor_total = quantidade * 6.50
    item = "X-Salada"
elif codigo == 3:
    valor_total = quantidade * 5.00
    item = "X-Bacon"
elif codigo == 4:
    valor_total = quantidade * 3.00
    item = "Torrada"
elif codigo == 5:
    valor_total = quantidade * 2.00
    item = "Refrigerante"
else:
    print("Código inválido. Por favor, digite um código entre 1 e 5.")

print(f"Total: R$ {valor_total:.2f}")