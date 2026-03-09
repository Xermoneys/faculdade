/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.mavenproject1.Ex1;

import java.util.ArrayList;
/**
 *
 * @author lucia
 */
public class TesteContaCorrente {
    public static void exercicio13(){
        ArrayList<ContaCorrente> contas = new ArrayList<>();
        
        for (int i = 0;i < 10; i++){
            contas.add(new ContaCorrente());
        }
        for (int i = 0;i < contas.size();i++){
            ContaCorrente conta = contas.get(i);
            
            conta.setSaldo(2000);
            conta.depositar(500);
            conta.sacar(400);
            
            System.out.println("Conta "+(i+1));
            System.out.println("Saldo: " +conta.getSaldo());
            System.out.println();
        }
    }
}
