#include <stdio.h>
#include <string.h>
#include <ctype.h>

int validar_senha(char *senha) {
    int tem_maiuscula = 0;
    int tem_minuscula = 0;
    int tem_digito = 0;
    int tem_especial = 0;

    // Verifica tamanho
    if (strlen(senha) < 8)
        return 0;

    for (int i = 0; senha[i] != '\0'; i++) {
        if (isupper(senha[i]))
            tem_maiuscula = 1;
        else if (islower(senha[i]))
            tem_minuscula = 1;
        else if (isdigit(senha[i]))
            tem_digito = 1;
        else if (strchr("!@#$%^&*", senha[i]) != NULL)
            tem_especial = 1;
    }

    // Verifica se todos os critérios foram atendidos
    if (tem_maiuscula && tem_minuscula && tem_digito && tem_especial)
        return 1;
    else
        return 0;
}

int main() {
    char senha[100];

    printf("Digite uma senha: ");
    fgets(senha, sizeof(senha), stdin);
    senha[strcspn(senha, "\n")] = '\0'; // remove o \n do fgets

    if (validar_senha(senha))
        printf("Senha válida!\n");
    else
        printf("Senha inválida! Certifique-se de que ela tenha:\n"
               "- Pelo menos 8 caracteres\n"
               "- Uma letra maiuscula\n"
               "- Uma letra minuscula\n"
               "- Um digito\n"
               "- Um caractere especial (!@#$%%^&*)\n");

    system("pause");
}
