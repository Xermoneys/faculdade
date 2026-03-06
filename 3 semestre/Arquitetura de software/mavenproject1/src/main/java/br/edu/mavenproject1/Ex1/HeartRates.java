/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.mavenproject1.Ex1;

/**
 *
 * @author lucia
 */
public class HeartRates {
    private Usuario usuario;
    
    public HeartRates(Usuario usuario){
        this.usuario = usuario;
    }
    
    public int maxHeartRate(){
        return 220 - usuario.getIdade();
    }
    public double minFreq(){
        return maxHeartRate() * 0.50;
    }
    public double maxFreq(){
        return maxHeartRate() * 0.85;
    }
}
