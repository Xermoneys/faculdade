#include <stdio.h>
int a = 0;
int b = 0;
int main(){
	printf("Digite dois numeros inteiros\n");
	printf("Primeiro numero inteiro: ");
	scanf("%d", &a);
	printf("Segundo numero inteiro: ");
	scanf("%d", &b);
	if (a > b){
		printf("O numero %d e maior que %d.", a, b);
	}
	else if (a < b){
		printf("O numero %d e maior que %d .", b,a);
	}
	else{
		printf("Os numeros inteiros sao iguais.", a,b);
	}
	system("pause");
}


