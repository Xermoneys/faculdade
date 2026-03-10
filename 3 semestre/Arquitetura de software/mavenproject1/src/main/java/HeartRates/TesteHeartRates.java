/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HeartRates;

import ContaCorrente.ContaCorrente;
import Usuario.Usuario;
import java.util.ArrayList;
/**
 *
 * @author feisplmonegatto
 */
public class TesteHeartRates {
   public static void exercicio12(){
    Usuario u = new Usuario("Luciano","Ventura",24,9,2004);
    HeartRates hr = new HeartRates(u);
    
    u.mostrarDados();
    hr.mostrarDados();
    }
}
