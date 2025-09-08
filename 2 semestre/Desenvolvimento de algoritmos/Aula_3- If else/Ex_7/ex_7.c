#include <stdio.h>
#include <string.h>


int main(){
 	char usuario[]= "admin";
 	char senha[]= "123456";
 	
 	char login[20], pin[20];
 	printf("Digite seu login: \n");
 	scanf("%s",&login);
 	
 	printf("Digite sua senha: \n");
 	scanf("%s",&pin);

	if (strcmp(usuario, login)==0 && strcmp(senha,pin)==0){
		printf("Logado com sucesso.\n");
}   else if (strcmp(usuario, login)!=0 && strcmp(senha,pin)==0){
		printf("Usuario incorreto.\n");
}   else if (strcmp(usuario, login)==0 && strcmp(senha,pin)!=0){
		printf("Senha incorreta.\n");
}	else{
	printf("Ambos incorretos.");
 }
 system("pause");
 return 0;
}
