#Menu principal do projeto 
print("'-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*'")
print("Bem vindo ao projeto Spotifei!")
print("Aperte um número para escolher uma opção:")
print("1 - Cadastrar novo usuário")
print("2 - Login do usuário")
print("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*")
#cadastramento de usuário
while True:
    opcao = int(input("Digite a opção desejada: "))
    if opcao == 1:
        print("--------------------------------")
        print("Cadastrando novo usuário")
        print("--------------------------------")
        nome = input("Digite seu nome: ")
        senha = input("Digite sua senha: ")
        print(f"Usuário {nome} cadastrado com sucesso!")
    elif opcao == 2:
        print("Login do usuário")
        email = input("Digite seu email: ")
        senha = input("Digite sua senha: ")
        print(f"Usuário {email} logado com sucesso!")
    else:
        print("Opção inválida, tente novamente.")
    