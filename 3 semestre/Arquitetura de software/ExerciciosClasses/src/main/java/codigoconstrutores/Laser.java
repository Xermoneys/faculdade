/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoconstrutores;

/**
 *
 * @author andrezanon
 */
public class Laser {
    private String fabricante;
    private double alcance;
    private double precisao;
    private double medida;
    
    public Laser(String fabricante, double alcance, double precisao,
            double medida){
        this.fabricante = fabricante;
        this.alcance = alcance;
        this.precisao = precisao;
        this.medida = medida;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getAlcance() {
        return alcance;
    }

    public double getPrecisao() {
        return precisao;
    }

    public double getMedida() {
        return medida;
    }
    
    public boolean equals(Laser laser){
        
        if(this.alcance != laser.alcance){
            return false;
        }
        else if(this.fabricante.equals(laser.fabricante)){
            return false;
        }
        
        else if(this.medida != laser.medida){
            return false;
        }
        
        else if(this.precisao != laser.precisao){
            return false;
        }
        
        else{
           return true; 
        }
        
    }
    
    public void mostraDados(){
        System.out.println("-- Laser ---");
        System.out.println(this.getFabricante());
        System.out.println(this.getPrecisao());
        System.out.println(this.getMedida());
    }
}
