#include <stdio.h>
#include <ctype.h>
#include <string.h>

int senha_valida(const char *senha) {
    int tem_maiuscula = 0, tem_minuscula = 0;
    int tem_digito = 0, tem_especial = 0;

    for (int i = 0; senha[i] != '\0'; i++) {
        if (isupper(senha[i])) tem_maiuscula = 1;
        else if (islower(senha[i])) tem_minuscula = 1;
        else if (isdigit(senha[i])) tem_digito = 1;
        else if (strchr("!@#$%^&*", senha[i])) tem_especial = 1;
    }

    return tem_maiuscula && tem_minuscula && tem_digito && tem_especial;
}

int main() {
    char senha[50];
    printf("Digite uma senha: ");
    scanf("%49s", senha);

    if (senha_valida(senha))
        printf("Senha forte!\n");
    else
        printf("Senha fraca. Deve conter maiúscula, minúscula, número e caractere especial.\n");

    system("pause");
}
