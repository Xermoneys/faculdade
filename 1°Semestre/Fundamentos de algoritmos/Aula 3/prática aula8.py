raio = float(input("Digite o raio do cilindro (em metros):"))
altura = float (input("Digite a altura do cilindro (em metros)"))
pi = 3.1415
perimetro = 2 * pi * raio
#calculo da area cilindro
area_base = pi * (raio ** 2)
area_lateral = altura * perimetro
area_total = area_lateral + area_base
#calculo de tinta
quantidade_tinta = (area_total / 3)
#calculo da qnts de lata
litros_p_lata = 5
quantidade_lata = int(quantidade_tinta / litros_p_lata)
resto = quantidade_tinta % litros_p_lata
if resto > 0:
    quantidade_lata += 1
if quantidade_lata == 1:
    custo_total = quantidade_lata * 50
else:
    if quantidade_lata == 2:
        custo_total = quantidade_lata * 48
    else:
        if quantidade_lata == 3:
            custo_total = quantidade_lata * 46
        else:
            custo_total = quantidade_lata * 45
if quantidade_lata == 1:
    preçounit = 50
else: 
    if quantidade_lata == 2:
        preçounit = 48
    else:
        if quantidade_lata == 3:
            preçounit = 46
        else:
            preçounit = 45
print (f"Área a ser pintada: {area_total:.2f} m²")
print (f"Quantidade de litros necessários: {quantidade_tinta:.2f} litros")
print (f"Quantidade de latas de tinta: {quantidade_lata}")
print (f"Preço unitário da lata: R$:{preçounit}")
print (f"Custo total: {custo_total}")

