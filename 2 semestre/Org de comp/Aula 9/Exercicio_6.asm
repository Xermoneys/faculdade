;Solução 1
MOV 30h, #0
MOV 31h, #0
MOV 32h, #0
MOV 33h, #0
MOV 34h, #0
MOV 35h, #0
MOV 36h, #0
MOV 37h, #0
MOV 38h, #0

;Solução 2

CLR A
MOV R0, #30h
ROT:
MOV @R0, A
INC R0
CJNE R0, #39h, ROT

;Solução 3
CLR A
MOV 30h, A
MOV 31h, A
MOV 32h, A
MOV 33h, A
MOV 34h, A
MOV 35h, A
MOV 36h, A
MOV 37h, A
MOV 38h, A