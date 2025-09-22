#include <stdio.h>

// Função recursiva que retorna a quantidade de passos
int collatz(int n) {
    // Caso base
    if (n == 1) {
        return 0;
    }
    // Se for par
    else if (n % 2 == 0) {
        return 1 + collatz(n / 2);
    }
    // Se for ímpar
    else {
        return 1 + collatz(3 * n + 1);
    }
}

int main() {
    int num;
    printf("Digite um número: ");
    scanf("%d", &num);

    int passos = collatz(num);
    printf("Foram necessários %d passos para chegar em 1.\n", passos);

	system("pause");
}
