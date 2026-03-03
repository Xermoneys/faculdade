package br.edu.mavenproject1.Ex1;

public class TesteDataAprimorada {

    public static void exercicio11() {

        // 🔹 Teste 1 – Mês como número
        Data data1 = new Data(10, 3, 2025);
        System.out.println("Teste 1 (mês como número):");
        data1.data1();
        data1.data2();
        data1.data3();

        System.out.println();

        // 🔹 Teste 2 – Mês como String
        Data data2 = new Data(25, "Dezembro", 2024);
        System.out.println("Teste 2 (mês como String):");
        data2.data1();
        data2.data2();
        data2.data3();

        System.out.println();

        // 🔹 Teste 3 – Outro exemplo
        Data data3 = new Data(1, "Janeiro", 2000);
        System.out.println("Teste 3 (outro exemplo):");
        data3.data1();
        data3.data2();
        data3.data3();
    }
}