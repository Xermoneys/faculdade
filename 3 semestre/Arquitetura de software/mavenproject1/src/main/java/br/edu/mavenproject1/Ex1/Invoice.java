/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.mavenproject1.Ex1;

/**
 *
 * @author lucia
 */
public class Invoice {
    private String identificador;
    private String descricao;
    private int quantidade;
    private double preco;
    
    public void setIdentificador(String identificador){
        this.identificador = identificador;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setQuantidade(int quantidade){
        if (quantidade > 0){
        this.quantidade = quantidade;
        }else{
        this.quantidade = 0;
        }
    }
    public void setPreco(double preco){
        if (preco > 0){
        this.preco = preco;
        }else{
        this.preco = 0;
        }
    }
    public String getIdentificador(){
        return identificador;
    }
    public String getDescricao(){
        return descricao;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public double getPreco(){
        return preco;
    }
    public double getInvoiceAmount(){
        return quantidade * preco;
}
}
