/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.disciplina_e_aluno;

/**
 *
 * @author feisplmonegatto
 */
public class Aluno {
    private String nome;
    private String sobrenome;
    private final String ra;

    public Aluno(String nome,String sobrenome,String ra ){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ra = ra;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the ra
     */
    public String getRa() {
        return ra;
    }


    public void mostraDados(){
        System.out.println("---//---");
        System.out.println("Nome: "  +this.nome);
        System.out.println("Sobrenome: " +this.sobrenome);
        System.out.println("RA: " +this.ra);
    }
}
