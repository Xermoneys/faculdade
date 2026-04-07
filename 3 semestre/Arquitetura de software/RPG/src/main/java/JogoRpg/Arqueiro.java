/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoRpg;

/**
 *
 * @author lucia
 */

public class Arqueiro extends Personagem {

    protected int precisao;
    protected int agilidade;

    public Arqueiro(String nome, int vida, int nivel, int ataqueBase, int precisao, int agilidade) {
        super(nome, vida, nivel, ataqueBase);
        this.precisao = precisao;
        this.agilidade = agilidade;
    }

    @Override
    public void atacar(Personagem inimigo) {

        int dano = ataqueBase + precisao;

        System.out.println(nome + " (Arqueiro) atacou " + inimigo.getNome());

        inimigo.receberDano(dano);
    }
}
