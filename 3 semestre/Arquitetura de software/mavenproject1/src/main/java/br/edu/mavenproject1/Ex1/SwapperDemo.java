/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.mavenproject1.Ex1;
import java.util.Scanner;
/**
 *
 * @author feisplmonegatto
 */
public class SwapperDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Swapper_ex1_aula2 troca = new Swapper_ex1_aula2();
        
        System.out.println("Digite o valor do primeiro número (x):");
        troca.setX(sc.nextFloat());
        System.out.println("Digite o valor do primeiro número (y):");
        troca.setY(sc.nextFloat());
    }
}
