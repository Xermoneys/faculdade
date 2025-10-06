#include <stdio.h>
#include <string.h>
#include <ctype.h>

char nome[] = "arara";

int eh_palindromo(char *str);

int main(){
		if (eh_palindromo(nome) == 1){
			printf("Eh palindromo\n");
			system("pause");
		}else{
			printf("Nao e palindromo\n");
			system("pause");
		}

}
int eh_palindromo(char *str){
	int i = 0;
		int j = strlen(str) - 1;
		    
		while (i < j){
			while (i < j && str[i] == ' ')i++;
			while (i < j && str[j] == ' ')j--;
				 
			if(tolower(str[i]) != tolower (str[j])){
				return 0;
				}
				i++;
				j--;
		}
		return 1;
}
