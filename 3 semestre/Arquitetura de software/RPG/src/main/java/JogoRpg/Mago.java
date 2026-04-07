/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoRpg;

/**
 *
 * @author lucia
 */
public class Mago extends Personagem {
    protected int mana;
    protected int inteligencia;

    public Mago(String nome, int vida, int nivel, int ataqueBase, int mana, int inteligencia) {
        super(nome, vida, nivel, ataqueBase);
        this.mana = mana;
        this.inteligencia = inteligencia;
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano;

        if (mana >= 10) {
           dano = ataqueBase + (inteligencia * 2);
            mana -= 10;
            System.out.println(nome + " lancou magia contra " + inimigo.getNome());
            System.out.println("Mana restante: " + mana);
        } else {
            dano = ataqueBase;
            System.out.println(nome + " atacou sem mana!");
        }

        inimigo.receberDano(dano);
    }
}
