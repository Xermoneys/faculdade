#include <stdio.h>
#include <string.h>

int conta_caracteres(char *str , char a){
	int count = 0;
	while (*str != '\0'){
		if (*str == a){
			count++;
			}
			str++;
		}
  return count;
}
int main(){

	char texto[] = "programacao em c";
	int count = conta_caracteres(texto, 'a');
 	printf("A quantidade de caracteres sera: %d\n", count);
	system("pause");
}
