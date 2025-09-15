#include <stdio.h>

int main(){
	int n;
	printf("Digite o valor de N: ");
	scanf("%d",&n);
	
	int soma_for = 0;
	for (int i = 0 ; i < n; i++)
	    soma_for += i;
	printf("Total sera: %d\n", soma_for);
	
	int soma_while = 0;
	int i = 0;
	while(i < n)
	    soma_while += i++;
	printf("Total sera: %d\n", soma_while);
	system("pause");
	//a do while fica mais legivel pois é menos logicas para fazer funcionar
	// o while é mais simples de se usar dependendo se o código não precisa de tanta logica, enquanto o for é mais pratico para logicas mais extensas
}
