#include <stdio.h>

int main(){
	int tamanho = 8;
	int array[tamanho];
	int maior_valor = 0, pmaior = 0;
	int menor_valor = 9999, pmenor = 0;
	
	for(int i=0; i<tamanho; i++){
		printf("Entre com um valor para a posicao %d: ", i);
		scanf("%d", &array[i]);
		if(array[i] > maior_valor){
			maior_valor = array[i];
			pmaior = i;
		}
		if(array[i] < menor_valor){
			menor_valor = array[i];
			pmenor = i;
		}
	}
	printf("O maior valor dos inseridos e %d e esta na posicao %d. \n",maior_valor, pmaior);
	printf("O menor valor dos inseridos e %d e esta na posicao %d. \n",menor_valor, pmenor);
	system("pause");
}
