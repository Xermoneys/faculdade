#include <stdio.h>

int main() {
    char str[] = "Ola mundo  C!";
    int write_pos = 0;

    for (int read_pos = 0; str[read_pos] != '\0'; read_pos++) {
        if (str[read_pos] != ' ') { // condi��o: manter se n�o for espa�o
            str[write_pos++] = str[read_pos];
        }
    }

    str[write_pos] = '\0'; // encerra string
    printf("String sem espa�os: %s\n", str);

    system("pause");
}
