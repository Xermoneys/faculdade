#include <stdio.h>
#include <stdlib.h>


// =====================================================
// ESTRUTURA DA CÉLULA
// =====================================================

// Cada elemento da fila será armazenado dentro de uma célula.
//
// Como estamos utilizando uma lista duplamente ligada,
// cada célula possui:
//
// - valor: o número armazenado
// - proximo: aponta para a próxima célula
// - anterior: aponta para a célula anterior

typedef struct Celula {

    int valor;

    // Ponteiro para o próximo elemento da fila
    struct Celula *proximo;

    // Ponteiro para o elemento anterior da fila
    struct Celula *anterior;

} Celula;


// =====================================================
// ESTRUTURA DA FILA
// =====================================================

// A fila possui:
//
// - head: aponta para o PRIMEIRO elemento da fila
// - tail: aponta para o ÚLTIMO elemento da fila
// - qtde: guarda a quantidade de elementos

typedef struct {

    // Primeiro elemento da fila
    Celula *head;

    // Último elemento da fila
    Celula *tail;

    // Quantidade de elementos presentes na fila
    int qtde;

} Queue;


// =====================================================
// FUNÇÃO: cria_celula
// =====================================================

// Cria uma nova célula dinamicamente na memória.
//
// Exemplo:
// cria_celula(10)
//
// Cria:
//
// valor = 10
// proximo = NULL
// anterior = NULL

Celula *cria_celula(int valor){

    // malloc reserva espaço na memória para uma nova célula
    Celula *nova = (Celula *)malloc(sizeof(Celula));

    // Verifica se a memória foi alocada corretamente
    if (nova == NULL){

        printf("Falhou");

        // Encerra o programa caso não seja possível
        // alocar memória
        exit(1);
    }

    // Armazena o valor recebido na célula
    nova->valor = valor;

    // Como a célula acabou de ser criada,
    // inicialmente ela não aponta para nenhuma outra
    nova->proximo = NULL;
    nova->anterior = NULL;

    // Retorna o endereço da nova célula criada
    return nova;
}


// =====================================================
// FUNÇÃO: cria_queue
// =====================================================

// Cria uma fila vazia.
//
// Inicialmente:
//
// head = NULL
// tail = NULL
// qtde = 0

Queue *cria_queue(){

    // Reserva memória para a estrutura da fila
    Queue *queue = (Queue *)malloc(sizeof(Queue));

    // Verifica se a alocação funcionou
    if (queue == NULL){

        printf("Falhou");

        // Encerra o programa caso não seja possível
        // alocar memória
        exit(1);
    }

    // A fila começa vazia,
    // portanto não existe primeiro elemento
    queue->head = NULL;

    // Também não existe último elemento
    queue->tail = NULL;

    // A quantidade inicial de elementos é zero
    queue->qtde = 0;

    // Retorna a fila criada
    return queue;
}


// =====================================================
// FUNÇÃO: enqueue
// =====================================================

// Insere um novo elemento no FINAL da fila.
//
// Uma fila segue o princípio FIFO:
//
// First In, First Out
// Primeiro a entrar, primeiro a sair.
//
// Exemplo:
//
// enqueue(10)
// enqueue(20)
// enqueue(30)
//
// Fila:
//
// HEAD                    TAIL
//  ↓                       ↓
// [10] <-> [20] <-> [30]

void enqueue(Queue *queue, int valor){

    // Verifica se a fila existe
    if(queue == NULL)
        return;

    // Cria uma nova célula contendo o valor recebido
    Celula *nova = cria_celula(valor);


    // -------------------------------------------------
    // CASO 1: A FILA ESTÁ VAZIA
    // -------------------------------------------------

    if(queue->qtde == 0){

        // Como não existe nenhum elemento,
        // a nova célula será ao mesmo tempo:
        //
        // - o primeiro elemento
        // - o último elemento

        queue->head = nova;
        queue->tail = nova;

    }


    // -------------------------------------------------
    // CASO 2: A FILA JÁ POSSUI ELEMENTOS
    // -------------------------------------------------

    else{

        // O antigo último elemento passa a apontar
        // para a nova célula
        //
        // Antes:
        //
        // [10] <-> [20]
        //              ↑
        //             tail
        //
        // Depois:
        //
        // [10] <-> [20] -> [nova]

        queue->tail->proximo = nova;


        // A nova célula aponta de volta
        // para o antigo último elemento
        //
        // [20] <-> [nova]

        nova->anterior = queue->tail;


        // Agora a nova célula passa a ser
        // o último elemento da fila

        queue->tail = nova;
    }


    // Aumenta a quantidade de elementos da fila
    queue->qtde++;
}


// =====================================================
// FUNÇÃO: dequeue
// =====================================================

// Remove e retorna o elemento do INÍCIO da fila.
//
// Como a fila utiliza FIFO:
//
// O primeiro elemento inserido
// será o primeiro elemento removido.
//
// Exemplo:
//
// HEAD
//  ↓
// [10] <-> [20] <-> [30]
//                      ↑
//                     TAIL
//
// Após remover:
//
// [20] <-> [30]

int dequeue(Queue *queue){

    // Verifica se:
    //
    // - a fila não existe
    // OU
    // - a fila está vazia

    if(queue == NULL || queue->qtde == 0){

        printf("Erro: Fila esta vazia");

        // Retorna -1 indicando erro
        return -1;
    }


    // Guarda o endereço do primeiro elemento.
    //
    // Isso é necessário porque vamos precisar
    // liberar sua memória depois.

    Celula *temp = queue->head;


    // Guarda o valor do elemento que será removido.
    //
    // Precisamos guardar antes de liberar
    // a memória da célula.

    int valor_retornado = temp->valor;


    // O head passa para o próximo elemento.
    //
    // Antes:
    //
    // head
    //  ↓
    // [10] -> [20] -> [30]
    //
    // Depois:
    //
    //         head
    //          ↓
    // [10] -> [20] -> [30]
    //
    // O [10] será removido depois.

    queue->head = queue->head->proximo;


    // -------------------------------------------------
    // CASO 1: A FILA FICOU VAZIA
    // -------------------------------------------------

    if(queue->head == NULL){

        // Se não existe mais head,
        // também não pode existir tail.

        queue->tail = NULL;
    }


    // -------------------------------------------------
    // CASO 2: AINDA EXISTEM ELEMENTOS
    // -------------------------------------------------

    else{

        // O novo primeiro elemento não possui
        // nenhum elemento anterior.
        //
        // Portanto:
        //
        // head->anterior = NULL

        queue->head->anterior = NULL;
    }


    // Libera da memória a célula removida
    free(temp);


    // Diminui a quantidade de elementos
    queue->qtde--;


    // Retorna o valor que estava
    // no início da fila
    return valor_retornado;
}


// =====================================================
// FUNÇÃO: show
// =====================================================

// Percorre e exibe todos os elementos da fila.
//
// A navegação acontece utilizando
// o ponteiro "proximo".
//
// Exemplo:
//
// atual
//   ↓
// [10] -> [20] -> [30] -> NULL
//
// O ponteiro atual vai avançando até chegar em NULL.

void show(Queue *queue){

    // Verifica se a fila existe e se possui elementos
    if (queue == NULL || queue->qtde == 0){

        printf("Fila vazia");

        return;
    }


    // Começa a percorrer a partir
    // do primeiro elemento
    Celula *atual = queue->head;


    printf("Fila (inicio ao fim): ");


    // Continua enquanto existir uma célula
    while (atual != NULL){

        // Mostra o valor da célula atual
        printf("[%d] ", atual->valor);


        // Avança para a próxima célula
        atual = atual->proximo;
    }


    // Mostra a quantidade total de elementos
    printf("\nQuantidade de elementos: %d\n\n", queue->qtde);
}


// =====================================================
// FUNÇÃO PRINCIPAL
// =====================================================

int main(void) {


    // Cria uma nova fila vazia
    Queue *queue = cria_queue();


    // Vetor contendo os valores que serão
    // inseridos na fila
    //
    // Eles serão inseridos exatamente
    // nesta ordem.

    int valores[] = {10, 2, 0, 4, 5, 5, 6, 2, 8, 1, 9};


    // Calcula automaticamente a quantidade
    // de elementos presentes no vetor.
    //
    // sizeof(valores)
    // → tamanho total do vetor em bytes
    //
    // sizeof(valores[0])
    // → tamanho de um elemento do vetor
    //
    // Dividindo um pelo outro, obtemos
    // a quantidade de elementos.

    int tamanho = sizeof(valores) / sizeof(valores[0]);


    printf("=== INSERINDO ELEMENTOS ===\n");


    // Percorre o vetor do início ao fim
    for(int i = 0; i < tamanho; i++){


        // Insere o valor atual no final da fila
        enqueue(queue, valores[i]);


        // Mostra qual valor acabou de ser inserido
        printf("Inserido %d: ", valores[i]);


        // Cria um ponteiro para percorrer
        // todos os elementos da fila
        Celula *atual = queue->head;


        // Percorre a fila do início até o final
        while(atual != NULL){

            // Mostra o valor atual
            printf("%d ", atual->valor);


            // Avança para a próxima célula
            atual = atual->proximo;
        }


        // Quebra de linha após mostrar a fila
        printf("\n");
    }


    printf("\n=== REMOVENDO ELEMENTOS ===\n");


    // Continua removendo enquanto
    // existir pelo menos um elemento
    // na fila.

    while(queue->qtde > 0){


        // Remove o primeiro elemento
        // e guarda o valor removido

        int removido = dequeue(queue);


        // Mostra o valor que acabou
        // de ser removido

        printf(
            "Valor removido: %d, Fila restante: ",
            removido
        );


        // Começa novamente no início da fila
        Celula *atual = queue->head;


        // Percorre todos os elementos restantes
        while(atual != NULL){

            // Mostra o valor atual
            printf("%d ", atual->valor);


            // Avança para a próxima célula
            atual = atual->proximo;
        }


        printf("\n");
    }


    // Libera a memória utilizada pela estrutura Queue.
    //
    // As células já foram liberadas durante
    // os dequeues.

    free(queue);


    // Indica que o programa terminou corretamente
    return 0;
}

// O principal para você lembrar ao estudar

// A fila funciona assim:

// ENQUEUE → adiciona no final (tail)

// HEAD                         TAIL
//  ↓                            ↓
// [10] <-> [2] <-> [4] <-> [5]

// E:

// DEQUEUE → remove do início (head)

// HEAD                         TAIL
//  ↓                            ↓
// [10] <-> [2] <-> [4] <-> [5]

// Remove o 10

// HEAD                  TAIL
//  ↓                     ↓
// [2] <-> [4] <-> [5]

// Ou seja:

// head → início da fila, onde ocorre o dequeue.
// tail → final da fila, onde ocorre o enqueue.
// enqueue() → adiciona no tail.
// dequeue() → remove do head.
// qtde → controla quantos elementos existem.
// proximo → permite caminhar para frente.
// anterior → permite caminhar para trás.