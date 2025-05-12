# Cadastrar novo usuário - Feito
# Login de usuário - Feito
# Buscar músicas por nome - Feito
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
    0 : "Sair\n"
}
menu_login = {
    1 : "Buscar músicas",
    2 : "Listar informações de músicas buscadas",
    3 : "Curtir músicas",
    4 : "Descurtir músicas",
    5 : "Gerenciar playlist",
    6 : "Visualizar histórico",
    0 : "Sair do menu de usuário. \n"
}
menu_buscar_musicas = {
    1 : "Buscar por música",
    2 : "Buscar por artista",
    0 : "Voltar ao menu de login. \n"
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
                        while True:
                            opcao_musica = exibir_menu_musica()
                            if opcao_musica == 1:
                                procurar_musicas()
                            elif opcao_musica == 2:
                                procurar_artista()
                            elif opcao_musica == 0:
                                break
                    elif opcao_logado == 2:
                        musicas_buscadas()
                    elif opcao_logado == 3: 
                        # Implementar curtir músicas
                        pass
                    elif opcao_logado == 4:
                        # Implementar descurtir músicas
                        pass
                    elif opcao_logado == 5:
                        # Implementar gerenciar playlist
                        pass
                    elif opcao_logado == 6:
                        # Implementar visualizar histórico
                        pass
                    elif opcao_logado == 0:
                        break
                    else:
                        print("Comando inválido. Tente novamente.")
        else:
            print("Comando inválido. Tente novamente.")

#função para exibir o menu 
def exibir_menu():
    print("Menu: \n")
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
    print("Logando o usuário: ")
    nome_login = input ("Digite o nome de usuário: ")
    senha_login = input("Digite a senha: ")

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
def procurar_musicas():
    print("Procurando músicas:")
    musica_procurada = input("Digite o nome da música a ser procurada: ")
    encontrou = False
    with open("musicas.txt", "r") as arquivo:
        conteudo = arquivo.readlines()
    for linha in conteudo:
        musica , artista , informacao = linha.strip().lower().split(",") 
        musica = musica.strip().lower()
        artista = artista.strip().lower()
        informacao = informacao.strip().lower()
        if musica_procurada.lower() in musica:
            print(f"Música(s): |{musica}| do(a) artista: |{artista}|encontrada no banco de dados.")
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
        musica , artista , informacao = linha.strip().lower().split(",") 
        musica = musica.strip().lower()
        artista = artista.strip().lower()
        informacao = informacao.strip().lower()
        if musica_artista.lower() in artista.lower():
            print(f"Música(s):|{musica}| do(a) artista:|{artista}|encontrada no banco de dados.")
            with open("musicas_buscadas.txt", "a" ) as arquivo:
                arquivo.write(f"{musica}, {artista}\n")
            encontrou = True
    if not encontrou:
        print("Música não encontrada.")

#Função para informações de músicas buscadas
#pegar informação da musica buscada e procurar no banco de dados musica e artista a descrição da informação
#abrir para "r" o arquivo musica.txt e ler somente a variavel informacao
def musicas_buscadas():
    with open("musicas_buscadas.txt", "r") as arquivo: # ler arquivo de historico de musicas
        conteudo = arquivo.readlines()
        for linha in conteudo:
            musica , artista = linha.strip().lower().split(",") 
            musica = musica.strip().lower()
            artista = artista.strip().lower()
            print(f"Música(s) buscada(s) anteriormente: {musica} , {artista}") #imprimir musicas buscadas inteiro
            
        buscada = input("\nDigite a música que deseja saber mais: ")
        encontrou = False #flag para ver se a música foi encontrada
    with open("musicas.txt" , "r") as arquivo_completo: #abrir arquivo de músicas para ler a informação
        for linha in arquivo_completo:
            musica , artista , informacao = linha.strip().lower().split(",") 
            musica = musica.strip().lower()
            artista = artista.strip().lower()
            informacao = informacao.strip().lower()
            if buscada.lower() in musica.lower(): #se a musica busca_buscada estiver dentro de musicas 
                print(f"Para a música: |{musica}|, do(a) artista |{artista}| as informações são: | {informacao}|\n") #imprima a informação sobre a música
                encontrou = True
    if not encontrou:
                print("Música não pesquisada recentemente. Tente novamente.")

#deepseek
#with open("musicas_buscadas.txt", "r") as arquivo: # ler apenas o histórico
#    historico = arquivo.readlines()
#
## Mostrar apenas o histórico
#print("Músicas buscadas anteriormente:")
#for linha in historico:
#    try:
#        musica, artista = linha.strip().split(",") 
#        print(f"- {musica.strip().title()}, {artista.strip().title()}")
#    except ValueError:
#        continue  # Ignora linhas mal formatadas
#
#buscada = input("\nDigite o nome exato da música que deseja saber mais: ").strip().lower()
#encontrou = False
#
## Buscar no arquivo completo
#with open("musicas.txt", "r") as arquivo_completo:
#    for linha in arquivo_completo:
#        try:
#            musica, artista, informacao = [x.strip().lower() for x in linha.split(",", 2)]  # Split em no máximo 2 vírgulas
#            if buscada == musica:  # Comparação EXATA
#                print(f"\nInformações completas:")
#                print(f"Música: {musica.title()}")
#                print(f"Artista: {artista.title()}")
#                print(f"Detalhes: {informacao.capitalize()}")
#                encontrou = True
#                break  # Encerra após encontrar
#        except ValueError:
#            continue  # Ignora linhas mal formatadas
#
#if not encontrou:
#    print("\nEsta música não consta no banco de dados completo.")


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