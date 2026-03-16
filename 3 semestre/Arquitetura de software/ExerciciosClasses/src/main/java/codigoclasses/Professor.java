/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoclasses;

/**
 *
 * @author andrezanon
 */
public class Professor extends Funcionario{
    private int horaAula;
    
    public Professor(String nome, String sobrenome,
            double salarioMensal, ContaFuncionario conta, int horaAula){
        super(nome, sobrenome, salarioMensal, conta);
        this.horaAula = horaAula;
    }
}
