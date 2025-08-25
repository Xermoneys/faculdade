#include <stdio.h>

int main(){
    int ano_atual, ano_vencimento = 0;

    printf("Digite o ano atual: \n");
    scanf("%d",&ano_atual);
    printf("Digite o vencimento do produto: \n");
    scanf("%d",&ano_vencimento);

    if (ano_atual > ano_vencimento){
        printf("O produto esta vencido.");
    }
    else{
        printf("O produto ainda nao venceu.");
    }
}
