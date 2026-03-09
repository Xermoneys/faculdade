/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoclasses;

/**
 *
 * @author andrezanon
 */
public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    private ContaFuncionario conta;
    
    public Funcionario(){
        
    }
    
    // Agregacao
    public Funcionario(String nome, String sobrenome,
            double salarioMensal, ContaFuncionario conta){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
        this.conta = conta;
    }
    
    // composicao
    public Funcionario(String nome, String sobrenome,
            double salarioMensal, String agencia,
            String nroConta, double valorConta){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
        this.conta = new ContaFuncionario(agencia, nroConta, valorConta);
    }

    public String getNome() {
        return this.nome;
    }
    
    public ContaFuncionario getConta(){
        return this.conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return this.salarioMensal;
    }
    
    public String getAgencia(){
        return this.getConta().getAgencia();
    }
    
    public String getNroConta(){
        return this.getConta().numeroConta();
    }
    
    public double getValorNaConta(){
        return this.getConta().valorNaConta();
    }
    
    public void setSalarioMensal(double salarioMensal) {
        if(salarioMensal >= 0){
            this.salarioMensal = salarioMensal;
        }
        else{
            this.salarioMensal = 0;
        }
    }
    
    public void aumentaSalario(double taxa){
        double r = (taxa/100);
        double aumento = this.salarioMensal * r;
        this.setSalarioMensal(this.getSalarioMensal() + aumento);
    }
    
    public double getSalarioAnual(){
        return this.getSalarioMensal() * 13;
    }
    
}
