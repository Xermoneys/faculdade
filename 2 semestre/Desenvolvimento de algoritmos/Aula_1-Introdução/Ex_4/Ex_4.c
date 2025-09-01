#include <stdio.h>

int main() {
    int A, B, C, temp;

    printf("Digite o primeiro numero: ");
    scanf("%d", &A);

    printf("Digite o segundo numero: ");
    scanf("%d", &B);

    printf("Digite o terceiro numero: ");
    scanf("%d", &C);

if (A > B) { temp = A; A = B; B = temp;}
if (A > C) { temp = A; A = C; C = temp; }
if (B > C) { temp = B; B = C; C = temp; }

    printf("\nNumeros em ordem crescente: %d, %d, %d\n", A, B, C);
	system("pause");
    return 0;
}

