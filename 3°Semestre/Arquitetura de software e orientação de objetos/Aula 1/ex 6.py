numero = int(input("Digite um número inteiro para testar se é primo: "))

if numero <= 1:
    print("O número não é primo")
else:
    primo = True
    for i in range(2, numero):
        if numero % i == 0:
            primo = False
            break

    if primo:
        print(f"O número {numero} é primo")
    else:
        print(f"O número {numero} não é primo")
