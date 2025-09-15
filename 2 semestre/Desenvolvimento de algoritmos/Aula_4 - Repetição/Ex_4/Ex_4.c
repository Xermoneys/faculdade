#include <stdio.h>

int main(){
	int opcao, n;
	do{
        printf("1.Calcular quadrado de um numero\n");
		printf("2.Calcular cubo de um numero\n");
		printf("3.Sair\n");
		printf("Digite um numero: ");
		scanf("%d", &opcao);
		if (opcao == 1){
			int i;
			printf("Entre com um numero para calcular o quadrado: ");
			scanf("%d",&i);
			printf("O quadrado de %d e %d\n", i , i*i);
			}
		else if (opcao == 2){
			int i;
			printf("Entre com um numero para calcular o cubo: ");
			scanf("%d",&i);
			printf("O cubo de %d e %d\n", i , i*i*i);
			}
        else if (opcao > 3 || opcao < 1){
			printf("Opcao invalida.\n");
			}
	}while(opcao =! 3);
	system("pause");
}

