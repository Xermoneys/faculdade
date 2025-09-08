#include <stdio.h>

int main(){
int a,b;
char operador;
int soma , subtracao, multiplicacao, divisao;

printf("Digite o primeiro valor:");
scanf("%d", &a);

printf("Digite o segundo valor:");
scanf("%d", &b);

printf("Digite o operador (+)(-)(*)(/): ");
scanf(" %c", &operador);

soma = (a + b);
subtracao = (a - b);

if(b != 0){
        divisao = (a / b);
    } else {
        divisao = 0;
    }

switch(operador){
	case '+':
		printf("%d\n",soma);
		break;
	case '-':
		printf("%d\n",subtracao);
		break;
	case '*':
		printf("%d\n",multiplicacao);
		break;
	case '/':
		printf("%d\n", divisao);
		break;
	default:
		printf("Vagabundo \n");
}
system("pause");
}
