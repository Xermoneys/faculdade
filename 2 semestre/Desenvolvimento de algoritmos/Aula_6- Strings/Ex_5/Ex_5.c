#include <stdio.h>
#include <ctype.h> // para isdigit()
#include <stdlib.h> // para atoi()

int extrair_numeros(char *str, int numeros[]) {
    int i = 0, j = 0;
    char temp[20]; // buffer tempor�rio para formar cada n�mero
    int count = 0;

    while (str[i] != '\0') {
        // Se encontrar um d�gito, come�a a formar um n�mero
        if (isdigit(str[i])) {
            j = 0;
            while (isdigit(str[i])) {
                temp[j++] = str[i++];
            }
            temp[j] = '\0'; // finaliza a string do n�mero

            // Converte e armazena no array
            numeros[count++] = atoi(temp);
        } else {
            i++;
        }
    }

    return count; // retorna quantos n�meros foram encontrados
}

int main() {
    char texto[200];
    int numeros[50]; // array para armazenar os n�meros encontrados

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
