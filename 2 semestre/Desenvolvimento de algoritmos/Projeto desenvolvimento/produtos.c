#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "produtos.h"

#define ARQ_PRODUTOS "produtos.txt"

typedef struct {
    int id;
    char nome[50];
    float preco;
} Produto;

void listarProdutos() {
    Produto p;
    FILE *f = fopen(ARQ_PRODUTOS, "r");
    if (!f) {
        printf("Nenhum produto encontrado.\n");
        return;
    }

    printf("\n=== Lista de Produtos ===\n");
    while (fscanf(f, "%d;%49[^;];%f\n", &p.id, p.nome, &p.preco) == 3) {
        printf("ID: %d | Nome: %s | Preco: R$ %.2f\n", p.id, p.nome, p.preco);
    }
    fclose(f);
}

void buscarProduto() {
    Produto p;
    char busca[50];
    FILE *f = fopen(ARQ_PRODUTOS, "r");
    if (!f) {
        printf("Erro ao abrir arquivo.\n");
        return;
    }

    printf("Digite o nome do produto para buscar: ");
    scanf(" %[^\n]", busca);

    printf("\n=== Resultados ===\n");
    while (fscanf(f, "%d;%49[^;];%f\n", &p.id, p.nome, &p.preco) == 3) {
        if (strstr(p.nome, busca))
            printf("ID: %d | Nome: %s | Preço: R$ %.2f\n", p.id, p.nome, p.preco);
    }

    fclose(f);
}
