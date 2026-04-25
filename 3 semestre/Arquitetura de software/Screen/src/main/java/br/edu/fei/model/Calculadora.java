/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fei.model;

/**
 *
 * @author andrezanon
 */
public class Calculadora {
    private int n1;
    private int n2;
    private String op;
    private boolean change;
    
    public Calculadora(){
        this.n1 = 0;
        this.n2 = 0;
        this.op = null;
        this.change = true;
    }

    public int getN1() {
        return n1;
    }

    public int getN2(){
        return n2;
    }

    public String getOp(){
        return op;
    }

    public void setOp(String op){
        this.op = op;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }
    
    public void setN2(int n2){
        this.n2 = n2;
    }

    public void soma(){
        int total;
        total = this.n1 + this.n2;
        setN1(total);
    }
    
    public void diferenca(){
        int total;
        total = this.n1 - this.n2;        
        setN1(total);
    }
    
    public void multiplicacao(){
        int total;
        if(this.n1 > 0){
            total = this.n1 * this.n2;
        }
        else{
            total = this.n2;
        }
        
        setN1(total);
    }
    
    public void divisao(){
        int total;
        if(this.n1 > 0){
            total = this.n1 / this.n2;
        }
        else{
            total = this.n2;
        }
        
        setN1(total);
    }
    
    public void reset(){
        this.n1 = 0;
        this.n2 = 0;
        this.op = null;
    }
}
