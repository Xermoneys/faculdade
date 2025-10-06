#include <stdio.h>
#include <ctype.h>  // para isdigit()

int main() {
    char str[] = "1a0bc12def34gh5";
    int numeros[10]; // vetor para armazenar os números encontrados
    int count = 0;
    int i = 0;

    while (str[i] != '\0') {
        if (isdigit(str[i])) {
            int num = 0;
            while (isdigit(str[i])) {
                num = num * 10 + (str[i] - '0'); // converte char para inteiro
                i++;
            }
            numeros[count++] = num; // guarda o número extraído
        } else {
            i++;
        }
    }

    printf("Números encontrados:\n");
    for (int j = 0; j < count; j++) {
        printf("%d\n", numeros[j]);
    }
    printf("Quantidade de numeros encontrados: %d.", count);
    system("pause");
}
