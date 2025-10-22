delay:
MOV R0, #84 ;1
rot1:
mov r1, #58 ;1
rot2:
djnz r1, rot2 ; 2*R1
djnz R0, rot1 ; (1+2*R1+2) *R0
nop ;1
ret ;2