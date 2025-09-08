#include <stdio.h>

int main(){
	int idade = 0;

	printf("Digite sua idade: ");
	scanf("%d", &idade);
	
	int maiordeIdade = (idade > 18)? 1 : 0;
	if (maiordeIdade){
		printf("Maior de idade\n");
}   else{
		printf("Menor de idade\n");
}
system("pause");
}
