#include <stdio.h>
#include <string.h>

int main() {
    char str[100] = "Eu gosto de maçã";
    char antiga[] = "maçã";
    char nova[] = "banana";
    char resultado[200]; // garantir espaço suficiente

    char *pos = strstr(str, antiga);
    if (pos != NULL) {
        int pos_inicio = pos - str;

        // Copia a parte antes da substring encontrada
        strncpy(resultado, str, pos_inicio);
        resultado[pos_inicio] = '\0';

        // Concatena a nova palavra
        strcat(resultado, nova);

        // Concatena o restante da string original após a palavra antiga
        strcat(resultado, str + pos_inicio + strlen(antiga));

        printf("Resultado: %s\n", resultado);
    } else {
        printf("Substring '%s' não encontrada.\n", antiga);
    }

    system("pause");
}
