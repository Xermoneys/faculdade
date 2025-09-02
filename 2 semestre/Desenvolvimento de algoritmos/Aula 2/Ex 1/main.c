#include <stdio.h>
#include "biblioteca.h"

int main(){
	float a , b = 0;
	printf("Digite o primeiro numero: ");
	scanf("%f",&a);
	printf("Digite o segundo numero: ");
	scanf("%f", &b);
	printf("a = %.2f, b = %.2f\n", a ,b);
	printf("Soma: %.2f\n", somar(a,b));
	printf("Subtrair: %.2f\n", subtrair(a,b));
	printf("Multiplicacao: %.2f\n",multiplicar(a,b));
	printf("Dividir: %.2f\n", dividir(a,b));
	system("pause");
	return 0;

}
