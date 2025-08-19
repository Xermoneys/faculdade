ano = int (input("Digite o ano atual:"))
nascimento = int (input("Digite seu ano de nascimento: "))
idade = ano - nascimento
if idade >= 18:
    print("Você já pode tirar sua CNH.")
if idade <= 18:
    print("Você ainda não tem idade pra tirar sua CNH.")
