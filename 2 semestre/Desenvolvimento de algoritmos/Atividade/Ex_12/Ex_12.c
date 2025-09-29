#include <stdio.h>

int main(){
	int numero;
	int soma_par = 0;
	int soma_impar = 0;
	int maior_valor;
 for(int i = 1; i < 6; i++){
		printf("Digite o %d numero: ", i);
		scanf("%d", &numero);
		maior_valor = numero;
		if (numero % 2 == 0){
			soma_par+= numero;
	}
		else if (numero % 2 == 1){
			soma_impar+= numero;
	}   else if (numero > maior_valor){
			maior_valor = numero;
}
 }
    
 
	printf("Soma dos pares: %d\n", soma_par);
	printf("Soma dos impares: %d\n", soma_impar);
	printf("Maior valor lido: %d\n", maior_valor);
	system("pause");
}
