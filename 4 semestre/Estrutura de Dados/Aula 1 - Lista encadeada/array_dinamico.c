#include <stdio.h>
#include <stdlib.h>

typedef struct ArrayDinamico{
	int *dados;
    int tamanho;
	int capacidade;
}ArrayDinamico;

ArrayDinamico* inicializar_array(int capacidade_inicial){
    // aloca o array, inicializa a capacidade inicial, aloca o vetor com os dados
    // e inicializa o tamanho com 0
    ArrayDinamico *array = malloc(sizeof(ArrayDinamico));
    array->capacidade = capacidade_inicial;
    array->dados = malloc(array->capacidade * sizeof(int));
    if (array->dados == NULL) {
        printf("Erro ao alocar memória para o array.\n");
        exit(1);
    }
    array->tamanho = 0;
    return array;
}

void inserir(ArrayDinamico *array, int valor){
    // se o tamanho do array estiver igual a capacidade, aumenta a capacidade
    // e depois insere o dado normalmente
    if(array->tamanho >= array->capacidade){
        printf("Aumentando a capacidade do array\n");
        array->capacidade *= 2;
        int *temp = realloc(array->dados, array->capacidade * sizeof(int));
        array->dados = temp;
    }
    array->dados[array->tamanho] = valor;
    array->tamanho++;
}

void imprimir(ArrayDinamico *array){
    // imprime os dadso sequencialmente
    printf("--- Array Dinamico --- \n");
    for(int i = 0; i < array->tamanho; i++){
        if(i < array->tamanho){
            printf("%d\n", array->dados[i]);
        }
    }
}

int busca(ArrayDinamico *array, int valor){
    // busca por um valor no array sequencialmente
    for(int i = 0; i < array->tamanho; i++){
        if(array->dados[i] == valor){
            return i;
        }
    }
    
    return -1;
}

void remover(ArrayDinamico *array, int valor){
    // remove um valor no array: primeiro busca e depois realiza um shift
    int pos = busca(array, valor);

    if(pos != -1){
        for(int i = pos; i < array->tamanho; i++){
            array->dados[i] = array->dados[i+1];
        }
        array->tamanho -= 1;
    }
}

int main(void){
    ArrayDinamico *array = inicializar_array(4);
    inserir(array, 2);
    inserir(array, 3);
    inserir(array, 4);
    imprimir(array);
    inserir(array, 5);
    inserir(array, 6);
    imprimir(array);
    remover(array, 2);
    remover(array, 6);
    imprimir(array);
}