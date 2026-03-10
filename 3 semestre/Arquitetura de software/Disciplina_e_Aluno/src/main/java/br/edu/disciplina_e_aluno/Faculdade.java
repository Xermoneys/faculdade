/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.disciplina_e_aluno;

import java.util.ArrayList;
/**
 *
 * @author feisplmonegatto
 */
public class Faculdade {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao", "da FEI", "1234");
        Aluno a2 = new Aluno("Maria", "da FEI", "1235");
        Aluno a3 = new Aluno("Andre", "de Sao Carlos", "1236");
        
        ArrayList<Aluno> alunos = new ArrayList();
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        
        Disciplina d1 = new Disciplina("POO", "CCM310", 3, alunos);
        d1.mostraDados();
        
}
}
