#include <stdio.h>
#include <stdlib.h>
typedef struct {
    int topo;
    int quantidade;
    int* vetor;
} Pilha;


Pilha inicializar_pilha(int quantidade){
    Pilha pilha = {0};
    pilha.topo = 0;
    pilha.vetor = malloc(sizeof(int) * quantidade);
    pilha.quantidade = quantidade;
    return pilha;
}

void push(Pilha* pilha, int valor){
    if (pilha->topo > pilha->quantidade){
        return;
    }

    pilha->vetor[pilha->topo] = valor;

    pilha->topo++;
}

int pop(Pilha* pilha){
    if (pilha->topo <= 0){
        return 0;
    }
    int x = pilha->vetor[pilha->topo - 1];
    pilha->topo--;
    return x;
}


int main(void){
    Pilha pilha = inicializar_pilha(128);
    push(&pilha, 10);
    push(&pilha, 20);
    push(&pilha, 30);
    push(&pilha, 40);
    push(&pilha, 50);
    printf("%d\n", pop(&pilha));
    printf("%d\n", pop(&pilha));
    printf("%d\n", pop(&pilha));
    printf("%d\n", pop(&pilha));

    return 0;
}