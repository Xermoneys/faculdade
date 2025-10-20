#include <stdio.h>
//desenvolva um programa que receba via teclado os valores para preencher uma matriz de 3x3 de inteiros. calcule e exiba a soma de todos os elementos do array.
int main() {
    int matriz[3][3];
    int soma = 0;
    printf("Digite os valores para a matriz 3x3:\n");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            printf("Posicao na matriz %d linha %d coluna: ", i+1, j+1);
            scanf("%d", &matriz[i][j]);
            soma += matriz[i][j];
        }
    }
    printf("\nA matriz sera:\n");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            printf("%2d", matriz[i][j]);
        }
        printf("\n");
    }
    printf("A soma de todos os elementos da matriz: %d\n", soma);
    system("pause");
}


