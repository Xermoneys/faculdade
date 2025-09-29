#include <stdio.h>

int main() {
    int numeros[15];
    int pares, impares;
    char opcao;

    do {
        pares = 0;
        impares = 0;

        printf("\n Digite 15 numeros inteiros\n");
        for (int i = 0; i < 15; i++) {
            printf("Numero %d: ", i + 1);
            scanf("%d", &numeros[i]);

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        printf("\nResultado:\n");
        printf("Quantidade de pares: %d\n", pares);
        printf("Quantidade de impares: %d\n", impares);

        printf("\nDeseja executar novamente? (s/n): ");
        scanf(" %c", &opcao); // espaço antes do %c ignora o Enter anterior

    } while (opcao == 's' || opcao == 'S');

    printf("\nPrograma encerrado.\n");
    return 0;
}
