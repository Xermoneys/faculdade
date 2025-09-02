//calculadora.c

int par(int n){
	return n % 2 == 0;
}
int primo(int n){
	if (n > 3)
		for(int i = 2; i < n; i++)
			if (n % i == 0)
				return 0;
				
	return 1;
}

int fatorial(int n){
	int f = 1;
	for(int i = 1; i <= n; i++)
		f*= i;
	return f;
}
int max(int a,int b){
	if (a>b)
		return a;
	else
		return b;
}
int pot(int a,int b){
	int total = a;
	for(int i = 1; i < b; i++)
		total *= a;
	return total;
}

