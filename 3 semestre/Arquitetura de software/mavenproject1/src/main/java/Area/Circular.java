/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Area;

/**
 *
 * @author lucia
 */
public class Circular extends Formato implements Area{
    private double diametro;
    private double valorMQuadrado;
    
    public Circular(double valorMQuadrado, double diametro){
        super(valorMQuadrado);
        this.diametro = diametro;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    @Override
    public double calculaPreco(){
        return this.getValorMQuadrado() * this.calculaArea();
    }
    
    @Override
    public double calculaArea(){
        double raio = this.getDiametro()/2;
        return Math.PI * Math.pow(raio, 2);
    }
}
