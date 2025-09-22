#include <stdio.h>

// Fun��o recursiva que retorna a quantidade de passos
int collatz(int n) {
    // Caso base
    if (n == 1) {
        return 0;
    }
    // Se for par
    else if (n % 2 == 0) {
        return 1 + collatz(n / 2);
    }
    // Se for �mpar
    else {
        return 1 + collatz(3 * n + 1);
    }
}

int main() {
    int num;
    printf("Digite um n�mero: ");
    scanf("%d", &num);

    int passos = collatz(num);
    printf("Foram necess�rios %d passos para chegar em 1.\n", passos);

	system("pause");
}
