salario = int(input("Digite o seu salário:"))
salariosuperior = salario * 1.1
salarioinferior = salario * 1.15
if salario > 1250:
    print("Seu novo salário será: %.2f" %salariosuperior)
else: 
    print ("Seu novo salário será: %.2f" %salarioinferior)