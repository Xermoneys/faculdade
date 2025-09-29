#include <stdio.h>

int main() {
    int array[10];
    int i, busca, encontrado = 0;
    
    printf("Digite 10 numeros inteiros \n");
    for (i = 0; i < 10; i++) {
        printf("Numero %d: ", i);
        scanf("%d", &array[i]);
    }
    printf("\nDigite um numero para buscar: ");
    scanf("%d", &busca);

    for (i = 0; i < 10; i++) {
        if (array[i] == busca) {
            printf("\nNumero %d encontrado na posicao %d do array.\n", busca, i);
            encontrado = 1;
            break;
        }
    }

    if (!encontrado) {
        printf("\nNumero %d nao foi encontrado no array.\n", busca);
    }

    system("pause");
}
