HRTrab = float (input ("Digite o valor da hora de trabalho: "))
HRTrabMes = int (input ("Digite o numero de horas trabalhadas no mes: "))
SalarioBruto = 4000
Ir = 0.11 * SalarioBruto
Inss = 0.08 * SalarioBruto
Sindicato = 0.05 * SalarioBruto
SalaLiq= SalarioBruto - Ir - Inss - Sindicato 

print (f"+ Salário Bruto:R${SalarioBruto: .2f} ")
print (f"- IR (11%):R${Ir: .2f} ")
print (f"- INSS (8%):R${Inss: .2f}")
print (f"- Sindicato (5%):R${Sindicato: .2f}")
print (f"+ Salário Líquido:R${SalaLiq: .2f}")