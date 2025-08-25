//Primeiro exercício da 1 aula

#include <stdio.h>
int main() {
  int numero, soma = 0;

 for (int i = 1; i <= 5; i++) {
  printf("Digite o %d numero inteiro: \n", i );
  scanf("%d", &numero);
  soma += numero;
 }
 printf("A soma dos 5 numeros é: %d\n", soma);
 return 0;
}