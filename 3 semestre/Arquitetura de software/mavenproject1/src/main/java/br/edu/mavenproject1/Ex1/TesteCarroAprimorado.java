/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.mavenproject1.Ex1;

/**
 *
 * @author feisplmonegatto
 */
public class TesteCarroAprimorado {
    public static void exercicio10(){
        CarroAprimorado c1 = new CarroAprimorado();
        c1.setModelo("Civic");
        c1.setCor("Vermelho");
        c1.setAno(2001);
        c1.setPreco(120);
        c1.setKm(10);
        System.out.println("Modelo: " +c1.getModelo()+"Cor: " +c1.getCor()+"Ano: " +c1.getAno()+"Preco: " +c1.getPreco()+"Km: " +c1.getKm());
        
        CarroAprimorado c2 = new CarroAprimorado("Civic","Azul",2019);
        System.out.println("Modelo: " +c2.getModelo()+"Cor: " +c2.getCor()+"Ano: " +c2.getAno()+"Preco: " +c2.getPreco()+"Km: " +c2.getKm());
        
        CarroAprimorado c3 = new CarroAprimorado("Honda","Vermelho",2026,120,12);
        System.out.println("Modelo: " +c3.getModelo()+"Cor: " +c3.getCor()+"Ano: " +c3.getAno()+"Preco: " +c3.getPreco()+"Km: " +c3.getKm());
    }
}
