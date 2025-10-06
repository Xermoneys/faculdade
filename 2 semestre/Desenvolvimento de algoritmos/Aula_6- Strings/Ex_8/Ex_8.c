#include <stdio.h>
#include <string.h>
#include <ctype.h>

void compactar_espacos(char *str) {
    int i = 0, j = 0;

    // 1?? Ignora espaços iniciais
    while (isspace(str[i])) {
        i++;
    }

    // 2?? Copia caracteres, eliminando espaços duplicados
    int espaco = 0;
    while (str[i] != '\0') {
        if (!isspace(str[i])) {
            str[j++] = str[i];
            espaco = 0; // reset: não estamos em espaço
        } else {
            if (!espaco) { // só adiciona um espaço se for o primeiro
                str[j++] = ' ';
                espaco = 1;
            }
        }
        i++;
    }

    // 3?? Remove espaço final, se existir
    if (j > 0 && str[j - 1] == ' ')
        j--;

    // 4?? Finaliza string
    str[j] = '\0';
}

int main() {
    char texto[100];

    printf("Digite uma frase: ");
    fgets(texto, sizeof(texto), stdin);
    texto[strcspn(texto, "\n")] = '\0'; // remove o \n do fgets

    compactar_espacos(texto);

    printf("Frase compactada: \"%s\"\n", texto);
    system("pause");
}
