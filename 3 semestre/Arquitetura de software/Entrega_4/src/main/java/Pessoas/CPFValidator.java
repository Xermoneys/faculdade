/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;
import java.util.ArrayList;
/**
 *
 * @author feisplmonegatto
 */


public class CPFValidator {

    private static final int[] pesoCPF = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

    private static int calcularDigito(ArrayList<Integer> nums, int tamanho) {
        int soma = 0;

        for (int i = 0; i < tamanho; i++) {
            soma += nums.get(i) * pesoCPF[pesoCPF.length - tamanho + i];
        }

        int resultado = 11 - (soma % 11);
        return (resultado > 9) ? 0 : resultado;
    }

    public static boolean cpfValido(String cpf) throws CPFException {

        ArrayList<Integer> numeros = parseCpf(cpf);

        if (numeros.size() != 11)
            throw new CPFException("Erro cpf");

        // Verifica se todos são iguais
        boolean iguais = true;
        for (int i = 1; i < numeros.size(); i++) {
            if (!numeros.get(i).equals(numeros.get(0))) {
                iguais = false;
                break;
            }
        }
        if (iguais)
            throw new CPFException("Erro cpf");

        int dig1 = calcularDigito(numeros, 9);
        int dig2 = calcularDigito(numeros, 10);

        if (numeros.get(9) != dig1 || numeros.get(10) != dig2) {
            throw new CPFException("Erro cpf");
        }

        return true;
    }

    public static ArrayList<Integer> parseCpf(String cpf){
        ArrayList<Integer> numeros = new ArrayList<>();

        String[] p1 = cpf.split("\\.");
        String[] p2 = p1[p1.length-1].split("\\-");

        String[] digitos = {p1[0], p1[1], p2[0], p2[p2.length-1]};

        for (String s : digitos){
            for (int i = 0; i < s.length(); i++){
                int x = Character.getNumericValue(s.charAt(i));
                numeros.add(x);
            }
        }

        return numeros;
    }
}
