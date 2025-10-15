#include <stdio.h>
#include <math.h>
#include <stdint.h>
#include <string.h>
#include <stdlib.h>

// Função para converter número decimal em binário IEEE 754 (32 bits)
void decimal_to_ieee(float num)
{
    union {
        float f;
        uint32_t i;
    } u;

    u.f = num;

    printf("\n[Decimal | IEEE 754]\n");
    printf("Valor decimal: %.0f\n", num);
    printf("IEEE 754 (32 bits): ");

    for (int i = 31; i >= 0; i--)
    {
        printf("%d", (u.i >> i) & 1);
        if (i == 31 || i == 23) printf(" "); // separa sinal, expoente e fração
    }
    printf("\n\n");
}

int main()
{
    int opcao;
    float num;

    do {
        printf("1 - Converter DECIMAL para BINARIO\n");
        printf("2 - Sair\n");dv
        printf("Escolha uma opcao: ");
        scanf("%d", &opcao);

        if (opcao == 1)
        {
            printf("Digite o numero em base 10: ");
            scanf("%f", &num);
            decimal_to_ieee(num);
            system("pause");
        }
        else if (opcao == 2)
        {
            printf("Encerrando o programa...\n");
            system("pause");
        }
        else
        {
            printf("Opcao invalida.\n");
            system("pause");
        }

    } while (opcao != 2);

    return 0;
}
