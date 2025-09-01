#include <stdio.h>
#include <math.h>

int main (){
    float nota_lab , soma_lab = 0;
    float nota_projeto , nota_prova , nota_total, media_lab = 0;

    for(int i = 1; i <= 3; i++) {
        printf("Digite a nota do %d laboratorio: \n", i);
        scanf("%f", &nota_lab);
        soma_lab += nota_lab;
    }
    printf("Digite a nota do projeto: \n");
    scanf("%f", &nota_projeto);
    printf("Digite a nota da prova: \n");
    scanf("%f", &nota_prova);
    nota_total = (soma_lab/3)*0.2 + sqrt(nota_projeto * nota_prova)*0.8;
    printf("A nota final e %.2f\n", nota_total);
    system("pause");
    return 0;
}
