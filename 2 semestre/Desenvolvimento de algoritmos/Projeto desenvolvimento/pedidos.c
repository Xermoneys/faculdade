#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "pedidos.h"

#define ARQ_PEDIDOS "pedidos.txt"

typedef struct {
    int id;
    int usuarioId;
    char produtos[200];
    float total;
    int avaliacao;
} Pedido;

void criarPedido(int usuarioId) {
    Pedido p;
    FILE *f = fopen(ARQ_PEDIDOS, "a");

    if (!f) {
        printf("Erro ao abrir arquivo de pedidos.\n");
        return;
    }

    printf("=== Criar Pedido ===\n");
    printf("ID do pedido: ");
    scanf("%d", &p.id);
    p.usuarioId = usuarioId;
    printf("Produtos (separe por vírgula): ");
    scanf(" %[^\n]", p.produtos);
    printf("Valor total: ");
    scanf("%f", &p.total);
    p.avaliacao = -1;

    fprintf(f, "%d;%d;%s;%.2f;%d\n", p.id, p.usuarioId, p.produtos, p.total, p.avaliacao);
    fclose(f);
    printf("Pedido criado com sucesso!\n");
}

void editarPedido(int usuarioId) {
    Pedido p;
    int id;
    FILE *f = fopen(ARQ_PEDIDOS, "r");
    FILE *temp = fopen("temp.txt", "w");

    if (!f || !temp) {
        printf("Erro ao abrir arquivos.\n");
        return;
    }

    printf("ID do pedido para editar: ");
    scanf("%d", &id);

    while (fscanf(f, "%d;%d;%199[^;];%f;%d\n",
                  &p.id, &p.usuarioId, p.produtos, &p.total, &p.avaliacao) == 5) {
        if (p.usuarioId == usuarioId && p.id == id) {
            printf("Novo conteudo de produtos: ");
            scanf(" %[^\n]", p.produtos);
            printf("Novo valor total: ");
            scanf("%f", &p.total);
        }
        fprintf(temp, "%d;%d;%s;%.2f;%d\n", p.id, p.usuarioId, p.produtos, p.total, p.avaliacao);
    }

    fclose(f);
    fclose(temp);
    remove(ARQ_PEDIDOS);
    rename("temp.txt", ARQ_PEDIDOS);
    printf("Pedido editado com sucesso!\n");
}

void excluirPedido(int usuarioId) {
    Pedido p;
    int id;
    FILE *f = fopen(ARQ_PEDIDOS, "r");
    FILE *temp = fopen("temp.txt", "w");

    if (!f || !temp) {
        printf("Erro ao abrir arquivos.\n");
        return;
    }

    printf("ID do pedido para excluir: ");
    scanf("%d", &id);

    while (fscanf(f, "%d;%d;%199[^;];%f;%d\n",
                  &p.id, &p.usuarioId, p.produtos, &p.total, &p.avaliacao) == 5) {
        if (!(p.usuarioId == usuarioId && p.id == id)) {
            fprintf(temp, "%d;%d;%s;%.2f;%d\n", p.id, p.usuarioId, p.produtos, p.total, p.avaliacao);
        }
    }

    fclose(f);
    fclose(temp);
    remove(ARQ_PEDIDOS);
    rename("temp.txt", ARQ_PEDIDOS);
    printf("Pedido excluido com sucesso!\n");
}

void adicionarProdutoPedido(int usuarioId) {
    Pedido p;
    int id;
    char novoProduto[50];
    FILE *f = fopen(ARQ_PEDIDOS, "r");
    FILE *temp = fopen("temp.txt", "w");

    if (!f || !temp) {
        printf("Erro ao abrir arquivos.\n");
        return;
    }

    printf("ID do pedido para adicionar produto: ");
    scanf("%d", &id);
    printf("Nome do produto para adicionar: ");
    scanf(" %[^\n]", novoProduto);

    while (fscanf(f, "%d;%d;%199[^;];%f;%d\n",
                  &p.id, &p.usuarioId, p.produtos, &p.total, &p.avaliacao) == 5) {
        if (p.usuarioId == usuarioId && p.id == id) {
            strcat(p.produtos, ", ");
            strcat(p.produtos, novoProduto);
        }
        fprintf(temp, "%d;%d;%s;%.2f;%d\n", p.id, p.usuarioId, p.produtos, p.total, p.avaliacao);
    }

    fclose(f);
    fclose(temp);
    remove(ARQ_PEDIDOS);
    rename("temp.txt", ARQ_PEDIDOS);
    printf("Produto adicionado com sucesso!\n");
}

void removerProdutoPedido(int usuarioId) {
    Pedido p;
    int id;
    char produtoRemover[50];
    FILE *f = fopen(ARQ_PEDIDOS, "r");
    FILE *temp = fopen("temp.txt", "w");

    if (!f || !temp) {
        printf("Erro ao abrir arquivos.\n");
        return;
    }

    printf("ID do pedido para remover produto: ");
    scanf("%d", &id);
    printf("Nome do produto a remover: ");
    scanf(" %[^\n]", produtoRemover);

    while (fscanf(f, "%d;%d;%199[^;];%f;%d\n",
                  &p.id, &p.usuarioId, p.produtos, &p.total, &p.avaliacao) == 5) {
        if (p.usuarioId == usuarioId && p.id == id) {
            char *pos = strstr(p.produtos, produtoRemover);
            if (pos) {
                int len = strlen(produtoRemover);
                memmove(pos, pos + len, strlen(pos + len) + 1);
            }
        }
        fprintf(temp, "%d;%d;%s;%.2f;%d\n", p.id, p.usuarioId, p.produtos, p.total, p.avaliacao);
    }

    fclose(f);
    fclose(temp);
    remove(ARQ_PEDIDOS);
    rename("temp.txt", ARQ_PEDIDOS);
    printf("Produto removido com sucesso!\n");
}

void listarPedidos(int usuarioId) {
    Pedido p;
    FILE *f = fopen(ARQ_PEDIDOS, "r");
    if (!f) {
        printf("Nenhum pedido encontrado.\n");
        return;
    }

    printf("\n=== Seus Pedidos ===\n");
    while (fscanf(f, "%d;%d;%199[^;];%f;%d\n",
                  &p.id, &p.usuarioId, p.produtos, &p.total, &p.avaliacao) == 5) {
        if (p.usuarioId == usuarioId) {
            printf("ID: %d | Produtos: %s | Total: R$ %.2f | Avaliacao: %s\n",
                   p.id, p.produtos, p.total,
                   (p.avaliacao >= 0) ? (p.avaliacao == 0 ? "0 estrelas" : (p.avaliacao == 1 ? "1 estrela" : "varias estrelas")) : "Sem avaliação");
        }
    }
    fclose(f);
}

void avaliarPedido(int usuarioId) {
    Pedido p;
    int id, avaliacao;
    FILE *f = fopen(ARQ_PEDIDOS, "r");
    FILE *temp = fopen("temp.txt", "w");

    if (!f || !temp) {
        printf("Erro ao abrir arquivos.\n");
        return;
    }

    printf("ID do pedido para avaliar: ");
    scanf("%d", &id);
    printf("Atribua uma nota (0 a 5): ");
    scanf("%d", &avaliacao);

    while (fscanf(f, "%d;%d;%199[^;];%f;%d\n",&p.id, &p.usuarioId, p.produtos, &p.total, &p.avaliacao) == 5) {
        if (p.usuarioId == usuarioId && p.id == id) {
            p.avaliacao = avaliacao;
        }
        fprintf(temp, "%d;%d;%s;%.2f;%d\n",
                p.id, p.usuarioId, p.produtos, p.total, p.avaliacao);
    }

    fclose(f);
    fclose(temp);
    remove(ARQ_PEDIDOS);
    rename("temp.txt", ARQ_PEDIDOS);
    printf("Pedido avaliado com sucesso!\n");
}

void menuPedidos(int usuarioId) {
    int opc;
    do {
        printf("\n=== Gerenciar Pedidos ===\n");
        printf("1 - Criar pedido\n");
        printf("2 - Editar pedido\n");
        printf("3 - Excluir pedido completo\n");
        printf("4 - Adicionar produto a um pedido preexistente\n");
        printf("5 - Remover produto dentro de um pedido\n");
        printf("6 - Listar pedidos\n");
        printf("0 - Voltar\n");
        printf("Escolha: ");
        scanf("%d", &opc);

        switch (opc) {
            case 1: criarPedido(usuarioId); break;
            case 2: editarPedido(usuarioId); break;
            case 3: excluirPedido(usuarioId); break;
            case 4: adicionarProdutoPedido(usuarioId); break;
            case 5: removerProdutoPedido(usuarioId); break;
            case 6: listarPedidos(usuarioId); break;
            case 0: break;
            default: printf("Opcao invalida.\n");
        }
    } while (opc != 0);
}
