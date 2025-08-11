a = int(input("Digite o lado A: "))
b = int(input("Digite o lado B: "))
c = int(input("Digite o lado C: "))

if a < b + c and b < a + c and c < a + b:
    if a == b and b == c:
        print("Triângulo equilátero")
elif a == b or a == c or b == c:
    print("Triângulo isóceles")
elif a != b and b != c and a != c:
    print("Triângulo escaleno")
else:
    print("Não é um triângulo")