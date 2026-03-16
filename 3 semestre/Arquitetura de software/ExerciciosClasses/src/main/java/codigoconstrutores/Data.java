/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoconstrutores;

/**
 *
 * @author andrezanon
 */
public final class Data {
    
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public Data(int dia, String mes, int ano){
        this.dia = dia;
        this.mes = this.mesStringParaInt(mes);
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    
    public int getDia(){
        return this.dia;
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    public void data1(){
        System.out.printf("%d/%d/%d\n", 
                this.getMes(), this.getDia(), this.getAno());
    }
    
    public void data2(){
        System.out.printf("%s %d, %d\n", 
                this.mesIntParaString(), this.getDia(), this.getAno());
    }
    
    public String mesIntParaString(){
        int mes = this.getMes();
        if(mes == 1){
            return "Janeiro";
        }
        else if(mes == 2){
            return "Fevereiro";
        }
        else if(mes == 3){
            return "Marco";
        }
        else if(mes == 4){
            return "Abril";
        }
        else if(mes == 5){
            return "Maio";
        }
        else if(mes == 6){
            return "Junho";
        }
        else if(mes == 7){
            return "Julho";
        }
        else if(mes == 8){
            return "Agosto";
        }
        else if(mes == 9){
            return "Setembro";
        }
        else if(mes == 10){
            return "Outubro";
        }
        else if(mes == 11){
            return "Novembro";
        }
        else if(mes == 12){
            return "Dezembro";
        }
        else{
            return "";
        }
    }
    
    public int mesStringParaInt(String mes){
        if(mes.equals("Janeiro")){
            return 1;
        }
        else if(mes.equals("Fevereiro")){
            return 2;
        }
        else if(mes.equals("Marco")){
            return 3;
        }
        else if(mes.equals("Abril")){
            return 4;
        }
        else if(mes.equals("Maio")){
            return 5;
        }
        else if(mes.equals("Junho")){
            return 6;
        }
        else if(mes.equals("Julho")){
            return 7;
        }
        else if(mes.equals("Agosto")){
            return 8;
        }
        else if(mes.equals("Setembro")){
            return 9;
        }
        else if(mes.equals("Outubro")){
            return 10;
        }
        else if(mes.equals("Novembro")){
            return 11;
        }
        else if(mes.equals("Dezembro")){
            return 12;
        }
        else{
            return -1;
        }
    }
    
    public void data3(){
        System.out.printf("%d/%d/%d\n", 
                this.getDia(), this.getMes(), this.getAno());
    }
    
    public void mostraDatas(){
        System.out.println("--- Data 1 ---");
        this.data1();
        
        System.out.println("--- Data 2 ---");
        this.data2();
        
        System.out.println("--- Data 3 ---");
        this.data3();
    }
    
}
