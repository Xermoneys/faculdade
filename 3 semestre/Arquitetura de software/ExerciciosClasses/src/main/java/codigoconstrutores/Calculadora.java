package codigoconstrutores;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andrezanon
 */
public class Calculadora {
    public final static double PI = 3.1415;
    
    public static double expo(int n, int m){
        double total = 1;
        for(int i = 0; i < m; i++){
            total *= n;
        }
        return total;
    }
    
    public static int somatoria(ArrayList<Integer> l){
        int total = 0;
        for(int i = 0; i < l.size(); i++){
            total = total + l.get(i);
        }
        return total;
    }
    
    public static int maior(ArrayList<Integer> l){
        int maior = l.get(0);
        for(int i = 1; i < l.size(); i++){
            if(maior < l.get(i))
                maior = l.get(i);
        }
        return maior;
    }
}
