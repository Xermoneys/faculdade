/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;

/**
 *
 * @author feisplmonegatto
 */
public class Pessoas {
    private String nome;
    private String cpf;
    
    public Pessoas(String nome, String cpf) throws CPFException{
        CPFValidator.cpfValido(cpf);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Pessoas() {
    }
   }
