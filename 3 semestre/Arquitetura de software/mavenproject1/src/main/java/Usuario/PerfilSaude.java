/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

/**
 *
 * @author feisplmonegatto
 */
public class PerfilSaude {
    private String nome;
    private String sobrenome;
    private String sexo;
    private int mes;
    private int dia;
    private int ano;
    private float altura;
    private float peso;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setSexo(String sexo){
        if(sexo.equals("H")|| sexo.equals("F")||sexo.equals("Masculino")||sexo.equals("Feminino")){
            this.sexo = sexo;
        }else{
            System.out.println("Coloque um comando válido");
        }
        
    }
    public void setMes(int mes){
        if(mes >= 1 && mes <= 12){ 
          this.mes = mes;
        }else{
          this.mes = 1;
       }
    }
    public void setDia(int dia){
        if(dia >= 1 && dia <= 30){
            this.dia = dia;
        }else{
            this.dia = 1;
        }
    }
    public void setAno(int ano){
        if(ano >= 1900 && ano <= 2026){
            this.ano = ano;
        }else{
            this.ano = 1900;
        }
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public String getSexo(){
        return sexo;
    }
    public int getMes(){
        return mes;
    }
    public int getDia(){
        return dia;
    }
    public int getAno(){
        return ano;
    }
    public float getAltura(){
        return altura;
    }
    public float getPeso(){
        return peso;
    }
    public int calcularIdade(){
        return (2026 - this.ano); 
    }
    public float calcularImc(){
        return this.peso / (this.altura * this.altura);
    }
}
