#include <stdio.h>

int main(){
    int hora, minuto ,segundo , segundos_passados = 0;

    printf("Qual a hora atual: \n");
    scanf("%d", &hora);
    printf("Se passaram quantos minutos: \n");
    scanf("%d", &minuto);
    printf("Quantos segundos passaram: \n");
    scanf("%d",&segundo);

    segundos_passados = (hora * 3600) + (minuto*60) + segundo;

    printf("Passou %d segundos", segundos_passados);
}