/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;
//import java.util.Scanner;
/**
 *
 * @author feisplmonegatto
 */
public class main {
    /*public static void main(String[] args){
        Pessoas [] Pessoas = new Pessoas[5];
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Digite o numero -1 para finalizar o programa");
        System.out.println("Digite o numero 1 para criar uma nova pessoa");
        System.out.println("Digite o numero 2 para pedir o indice");
        int numero = sc.nextInt();
        while(numero != -1){
        if (numero == 1){
            System.out.println("Digite o CPF no formato XXX.XXX.XXX-DD: ");
            String cpf = sc.nextLine();
            cpf = cpf + sc.nextLine();
            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite o indice no vetor: ");
            int posicao = sc.nextInt();
            try{
                Pessoas p = new Pessoas(nome,cpf);
                Pessoas[posicao] = p;
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("Indice " +posicao+ "nao existe");
            }
        }
        else {
            if (numero == 2){
                System.out.println("Digite o indice no vetor: ");
                int posicao = sc.nextInt();
                try{
                    Pessoas p = Pessoas[posicao];
                    System.out.println("Nome: " +p.getNome());
                    System.out.println("CPF: " +p.getCpf());
            }
            catch(NullPointerException e){
                System.out.println("Nao existe pessoa" + "na posicao" + posicao);
            }
            numero = sc.nextInt();
        }
        }
        } 
        }*/
    public static void main(String[] args) {
        String nome = "Fulano";
        String cpf = "516.886.991-20";
        try{
           Pessoas p = new Pessoas(nome, cpf);
           System.out.println("Nome: " + p.getNome() + " // CPF: " + p.getCpf());
       }
       catch(CPFException e){
           System.out.println("CPF " + cpf + " invalido de " + nome);
           e.printStackTrace();
       }
       
        cpf = "123.456.789-10";
        try{
           Pessoas p = new Pessoas(nome, cpf);
           System.out.println(p.getNome() + " - " + p.getCpf());
       }
       catch(CPFException e){
           System.out.println("CPF : " + cpf + " Invalido de " + nome);
           e.printStackTrace();
       }

}
    }

