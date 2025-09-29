#include <stdio.h>

int main(){
	int tamanho = 5;
	int array[tamanho];
	for(int i = 0; i < tamanho; i++){
		printf("Entre com o valor para a posicao %d: ", i);
		scanf("%d", &array[i]);
		}

		printf("Array final: \n");
		for(int i = 0; i < tamanho; i++)
		    printf("%d\n", array[i]);

		system("pause");
}
