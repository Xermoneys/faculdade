# Exercício 03
# Neste exercício, você criará um programa em Python que
# identifica a(s) palavras(s) mais longa(s) em um arquivo.
# Seu programa deve exibir uma mensagem que inclua o tamanho da
# palavra mais longa, juntamente com todas as palavras desse
# comprimento que ocorreram no arquivo. Desconsidere sinais de
# pontuação.

with open("texto.txt", "r") as arquivo:
    conteudo = arquivo.read()
    palavras = conteudo.split()

