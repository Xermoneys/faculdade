#include <stdio.h>

int main() {
    int array[20];
    int soma = 0;
    printf("Digite 20 numeros inteiros:\n");
    for (int i = 0; i < 20; i++) {
        printf("Digite o %d valor do array: ", i);
        scanf("%d", &array[i]);
    }
    for (int i = 0; i < 20; i++) {
        if (i % 2 == 0) {
            soma += array[i];
        }
    }
    printf("\nA soma dos elementos nos indices pares e: %d\n", soma);

    system("pause");
}

//crie um programa em c que instancia um array de inteiros com 20 posições e receba seus valores via teclado para preencher esse array. depois calcule e exiba a soma dos elementos nos indices pares do array
