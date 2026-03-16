/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Area;

/**
 *
 * @author lucia
 */
public class Retangular extends Formato implements Area{
    private double l1;
    private double l2;
    
    public Retangular(double valorMQuadrado, double l1, double l2){
        super(valorMQuadrado);
        this.l1 = l1;
        this.l2 = l2;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }
    
    @Override
    public double calculaArea(){
        return this.getL1() * this.getL2();
    }
    
    @Override
    public double calculaPreco(){
        return this.getValorMQuadrado() * this.calculaArea();
    }
}

