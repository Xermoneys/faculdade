/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoheranca;

/**
 *
 * @author andrezanon
 */
public class Triangular extends Formato implements Area{
    private double base;
    private double altura;
    
    public Triangular(double valorMQuadrado, double base, double altura){
        super(valorMQuadrado);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calculaArea(){
        return (this.getBase() * this.getAltura()) / 2;
    }
    
    @Override
    public double calculaPreco(){
        return this.getValorMQuadrado() * this.calculaArea();
    }
}
