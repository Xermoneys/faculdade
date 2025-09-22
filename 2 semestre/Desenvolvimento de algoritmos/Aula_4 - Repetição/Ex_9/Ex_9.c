#include <stdio.h>

int main() {
    int numero, soma = 0, contador = 0;
    float media;

    while (1) { // laço principal para permitir vários números
        do {
            printf("Digite um numero entre 1 e 100 (ou 0 para sair): ");
            scanf("%d", &numero);

            if (numero == 0) {
                break; // sai do do-while se for zero
            }

            if (numero < 1 || numero > 100) {
                printf("Numero invalido! Tente novamente.\n");
            }
        } while (numero < 1 || numero > 100);

        if (numero == 0) {
            break; // sai do while principal se for zero
        }

        soma += numero;
        contador++;
    }

    if (contador > 0) {
        media = (float)soma / contador;
        printf("\nVoce digitou %d numeros validos.\n", contador);
        printf("A media dos numeros validos e: %.2f\n", media);
    } else {
        printf("\nNenhum numero valido foi digitado.\n");
    }

    system("pause");
}
