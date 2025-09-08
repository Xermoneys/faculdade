// numero.c
int ehpar (int n){
	return (n % 2 == 0);
}
int ehprimo(int n){
	if(n <= 1) return 0; //se o número der negativo ou zero desconsidere
	if(n == 2) return 1; // se o número for 2 considere
	if(n % 2 == 0)return 0; // se o número for divisível por 2 e der resto 0  desconsidere
	
	for(int i = 3; i*i <=n ;i += 2){//perguntar sobre isso pro gpt
		if (n % i == 0)return 0;
	}
	return 1;
}
int fatorial(int n){
	int f = 1;
	for(int i = 1;i <= n; i++)
		f*= i;
	return f;
}
int max(int a, int b){
	if(a>b){
		return a;
	}else{
		return b;
	}
}
int pot(int a, int b){
	int total = a;
	for(int i = 1; i < b;i++)
		total *= a;
	return total;
}

