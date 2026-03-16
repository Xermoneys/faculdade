/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoconstrutores;

/**
 *
 * @author andrezanon
 */
public class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;
    private int idade;
    private int dia;
    private int mes;
    private int ano;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, String sobrenome,
        int dia, int mes, int ano){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia >= 1 && dia <= 31 ? dia : 1;
        this.mes = mes >= 1 && mes <= 12 ? mes : 1;
        this.ano = ano >= 1900 && ano <= 2026 ? ano : 1900;
        this.idade = 2026 - this.ano;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    
    public String getNome() {
        return nome;
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
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void mostraDados(){
        System.out.println("--- Dados da Pessoa ---");
        System.out.println("Nome:\t" + this.getNome());
        System.out.println("Idade:\t" + this.getIdade());
    }
   
}
