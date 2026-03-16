/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoconstrutores;

import java.util.ArrayList;

/**
 *
 * @author andrezanon
 */
public class Matematica {
    public static final double PI = 3.1415;
    
    public static int potencia(int x, int y){
        if(y == 0){
            return 1;
        }
        else{
            int total = 1;
            for(int i = 0; i < y; i++){
                total *= x ;
            }
            return total;
        }
    }
    
    public static int somatoria(ArrayList<Integer> a){
        int total = 0;
        for(int i = 0; i < a.size(); i++){
            total += a.get(i);
        }
        return total;
    }
}
