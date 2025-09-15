#include <stdio.h>

// Função recursiva
int potenciaRecursiva(int x, int n) {
    // Critério de parada
    if (n == 0) {
        return 1; // qualquer número elevado a 0 é 1
    }
    // Chamada recursiva com valor atualizado
    return x * potenciaRecursiva(x, n - 1);
}

// Função iterativa (com laço)
int potenciaIterativa(int x, int n) {
    int resultado = 1;
    for (int i = 0; i < n; i++) {
        resultado *= x;
    }
    return resultado;
}

int main() {
    int base, expoente;

    printf("Digite a base: ");
    scanf("%d", &base);

    printf("Digite o expoente: ");
    scanf("%d", &expoente);

    int resultadoRec = potenciaRecursiva(base, expoente);
    int resultadoIter = potenciaIterativa(base, expoente);

    printf("\nRecursiva: %d^%d = %d\n", base, expoente, resultadoRec);
    printf("Iterativa: %d^%d = %d\n", base, expoente, resultadoIter);
	system("pause");
    return 0;
}
