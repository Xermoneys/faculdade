#include <stdio.h>

int main(){
	int epar;
	for(int i =0; i < 21; i++){
		if (i % 2 == 0){
			continue;
		}
		else if (i > 15){
			break;
		}
	printf("%d\n", i);
	system("pause");
}
}

