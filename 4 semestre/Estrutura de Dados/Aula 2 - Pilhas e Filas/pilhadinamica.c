#include <stdio.h>
#include <stdlib.h>

typedef struct Celula Celula;

struct Celula {
    int valor;
    Celula* proximo;
};


typedef struct {
    Celula* topo;
    int quantidade;
} Pilha;

Pilha inicializar_pilha(){
    Pilha pilha;
    pilha.quantidade = 0;
    pilha.topo = NULL;
    return pilha;
}


void push(Pilha* pilha, int valor){
    Celula* novo = malloc(sizeof(Celula));
    novo->valor = valor;

    novo->proximo = pilha->topo;
    pilha->topo = novo;

    pilha->quantidade++;
}


int pop(Pilha* pilha){
    if (pilha->topo == NULL){
        printf("Underflow\n");
        exit(1);
    }

    Celula* tmp = pilha->topo;
    int valor = tmp->valor;
    pilha->topo = tmp->proximo;
    free(tmp);

    return valor;
}

int busca(Pilha* pilha, int valor){
    Pilha aux = inicializar_pilha();
    int encontrou = 0;
    while (pilha->topo != NULL){
        int removido = pop(pilha);
        push(&aux, removido);
        if (removido == valor){
            encontrou = 1; 
            break;
        }
    }
    int retorno;
    while(aux.topo != NULL){
        retorno = pop(&aux);
        push(pilha, retorno);
    }

    return encontrou;
}




int main(void){
    Pilha pilha = inicializar_pilha();
    push(&pilha, 10);
    push(&pilha, 20);
    push(&pilha, 30);
    push(&pilha, 40);

    printf("%d\n", pop(&pilha));
    printf("%d\n", pop(&pilha));
    printf("%d\n", pop(&pilha));
    printf("%d\n", pop(&pilha));
    return 1;
}