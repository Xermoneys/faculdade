#include <stdio.h>

int main() {
    int matriz1[2][2], matriz2[2][2];
    int iguais = 1; 
    printf("Digite os elementos da primeira matriz 2x2:\n");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            printf("Elemento [%d][%d]: ", i, j);
            scanf("%d", &matriz1[i][j]);
        }
    }
    printf("\nDigite os elementos da segunda matriz 2x2:\n");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            printf("Elemento [%d][%d]: ", i, j);
            scanf("%d", &matriz2[i][j]);
        }
    }
    printf("Matriz feita: \n");
    for (int i = 0; i<2;i++){
		for (int j = 0; j<2;j++){
			printf("%2d", matriz1[i][j]);
		}
		printf("\n");
    }
    printf("Matriz feita: \n");
    for (int i = 0; i<2;i++){
		for (int j = 0; j<2;j++){
			printf("%2d", matriz2[i][j]);
		}
		printf("\n");
    }
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            if (matriz1[i][j] != matriz2[i][j]) {
                iguais = 0;
                break;
            }
        }
    }
    if (iguais)
        printf("\nMatrizes iguais\n");
    else
        printf("\nMatrizes diferentes\n");

    system("pause");
}
