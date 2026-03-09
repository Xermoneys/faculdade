/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoclasses;

/**
 *
 * @author andrezanon
 */
public class ContaFuncionario {
    private String agencia;
    private final String numeroConta;
    private double valorNaConta;
    
    public ContaFuncionario(String agencia, String numeroConta, 
            double valorNaConta){
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.valorNaConta= valorNaConta;
    }
    
    protected String getAgencia(){
        return this.agencia;
    }
    
    protected String numeroConta(){
        return this.numeroConta;
    }
    
    protected double valorNaConta(){
        return this.valorNaConta;
    }
    
    public void setAgencia(String novaAgencia){
        this.agencia = novaAgencia;
    }
    
    private void adicionaValor(double valor){
        this.valorNaConta += valor;
    }
    
    private void removeValor(double valor){
        if(this.valorNaConta >= valor){
            this.valorNaConta -= valor;
        } 
    }
}
