    /*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    */

    package com.mycompany.ex1;
    import java.util.Scanner;
    public class TestePessoa {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Pessoa p1 = new Pessoa();
            Pessoa p2 = new Pessoa();
            Pessoa p3 = new Pessoa();
            
            System.out.print("Digite o nome da pessoa 1: ");
            p1.setNome(sc.nextLine());
            System.out.print("Digite o cpf da pessoa 1: ");
            p1.setCpf(sc.nextLine());
            System.out.print("Digite a idade da pessoa 1: ");
            p1.setIdade(sc.nextInt());
            sc.nextLine();
            System.out.print("Digite o nome da pessoa 2: ");
            p2.setNome(sc.nextLine());
            System.out.print("Digite o cpf da pessoa 2: ");
            p2.setCpf(sc.nextLine());
            System.out.print("Digite a idade da pessoa 2: ");
            p2.setIdade(sc.nextInt());
            sc.nextLine();
            System.out.print("Digite o nome da pessoa 3: ");
            p3.setNome(sc.nextLine());
            System.out.print("Digite o cpf da pessoa 3: ");
            p3.setCpf(sc.nextLine());
            System.out.print("Digite a idade da pessoa 3: ");
            p3.setIdade(sc.nextInt());
            sc.nextLine();
            
            System.out.println("Pessoa 1: " + p1.getNome() + "| CPF: " + p1.getCpf()+ "| Idade: " + p1.getIdade());
            System.out.println("Pessoa 2: " + p2.getNome() + "| CPF: " + p2.getCpf()+ "| Idade: " + p2.getIdade());
            System.out.println("Pessoa 3: " + p3.getNome() + "| CPF: " + p3.getCpf()+ "| Idade: " + p3.getIdade());
            
        }
    }
