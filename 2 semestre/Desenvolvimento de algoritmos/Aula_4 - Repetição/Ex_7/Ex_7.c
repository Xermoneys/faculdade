#include <stdio.h>

int fibonacci(int n) {
if (n == 0) return 0;
if (n == 1) return 1;
return fibonacci(n - 1) + fibonacci(n - 2);
}

int main() {
int n = 40;
int opcao;

do {
printf("\nEscolha uma opcao:\n");
printf("1 - Iterativa\n");
printf("2 - Recursiva\n");
printf("3 - Sair\n");
printf("Opcao: ");
scanf("%d", &opcao);

switch (opcao) {
case 1: {
int a = 0, b = 1, c;
printf("Sequencia de Fibonacci (iterativa):\n");
for (int i = 1; i <= n; i++) {
printf("%d ", a);
c = a + b;
a = b;
b = c;
}
printf("\n");
break;
}

case 2:
printf("Sequencia de Fibonacci (recursiva):\n");
for (int i = 0; i < n; i++) {
printf("%d ", fibonacci(i));
}
printf("\n");
break;

case 3:
printf("Saindo...\n");
break;

default:
printf("Opcao invalida!\n");
}
} while (opcao != 3);

system("pause");
return 0;
}
