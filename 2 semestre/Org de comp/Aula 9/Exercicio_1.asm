;Subrotina para zerar a RAM interna
;RETORNA: posições de 0 a 127 da RAM interna zeradas
; USA: A e R0

ZERAR: 
CLR A 		;A = 0, valor a ser escrito
MOV R0, #127    ;R0 = endereço mais alto
ROT:
MOV @R0,A      ;zera posição apontada por RO
DJNZ R0, ROT    ;decrementa ponteiro e contador
RET             ;retorna da subrotina





