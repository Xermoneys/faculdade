#include <stdio.h>

int main(){
	int opcao;

	printf("Digite um numero de 1 a 7: ");
	scanf("%d",&opcao);

	switch(opcao){
		case 1:
			printf("Segunda\n");
			break;
		case 2:
			printf("Terca\n");
			break;
		case 3:
			printf("Quarta\n");
			break;
		case 4:
			printf("Quinta\n");
			break;
		case 5:
			printf("Sexta\n");
			break;
		case 6:
			printf("Sabado\n");
			break;
		case 7:
			printf("Domingo\n");
			break;
}
system("pause");
}
