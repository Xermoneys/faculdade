from utils import criar_numeros , ler_numeros , numeros_unicos , salvar_numeros_unicos

def main():          
        criar_numeros("numeros.txt")    
        numeros = ler_numeros("numeros.txt")
        num_unicos = numeros_unicos(numeros)
        salvar_numeros_unicos("numeros_unicos.txt", num_unicos)
        
if __name__ == "__main__":
    main()