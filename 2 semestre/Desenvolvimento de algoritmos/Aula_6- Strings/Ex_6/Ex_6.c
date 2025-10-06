#include <stdio.h>
#include <string.h>

void substituir_primeira_substring(char *str, char *antiga, char *nova, char *resultado) {
    char *pos = strstr(str, antiga); // Encontra a primeira ocorrência de 'antiga'

    if (pos == NULL) {
        // Se não encontrou, apenas copia a string original para o resultado
        strcpy(resultado, str);
        return;
    }

    // Copia a parte antes da substring encontrada
    int prefixo_len = pos - str;
    strncpy(resultado, str, prefixo_len);
    resultado[prefixo_len] = '\0';

    // Adiciona a nova substring
    strcat(resultado, nova);

    // Adiciona o restante da string depois da substring antiga
    strcat(resultado, pos + strlen(antiga));
}

int main() {
    char str[100] = "O gato subiu no telhado do gato";
    char antiga[20] = "gato";
    char nova[20] = "cachorro";
    char resultado[200]; // buffer para armazenar o resultado final

    substituir_primeira_substring(str, antiga, nova, resultado);

    printf("Resultado: %s\n", resultado);

    system("pause");
}
