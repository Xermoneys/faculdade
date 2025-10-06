#include <stdio.h>
#include <string.h>

int main() {
    char str[100] = "Eu gosto de ma��";
    char antiga[] = "ma��";
    char nova[] = "banana";
    char resultado[200]; // garantir espa�o suficiente

    char *pos = strstr(str, antiga);
    if (pos != NULL) {
        int pos_inicio = pos - str;

        // Copia a parte antes da substring encontrada
        strncpy(resultado, str, pos_inicio);
        resultado[pos_inicio] = '\0';

        // Concatena a nova palavra
        strcat(resultado, nova);

        // Concatena o restante da string original ap�s a palavra antiga
        strcat(resultado, str + pos_inicio + strlen(antiga));

        printf("Resultado: %s\n", resultado);
    } else {
        printf("Substring '%s' n�o encontrada.\n", antiga);
    }

    system("pause");
}
