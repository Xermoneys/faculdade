#include <stdio.h>

int main(){
    int tamanho = 10;
	int array[tamanho];
	int positivo = 0;
	int total = 0;
	for(int i = 0; i < tamanho; i++){
		printf("Entre com o valor para a posicao %d: ", i);
		scanf("%d", &array[i]);
		total += array[i];
		if(array[i] >= 0)
		    positivo++;
		}
		
		printf("Array: ");
		for(int i = 0; i < tamanho; i++)
		    printf("%d ", array[i]);
  printf("\nTotal da soma: %d\n", total);
  printf("Quantidade de positivos: %d\n", positivo);
  system("pause");
}
