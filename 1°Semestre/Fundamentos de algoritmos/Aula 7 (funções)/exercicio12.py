# Exercício 12
# Escreva uma função que calcula o quociente e o resto da
# divisão inteira entre dois números. Utilize apenas as
# operações de soma e subtração para calcular o resultado.
# Dica: utilize uma estrutura de repetição para isso.
# Faça um programa principal que recebe o dividendo e o divisor
# do usuário e, depois de chamar a função, exibe o quociente e o
# resto.

def quociente_resto(dividendo:int,divisor:int):
    quociente:int = 0
    while dividendo >= divisor:
        dividendo -= divisor
        quociente += 1
    print(f"O quociente é {quociente} e o resto é {dividendo}")

dividendo = int(input("Digite o dividendo: "))
divisor = int(input("Digite o divisor: "))

quociente_resto(dividendo,divisor)