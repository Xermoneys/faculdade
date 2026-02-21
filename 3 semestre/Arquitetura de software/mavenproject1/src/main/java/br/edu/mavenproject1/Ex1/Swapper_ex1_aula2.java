/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.mavenproject1.Ex1;

/**
 *
 * @author feisplmonegatto
 */
public class Swapper_ex1_aula2 {
    private float x;
    private float y;
    
    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }
    public void swap(float x , float y){
        this.x = y;
        this.y = x;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
   
}
