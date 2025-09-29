#include <stdio.h>

int main(){
	int linhas = 3, coluna = 3;
	int m[linhas][coluna];
	for (int i =0; i < linhas; i++)
	    for(int c=0; c<coluna; c++){
			printf("Entre com o valor para a posicao %dx%d: ", i+1,c+1);
			scanf("%d", &m[i][c]);
		}
		
	for(int i = 0 ; i < linhas; i++){
		for(int c = 0; c<coluna; c++){
			printf("%2d", m[i][c]);
			}
			printf("\n");
		}
		system("pause");
}
