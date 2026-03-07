/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.mavenproject1.Ex1;

/**
 *
 * @author lucia
 */
public class Usuario {
    private String nome;
    private String sobrenome;
    private int dia;
    private int mes;
    private int ano;
    
    public Usuario(String nome, String sobrenome, int dia,int mes,int ano){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
    public int getIdade(){
        return 2026 - ano;
    }
    public void mostrarDados(){
        System.out.println("Nome: " +this.getNome());
        System.out.println("Sobrenome: " +this.getSobrenome());
        System.out.println("Data de nascimento: " +this.getDia()+ "/ "+this.getMes()+ "/ " +this.getAno());
        System.out.println("Idade: " +this.getIdade());
    }
    
}
