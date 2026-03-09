/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoclasses;

/**
 *
 * @author andrezanon
 */
public class Pessoa {
    private String cpf;
    private String nome;
    private int idade;

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String novoCpf) {
        this.cpf = novoCpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void mostraDadados(){
        System.out.println("--- Dados da Pessoa ---");
        System.out.println("Nome:\t" + this.getNome());
        System.out.println("CPF:\t" + this.getCpf());
        System.out.println("Idade:\t" + this.getIdade());
    }
   
}
