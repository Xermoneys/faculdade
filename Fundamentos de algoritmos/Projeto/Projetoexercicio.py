
menu = {
    1 : "Novo contato ",
    2 : "Procurar um contato",
    3 : "Atualizar contato ",
    4 : "Apagar contato",
    0 : "Sair"
}

def main():
    while True:
        print("Menu: ")
        for key,value in menu.items():
            print(f"{key} - {value}")
        opcao = int(input("Digite uma opção: "))

        if opcao == 1:
            novo_contato()
        elif opcao == 2:
            procura_contato()
        elif opcao == 3:
            atualiza_contato()
        elif opcao == 4:
            apaga_contato()
        elif opcao == 0:
            print("Saindo do programa.")
            break
        else:
            print("Comando inválido.")

def novo_contato():
    nome = input("Digite o nome: ")
    sobrenome = input("Digite o sobrenome: ")
    telefone = input("Digite o telefone: ")
    email = input("Digite o email: ")

    with open("contatos.txt", "a") as arquivo:
        arquivo.write(f"{nome},{sobrenome},{telefone},{email}\n")

def procura_contato():
    nome_procurado = input ("Digite o nome a ser procurado: ")

    with open("contatos.txt", "r") as arquivo:
        linhas = arquivo.readlines()
        nao_encontrado = True
        for linha in linhas:
            nome , sobrenome , telefone , email = linha.strip().split(",")
            if nome_procurado.lower() in nome.lower():
                print(f"Nome: {nome}, Sobrenome: {sobrenome}, Telefone: {telefone}, Email: {email}.")
                break
        if nao_encontrado == True:
            print("Contato não encontrado.")

def atualiza_contato():
    nome_atualizar = input("Digite o nome do contato a ser atualizado: ")
    with open("contatos.txt", "r+") as arquivo:
        linhas = arquivo.readlines()
        for i, linha in enumerate(linhas): #i , linhas = range(len(linhas)), linhas
            nome , sobrenome , telefone , email = linha.strip().split(",")
            if nome_atualizar.lower() in nome.lower():
                print(f"Nome: {nome}, Sobrenome: {sobrenome}, Telefone: {telefone}, Email: {email}.")
                novo_nome = input("Digite o novo nome: ")
                novo_sobrenome = input("Digite o novo sobrenome: ")
                novo_telefone = input("Digite o novo telefone: ")
                novo_email = input("Digite o novo email: ")

                linhas[i] = f"{novo_nome}, {novo_sobrenome}, {novo_telefone}, {novo_email}\n"
                break
        else:
            print("Contato não encontrado")

        arquivo.seek(0)
        arquivo.writelines(linhas)

def apaga_contato():

    nome_apagar = input("Digite o nome do contato que deseja apagar: ")

    with open("contatos.txt", "r+") as arquivo:
        linhas = arquivo.readlines()
        for i, linha in enumerate(linhas): #i , linhas = range(len(linhas)), linhas
            nome , sobrenome , telefone , email = linha.strip().split(",")
            if nome_apagar.lower() in nome.lower():
                print(f"Nome: {nome}, Sobrenome: {sobrenome}, Telefone: {telefone}, Email: {email}.")
                del linhas[i]
                break
        else:
            print("Contato não encontrado")


        arquivo.seek(0)
        arquivo.writelines(linhas)
        arquivo.truncate()

if __name__ == "__main__":
    main()