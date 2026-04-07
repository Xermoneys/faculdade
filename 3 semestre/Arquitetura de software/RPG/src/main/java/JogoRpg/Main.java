/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoRpg;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author lucia
 */
public class Main {
     public static void main(String[] args) {

        Personagem guerreiro = new Guerreiro(
                "Thorin",
                120,
                5,
                15,
                10, // força
                8   // defesa
        );

        Personagem mago = new Mago(
                "Merlin",
                80,
                5,
                10,
                40, // mana
                12  // inteligencia
        );

        Personagem arqueiro = new Arqueiro(
                "Legolas",
                90,
                5,
                12,
                14, // precisão
                20  // agilidade (20% critico)
        );

        List<Personagem> personagens = new ArrayList<>();
        personagens.add(guerreiro);
        personagens.add(mago);
        personagens.add(arqueiro);

        System.out.println("--- BATALHA ---\n");

        guerreiro.atacar(mago);
        mago.atacar(guerreiro);
        arqueiro.atacar(mago);

        System.out.println("\n--- STATUS ---");
        mostrarStatus(personagens);
    }

    public static void mostrarStatus(List<Personagem> personagens) {

        for (Personagem p : personagens) {
            System.out.println(p.getNome() + " | Vida: " + p.getVida());
        }

    }

}

