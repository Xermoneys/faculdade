/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Credito;

import java.util.UUID;
/**
 *
 * @author lucia
 */
public class Pix extends Pagamento{
    private final String codigo;
    
    public Pix(double valor){
        super(valor, 1);
        this.codigo = UUID.randomUUID().toString();
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    
    @Override
    public void realizaPagamento(){
        System.out.println("Pagamento por Pix");
        System.out.println("Valor Pix: " + this.getValor());
    }
}
