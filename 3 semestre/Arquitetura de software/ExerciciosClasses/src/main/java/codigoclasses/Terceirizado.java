/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoclasses;

/**
 *
 * @author andrezanon
 */
public class Terceirizado extends Funcionario{
    private String empresa;
    
    public Terceirizado(String nome, String sobrenome,
            double salarioMensal, ContaFuncionario conta, 
            String empresa){
        super(nome, sobrenome, salarioMensal, conta);
        this.empresa = empresa;
    }
}
