/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Credito;

import java.time.YearMonth;
/**
 *
 * @author lucia
 */
public class Credito extends Pagamento{
    private int quantidadeParcelas;
    private final int nroCartao;
    private final YearMonth dataVencimento;
    private final int nroCVV;
    
    public Credito(double valor, int quantidadeParcelas, int nroCartao,
            int mes, int ano, int nroCVV){
        super(valor, 0.95);
        this.quantidadeParcelas = quantidadeParcelas;
        this.nroCartao = nroCartao;
        this.dataVencimento = YearMonth.of(ano, mes);
        this.nroCVV = nroCVV;
    }

    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(int quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public int getNroCartao() {
        return nroCartao;
    }

    public YearMonth getDataVencimento() {
        return dataVencimento;
    }

    public int getNroCVV() {
        return nroCVV;
    }
    
    public void exibeExtratoCredito(){
        super.exibeExtrato();
        System.out.println("Qtd. Parcelas: " + this.getQuantidadeParcelas());
        System.out.println("Nro. Cartao: " + this.getNroCartao());
        System.out.println("Nro.CVV: " + this.getNroCVV());
        System.out.println("Data Vencimento " + this.getDataVencimento());
    }
    
    @Override
    public void realizaPagamento(){
        System.out.println("Pagamento no Credito");
        double valor_total = this.getTaxa() * this.getValor();
        double parcela = valor_total / this.getQuantidadeParcelas();
        System.out.printf("Valor da Taxa: %.2f\n", valor_total);
        System.out.printf("Valor da Parcela: %.2f\n", parcela);
    }
    
    public void exibeExtratoCredito(boolean escondido){
        if(!escondido){
            this.exibeExtratoCredito();
        }
        else{
            super.exibeExtrato();
            System.out.println("Qtd. Parcelas: " + this.getQuantidadeParcelas());
        }
    }
    
}
