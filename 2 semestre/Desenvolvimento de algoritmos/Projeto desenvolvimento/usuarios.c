#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "usuarios.h"

#define ARQ_USUARIOS "usuarios.txt"

typedef struct {
    int id;
    char nome[50];
    char senha[20];
} Usuario;

void cadastrarUsuario() {
    Usuario u;
    FILE *f = fopen(ARQ_USUARIOS, "a");
    if (!f) {
        printf("Erro ao abrir arquivo.\n");
        return;
    }

    printf("ID do usuario: ");
    scanf("%d", &u.id);
    printf("Nome: ");
    scanf(" %[^\n]", u.nome);
    printf("Senha: ");
    scanf(" %[^\n]", u.senha);

    fprintf(f, "%d;%s;%s\n", u.id, u.nome, u.senha);
    fclose(f);
    printf("Usuario cadastrado com sucesso!\n");
}

int loginUsuario() {
    Usuario u;
    char nome[50], senha[20];
    FILE *f = fopen(ARQ_USUARIOS, "r");

    if (!f) {
        printf("Erro ao abrir arquivo.\n");
        return -1;
    }

    printf("Nome: ");
    scanf(" %[^\n]", nome);
    printf("Senha: ");
    scanf(" %[^\n]", senha);

    while (fscanf(f, "%d;%49[^;];%19[^\n]\n", &u.id, u.nome, u.senha) == 3) {
        if (strcmp(u.nome, nome) == 0 && strcmp(u.senha, senha) == 0) {
            fclose(f);
            printf("Login bem-sucedido! Bem-vindo, %s\n", u.nome);
            return u.id;
        }
    }

    fclose(f);
    printf("Usuario ou senha incorretos.\n");
    return -1;
}
