# Exercício 07
# Faça um programa que preencha uma matriz 10 X 3 com as notas
# de 10 alunos com 3 provas (valores gerados de forma aleatória
# entre 0 e 10).
# O programa deverá mostrar:
# ▶ A matriz com todas as notas de cada aluno.
# ▶ Um relatório com o número do aluno (número da linha), a prova em
# que cada aluno obteve a menor nota (número da coluna) e o valor
# da menor nota.
# ▶ O relatório deverá mostrar também qual foi a menor nota obtida
# em cada prova e a quantidade de alunos que obtiveram essa menor
# nota na respectiva prova.

from random import randint

notas = []

for num_linha in range(10):
    linha = []
    for num_coluna in range(3):
        linha.append(randint(0,10))
    notas.append(linha)

print("\nMatriz:")
for linha in notas:
    for elemento in linha:
        print(f'{elemento:2d}', end=' ')
    print() 

print("\nRelatório: ")
for aluno in range(len(notas)):
    print(f'Aluno {aluno} | ', end=' ')
    menor_nota = min(notas[aluno]) 
    print(f'Menor nota: {menor_nota} | ', end=' ')
    menor_prova = notas[aluno].index(menor_nota) + 1
    print(f'Prova: {menor_prova}')

