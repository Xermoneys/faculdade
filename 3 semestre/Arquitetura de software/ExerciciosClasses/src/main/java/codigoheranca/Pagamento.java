/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoheranca;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author andrezanon
 */
public class Pagamento {
    private final String idTransacao;
    private final double valor;
    private final LocalDateTime data;
    protected String status;
    private final double taxa;
    
    public Pagamento(double valor, double taxa){
        this.idTransacao = UUID.randomUUID().toString();
        this.valor = valor;
        this.data = LocalDateTime.now();
        this.status = "Pendente";
        this.taxa = taxa;
    }

    public String getIdTransacao() {
        return idTransacao;
    }

    public double getValor() {
        return valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }
    
    public double getTaxa(){
        return taxa;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void realizaPagamento(){
        System.out.println("Pagamento Realizado");
    }
    
    public void exibeExtrato(){
        System.out.println("ID: " + this.getIdTransacao());
        System.out.println("Data Transacao: " + this.getData());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Status: " + this.getStatus());
    }
}
