#include <stdio.h>
#include <ctype.h> // para isdigit()
#include <stdlib.h> // para atoi()

int extrair_numeros(char *str, int numeros[]) {
    int i = 0, j = 0;
    char temp[20]; // buffer temporário para formar cada número
    int count = 0;

    while (str[i] != '\0') {
        // Se encontrar um dígito, começa a formar um número
        if (isdigit(str[i])) {
            j = 0;
            while (isdigit(str[i])) {
                temp[j++] = str[i++];
            }
            temp[j] = '\0'; // finaliza a string do número

            // Converte e armazena no array
            numeros[count++] = atoi(temp);
        } else {
            i++;
        }
    }

    return count; // retorna quantos números foram encontrados
}

int main() {
    char texto[200];
    int numeros[50]; // array para armazenar os números encontrados

    printf("Digite uma frase: ");
    fgets(texto, sizeof(texto), stdin);

    int qtd = extrair_numeros(texto, numeros);

    printf("Foram encontrados %d numeros:\n", qtd);
    for (int i = 0; i < qtd; i++) {
        printf("%d ", numeros[i]);
    }
    printf("\n");

    system("pause");
}
