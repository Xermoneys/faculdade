/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.sistemaacademico.model.dao;

import br.edu.sistemaacademico.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author feisplmonegatto
 */
public class AlunoDAO {
    private Connection conn;
    
    public AlunoDAO(Connection conn){
        this.conn = conn;
    }

    public void insere(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   public void inserir(Aluno aluno) throws SQLException{
        String sql = "INSERT INTO tabela_nova(nome, usuario, senha) "
        + "values('"+ aluno.getNome() +"', '"+ aluno.getUsuario()+ ", '"
        + ", '"+ aluno.getSenha() +"')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close(); 
   }
}
