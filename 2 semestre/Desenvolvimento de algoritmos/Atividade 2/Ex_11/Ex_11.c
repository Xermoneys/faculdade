#include <stdio.h>
//escreva uma função em c chamada fatorial que receba um numero inteiro n e retorne o fatorial de n usando recursão
int fatorial(int n) {
    if (n == 0 || n == 1)
        return 1;
    else
        return n * fatorial(n - 1);
}
int main() {
    int numero;
    printf("Digite um numero inteiro: ");
    scanf("%d", &numero);
    if (numero < 0) {
        printf("Nao existe fatorial de numero negativo.\n");
    } else {
        printf("Fatorial de %d = %d\n", numero, fatorial(numero));
    }
    system("pause");
}

