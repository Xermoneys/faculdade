#Autor: Luciano Ventura Monegatto
# 1 semestre de ciência da computação

# Cadastrar novo usuário - Feito
# Login de usuário - Feito
# Buscar músicas por nome - Feito
# Listar informações de músicas buscadas- Feito
# Curtir e descurtir músicas - Feito
# Gerenciar playlists* - Feito
# Visualizar histórico** - Feito

#Gerenciar playlist:
#• Criar, -Feito
#editar, -Feito
#excluir playlists - Feito
#• Adicionar músicas de playlist - Feito
#remover músicas de playlists - Feito
#Visualizar Histórico:
#• Visualizar lista de músicas curtidas - Feito
#• Visualizar lista de músicas descurtidas - Feito

#'r': leitura (padrão).
#'w': escrita (sobrescreve o arquivo se já existir).
#'a': anexar (acrescenta ao final do arquivo se já existir).
#'r+': leitura e escrita.

#Em cada etapa das funções os números estão no relatório para explicação

#Para não acontecer o vazamento de senha é recomendavel dar a mensagem que a senha está incorreta invés de falar que o email não existe.

import os #O módulo os em Python é um módulo integrado que fornece uma maneira de interagir com o sistema operacional. Ele oferece funções para manipular o sistema de arquivos, acessar variáveis de ambiente, executar comandos do sistema e obter informações sobre o ambiente de execução. 
#Ao pesquisar se teria um jeito de apagar arquivos sem usar essa biblioteca a resposta mais comum era que não seria possível

#A grande maioria dos .lower usados foram para evitar que o usuário colocasse letra maiuscula e não conseguisse procurar a música ou digitar o usuário correto

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
menu_editar_playlist = {
    1: "Adicionar músicas na playlist.",
    2: "Remover músicas da playlist.",
    0: "Voltar ao menu da playlist"
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
                        buscar()
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

#-----------------------------------------------------------------------------------------------------------------------
# 1.Menus do programa

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

#menu para exibir o editar da playlist
def exibir_menu_editar_playlist():
    print("\nEscolha uma opção: \n")
    for key,value in menu_editar_playlist.items():
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

#------------------------------------------------------------------------------------------------------------------------------------------

#Funções do programa

#2.função para novos usuarios

def cadastrar_usuario():
    print("\nCadastrando o usuário...")
    nome = input("\nDigite o nome de usuário: ")
    senha = input("\nDigite sua senha: ")
#loop até a confirmação da senha esteja certa
    while True:
        senha_novamente = input("Confirme a senha colocada: ")
        if senha == senha_novamente:
            with open("usuarios.txt", "a") as arquivo: #a significa anexar
                arquivo.write(f"{nome},{senha}\n")
                print("Cadastro feito com sucesso.")
                break
        else:
            print("As senhas não coincidem. Por favor, digite novamente.")
        
#função para logar os usuários depois do cadastramento
def login_usuario():
    print("\nLogando o usuário... ")
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
def buscar():
    def buscar_musicas():
        print("Procurando músicas por nome da música...")
        musica_procurada = input("Digite o nome da música a ser procurada: ")
        encontrou = False #flag para que faça a verificação se achou a musica
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
    def buscar_por_artista():
        print("\nProcurando músicas por artista... ")
        musica_artista = input("\nDigite o nome do artista que deseja procurar: ")
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
#loop puxado da main para que o código seja visto de forma mais limpa
    while True:
        opcao_musica = exibir_menu_musica()
        if opcao_musica == 1:
            buscar_musicas()
        elif opcao_musica == 2:
            buscar_por_artista()
        elif opcao_musica == 0:
            break
#Função para informações de músicas buscadas
#pegar informação da musica buscada e procurar no banco de dados musica e artista a descrição da informação
#abrir para "r" o arquivo musica.txt e ler somente a variavel informacao
def musicas_buscadas():
    with open("musicas_buscadas.txt", "r") as arq_musicas:
        musicas_buscadas = [linha.strip() for linha in arq_musicas if linha.strip()]

    print("\nMúsicas buscadas anteriormente: ")
    for i, musica in enumerate(musicas_buscadas, 1):
        print(f"{i}. {musica}") #imprimir musicas buscadas inteiro
            
#Função para curtir músicas
def gerenciar_musicas():
    def curtir_musicas():
        with open("musicas.txt", "r") as arquivo:#ler arquivo de músicas completo para depois escolher quais músicas serão curtidas
            conteudo = arquivo.readlines()

        print("\nLista de músicas disponíveis:")
        for linha in conteudo:
            musica, artista = linha.strip().split(",")
            print(f"Música(s): |{musica.strip()}| do(a) artista: |{artista.strip()}|.")#imprime as músicas 

        nome_curtir = input("\nDigite o nome da música que deseja curtir: ").strip().lower()
        encontrou = False

        for linha in conteudo:
            musica, artista = linha.strip().split(",")
            if nome_curtir in musica.lower():
                with open("musicas_curtidas.txt", "a") as arquivo:
                    arquivo.write(f"{musica.strip()}, {artista.strip()}\n")
                print(f"\nVocê curtiu: |{musica}| - |{artista}|")
                encontrou = True

        if not encontrou:
            print("\nMúsica não encontrada.")

    #Função para descurtir músicas
    def descurtir_musicas():
        with open("musicas_curtidas.txt", "r") as arquivo: #lê o arquivo de musicas curtidas primeiro para o usuario poder descurtir depois
            musicas_curtidas = arquivo.readlines()

        print("\nLista de músicas curtidas:")
        for i, linha in enumerate(musicas_curtidas): #enumerando
            musica, artista = linha.strip().split(",")
            print(f"{i}. {musica.strip()} - {artista.strip()}")# imprime as músicas enumerando usando a lógica que pra cada linha de música seja um número diferente

        nome_descurtir = input("\nDigite o nome da música que deseja descurtir: ").strip().lower()
        encontrou = False
        novas_linhas = []
        musicas_removidas = []

        for linha in musicas_curtidas:
            musica, artista = linha.strip().split(",")
            if nome_descurtir in musica.strip().lower():
                print(f"\nVocê descurtiu: |{musica.strip()}| - |{artista.strip()}|")
                encontrou = True
                musicas_removidas.append(linha)  # guarda para salvar depois
                continue
            novas_linhas.append(linha)

        if encontrou:
            # sobrescreve o arquivo de músicas curtidas com as restantes
            with open("musicas_curtidas.txt", "w") as arquivo:
                arquivo.writelines(novas_linhas)

            # adiciona as músicas descurtidas ao final do arquivo
            with open("musicas_descurtidas.txt", "a") as arquivo:
                arquivo.writelines(musicas_removidas)
        else:
            print("\nMúsica não encontrada na lista de curtidas.")
#loop para a função de gerenciamento de músicas ficar mais dinâmico no código principal
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
    #função para criação de playlists
    def nova_playlist():
        titulo = input("Digite um nome para a nova playlist que deseja criar: ")
        nome_arquivo = f"{titulo}_playlist.txt" #ficar mais fácil para adicionar o nome dado pelo usuário e especificar que é uma playlist criada por ele

        # criação do arquivo de playlist
        with open(nome_arquivo, "w") as arq:
            pass  # nenhuma música no início

        # registro da playlist no índice
        with open("lista_de_playlists.txt", "a") as registro:
            registro.write(nome_arquivo + "\n")

        print(f"\nA playlist '{nome_arquivo}' foi criada com sucesso.")
    #função para editar a playlist
    def editar_playlist():
            def adicionar_musicas_playlist():
                if not os.path.exists("lista_de_playlists.txt"): #verifica se existe alguma playlist para ser editada
                    print("\nNenhuma playlist disponível para ser editada.")
                    return
                #pega o caminho do .txt que armazena o nome das playlists criadas anteriormente pelo usuário
                with open("lista_de_playlists.txt", "r") as arq:
                    playlists = [linha.strip() for linha in arq if linha.strip()]

                print("\nPlaylists disponíveis:")
                for i, nome in enumerate(playlists, 1):#mesma lógica usada anteriormente para enumeras as linhas por cada linha lida, dizendo para minha lista começar a contar a partir do 1 e não do 0
                    print(f"{i}. {nome}") #imprimir o número e o nome

                try:
                    escolha = int(input("Digite o número da playlist que deseja editar: ")) #de novo usando um número para não correr um risco das coisas darem errado
                    if not (1 <= escolha <= len(playlists)):
                        print("Opção inválida.")
                        return
                    nome_playlist = playlists[escolha - 1]
                except ValueError:
                    print("Entrada inválida.")
                    return

                with open("musicas.txt", "r") as arq_musicas:
                    musicas_disponiveis = [linha.strip() for linha in arq_musicas if linha.strip()]

                print("\nMúsicas disponíveis:")
                for i, musica in enumerate(musicas_disponiveis, 1):
                    print(f"{i}. {musica}") #usado para enumerar as músicas começando pelo nm 1

                try:
                    escolha_musica = int(input("Digite o número da música que deseja adicionar: "))
                    if not (1 <= escolha_musica <= len(musicas_disponiveis)):
                        print("Opção inválida.")
                        return
                    musica_escolhida = musicas_disponiveis[escolha_musica - 1] #número para a função entender já que previamente adicionamos para contar a partir do 1

                    with open(nome_playlist, "a") as arquivo:
                        arquivo.write(musica_escolhida + "\n")

                    print(f"Música |{musica_escolhida}| adicionada à playlist |{nome_playlist}|.")
                except ValueError:
                    print("Entrada inválida.")
            def remover_musicas_playlist():
                if not os.path.exists("lista_de_playlists.txt"): #verificar o caminho 
                    print("Nenhuma playlist disponível para editar.")
                    return
    
                with open("lista_de_playlists.txt", "r") as arq:
                    playlists = [linha.strip() for linha in arq if linha.strip()]

                print("\nPlaylists disponíveis:")
                for i, nome in enumerate(playlists, 1): #começar a enumerar a partir do 1
                    print(f"{i}. {nome}")

                try:
                    escolha = int(input("Digite o número da playlist que deseja editar: ")) #numero como falado antes para aumentar a precisão
                    if not (1 <= escolha <= len(playlists)):
                        print("Opção inválida.")
                        return
                    nome_playlist = playlists[escolha - 1]
                except ValueError:
                    print("Entrada inválida.")
                    return

                if not os.path.exists(nome_playlist):
                    print("A playlist selecionada não existe.")
                    return

                with open(nome_playlist, "r") as arq_playlist:
                    musicas_na_playlist = [linha.strip() for linha in arq_playlist if linha.strip()] #compreensão de listas

                if not musicas_na_playlist:
                    print("A playlist está vazia.")
                    return

                print("\nMúsicas na playlist:")
                for i, musica in enumerate(musicas_na_playlist, 1):
                    print(f"{i}. {musica}")

                try:
                    escolha_musica = int(input("Digite o número da música que deseja remover: "))
                    if not (1 <= escolha_musica <= len(musicas_na_playlist)):
                        print("Opção inválida.")
                        return
                    musica_removida = musicas_na_playlist.pop(escolha_musica - 1)

                    with open(nome_playlist, "w") as arq_playlist: #w uasdo para sobreescrever 
                        for musica in musicas_na_playlist:
                            arq_playlist.write(musica + "\n")

                    print(f"Música |{musica_removida}| removida da playlist '{nome_playlist}'.")
                except ValueError:
                    print("Entrada inválida.")

            while True:
               opcao_editar = exibir_menu_editar_playlist()
               if opcao_editar == 1:
                   adicionar_musicas_playlist()
               elif opcao_editar == 2:
                   remover_musicas_playlist()
               elif opcao_editar == 0:
                   break    

    #função para deletar playlists
    def deletar_playlist():
        if not os.path.exists("lista_de_playlists.txt"): #se não está no caminho(path) que existe então não existe nenhuma playlist para ser escluída
            print("\nNenhuma playlist para excluir.")
            return

        with open("lista_de_playlists.txt", "r") as registro:
            todas = [linha.strip() for linha in registro if linha.strip()] #compreensão de listas pesquisadas e aprendidas na aula

        if not todas:
            print("\nNenhuma playlist registrada.")
            return

        print("\nPlaylists encontradas:")
        for i, nome in enumerate(todas, 1):
            print(f"{i}. {nome}")

        try:
            escolha = int(input("\nDigite o número da playlist que deseja remover: ")) #fazendo por números a chance de uma playlist com nomes parecidos sejam removidos é menor, caso eu optasse por usar "in"
            if 1 <= escolha <= len(todas):
                alvo = todas[escolha - 1]

                # apagar o arquivo, se existir
                if os.path.exists(alvo):#se o caminho existir em alvo
                    os.remove(alvo)

                # remover do índice
                del todas[escolha - 1]
                with open("lista_de_playlists.txt", "w") as registro:
                    for item in todas:
                        registro.write(item + "\n")

                print(f"'{alvo}' foi removida com sucesso.")
            else:
                print("Opção fora do intervalo.")
        except ValueError:
            print("Por favor, insira um número válido.")

            
    while True:
        opcao_playlist = exibir_menu_playlist()
        if opcao_playlist == 1:
            nova_playlist()
        elif opcao_playlist == 2:
            editar_playlist()
        elif opcao_playlist == 3:
            deletar_playlist()
        elif opcao_playlist == 0:
            break
#Função para aparecer o histórico de musicas curtidas e descurtidas
#função simples que basicamente só pega os .txt armazenados de curtidas e descurtidas e os imprime
def historico():
    def lista_curtidas():
        with open("musicas_curtidas.txt", "r") as arquivo:
            conteudo = [linha.strip() for linha in arquivo if linha.strip()]
        print("\nLista de músicas curtidas:")
        for i, musica  in enumerate(conteudo):
            print(f"{i}. |{musica}|.")

    def lista_descurtidas():
        with open("musicas_descurtidas.txt", "r") as arquivo:
            conteudo = [linha.strip() for linha in arquivo if linha.strip()]
        print("\nLista de músicas descurtidas:")
        for i, musica  in enumerate(conteudo):
            print(f"{i}. |{musica}|.")

    while True:
        opcao_historico = exibir_menu_historico()
        if opcao_historico == 1:
            lista_curtidas()
        elif opcao_historico == 2:
            lista_descurtidas()
        elif opcao_historico == 0:
            break

def sair(): #função para sair do programa
    print("Saindo do programa...")
    exit()

if __name__ == "__main__":
    main()