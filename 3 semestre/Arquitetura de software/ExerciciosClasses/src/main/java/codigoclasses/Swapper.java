/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoclasses;

/**
 *
 * @author andrezanon
 */
public class Swapper {
    private float x;
    private float y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    public void swap(){
        float temp = this.getX();
        this.setX(this.getY());
        this.setY(temp);
    }
    
    public void mostraValores(){
        System.out.println("--- Valores ---");
        System.out.println("Valor de x: " + this.getX());
        System.out.println("Valor de y: " + this.getY());
    }
}
