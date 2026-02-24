/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.mavenproject1.Ex1;

/**
 *
 * @author feisplmonegatto
 */
public class TesteFuncionario {
    public static void exercicio5(){
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        
        f1.setNome("Luciano");
        f1.setSobrenome("Ventura");
        f1.setSalario(1200);
        
        f2.setNome("Eduardo");
        f2.setSobrenome("Demente");
        f2.setSalario(1500);
        
        System.out.println("Funcionario -1-");
        System.out.println("Nome do funcionario 1: " +f1.getNome());
        System.out.println("Sobrenome do funcionario 1: " +f1.getSobrenome());
        System.out.printf("Salario do funcionario 1: %.2f%n", f1.getSalario());
        System.out.printf("Salario anual do funcionario 1: %.2f%n", f1.salarioanual());
        System.out.printf("Salario anual com aumento de 10%% do funcionario 1: %.2f%n", f1.novosalario());
        
        System.out.println("Funcionario -2-");
        System.out.println("Nome do funcionario 2: " +f2.getNome());
        System.out.println("Sobrenome do funcionario 2: " +f2.getSobrenome());
        System.out.printf("Salario do funcionario 2: %.2f%n", f1.getSalario());
        System.out.printf("Salario anual do funcionario 2: %.2f%n", f2.salarioanual());
        System.out.printf("Salario anual do funcionario 2: %.2f%n", f2.novosalario());
        
} 
}
