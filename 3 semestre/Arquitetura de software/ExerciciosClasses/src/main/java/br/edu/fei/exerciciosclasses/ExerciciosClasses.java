/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.fei.exerciciosclasses;

import codigoclasses.ContaBancaria;
import codigoclasses.ContaFuncionario;
import java.util.Scanner;
import codigoclasses.Pessoa;
import codigoclasses.Swapper;
import codigoclasses.Terreno;
import codigoclasses.Televisao;
import codigoclasses.Funcionario;
import codigoclasses.PerfilDeSaude;
import codigoconstrutores.Data;
import codigoconstrutores.HeartRates;
import codigoconstrutores.Laser;
import codigoconstrutores.Matematica;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author andrezanon
 */
public class ExerciciosClasses {
    
    public static void exercicio1(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite seu cpf: ");
        String cpf = scanner.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        Pessoa p1 = new Pessoa();
        p1.setNome(nome);
        p1.setCpf(cpf);
        p1.setIdade(idade);
        
        p1.mostraDadados();
    }
    
    public static void exercicio2(){
               
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite X: ");
        float x = scanner.nextFloat();
        
        System.out.print("Digite Y: ");
        float y = scanner.nextFloat();
        
        Swapper troca = new Swapper();
        troca.setX(x);
        troca.setY(y);
        troca.mostraValores();
        
        troca.swap();
        
        troca.mostraValores();
    }
    
    public static void exercicio3(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o lado 1 (em m): ");
        int l1 = scanner.nextInt();
        
        System.out.print("Digite lado 2 (em m): ");
        int l2 = scanner.nextInt();
        
        System.out.print("Digite o preco (reais por m2): ");
        float preco = scanner.nextFloat();
        
        Terreno terreno = new Terreno();
        terreno.setLado1(l1);
        terreno.setLado2(l2);
        terreno.setPreco(preco);
        
        terreno.mostraDados();
    }
    
    public static void exercicio4(){
        Televisao tv1 = new Televisao();
        tv1.setCanal(1);
        tv1.setModelo("TVFei");
        tv1.setPreco((float) 1380.99);
        tv1.setLigada(false);
        tv1.setTamanho(50);
        tv1.setVolume(0);
        
        System.out.println(tv1.getVolume());
        tv1.alteraVolume(20);
        tv1.addicionaCanal();
        System.out.println(tv1.getVolume());        
        System.out.println(tv1.getCanal());        
        tv1.setLigada(true);
        tv1.alteraVolume(30);
        tv1.addicionaCanal();
        System.out.println(tv1.getVolume());
        System.out.println(tv1.getCanal()); 
    }
    
    public static void exercicio5(){
        Funcionario f1 = new Funcionario();
        
        f1.setNome("Joao");
        f1.setSobrenome("Silva");
        f1.setSalarioMensal(1350.50);
        System.out.println("--- Info do Funcionario ---");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Sobrenome: " + f1.getSobrenome());
        System.out.printf("Salario: %.2f\n", f1.getSalarioMensal());
        System.out.printf("Salario Anual: %.2f\n", f1.getSalarioAnual());
        System.out.println("--- Aumenta Salario ---");
        
        double novoSalario = aumentaSalario(f1.getSalarioMensal(), 10);
        
        System.out.printf("Novo Salario: %.2f\n", novoSalario);
        f1.setSalarioMensal(novoSalario);
        System.out.printf("Salario: %.2f\n", f1.getSalarioMensal());
        System.out.printf("Salario Anual: %.2f\n", f1.getSalarioAnual());   
    }
    
    public static double aumentaSalario(double salario, double taxa){
        double r = (taxa)/100;
        double aumento = salario * r;
        System.out.println(aumento);
        return salario + aumento;
    }
    
    public static void exercicio6(){
        PerfilDeSaude p1 = new PerfilDeSaude();
        p1.setNome("Feiana");
        p1.setSobrenome("Palmeirense");
        p1.setSexo("F");
        p1.setDia(5);
        p1.setMes(2);
        p1.setAno(2000);
        p1.setAltura(1.6);
        p1.setPeso(60);
        
        PerfilDeSaude p2 = new PerfilDeSaude();
        p2.setNome("Feiana");
        p2.setSobrenome("Palmeirense");
        p2.setSexo("F");
        p2.setDia(5);
        p2.setMes(2);
        p2.setAno(2000);
        p2.setAltura(1.6);
        p2.setPeso(60);
        
        p2.infoDoPerfil();
    }
    
    public void codigoFuncionario(){
        ContaFuncionario c = new ContaFuncionario("1234", "987-6", 10000);
        Funcionario f1 = new Funcionario("Joao", "Silva", 1350.50, c);
        Funcionario f2 = new Funcionario("Joao", "Silva", 1350.50,
                "1234", "987-6", 10000);
        
        //f1.setNome("Joao");
        //f1.setSobrenome("Silva");
        //f1.setSalarioMensal(1350.50);
        System.out.println("--- Info do Funcionario ---");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Sobrenome: " + f1.getSobrenome());
        System.out.printf("Salario: %.2f\n", f1.getSalarioMensal());
        System.out.printf("Salario Anual: %.2f\n", f1.getSalarioAnual());
        System.out.printf("Numero da Conta: %s\n", f1.getNroConta());
        System.out.printf("Numero da Agencia: %s\n", f1.getAgencia());
        System.out.printf("Valor na Conta: %s\n", f1.getValorNaConta());
        
        System.out.println("--- Aumenta Salario ---");
        f1.aumentaSalario(10);
        System.out.printf("Novo Salario: %.2f\n", f1.getSalarioMensal());
        System.out.printf("Novo Salario Anual: %.2f\n", f1.getSalarioAnual());   
        
        // alterando objeto funcionario
        //mudaFuncionario(f1);
        
        // alterando tipo primitivo inteiro
        //int x = 15;
        //mudaInteiro(x);
        //System.out.printf("X: %d\n", x);
    }
    
    public static ContaBancaria lerDadosContaBancaria(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite seu CPF: ");
        String cpf = scanner.nextLine();
        
        System.out.println("Digite a agencia: ");
        String agencia = scanner.nextLine();
        
        System.out.println("Digite a numero da conta: ");
        String numeroConta = scanner.nextLine();
        
        System.out.println("Digite o valor na conta: ");
        double valor  = scanner.nextDouble();
        
        System.out.println("Digite a taxa de rendimento: ");
        double taxaDeRendimento  = scanner.nextDouble();
        
        return new ContaBancaria(nome, 
                cpf, numeroConta, agencia,
                valor, taxaDeRendimento);
    }
    
    public static void igualJava(){
        ContaBancaria cb1 = lerDadosContaBancaria();
        cb1.mostraDados();
        
        ContaBancaria cb = new ContaBancaria("Feiano", 
                "12345678-99", "9876-5", "1234",
                100.60, 0.0005);
        cb.mostraDados();
        
        System.out.println(cb == cb1);
        
        String n1 = new String("Feiano");
        String n2 = new String("Feiano");
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));
    }
    
    public static void exercicioConstrutores1(){
        Data d1 = new Data(02, 03, 2026);
        Data d2 = new Data(02, "Marco", 2026);
        
        System.out.println("");
        
        System.out.println("--- DATA 1 ---");
        d1.mostraDatas();
        System.out.println("--- DATA 2 ---");
        d2.mostraDatas();
    }
    
    public static void heartRates(){
        HeartRates hr = new HeartRates("Feiano", "Palmeirense", 02, 03, 1993);
        hr.mostraDados();
    }
    
    /**
     * Funcao para comparar dois ArrayLists.
     * Os objetos podem de qualquer classe
     * @param l1 (ArrayList): ArrayList com objetos de qualquer classe
     * @param l2 (ArrayList): ArrayList com objetos de qualquer classe
     * @return (boolean) verdadeiro se l1 e l2 sao iguais, false caso contrario
     */
    public static boolean comparaArrayLists(ArrayList l1,
            ArrayList l2){

        if(l1.size() != l2.size()){
            return false;
        }
        
        for(Object ob: l1){
            if(!l2.contains(ob)){
                return false;
            }
        }
        
        for(Object ob: l2){
            if(!l1.contains(ob)){
                return false;
            }
        }
        return true;
    }
    
    public void exercicioArrayList(){
                Laser l[] = new Laser[3];
        ArrayList<Laser> al = new ArrayList<>();
        ArrayList<Laser> al2 = new ArrayList<>();
        ArrayList<Laser> al3 = new ArrayList<>();        
        
        String fabricante = "FEI";
        int alcance = 10;
        int precisao = 50;
        int medida = 12;
        
        for(int i = 0; i < 3; i++){
            Laser laser = new Laser(fabricante, ++alcance, 
                    precisao++, medida++);
            //l[i] = laser;
            al.add(laser);
            al2.add(laser);
            
        }
        
        System.out.println("--- Utilizando FOR ---");
        for(int i = 0; i < l.length; i++){
            l[i].mostraDados();
            al.get(i).mostraDados();
        }
        
        System.out.println("--- Utilizando FOR EACH ---");
        for(Laser laser : al){
            laser.mostraDados();
            System.out.println();
        }
        
        System.out.println("--- Utilizando ITERATOR ---");
        Iterator <Laser> iterator = al.iterator();
        
        while(iterator.hasNext()){
            Laser laser = iterator.next();
            laser.mostraDados();
            System.out.println();
        }
        
        System.out.println("--- Utilizando VALOR INDEX ---");
        l[0].mostraDados();
        System.out.println();
        l[1].mostraDados();
        System.out.println();
        l[2].mostraDados();
        System.out.println(); 
        
        al3.add(new Laser("abc", 12, 35, 67));
        
        System.out.println(al == al2);
        
        System.out.println(al.equals(al2)); // verdadeiro
        System.out.println(comparaArrayLists(al, al2)); // verdadeiro
        
        System.out.println(al.equals(al3)); // falso
        System.out.println(comparaArrayLists(al, al3)); // falso
        System.out.println(al.contains(al2.get(1)));  
        
        System.out.println("--- Cores ---");
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("Rosa");
        s1.add("Vermelho");
        s1.add("Azul");
        
        ArrayList<String> s2 = new ArrayList<>();
        s2.add("Azul");
        s2.add("Rosa");
        s2.add("Vermelho");
        s2.add("Rosa");
        
        System.out.println(s1.equals(s2));
        System.out.println(comparaArrayLists(s1, s2));
    }
   
    public static void main(String[] args) {
        //exercicio1();        
        //exercicio2();
        //exercicio3();
        //exercicio4();
        //exercicio5();
        //exercicioConstrutores1();
        System.out.println(Matematica.potencia(2, 4));
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            a.add(i);
        }
        System.out.println(Matematica.somatoria(a));
    }
    
}
