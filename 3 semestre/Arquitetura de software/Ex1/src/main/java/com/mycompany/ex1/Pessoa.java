/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1;

/**
 *
 * @author lucia
 */
public class Pessoa {
    private String cpf;
    private String nome;
    private int idade;
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getCpf(){
        return cpf;
    }
    public String getNome(){
        return nome;
    } 
    public int getIdade(){
        return idade;
    } 
}
