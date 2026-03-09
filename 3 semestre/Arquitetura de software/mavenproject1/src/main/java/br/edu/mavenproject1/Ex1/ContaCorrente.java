/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.mavenproject1.Ex1;

/**
 *
 * @author lucia
 */
public class ContaCorrente {
    private double saldo;
    
    public ContaCorrente(){
        saldo = 0;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }
}
