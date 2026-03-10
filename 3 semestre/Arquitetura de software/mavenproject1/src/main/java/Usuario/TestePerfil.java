/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;
import Usuario.PerfilSaude;
import java.util.Scanner;
/**
 *
 * @author feisplmonegatto
 */
public class TestePerfil {
    public static void exercicio7(){
        Scanner sc = new Scanner(System.in);
        PerfilSaude p1 = new PerfilSaude();
        
        System.out.println("Pessoa -1-");
        System.out.println("Digite o seu nome: ");
        p1.setNome(sc.nextLine());
        System.out.println("Digite o seu sobrenome: ");
        p1.setSobrenome(sc.nextLine());
        System.out.println("Digite o seu sexo: ");
        p1.setSexo(sc.nextLine());
        System.out.println("Digite o seu dia de nascimento: ");
        p1.setDia(sc.nextInt());
        System.out.println("Digite o seu mes de nascimento: ");
        p1.setMes(sc.nextInt());
        System.out.println("Digite o seu ano de nascimento: ");
        p1.setAno(sc.nextInt());
        System.out.println("Digite a sua altura: ");
        p1.setAltura(sc.nextFloat());
        System.out.println("Digite o seu peso: ");
        p1.setPeso(sc.nextFloat());
        System.out.println("Nome do paciente: " + p1.getNome());
        System.out.println("Sobrenome do paciente: " + p1.getSobrenome());
        System.out.println("Sexo do paciente: " + p1.getSexo());
        System.out.println("Data de nascimento: " + p1.getDia()+ "/" + p1.getMes()+ "/"+ p1.getAno());
        System.out.println("Altura do paciente: " + p1.getAltura());
        System.out.println("Peso do paciente: " + p1.getPeso());
        System.out.println("Sua idade: " + p1.calcularIdade());
        System.out.printf("IMC: %.2f" , p1.calcularImc());
    }
}
