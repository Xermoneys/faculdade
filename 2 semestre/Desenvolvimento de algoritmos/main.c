#include <stdio.h>
#include "conversoes.h"

int main(){
	int opcao;
	float valor, resultado;
	do{
		printf("====Sistema de conversoes=====\n");
		printf("1 - Celsius para Fahrenheit.\n");
		printf("2 - Farenheit para Celsius.\n");
		printf("3 - Metros para quilometros.\n");
		printf("4 - Quilometros para metros.\n");
		printf("5 - Segundos para minutos.\n");
		printf("6 - Minutos para segundos.\n");
		printf("0 - Sair\n");
		printf("Escolha uma opcao: ");
		scanf("%d", &opcao);
	
	switch(opcao){
		case 1:
			printf("Digite qual valor em Celsius deseja converter: ");
			scanf("%f", &valor);
			resultado = celsiuspFahrenheit(valor);
			printf("O resultado da conversao sera: %.2f farenheit\n", resultado);
			system("pause");
			break;
		case 2:
			printf("Digite qual valor em Farenheit deseja converter: ");
			scanf("%f", &valor);
			resultado = fahrenheitpCelsius(valor);
			printf("O resultado da conversao sera: %.2f celsius\n", resultado);
			system("pause");
			break;
		case 3:
			printf("Digite qual valor em Metros deseja converter: ");
			scanf("%f", &valor);
			resultado = metrospQuilometros(valor);
			printf("O resultado da conversao sera: %.f quilometro(s)\n", resultado);
			system("pause");
			break;
		case 4:
			printf("Digite qual valor em Quilometros deseja converter: ");
			scanf("%f", &valor);
			resultado = quilometrospMetros(valor);
			printf("O resultado da conversao sera: %.f metro(s)\n", resultado);
			system("pause");
			break;
		case 5:
			printf("Digite qual valor em Segundos deseja converter: ");
			scanf("%f", &valor);
			resultado = segundospMinutos(valor);
			printf("O resultado da conversao sera: %.f minuto(s)\n", resultado);
			system("pause");
			break;
		case 6: 
			printf("Digite qual valor em Minutos deseja converter: ");
			scanf("%f", &valor);
			resultado = minutospSegundos(valor);
			printf("O resultado da conversao sera: %.f segundo(s)\n", resultado);
			system("pause");
			break;
		case 0:
			printf("Saindo do programa\n");
			system("pause");
			break;
		default:
			printf("Opcao invalida. Tente novamente.\n");	 
	
	}
  } while (opcao != 0);

    return 0;
}
