/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Area;

/**
 *
 * @author feisplmonegatto
 */
public class TesteArea {
    public static void exercicio14(){
        Circular c1 = new Circular(10.5, 10);
        System.out.println(c1.calculaPreco());
        
        Retangular r1 = new Retangular(10.5, 15, 10);
        System.out.println(r1.calculaPreco());
        
        Triangular t1 = new Triangular(10.5, 15, 10);
        System.out.println(t1.calculaPreco());
    }
}
