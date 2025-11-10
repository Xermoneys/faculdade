#include <stdio.h>
#include <stdlib.h>
#include "usuarios.h"
#include "produtos.h"
#include "pedidos.h"

int main() {
    int opcao, usuarioId = -1;

    do {
        printf("\n=== FastDeliveryInformatic ===\n");
        printf("1 - Cadastrar usuario\n");
        printf("2 - Login\n");
        printf("3 - Buscar produto\n");
        printf("4 - Listar produtos\n");
        printf("5 - Gerenciar pedidos\n");
        printf("6 - Avaliar pedido\n");
        printf("0 - Sair\n");
        printf("Escolha: ");
        scanf("%d", &opcao);

        switch (opcao) {
            case 1:
                cadastrarUsuario();
                break;
            case 2:
                usuarioId = loginUsuario();
                break;
            case 3:
                buscarProduto();
                break;
            case 4:
                listarProdutos();
                break;
            case 5:
                if (usuarioId != -1)
                    menuPedidos(usuarioId);
                else
                    printf("Voce precisa estar logado!\n");
                break;
            case 6:
                if (usuarioId != -1)
                    avaliarPedido(usuarioId);
                else
                    printf("Voce precisa estar logado!\n");
                break;
            case 0:
                printf("Encerrando o sistema...\n");
                break;
            default:
                printf("Opcao invalida.\n");
        }
    } while (opcao != 0);

    return 0;
}
