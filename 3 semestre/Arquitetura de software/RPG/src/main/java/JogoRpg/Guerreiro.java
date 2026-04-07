/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoRpg;

/**
 *
 * @author lucia
 */
public class Guerreiro extends Personagem {

    protected int forca;
    protected int defesa;

    public Guerreiro(String nome, int vida, int nivel, int ataqueBase, int forca, int defesa) {
        super(nome, vida, nivel, ataqueBase);
        this.forca = forca;
        this.defesa = defesa;
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = ataqueBase + forca;

        System.out.println(nome + " (Guerreiro) atacou " + inimigo.getNome());

        inimigo.receberDano(dano);
    }

    @Override
    public void receberDano(int dano) {

        int danoFinal = dano - defesa;

        if (danoFinal < 0) {
            danoFinal = 0;
        }

        System.out.println(nome + " defendeu parte do dano com defesa " + defesa);

        super.receberDano(danoFinal);
    }
}
