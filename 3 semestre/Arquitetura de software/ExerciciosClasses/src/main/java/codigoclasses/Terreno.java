/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoclasses;

/**
 *
 * @author andrezanon
 */
public class Terreno {
    private int lado1;
    private int lado2;
    private float preco;

    public int getLado1() {
        return this.lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public int area(){
        return this.getLado1() * this.getLado2();
    }
    
    public int perimetro(){
        return 2 * this.lado1 + 2 * this.lado2;
    }
    
    public float precoTotal(){
        return this.area() * this.preco;
    }
    
    public void mostraDados(){
        System.out.println("--- Dados do Terreno ---");
        System.out.println("L1:\t" + this.getLado1());
        System.out.println("L2:\t" + this.getLado2());
        System.out.println("Preco m2:\t" + this.getPreco());
        System.out.println("Perimetro:\t" + this.perimetro());
        System.out.println("Area:\t" + this.area());
        System.out.println("Preco Total:R$\t" + this.precoTotal());
    }
}
