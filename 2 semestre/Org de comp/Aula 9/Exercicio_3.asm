delay:
MOV R7, #140 ;1
rot500:
DJNZ R7, rot500 ; 2*R7
RET ;2

