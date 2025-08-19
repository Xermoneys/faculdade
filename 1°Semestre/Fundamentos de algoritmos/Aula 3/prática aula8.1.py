a = int(input("Digite o valor do primeiro produto: "))
b = int(input("Digite o valor do segundo produto: ")) 
c = int(input("Digite o valor do terceiro produto: "))
Total = a + b + c
if Total > 500:
    desconto = Total * 0.2
    print(f"Desconto: {desconto:.2f}")
else:
    desconto = Total * 0.1
    print(f"Desconto: {desconto: .2f}")