senha = input("Digite a senha: ")
if senha == "1234":
    print("Acesso permitido.")
    opcao = input("Deseja acessar a área administrativa? (S para sim, N para não): ")
    if opcao == "S":
        print("Entrando na área administrativa...")
    else:
        print("Você está na área de usuário comum.")
else:
    print("Senha incorreta! Acesso negado.")