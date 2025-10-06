#include <stdio.h>
#include <string.h>

int main() {
    char str[100]; // espaço para armazenar a string

    printf("Digite uma string: ");
    fgets(str, sizeof(str), stdin);

    // Remove o '\n' que o fgets adiciona
    str[strcspn(str, "\n")] = '\0';

    char *inicio = str;
    char *fim = str + strlen(str) - 1;

    while (inicio < fim) {
        char temp = *inicio;
        *inicio = *fim;
        *fim = temp;
        inicio++;
        fim--;
    }

    printf("String invertida: %s\n", str);

    system("pause");
    return 0;
}
