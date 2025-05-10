# Cadastrar novo usuário
# Login de usuário
# Buscar músicas por nome
# Listar informações de músicas buscadas
# Curtir e descurtir músicas
# Gerenciar playlists*
# Visualizar histórico**

#Gerenciar playlist:
#• Criar, editar, excluir playlists
#• Adicionar/remover músicas de playlists
#Visualizar Histórico:
#• Visualizar lista de músicas curtidas
#• Visualizar lista de músicas descurtidas

#'r': leitura (padrão).
#'w': escrita (sobrescreve o arquivo se já existir).
#'a': anexar (acrescenta ao final do arquivo se já existir).
#'r+': leitura e escrita.

#Para não acontecer o vazamento de senha é recomendavel dar a mensagem que a senha está incorreta invés de falar que o email não existe.

#Menu principal do projeto
menu = {
    1 : "Cadastrar novo usuário ",
    2 : "Login de usuário", 
    3 : "Atualizar contato ",
    4 : "Apagar contato",
    0 : "Sair"
}
#código principal do projeto ccom o hub e o loop de repetição com o menu
def main():
    while True:
        opcao = exibir_menu()
        if opcao == 1:
            cadastrar_usuario()
        elif opcao == 2:
            login_usuario()
        elif opcao == 3:
            atualiza_contato()
        elif opcao == 4:
            apaga_contato()
        elif opcao == 0:
            sair()
        else:
            print("Comando inválido.Tente novamente.")

#função para exibir o menu 
def exibir_menu():
    print("Menu: ")
    for key,value in menu.items():
        print(f"{key} - {value}")
    opcao = int(input("Digite uma opção: "))
    return opcao

#função para novos usuarios

def cadastrar_usuario():
    nome = input("Digite o nome de usuário: ")
    senha = input("Digite sua senha: ")
    senha_novamente = input("Confirme sua senha: ")

    if senha == senha_novamente:
        with open("usuarios.txt", "a") as arquivo: #a significa anexar
            arquivo.write(f"{nome},{senha}\n")
            print("Cadastro feito com sucesso.")
    else:
        print("As senhas não coincidem. Por favor, digite novamente.")
#função para logar os usuários depois do cadastramento
def login_usuario():
    print("Logando o usuário: ")
    nome_login = input ("Digite o nome de usuário: ")
    senha_login = input("Digite a senha: ")

    with open("usuarios.txt", "r") as arquivo: #puxar o arquivo no modo de leitura
        conteudo = arquivo.readlines() #ler as linhas individualmente do arquivo
    for linha in conteudo:
        nome , senha = linha.strip().split(",") #dividir o arquivo de texto por mensagem que estejam separadas por virgula ou espaço
        if nome_login.lower() == nome.lower() and senha_login.lower() == senha.lower(): #garante que tanto o nome quanto a senha sejam iguais aos cadastrados
                print("Logado com sucesso.")
                print(f"Seja bem-vindo {nome}.")
                break
    else:
        print("Erro no cadastro. Verifique os dados informados e tente novamente.") #não expoe os dados do usuário como se o nome ou senha já foram cadastrados

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

def sair():
    print("Saindo do programa...")
    exit()

if __name__ == "__main__":
    main()