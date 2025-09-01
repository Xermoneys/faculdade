#include <stdio.h>
#include "biblioteca.h"

int main(){
	float a = 10.0 , b = 3.0;
	
	printf("a = %.2f, b = %.2f\n", a ,b);
	printf("Soma: %.2f\n", somar(a,b));
	printf("Subtrair: %.2f\n", subtrair(a,b));
	printf("Multiplicacao: %.2f\n",multiplicar(a,b));
	printf("Dividir: %.2f\n", dividir(a,b));
	system("pause");
	return 0;

}
