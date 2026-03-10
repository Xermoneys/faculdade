/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retangulo;

/**
 *
 * @author feisplmonegatto
 */
public class Retângulo {
    private int lado1;
    private int lado2;
    private float preco;
    
    public void setLado1(int lado1){
        this.lado1 = lado1;
    }
    public void setLado2(int lado2){
        this.lado2 = lado2;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    public int getLado1(){
        return lado1;
    }
    public int getLado2(){
        return lado2;
    }
    public float getPreco(){
        return preco;
    }
    public int area(){
        return this.lado1 * this.lado2;
    }
    public int perimetro(){
        return (this.getLado1()*2)+(this.getLado2()*2);
    }
    public float precoTotal(){
        return this.area() * this.preco;
    }
}
