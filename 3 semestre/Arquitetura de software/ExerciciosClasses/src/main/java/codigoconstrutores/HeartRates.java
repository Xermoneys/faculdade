/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoconstrutores;

/**
 *
 * @author andrezanon
 */
public class HeartRates {
    Pessoa pessoa;
    
    public HeartRates(String nome, String sobrenome,
        int dia, int mes, int ano){
        
        this.pessoa = new Pessoa(nome, sobrenome, dia, mes, ano);
    }
    
    private Pessoa getPessoa(){
        return this.pessoa;
    }
    
    public int freqMaxima(){
        return 220 - this.getPessoa().getIdade();
    }
    
    public int freqAlvoMin(){
        double alvoMin = this.freqMaxima() * 0.5;
        return (int) alvoMin;
    }
    
    public int freqAlvoMax(){
        double alvoMin = this.freqMaxima() * 0.85;
        return (int) alvoMin;
    }
    
    public void mostraDados(){
        this.getPessoa().mostraDadados();
        System.out.println("--- Dados de Frequencia Cardiaca ---");
        System.out.printf("Frequencia Maxima: %d\n", this.freqMaxima());
        System.out.printf("Frequencia Alvo [%d-%d]\n", this.freqAlvoMin(),
                this.freqAlvoMax());
    }
}
