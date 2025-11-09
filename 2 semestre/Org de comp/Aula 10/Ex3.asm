org 0000h
LJMP START ;Pula incondicionalmente para START
org 0003h
INT_EXT0:
CPL P1.0 ;complementa P1.0
RETI ;Retorna da interrupção
org 0013h
INT_EXT1:
CPL P1.7 ;complementa P1.7
RETI ;Retorna da interrupção
org 0080h
START:
SETB EA ;Habilita as interrupções
SETB EX0 ;Habilita a interrupção 0
SETB EX1 ;Habilita a interrupção 1
SETB IT0 ;Trabalhando com borda de descida
SETB IT1 ;Trabalhando com borda de descida
SJMP $ ;Laço de repetição
