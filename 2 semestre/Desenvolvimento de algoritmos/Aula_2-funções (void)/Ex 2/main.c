#include <stdio.h>
#include "numeros.h"

int main() {
    int num1 = 1;
    int num2 = 2;

    printf("par: %d\n", par(num1));
    printf("par: %d\n", par(num2));
    printf("primo: %d\n", primo(num1));
    printf("primo: %d\n", primo(num2));
    printf("fatorial de %d: %d\n", num2, fatorial(num2));
    printf("maior entre %d e %d: %d\n", num1, num2, max(num1, num2));
    printf("%d elevado a %d = %d\n", num1, 3, pot(num1, 3));
	system("pause");
    return 0;
}

