#include <stdio.h>

int main(){
	int linhas , i ,j;
	printf("Digite quantas linhas quer imprimir:");
	scanf("%d", &linhas);
	for (i = 1; i <= linhas; i++ ){
	    for (j = 1; j <= i; j++){
	    	printf("*");
		}
		printf("\n");
	}
	system("pause");
}
