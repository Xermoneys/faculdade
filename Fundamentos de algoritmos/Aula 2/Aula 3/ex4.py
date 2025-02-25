salario = float (input("Digite o valor do salário atual:"))
if salario < 1800:
    novo_salario = salario * 1.1
    print ("O funcionário tem direito a 10% de aumento")
    print ("O novo salário ser de R$ %.2f" % novo_salario)
    print ("Parabéns pelo novo salário!")
