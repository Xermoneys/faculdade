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
public class TestePerfil {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PerfilSaude p1 = new PerfilSaude();
        
        System.out.println("Pessoa -1-");
        System.out.println("Digite o seu nome: ");
        p1.setNome(sc.nextLine());
        System.out.println("Digite o seu sobrenome: ");
        p1.setSobrenome(sc.nextLine());
        System.out.println("Digite o seu sexo: ");
        p1.setSexo(sc.nextLine());
        System.out.println("Digite o seu mes de nascimento: ");
        p1.setMes(sc.nextInt());
        System.out.println("Digite o seu dia de nascimento: ");
        p1.setDia(sc.nextInt());
        System.out.println("Digite o seu ano de nascimento: ");
        p1.setAno(sc.nextInt());
        System.out.println("Digite a sua altura: ");
        p1.setAltura(sc.nextFloat());
        System.out.println("Digite o seu peso: ");
        p1.setPeso(sc.nextFloat());
        System.out.println("Nome do paciente: " + p1.getNome());
        System.out.println("Sobrenome do paciente: " + p1.getSobrenome());
        System.out.println("Sexo do paciente: " + p1.getSexo());
        System.out.println("Mes de nascimento: " + p1.getMes());
        System.out.println("Dia de nascimento: " + p1.getDia());
        System.out.println("Ano de nasciemnto: " + p1.getAno());
        System.out.println("Altura do paciente: " + p1.getAltura());
        System.out.println("Peso do paciente: " + p1.getPeso());
        System.out.println("Sua idade: " + p1.calcularIdade());
        System.out.println("IMC: " + p1.calcularImc());
    }
}
