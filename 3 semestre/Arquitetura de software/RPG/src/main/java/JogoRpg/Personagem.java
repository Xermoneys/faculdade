/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoRpg;

/**
 *
 * @author lucia
 */
public abstract class Personagem {

    protected String nome;
    protected int vida;
    protected final int nivel;
    protected final int ataqueBase;

    public Personagem(String nome, int vida, int nivel, int ataqueBase) {
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
        this.ataqueBase = ataqueBase;
    }

    public abstract void atacar(Personagem inimigo);

    public void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) {
            vida = 0;
        }

        System.out.println(nome + " recebeu " + dano + " de dano.");
        System.out.println("Vida restante de " + nome + ": " + vida);
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }
}
