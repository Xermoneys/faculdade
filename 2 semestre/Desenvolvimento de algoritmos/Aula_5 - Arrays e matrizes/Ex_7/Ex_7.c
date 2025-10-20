#include <stdio.h>

int main(){
	int linhas = 4, coluna = 4;
	int m[linhas][coluna];
	int soma_linha = 0;
	int soma_coluna = 0;
	for (int i =0; i < linhas; i++)
	    for(int c=0; c<coluna; c++){
			printf("Entre com o valor para a posicao %dx%d: ", i+1,c+1);
			scanf("%d", &m[i][c]);
		}
	printf("Matriz completa: \n");
	for(int i=0;i<linhas;i++){
		for (int c = 0; c < coluna; c++){
			
			printf("%4d", m[i][c]);
		}
		printf("\n");
}
	for(int i = 0 ; i < linhas; i++){
		int total = 0;
		for(int c = 0; c<coluna; c++){
			total += m[i][c];
			}
			printf("Total linha %d: %d\n", i+1 ,total);
		}
	for(int c = 0 ; c < coluna; c++){
		int total = 0;
		for(int i = 0; i < linhas; i++){
			total += m[i][c];
			}
			printf("Total coluna %d: %d\n", c+1 ,total);
		}
		system("pause");
}
