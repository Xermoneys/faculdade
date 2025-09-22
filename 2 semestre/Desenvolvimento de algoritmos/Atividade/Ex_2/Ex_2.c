#include <stdio.h>

int main(){
	int numero;
 do{
		printf("Digite um numero inteiro:");
		scanf("%d", &numero);
		
		switch(numero){
			case 1:
				printf("Um\n");
				break;
			case 2:
				printf("Dois\n");
				break;
			default:
				printf("Outro numero.\n");
				break;
  }
		}while(numero != 0);
}
