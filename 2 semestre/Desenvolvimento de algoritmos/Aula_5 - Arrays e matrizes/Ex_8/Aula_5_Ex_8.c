#include <stdio.h>

int main() {
    int matriz[3][3];
    int soma = 0;

    printf("Digite os elementos da matriz 3x3:\n");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            printf("Elemento [%d][%d]: ", i, j);
            scanf("%d", &matriz[i][j]);
        }
    }

    printf("\nElementos da diagonal principal:\n");
    for (int i = 0; i < 3; i++) {
        printf("%d ", matriz[i][i]);
        soma += matriz[i][i];
    }

    printf("\nSoma da diagonal principal = %d\n", soma);

    system("pause");
}
