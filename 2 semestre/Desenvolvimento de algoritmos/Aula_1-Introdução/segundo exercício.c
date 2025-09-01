#include <stdio.h>
int main (){
    float numero, soma = 0;

    for (int i = 1; i <= 5; i++) {
        printf("Digite o %d numero inteiro: \n", i );
        scanf("%f", &numero);
        soma += numero;
    }
    printf("A soma dos 5 numeros é: %.1f\n", soma);
    return 0;
}
