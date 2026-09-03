#include <stdio.h>
#include <stdlib.h>

typedef struct Celula{
	struct Celula *anterior;
	struct Celula *proximo;
	int valor;
}Celula;

typedef struct LDDE{
	Celula *primeiro;
	int qtde;
}LDDE;

LDDE *inicializa_lista(){
	LDDE *lista = malloc(sizeof(LDDE));
	lista->primeiro = NULL;
	lista->qtde = 0;
	return lista;
}

Celula *inicializa_celula(int valor){
	Celula *celula = malloc(sizeof(Celula));
	celula->anterior = NULL;
	celula->proximo = NULL;
	celula->valor = valor;
	return celula;
}

void inserir(LDDE *lista, int valor) {
    Celula *celula = inicializa_celula(valor);
    Celula *atual = lista->primeiro; //começar a partir da primeira celular
    
    Celula* ant = NULL; //
    while (atual != NULL && valor >= atual->valor){
        ant = atual;
        atual = atual->proximo;
    }

    celula->anterior = ant;
    celula->proximo = atual;
    if (ant != NULL){
        ant->proximo = celula;
    }else{
        lista->primeiro = celula;
    }

    if (atual != NULL){
        atual->anterior = celula;
    }
    lista->qtde++;
}


void imprimir_crescente(LDDE *lista){
	Celula *atual = lista->primeiro;
	while(atual != NULL){
		printf("%d ", atual->valor);
		atual = atual->proximo;
	}
	printf("\n");
}

void imprimir_decrescente(LDDE *lista){
	Celula *atual = lista->primeiro;
	Celula *anterior = NULL;
	while(atual != NULL){
		anterior = atual;
		atual = atual->proximo;
	}
	atual = anterior;
	while(atual != NULL){
		printf("%d ", atual->valor);
		atual = atual->anterior;
	}
	printf("\n");
}

Celula *buscar(LDDE *lista, int valor){
	Celula *atual = lista->primeiro;
	while(atual != NULL && atual->valor != valor){
		atual = atual->proximo;
	}
	return atual;
}

void remover(LDDE *lista, int valor) {
    Celula* atual = lista->primeiro; //comece procurando a partir do 1 da lista

    while (atual != NULL && atual->valor != valor){//laço para procurar a céula que é pra ser removida
        atual = atual->proximo;//ir para o próximo número da lista
    }

    if (atual != NULL){ //pode ser um valor que não esta na lista
        if (atual->anterior != NULL){//verificar se existe uma celula anterior
            atual->anterior->proximo = atual->proximo; //se existir pegue o próximo da celula anterior = pegue o próximo do atual
        } else {
            lista->primeiro = atual->proximo;
        }
        
        if (atual->proximo != NULL){
            atual->proximo->anterior = atual->anterior;
        }
        free(atual);
    }

    lista->qtde -= 1;
}


int main(void) {
  LDDE *lista = inicializa_lista();
	int in[] = {2, 3, 9, 6, 7, 4, 1, 8, 0, 5};
	int out[] = {0, 9, 1, 8, 5, 5, 6, 2, 3, 4, 7};
	int len_in = sizeof(in) / sizeof(int);
	int len_out = sizeof(out) / sizeof(int);
	for(int i = 0; i < len_in; i ++){
		inserir(lista, in[i]);
		imprimir_crescente(lista);
		imprimir_decrescente(lista);
	}
	for(int j = 0; j < len_out; j++){
		remover(lista, out[j]);
		imprimir_crescente(lista);
		imprimir_decrescente(lista);
	}
  return 0;
}