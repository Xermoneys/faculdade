/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoclasses;

/**
 *
 * @author andrezanon
 */
public class Televisao {
    private String modelo;
    private float preco;
    private float tamanho;
    private int volume;
    private int canal;
    private boolean ligada;

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        if(preco >= 0){
            this.preco = preco;
        }
        else{
            this.preco = 0;
        }
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        if(tamanho > 10){
            this.tamanho = tamanho;
        } 
        else{
            this.tamanho = 10;
        }
        
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        if(volume >= 0)
            this.volume = volume;
        else
            this.volume = 0;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if(canal >= 0)
            this.canal = canal;
        else
            this.canal = 0;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    
    public void alteraVolume(int novoVolume){
        if (this.isLigada() && novoVolume >= 0){
            this.setVolume(novoVolume);
        }
    }
    
    public void addicionaCanal(){
        if(this.isLigada()){
            this.setCanal(this.getCanal() + 1);
        }
    }
    
    public void reduzCanal(){
        if (this.getCanal() >= 1){
            this.setCanal(this.getCanal() - 1);
        }
    }
    
}
