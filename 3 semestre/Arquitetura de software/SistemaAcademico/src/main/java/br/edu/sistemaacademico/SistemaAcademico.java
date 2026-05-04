/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.sistemaacademico;

import br.edu.sistemaacademico.View.Cadastro;
import br.edu.sistemaacademico.View.Login;
import br.edu.sistemaacademico.controller.Controller;
import java.sql.SQLException;

/**
 *
 * @author feisplmonegatto
 */
public class SistemaAcademico {

    public static void main(String[] args) {
    try {
        Cadastro cadastroView = new Cadastro();
        Login loginView = new Login();

        Controller controller = new Controller();

        controller.setCadastroView(cadastroView);
        controller.setLoginView(loginView);

        cadastroView.setController(controller);
        loginView.setController(controller);
        
        cadastroView.setVisible(true);

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}
