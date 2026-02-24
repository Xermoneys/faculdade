/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.mavenproject1.Ex1;
import java.util.Scanner;
/**
 *
 * @author lucia
 */
public class Retangulo {
    public static void exercicio3(){
    Scanner sc = new Scanner(System.in);
    Retângulo ret1  = new Retângulo();
    Retângulo ret2  = new Retângulo();
    
    System.out.print("Retangulo -1- \n");
    System.out.print("Digite o valor para o lado1: ");
    ret1.setLado1(sc.nextInt());
    System.out.print("Digite o valor para o lado2: ");
    ret1.setLado2(sc.nextInt());
    System.out.println("Digite o valor do preco por m²: ");
    ret1.setPreco(sc.nextFloat());
    
    System.out.print("Retangulo -2- \n");
    System.out.print("Digite o valor para o lado1: ");
    ret2.setLado1(sc.nextInt());
    System.out.print("Digite o valor para o lado2: ");
    ret2.setLado2(sc.nextInt());
    System.out.println("Digite o valor do preco por m²: ");
    ret2.setPreco(sc.nextFloat());
    
    System.out.print("Retangulo -1- ");
    System.out.println("Valor do lado1:  " + ret1.getLado1() + " | Valor do lado 2: " + ret1.getLado2());
    System.out.println("Valor da area: " + ret1.area());
    System.out.println("Valor do perimetro: " + ret1.perimetro());
    System.out.println("Valor total do terreno " +ret1.precoTotal());
    
    System.out.print("Retangulo -2- ");
    System.out.println("Valor do lado1:  " + ret2.getLado1() + " | Valor do lado 2: " + ret2.getLado2());
    System.out.println("Valor da area: " + ret2.area());
    System.out.println("Valor do perimetro: " + ret2.perimetro());
    System.out.println("Valor total do terreno " +ret2.precoTotal());
    }
}
