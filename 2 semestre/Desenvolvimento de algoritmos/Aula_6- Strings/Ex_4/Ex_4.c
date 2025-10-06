#include <stdio.h>
#include <string.h>
#include <ctype.h>

void formatar_nome(char *nome) {
    int i = 0, j = 0;
    int nova_palavra = 1; // indica se o próximo caractere é o início de uma nova palavra

    // Remove espaços extras e ajusta letras
    while (nome[i] != '\0') {
        if (!isspace(nome[i])) {
            // Se for início de nova palavra ? maiúscula
            if (nova_palavra) {
                nome[j++] = toupper(nome[i]);
                nova_palavra = 0;
            }
            // Caso contrário ? minúscula
            else {
                nome[j++] = tolower(nome[i]);
            }
        }
        else {
            // Se o caractere anterior não era espaço, adiciona um espaço
            if (j > 0 && nome[j - 1] != ' ') {
                nome[j++] = ' ';
            }
            nova_palavra = 1;
        }
        i++;
    }

    // Remove espaço final se houver
    if (j > 0 && nome[j - 1] == ' ')
        j--;

    nome[j] = '\0'; // finaliza a string
}

int main() {
    char nome[100];

    printf("Digite o nome: ");
    fgets(nome, sizeof(nome), stdin);
    nome[strcspn(nome, "\n")] = '\0'; // remove o \n do fgets

    formatar_nome(nome);

    printf("Nome formatado: %s\n", nome);
    system("pause");
}
