/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.sistemaacademico.controller;

import br.edu.sistemaacademico.View.Cadastro;
import br.edu.sistemaacademico.model.Aluno;
import br.edu.sistemaacademico.model.dao.AlunoDAO;
import br.edu.sistemaacademico.model.dao.Conexao;
import java.sql.SQLException;

/**
 *
 * @author feisplmonegatto
 */
public class Controller {
    private Cadastro cadastroView;
    private AlunoDAO alunoDAO;
    
    public Controller(Cadastro cadastroView) throws SQLException {
        this.cadastroView = cadastroView;
        Conexao conexao = new Conexao();
        this.alunoDAO = new AlunoDAO(conexao.getConnection());
    }
    public void inserir(){
        String nome = this.cadastroView.getTfNome().getText();
        String usuario = this.cadastroView.getTfUsuario().getText();
        String senha = this.cadastroView.getTfSenha().getText();
        Aluno aluno = new Aluno(nome,usuario,senha);
        try{
            this.alunoDAO.inserir(aluno);
        }
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("Erro ao inserir");
        }
        
        
    }
}
