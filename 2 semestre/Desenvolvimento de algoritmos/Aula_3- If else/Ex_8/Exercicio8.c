#include <stdio.h>

int main(){
	float a, b ,h , raio, area;
	int opcao;
	printf("1 - Calcular a area do circulo.\n");
	printf("2 - Calcular a area do retangulo.\n");
	printf("3 - Calcular a area do triagulo.\n");
	printf("4 - Sair\n");
	scanf("%d", &opcao);
	switch(opcao){
		case 1:
			printf("Digite o raio do circulo:\n");
			scanf("%f", &raio);
			area = 3.14 * raio * raio;
			printf("Area do circulo e: %.2f\n", area);
			break;
		case 2:
			printf("Digite os lados do retangulo:\n");
			scanf("%f %f", &a, &b);
			area = a * b;
			printf("A area e: %.2f\n", area);
			break;
		case 3:
			printf("Digite a altura e a base do triangulo:\n");
			scanf("%f %f", &h, &b);
			area = (h * b) /2;
			printf("A area do triangulo e : %.2f\n", area);
			break;
		case 4:
			break;
}
system("pause");
return 0;
}
