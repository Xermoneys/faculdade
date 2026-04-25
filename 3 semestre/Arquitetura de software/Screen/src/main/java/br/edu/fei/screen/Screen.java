/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.fei.screen;

import br.edu.fei.controller.CalculadoraController;
import br.edu.fei.model.Calculadora;

/**
 *
 * @author andrezanon
 */
public class Screen {
    public static void main(String[] args) {
        // cria objeto da view
        Form form = new Form();
        
        // cria objeto do model
        Calculadora calculadora = new Calculadora();
        
        // cria objeto do controller
        CalculadoraController calculadoraController 
                = new CalculadoraController(form, calculadora);
        
        form.setController(calculadoraController);
        form.setVisible(true);
    }
}
