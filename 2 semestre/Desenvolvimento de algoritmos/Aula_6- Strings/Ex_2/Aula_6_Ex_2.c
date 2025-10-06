#include <stdio.h>
#include <string.h>

void inverte_string(char *str){
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
}

int main() {
    char str[100]; 
    printf("Entrada: ");
    fgets(str, sizeof(str), stdin);
    inverte_string(str);
    printf("Saida: %s\n", str);
    system("pause");
    return 0;
}
