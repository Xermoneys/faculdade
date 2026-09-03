#include <stdio.h>
#include <stdlib.h>
typedef struct Celula Celula;

struct Celula {
    int valor;
    Celula* anterior;
    Celula* proximo;
};

typedef struct {
    Celula* primeiro;
    int tamanho;
} ListaDupla;

ListaDupla inicializar_lista(){
    ListaDupla listadupla;
    listadupla.primeiro = NULL;
    listadupla.tamanho = 0;
    return listadupla;
}

Celula* inicializar_celula(int valor){
    Celula* celula = malloc(sizeof(Celula));
    if (celula == NULL){
        printf("Erro ao alocar memoria\n");
        exit(1);
    }
    celula->proximo = NULL;
    celula->anterior = NULL;
    celula->valor = valor;
    return celula;
}


void inserir(ListaDupla* lista, int valor){
    Celula* celula = inicializar_celula(valor);
    Celula* atual = lista->primeiro;

    Celula* ant = NULL;
    while (atual != NULL && valor >= atual->valor){
        ant = atual;
        atual = atual->proximo;
    }


    celula->anterior = ant;
    celula->proximo = atual;
    if (ant != NULL){
        ant->proximo = celula;
    } else {
        lista->primeiro = celula;
    }

    if (atual != NULL){
        atual->anterior = celula;
    }

    lista->tamanho++;
}

int busca(ListaDupla lista, int valor){
    Celula* atual = lista.primeiro;

    while(atual != NULL && atual->valor != valor){
        atual = atual->proximo;
    }

    return atual != NULL;
}

void remover(ListaDupla* lista, int valor){
    Celula* atual = lista->primeiro;

    while (atual != NULL && atual->valor != valor){
        atual = atual->proximo;
    }

    if (atual != NULL){
        if (atual->anterior != NULL){
            atual->anterior->proximo = atual->proximo;
        } else {
            lista->primeiro = atual->proximo;
        }
        
        if (atual->proximo != NULL){
            atual->proximo->anterior = atual->anterior;
        }
        free(atual);
    }

    lista->tamanho -= 1;
}



void imprimir(ListaDupla lista){
    Celula* atual = lista.primeiro;
    int pos = 0;
    while (atual != NULL){
        printf("[%d] = %d\n", pos, atual->valor);
        atual = atual->proximo;
        pos++;
    }
}


int main(void){
    ListaDupla lista = inicializar_lista();
    inserir(&lista, 10);
    inserir(&lista, 20);
    inserir(&lista, 15);

    remover(&lista, 20);

    imprimir(lista);

    
    return 0;
}