#include <stdio.h>
#include <string.h>
int main(){
 int dia, mes, ano;
 char str[11] = "01/10/2022";
 printf("%s\n", str);
 sscanf(str, "%02d/%02d/%04d", &dia, &mes, &ano);
 printf("%d %d %d\n", dia, mes, ano);
 system("pause");
}
