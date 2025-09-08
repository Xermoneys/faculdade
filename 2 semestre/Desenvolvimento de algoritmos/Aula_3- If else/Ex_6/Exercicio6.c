#include <stdio.h>

int main() {
    int a, b, c;
    int maior, menor;

    printf("Digite tres numeros: ");
    scanf("%d %d %d", &a, &b, &c);

    if (a >= b && a >= c) {
        maior = a;
    } else if (b >= a && b >= c) {
        maior = b;
    } else {
        maior = c;
    }

    if (a <= b && a <= c) {
        menor = a;
    } else if (b <= a && b <= c) {
        menor = b;
    } else {
        menor = c;
    }

    printf("Maior valor: %d\n", maior);
    printf("Menor valor: %d\n", menor);
	system("pause");
    return 0;
}
