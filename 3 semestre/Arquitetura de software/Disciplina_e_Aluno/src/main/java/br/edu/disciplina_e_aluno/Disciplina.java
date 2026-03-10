/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.disciplina_e_aluno;

import java.util.ArrayList;
/**
 *
 * @author feisplmonegatto
 */
public class Disciplina {
    private String nome;
    private String codigo;
    private int semestre;
    private ArrayList<Aluno>alunos;

    public Disciplina(String nome,String codigo, int semestre,ArrayList<Aluno>alunos){
        this.nome = nome;
        this.codigo = codigo;
        this.semestre = semestre;
        this.alunos = alunos;
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
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * @return the alunos
     */
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    protected void mostraDados(){
        System.out.println("Disciplina: "  +this.nome);
        System.out.println("Codigo: " +this.codigo);
        System.out.println("Semestre: " +this.semestre);
        System.out.println("Quantidade de alunos: " +alunos.size());
        for(Aluno alu: alunos){
            alu.mostraDados();
            System.out.println();
        }
    }
}
