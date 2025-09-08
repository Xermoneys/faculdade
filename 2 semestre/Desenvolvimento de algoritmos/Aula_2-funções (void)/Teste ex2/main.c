#include <stdio.h>
#include "numero.h"

int main(){
	int a ,b = 0;
	
	printf("Digite um numero inteiro: ");
	scanf("%d", &a);
	printf("Digite outro numero inteiro: ");
	scanf("%d", &b);
	printf("Numeros digitados: %d | %d\n", a,b);
	if (ehpar(a)){
		printf("%d e par.\n", a);
	}else{
		printf("%d numero e impar.\n", a);
	}
		if (ehpar(b)){
		printf("%d e par.\n", b);
	}else{
		printf("%d numero e impar.\n", b);
	}
	printf("fatorial de %d: %d\n", a, fatorial(a));
	printf("fatorial de %d: %d\n", b, fatorial(b));
    printf("maior entre %d e %d: %d\n", a, b, max(a, b));
    printf("%d elevado a %d = %d\n", a, 3, pot(a, 3));
    printf("%d elevado a %d = %d\n", b, 3, pot(b, 3));
	system("pause");
}
