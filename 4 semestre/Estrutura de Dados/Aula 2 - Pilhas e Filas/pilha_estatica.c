#include <stdio.h>
#include <stdlib.h>

typedef struct PilhaEstatica{
	int *dados;
    int tamanho;
	int capacidade;
}PilhaEstatica;

PilhaEstatica* inicializar_array(int capacidade_inicial){
    // aloca o array, inicializa a capacidade inicial, aloca o vetor com os dados
    // e inicializa o tamanho com 0
    PilhaEstatica *array = malloc(sizeof(PilhaEstatica));
    array->capacidade = capacidade_inicial;
    array->dados = malloc(array->capacidade * sizeof(int));
    if (array->dados == NULL) {
        printf("Erro ao alocar memória para o array.\n");
        exit(1);
    }
    array->tamanho = 0;
    return array;
}


int topo(PilhaEstatica *array){
    return array->dados[array->tamanho-1];
}

int vazia(PilhaEstatica *array){
    if(array->tamanho == 0)
        return 1;
    else
        return 0;
}

int push(PilhaEstatica *array, int valor){
    if(array->tamanho >= array->capacidade){
        printf("Erro ao inseir %d. Pilha esta cheia", valor);
        return 0;
    }
    else{
        array->dados[array->tamanho] = valor;
        array->tamanho++;
        return 1;
    }
}

int pop(PilhaEstatica *array){
    if(array->tamanho == 0){
        printf("Erro. Pilha vazia");
        return -1;
    }

    int valor = array->dados[array->tamanho-1];
    array->tamanho--;
    return valor;
}

int busca(PilhaEstatica *array, int valor){
    PilhaEstatica *auxiliar = inicializar_array(array->capacidade); 
    // busca por um valor na pilha sequencialmente
    int i = array->tamanho-1;
    while(vazia(array) != 1){
        // tira da pilha principal e coloca na auxiliar
        int removido = pop(array);
        push(auxiliar, removido);
        // se encontrei entao paro a execucao, incrementa i depois do break para representar o indice
        if(removido == valor)
            break;
        i--; 
    }

    // remove todos os elementos da auxiliar e os coloca na principal
    while (vazia(auxiliar) != 1){
        int devolver = pop(auxiliar);
        push(array, devolver);
    }
    
    free(auxiliar);
    return i;
}

void imprimir(PilhaEstatica *array){
    PilhaEstatica *auxiliar = inicializar_array(array->capacidade); 
    // imprime os dadso sequencialmente
    printf("\n --- Pilha Estatica --- \n");

    while(vazia(array) != 1){
        // tira da pilha principal e coloca na auxiliar
        int removido = pop(array);
        printf("%d\n", removido);
        push(auxiliar, removido);
    }

    // remove todos os elementos da auxiliar e os coloca na principal
    while (vazia(auxiliar) != 1){
        int devolver = pop(auxiliar);
        push(array, devolver);
    }

    free(auxiliar);
}

int main(void){
    PilhaEstatica *array = inicializar_array(4);
    push(array, 2);
    push(array, 3);
    push(array, 4);
    imprimir(array);
    push(array, 5);
    push(array, 6);
    imprimir(array);
    printf("Busca por 3: %d\n", busca(array, 3));
    printf("Topo: %d \n", topo(array));
    printf("Valor removido %d\n", pop(array));
    printf("Valor removido %d\n", pop(array));
    printf("Busca por 5: %d\n", busca(array, 5));
    imprimir(array);
    free(array);
}