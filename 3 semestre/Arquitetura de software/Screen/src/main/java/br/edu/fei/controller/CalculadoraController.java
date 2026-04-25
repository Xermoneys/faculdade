/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fei.controller;

import br.edu.fei.model.Calculadora;
import br.edu.fei.screen.Form;

/**
 *
 * @author andrezanon
 */
public class CalculadoraController {
    private Form form;
    private Calculadora calculadora;
    private boolean status;
    
    public CalculadoraController(Form form, Calculadora calculadora){
        this.form = form;
        this.calculadora = calculadora;
        this.status = false;
    }
    
    public void addText(String text){
        if(this.status){
            this.form.getTextField().setText(text);
            this.status = !this.status;
        }
        else{
            String currentText = this.form.getTextField().getText();
            this.form.getTextField().setText(currentText + text);
        }
    }

    public void resetText() {
        this.form.getTextField().setText("");
        this.calculadora.reset();
    }

    public void define_operacao(String operacao){
        String atualTexto = this.form.getTextField().getText();
        Integer valor = Integer.valueOf(atualTexto);
        this.calculadora.setN1(valor);
        this.calculadora.setOp(operacao);
        this.status = true;
    }

    public void calculaOperacao() {
        String operacao = this.calculadora.getOp();
        String atualTexto = this.form.getTextField().getText();
        Integer valor = Integer.valueOf(atualTexto);
        this.calculadora.setN2(valor);
        
        switch (operacao) {
            case "soma" -> {
                this.calculadora.soma();
            }
            case "diferenca" -> {
                this.calculadora.diferenca();
            }
            case "multiplicacao" -> {
                this.calculadora.multiplicacao();
            }
            case "divisao" -> {
                this.calculadora.divisao();
            }
            default -> throw new AssertionError();
        }
        
        Integer total = this.calculadora.getN1();
        this.form.getTextField().setText(total.toString());
        this.calculadora.setN2(0);
    }
}
