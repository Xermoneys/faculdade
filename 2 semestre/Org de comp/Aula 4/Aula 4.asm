ORG 0000H
MOV A, #10011111B
ANL A,#10H

MOV 20H,#0FFH
ANL 20H,#00H

ORL A,#10H
ORL 20H, #OAH

XRL A, #10H

CLR A ;limpa os valores de A
 
CPL A ;

RL A

RLC A

RR A

RRC A

SWAP A

ANL C, P0.1 ;P0 são os pinos de saida