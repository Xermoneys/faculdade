/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.sistemaacademico;

import br.edu.sistemaacademico.View.Cadastro;
import br.edu.sistemaacademico.controller.Controller;
import java.sql.SQLException;

/**
 *
 * @author feisplmonegatto
 */
public class SistemaAcademico {

    public static void main(String[] args) throws SQLException {
       Cadastro cadastroView = new Cadastro();
       Controller controller = new Controller(cadastroView);
       cadastroView.setController(controller);
       cadastroView.setVisible(true);
       
    }
}
