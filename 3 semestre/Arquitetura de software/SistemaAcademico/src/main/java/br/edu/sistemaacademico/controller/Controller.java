/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.sistemaacademico.controller;

import br.edu.sistemaacademico.View.Cadastro;
import br.edu.sistemaacademico.View.Login;
import br.edu.sistemaacademico.model.Aluno;
import br.edu.sistemaacademico.model.dao.AlunoDAO;
import br.edu.sistemaacademico.model.dao.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author feisplmonegatto
 */
public class Controller {
    private Cadastro cadastroView;
    private Login loginView;
    private AlunoDAO alunoDAO;

    public Controller() throws SQLException {
        Conexao conexao = new Conexao();
        this.alunoDAO = new AlunoDAO(conexao.getConnection());
    }
    public void setCadastroView(Cadastro cadastroView) {
        this.cadastroView = cadastroView;
    }

    public void setLoginView(Login loginView) {
        this.loginView = loginView;
    }
    public void abrirCadastro() {
        loginView.setVisible(false);
        cadastroView.setVisible(true);
    }
    public void voltarLogin() {
        cadastroView.setVisible(false);
        loginView.setVisible(true);
    }
    public void inserir() {
        String nome = this.cadastroView.getTfNome().getText();
        String usuario = this.cadastroView.getTfUsuario().getText();
        String senha = this.cadastroView.getTfSenha().getText();

        Aluno aluno = new Aluno(nome, usuario, senha);

        try {
            Conexao conexao = new Conexao();
            AlunoDAO alunoDAO = new AlunoDAO(conexao.getConnection());

            alunoDAO.inserir(aluno);

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao inserir");
        }
    }
    public void login() {
        String usuario = this.loginView.getTfUsuario().getText();
        String senha = this.loginView.getTfSenha().getText();

        Aluno aluno = new Aluno(null, usuario, senha);

        try {
            Conexao conexao = new Conexao();
            AlunoDAO alunoDAO = new AlunoDAO(conexao.getConnection());

            ResultSet rs = alunoDAO.consultar(aluno);

            if (rs.next()) {
                System.out.println("Login OK");
            } else {
                System.out.println("Usuario ou senha invalidos");
            }   

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro no login");
        }
    }
}
