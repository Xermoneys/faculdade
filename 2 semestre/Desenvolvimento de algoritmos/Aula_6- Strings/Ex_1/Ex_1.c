#include <stdio.h>
#include <string.h>

int conta_caracteres(char *str , char c){
	int count = 0;
	while (*str != '\0'){
		if (*str == c){
			count++;
			}
			str++;
		}
  return count;
}
int main(){

	char texto[] = "programacao em c";
	int count = conta_caracteres(texto, 'c');
 	printf("A quantidade de caracteres sera: %d", count);
	system("pause");
}
