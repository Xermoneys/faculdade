	ORG 0000H
	LJMP Inicio ;Salto para inicio

	ORG 0050H
Inicio:
	PUSH 01H
	PUSH PSW
	PUSH 00H
	PUSH ACC

	MOV R0, #55H ;Endereço inicial do array
	MOV R0, #20H ;Endereço inicial do array
	MOV R1, #11 ;Numero de elemento do vetor
	ACALL Vetor
	
	POP ACC 	;Guardando o conteudo dos registradores na pilha
	POP 00H
	POP PSW
	POP 01H		;Salvando o conteudo
	
	SJMP $
Vetor: 
	MOV R0, #20H ;Endereço inicial do array
	MOV A,#0FFH ;Valor a ser escrito no vetor
	MOV R1, #11 ;Numero de elemento do vetor
Array: 
	MOV @R0,A ;Escreve no elemento atual do vetor
	INC R0 ;Incrementa ponteiro de escrita no vetor
	DJNZ R1, Array ;Verifica se terminou de escrever no vetor
	RET
