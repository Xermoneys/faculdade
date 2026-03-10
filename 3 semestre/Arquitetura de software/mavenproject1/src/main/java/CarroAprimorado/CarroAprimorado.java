/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarroAprimorado;

/**
 *
 * @author feisplmonegatto
 */
public class CarroAprimorado {
    private String modelo;
    private String cor;
    private int ano;
    private double preco;
    private double km;
    
    public CarroAprimorado(){
    }
     public CarroAprimorado(String modelo,String cor,int ano){
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;  
    }

    public CarroAprimorado(String modelo,String cor,int ano,double preco,double km){
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
        this.km = km;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
}
