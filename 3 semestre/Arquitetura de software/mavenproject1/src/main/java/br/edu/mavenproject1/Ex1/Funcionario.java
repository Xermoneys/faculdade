/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.mavenproject1.Ex1;

/**
 *
 * @author feisplmonegatto
 */
public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salario;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setSalario(double salario){
        if (salario > 0){
            this.salario = salario;
        }else{
            this.salario = 0;
        }   
    }
    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public double getSalario(){
        return salario;
    }
    public double salarioanual(){
        return this.salario * 12;
    }
    public double novosalario(){
    return this.salario * 12 * 1.10;
}
}
