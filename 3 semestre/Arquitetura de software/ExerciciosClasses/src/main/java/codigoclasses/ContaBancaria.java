/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoclasses;

/**
 *
 * @author andrezanon
 */
public class ContaBancaria {
    
    private String nome;
    private String cpf;
    private String numeroConta;
    private String agencia;
    private double valor;
    private double taxaDeRendimento;
    
    public ContaBancaria(){
        this.valor = 0;
    }
    
    public ContaBancaria(String nome, String cpf, String numeroConta, 
            String agencia, double valor, double taxaDeRendimento){
        this.nome = nome;
        this.cpf = cpf;
        this.valor = valor;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        
        if(valor > 0){
            this.valor = valor;
        }
        else{
            this.valor = 0;
        }
        
        this.taxaDeRendimento = taxaDeRendimento;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public String getNumeroConta(){
        return this.numeroConta;
    }
    
    public String getAgencia(){
        return this.agencia;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public double getTaxaDeRendimento(){
        return this.taxaDeRendimento;
    }
    
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    
    public void setCpf(String novoCpf){
        this.cpf = novoCpf;
    }
    
    public void setNumeroConta(String novoNumeroConta){
        this.numeroConta = novoNumeroConta;
    }
    
    public void setAgencia(String novaAgencia){
        this.agencia = novaAgencia;
    }
    
    public void setTaxaDeRendimento(double novaTaxaDeRendimento){
        this.taxaDeRendimento = novaTaxaDeRendimento;
    }
    
    private void setValor(double valor){
        this.valor = valor;
    }
    
    public void adicionaValor(double deposito){
        this.setValor(this.valor + deposito);
    }
    
    public void pagamento(double valorPagamento){
        this.setValor(this.valor - valorPagamento);
    }
    
    public void mostraDados(){
        System.out.println("-- Dados da Conta --");
        System.out.printf("Numero da Conta %s / Agencia %s\n", 
                this.getNumeroConta(), this.agencia);
        System.out.println("Titular: " + this.getNome());
        System.out.println("CPF: " + this.cpf);
        System.out.printf("Valor na CC: %.2f\n", this.getValor());
        System.out.printf("Taxa de Rendimento: %.5f\n", 
                this.getTaxaDeRendimento());
    }
}
