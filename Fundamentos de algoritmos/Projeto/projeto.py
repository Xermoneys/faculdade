# Cadastrar novo usuário - Feito
# Login de usuário - Feito
# Buscar músicas por nome - Feito
# Listar informações de músicas buscadas- Feito
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
    0 : "Sair\n"
}
menu_login = {
    1 : "Buscar músicas",
    2 : "Listar informações de músicas buscadas",
    3 : "Curtir músicas e Descurtir músicas",
    4 : "Gerenciar playlist",
    5 : "Visualizar histórico",
    0 : "Sair do menu de usuário. \n"
}
menu_buscar_musicas = {
    1 : "Buscar por música",
    2 : "Buscar por artista",
    0 : "Voltar ao menu do usuário \n"
}
menu_curtir_descutir = {
    1 : "Curtir músicas",
    2 : "Descurtir músicas",
    0 : "Voltar ao menu do usuário \n"
}
menu_playlist = {
    1: "Criar playlist",
    2: "Editar playlist",
    3: "Excluir playlist",
    0: "Voltar ao menu do usuário \n"
}
menu_historico = {
    1: "Visualizar lista de músicas curtidas",
    2: "Visualizar lista de músicas descurtidas",
    0: "Voltar ao menu do usuário \n"
}
#código principal do projeto com o hub e o loop de repetição com o menu
def main():
    while True:
        opcao = exibir_menu()
        if opcao == 0:
            sair()
        elif opcao == 1:
            cadastrar_usuario()
        elif opcao == 2:
            if login_usuario():
                while True:
                    opcao_logado = exibir_menu_login()
                    if opcao_logado == 1:
                        procurar()
                    elif opcao_logado == 2:
                        musicas_buscadas()
                    elif opcao_logado == 3:
                        gerenciar_musicas()
                    elif opcao_logado == 4:
                        playlist()
                    elif opcao_logado == 5:
                        historico()  
                    elif opcao_logado == 0:
                        break
                    else:
                        print("Comando inválido. Tente novamente.")
        else:
            print("Comando inválido. Tente novamente.")

#função para exibir o menu 
def exibir_menu():
    print("\nMenu: \n")
    for key,value in menu.items():
        print(f"{key} - {value}")
    opcao = int(input("Digite uma opção: "))
    return opcao

#exibir menu depois de logar o usuario
def exibir_menu_login():
    print("Menu do usuário: \n")
    for key,value in menu_login.items():
        print(f"{key} - {value}")
    opcao = int(input("Digite uma opção: "))
    return opcao

#menu para exibir opções de pesquisas para o usuário
def exibir_menu_musica():
    print("\nEscolha uma opção: \n")
    for key,value in menu_buscar_musicas.items():
        print(f"{key} - {value}")
    opcao = int(input("Digite uma opção: "))
    return opcao

#menu para exibir curtir ou descurtir músicas
def exibir_menu_curtir_descurtir():
    print("\nEscolha uma opção: \n")
    for key,value in menu_curtir_descutir.items():
        print(f"{key} - {value}")
    opcao = int(input("Digite uma opção: "))
    return opcao

#menu para exibir a playlist
def exibir_menu_playlist():
    print("\nEscolha uma opção: \n")
    for key,value in menu_playlist.items():
        print(f"{key} - {value}")
    opcao = int(input("Digite uma opção: "))
    return opcao

#menu para exibir o histórico
def exibir_menu_historico():
    print("\nEscolha uma opção: \n")
    for key,value in menu_historico.items():
        print(f"{key} - {value}")
    opcao = int(input("Digite uma opção: "))
    return opcao
#função para novos usuarios

def cadastrar_usuario():
    nome = input("Digite o nome de usuário: ")
    senha = input("Digite sua senha: ")
#loop até a confirmação da senha esteja certa
    while True:
        senha_novamente = input("Confirme sua senha: ")
        if senha == senha_novamente:
            with open("usuarios.txt", "a") as arquivo: #a significa anexar
                arquivo.write(f"{nome},{senha}\n")
                print("Cadastro feito com sucesso.")
                break
        else:
            print("As senhas não coincidem. Por favor, digite novamente.")
        
#função para logar os usuários depois do cadastramento
def login_usuario():
    print("\nLogando o usuário: ")
    nome_login = input ("\nDigite o nome de usuário: ")
    senha_login = input("\nDigite a senha: ")

    with open("usuarios.txt", "r") as arquivo: #puxar o arquivo no modo de leitura
        conteudo = arquivo.readlines() #ler as linhas individualmente do arquivo
    for linha in conteudo:
        nome , senha = linha.strip().split(",") #dividir o arquivo de texto por mensagem que estejam separadas por virgula ou espaço
        if nome_login.lower() == nome.lower() and senha_login.lower() == senha.lower(): #garante que tanto o nome quanto a senha sejam iguais aos cadastrados
                print("\nLogado com sucesso.")
                print(f"Seja bem-vindo {nome}. \n")
                return True
    else:
        print("Erro no login. Verifique os dados informados e tente novamente.") #não expoe os dados do usuário como se o nome ou senha já foram cadastrados
        return False

#Função para procurar músicas pelo nome da música
def procurar():
    def procurar_musicas():
        print("Procurando músicas:")
        musica_procurada = input("Digite o nome da música a ser procurada: ")
        encontrou = False
        with open("musicas.txt", "r") as arquivo:
            conteudo = arquivo.readlines()
        for linha in conteudo:
            musica , artista = linha.strip().lower().split(",") 
            if musica_procurada.lower() in musica:
                print(f"Música(s): |{musica.strip().lower()}| do(a) artista: |{artista.strip().lower()}|encontrada no banco de  dados.")
                with open("musicas_buscadas.txt", "a" ) as arquivo:
                    arquivo.write(f"{musica},{artista}\n")
                encontrou = True
        if not encontrou:
            print("Música não encontrada.")

    #Função para procurar músicas pelo nome do artista
    def procurar_artista():
        print("Procurando músicas por artista: ")
        musica_artista = input("Digite o nome do artista a ser procurado: ")
        encontrou = False #linha para a música ser achada
        with open("musicas.txt", "r") as arquivo:
            conteudo = arquivo.readlines()
        for linha in conteudo:
            musica , artista = linha.strip().lower().split(",") 
            if musica_artista.lower() in artista.lower():
                print(f"Música(s):|{musica.strip().lower()}| do(a) artista:|{artista.strip().lower()}|encontrada no banco de dados. ")
                with open("musicas_buscadas.txt", "a" ) as arquivo:
                    arquivo.write(f"{musica}, {artista}\n")
                encontrou = True
        if not encontrou:
            print("Música não encontrada.")

    while True:
        opcao_musica = exibir_menu_musica()
        if opcao_musica == 1:
            procurar_musicas()
        elif opcao_musica == 2:
            procurar_artista()
        elif opcao_musica == 0:
            break
#Função para informações de músicas buscadas
#pegar informação da musica buscada e procurar no banco de dados musica e artista a descrição da informação
#abrir para "r" o arquivo musica.txt e ler somente a variavel informacao
def musicas_buscadas():
    with open("musicas_buscadas.txt", "r") as arquivo: # ler arquivo de historico de musicas
        conteudo = arquivo.readlines()
        for linha in conteudo:
            musica , artista = linha.strip().lower().split(",") 
            print(f"Música(s) buscada(s) anteriormente: {musica.strip().lower()} , {artista.strip().lower()}") #imprimir musicas buscadas inteiro
            
#Função para curtir músicas
def gerenciar_musicas():
    def curtir_musicas():
        with open("musicas.txt", "r") as arquivo:
            conteudo = arquivo.readlines()

        print("\nLista de músicas disponíveis:")
        for linha in conteudo:
            musica, artista = linha.strip().split(",")
            print(f"Música(s): |{musica.strip()}| do(a) artista: |{artista.strip()}|.")

        nome_curtir = input("\nDigite o nome da música que deseja curtir: ").strip().lower()
        encontrou = False

        for linha in conteudo:
            musica, artista = linha.strip().split(",")
            if nome_curtir in musica.lower():
                with open("musicas_curtidas.txt", "a") as arquivo_curtidas:
                    arquivo_curtidas.write(f"{musica.strip()}, {artista.strip()}\n")
                print(f"\nVocê curtiu: {musica} - {artista}")
                encontrou = True

        if not encontrou:
            print("\nMúsica não encontrada.")

    #Função para descurtir músicas
    def descurtir_musicas():
        with open("musicas_curtidas.txt", "r") as arquivo:
            musicas_curtidas = arquivo.readlines()

        print("\nLista de músicas curtidas:")
        for i, linha in enumerate(musicas_curtidas):
            musica, artista = linha.strip().split(",")
            print(f"{i}. {musica.strip()} - {artista.strip()}")

        nome_descurtir = input("\nDigite o nome da música que deseja descurtir: ").strip().lower()
        encontrou = False
        novas_linhas = []
        musicas_removidas = []

        for linha in musicas_curtidas:
            musica, artista = linha.strip().split(",")
            if nome_descurtir in musica.strip().lower():
                print(f"\nVocê descurtiu: {musica.strip()} - {artista.strip()}")
                encontrou = True
                musicas_removidas.append(linha)  # Guarda para salvar depois
                continue
            novas_linhas.append(linha)

        if encontrou:
            # Sobrescreve o arquivo de músicas curtidas com as restantes
            with open("musicas_curtidas.txt", "w") as arquivo:
                arquivo.writelines(novas_linhas)

            # Adiciona as músicas descurtidas ao final do arquivo "descurtidas"
            with open("musicas_descurtidas.txt", "a") as arquivo:
                arquivo.writelines(musicas_removidas)
        else:
            print("\nMúsica não encontrada na lista de curtidas.")

    while True: 
        opcao_curtir_descutir = exibir_menu_curtir_descurtir()
        if opcao_curtir_descutir == 1:
            curtir_musicas()
        elif opcao_curtir_descutir == 2:
            descurtir_musicas()
        elif opcao_curtir_descutir == 0:
            break
#Função para gerenciar a playlist
def playlist():
    def criar_playlist():
        ...
    def editar_playlist():
        ...
    def excluir_playlist():
        ...
    while True:
        opcao_playlist = exibir_menu_playlist()
        if opcao_playlist == 1:
            criar_playlist()
        elif opcao_playlist == 2:
            editar_playlist()
        elif opcao_playlist == 3:
            excluir_playlist()
        elif opcao_playlist == 0:
            break
#Função para aparecer o histórico de musicas curtidas e descurtidas
def historico():
    def lista_curtidas():
        with open("musicas_curtidas.txt", "r") as arquivo:
            conteudo = arquivo.readlines()
        print("\nLista de músicas curtidas:")
        for linha in conteudo:
            musica, artista = linha.strip().split(",")
            print(f"Música(s): |{musica.strip()}| do(a) artista: |{artista.strip()}|.")

    def lista_descurtidas():
        with open("musicas_descurtidas.txt", "r") as arquivo:
            conteudo = arquivo.readlines()
        print("\nLista de músicas que foram descurtidas:")
        for linha in conteudo:
            musica, artista = linha.strip().split(",")
            print(f"Música(s): |{musica.strip()}| do(a) artista: |{artista.strip()}|.")

    while True:
        opcao_historico = exibir_menu_historico()
        if opcao_historico == 1:
            lista_curtidas()
        elif opcao_historico == 2:
            lista_descurtidas()
        elif opcao_historico == 0:
            break

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