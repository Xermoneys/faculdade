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
	/*A função listarProdutos() tem como objetivo exibir todos os produtos disponíveis no sistema.
	Os dados são lidos diretamente do arquivo produtos.txt e apresentados de forma organizada, contendo informações como ID, nome, tipo e preço de cada item.
	Essa função é fundamental para que o usuário tenha uma visão geral do catálogo antes de realizar um pedido, simulando a experiência de navegação em um site de comércio eletrônico.
*/
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
	/*A função buscarProduto() permite que o usuário procure por um produto específico no catálogo da loja virtual.
	A busca é realizada com base no nome ou parte do nome do produto, verificando as informações presentes no arquivo produtos.txt.
	Ao localizar o item desejado, o sistema exibe os detalhes do produto, como o nome, o tipo e o preço.
	Essa funcionalidade proporciona agilidade na navegação, permitindo que o usuário encontre facilmente os produtos de seu interesse.
*/
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
