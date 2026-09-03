#include <stdio.h>
#include <stdlib.h>

typedef struct FilaEstatica{
	int *dados;
    int tamanho;
	int capacidade;
}FilaEstatica;

FilaEstatica* inicializar_array(int capacidade_inicial){
    // aloca o array, inicializa a capacidade inicial, aloca o vetor com os dados
    // e inicializa o tamanho com 0
    FilaEstatica *array = malloc(sizeof(FilaEstatica));
    array->capacidade = capacidade_inicial;
    array->dados = malloc(array->capacidade * sizeof(int));
    if (array->dados == NULL) {
        printf("Erro ao alocar memória para o array.\n");
        exit(1);
    }
    array->tamanho = 0;
    return array;
}

int enfileirar(FilaEstatica *array, int valor){
    if(array->tamanho >= array->capacidade){
        printf("Erro ao inseir %d. Fila esta cheia", valor);
        return 0;
    }
    else{
        array->dados[array->tamanho] = valor;
        array->tamanho++;
        return 1;
    }
}

int desenfileirar(FilaEstatica *array){
    if(array->tamanho == 0){
        printf("Erro. Pilha vazia");
        return -1;
    }

    // remove o valor 0, o primeiro a entrar na fila e realiza
    // o shift dos outros valores comecando em 1
    int valor = array->dados[0];
    for(int i=0; i < array->tamanho; i++){
        array->dados[i] = array->dados[i+1];
    }

    array->tamanho--;
    return valor;
}

int vazia(FilaEstatica *array){
    if(array->tamanho == 0)
        return 1;
    else
        return 0;
}

int busca(FilaEstatica *array, int valor){
    FilaEstatica *auxliar = inicializar_array(array->capacidade);
    int i = -1, encontrado = -1;
    // busca por um valor na fila removendo de uma e colocando em outra filas
    while(vazia(array) != 1){
        int removido = desenfileirar(array);
        enfileirar(auxliar, removido);
        i++;
        if(removido == valor)
            encontrado = i;
    }

    // devolve os valores
    while(vazia(auxliar) != 1){
        int devolver = desenfileirar(auxliar);
        enfileirar(array, devolver);
    }
    
    free(auxliar);
    return encontrado;
}

void imprimir(FilaEstatica *array){
    // imprime os dadso sequencialmente
    printf("\n --- Fila Estatica --- \n");
    FilaEstatica *auxliar = inicializar_array(array->capacidade);
    int i = 0;
    // busca por um valor na fila removendo de uma e colocando em outra filas
    while(vazia(array) != 1){
        int removido = desenfileirar(array);
        printf("%d\n", removido);
        enfileirar(auxliar, removido);
    }

    // devolve os valores
    while(vazia(auxliar) != 1){
        int devolver = desenfileirar(auxliar);
        enfileirar(array, devolver);
    }

    free(auxliar);

}


int main(void){
    FilaEstatica *array = inicializar_array(4);
    enfileirar(array, 2);
    enfileirar(array, 3);
    enfileirar(array, 4);
    imprimir(array);
    printf("Busca por 3: %d\n", busca(array, 3));
    enfileirar(array, 5);
    enfileirar(array, 6);
    imprimir(array);
    printf("Valor removido %d\n", desenfileirar(array));
    printf("Valor removido %d\n", desenfileirar(array));
    printf("Busca por 5: %d\n", busca(array, 5));
    printf("Busca por 2: %d\n", busca(array, 2));
    imprimir(array);
    free(array);
}