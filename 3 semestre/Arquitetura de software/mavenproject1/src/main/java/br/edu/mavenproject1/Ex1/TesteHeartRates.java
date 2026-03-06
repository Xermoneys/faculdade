/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.mavenproject1.Ex1;

/**
 *
 * @author lucia
 */
public class TesteHeartRates {
    public static void exercicio12(){
    Usuario u = new Usuario("Luciano","Ventura",24,9,2004);
    HeartRates hr = new HeartRates(u);
    
    System.out.println("Nome: " +u.getNome());
    System.out.println("Sobrenome: " +u.getSobrenome());
    System.out.println("Data de nascimento: " +u.getDia()+ "/ "+u.getMes()+ "/ " +u.getAno());
    
    System.out.println("Idade: " +u.getIdade());
    
    System.out.println("Frequencia cardiaca maxima: " +hr.maxHeartRate());
    System.out.printf("Frequencia cardiaca alvo: %.2f - %.2f%n", hr.minFreq(),hr.maxFreq());
    
    
    
    }
}
