/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoclasses;

/**
 *
 * @author andrezanon
 */
public class PerfilDeSaude {
    private String nome;
    private String sobrenome;
    private String sexo;
    private int dia;
    private int mes;
    private int ano;
    private double altura;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if(sexo.equals("H") || sexo.equals("M") || sexo.equals("O"))
            this.sexo = sexo;
        else
            this.sexo = "O";
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia >= 1 && dia <= 31)
            this.dia = dia;
        else
            this.dia = 1;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes >= 1 && mes <= 12)
            this.mes = mes;
        else
            this.mes = 1;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        if(ano > 1900)
            this.ano = ano;
        else
            this.ano = 1900;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura > 0)
            this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(this.peso >= 0)
            this.peso = peso;
    }
    
    private double imc(){
        return this.getPeso() / (this.getAltura() * this.getAltura());
    }
    
    private int getIdade(){
        return 2026 - this.getAno();
    }
    
    public void infoDoPerfil(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Sobreome: " + this.getSobrenome());
        System.out.println("Sexo: " + this.getSexo());
        String data = String.format("%d/%d/%d", 
                this.getDia(), this.getMes(), this.getAno());
        System.out.println("Data de Nascimento: " + data);
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.printf("IMC: %.1f", this.imc());
    }
}
