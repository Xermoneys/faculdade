# Exercício 02
# Peça ao usuário uma string1;
# Imprima se essa string é um palíndromo ou não.
# Palíndromo é uma palavra ou frase (normalmente, ignorando-se
# os espaços em branco) que se pode ler, indiferentemente, da
# esquerda para a direita ou vice-versa.
# Exemplos: “ovo”, “a grama é amarga” maiúsculas.

texto = input("Digite uma string: ")
texto_convertido = ""
for letra in texto:
    if ord(letra) in range (97,123):
        letra = chr(ord(letra) - 32)
        texto_convertido += letra
    elif ord(letra) in range(65,91):
        texto_convertido += letra

print(f"Texto convertido: {texto_convertido}")

if texto_convertido == texto_convertido[::-1]:
    print("A string é um palíndromo.")
else: 
    print("A string não é um palíndromo.")