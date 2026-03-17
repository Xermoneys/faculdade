/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.mavenproject1.Ex1;
import java.util.ArrayList;
import Credito.Credito;
import Credito.Pix;
/**
 *
 * @author lucia
 */
public class Executador {
    public static void main(String[] args){
        //TestePessoa.exercicio1();
        //Retangulo.Retangulo.exercicio3();
        //Funcionario.TesteFuncionario.exercicio5();
        //Invoice.TesteInvoice.exercicio6(); 
        //TestePerfil.exercicio7();
        //Funcionario.TesteFuncionarioAprimorado.exercicio8();
        //CarroAprimorado.TesteCarroAprimorado.exercicio10();
        //Data.TesteDataAprimorada.exercicio11();
        //HeartRates.TesteHeartRates.exercicio12();
        //ContaCorrente.TesteContaCorrente.exercicio13();
        //Area.TesteArea.exercicio14();
       
        
    /**Usuario n[] = new Usuario[6];
    n[0] = new Usuario("Luciano","Ventura",24,9,2004);
    n[1] = new Usuario("Joao","Ventura",24,9,2004);
    n[2] = new Usuario("Kaiky","Ventura",24,9,2004);
    n[3] = new Usuario("Lucas","Ventura",24,9,2004);
    n[4] = new Usuario("Joaquin","Ventura",24,9,2004);
    n[5] = new Usuario("Martin","Ventura",24,9,2004);
    for(int i = 0; i < n.length;i++){
        n[i].mostrarDados();
}
**/
    /**ArrayList<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("Luciano","Ventura",24,9,2004));
    usuarios.add(new Usuario("Joao","Ventura",24,9,2004));
    usuarios.add(new Usuario("Kaiky","Ventura",24,9,2004));
    usuarios.add(new Usuario("Lucas","Ventura",24,9,2004));
    usuarios.add(new Usuario("Luciano","Ventura",24,9,2004));
    usuarios.add(new Usuario("Luciano","Ventura",24,9,2004));
    for (Usuario usuario : usuarios){
        System.out.println(usuario.getNome());
        System.out.println(usuario.getIdade());
        System.out.println();
    }
    * **/   
     /*
    ArrayList<String> s1 = new ArrayList<>();
        s1.add("Azul");
        s1.add("Rosa");
        s1.add("Vermelho");
        
        ArrayList<String> s2 = new ArrayList<>();
        s2.add("Azul");
        s2.add("Rosa");
        s2.add("Vermelho");
        
        
        System.out.println(s1.equals(s2));
        System.out.println(comparaArrayLists(s1, s2));
        */
        //System.out.println(Calculadora.PI);
        //System.out.println(Calculadora.expo(2,3));
        
       /* ArrayList<Integer>inteiros = new ArrayList();
        for(int i = 1; i <= 100; i++)
            inteiros.add(i);
        int soma = Calculadora.Somatoria(inteiros);
        System.out.println(soma);
        System.out.println(Calculadora.maior(inteiros));
        */
       
      /* Credito pgto = new Credito(100.00, 3, 123456, 1, 2030, 123);
        pgto.realizaPagamento();
        
        System.out.println();
        
        Pix pgtoPix = new Pix(100.00);
        pgtoPix.realizaPagamento();
        */
    }
    /**
     * Funcao para comparar dois ArrayLists.
     * Os objetos podem de qualquer classe
     * @param l1 (ArrayList): ArrayList com objetos de qualquer classe
     * @param l2 (ArrayList): ArrayList com objetos de qualquer classe
     * @return (boolean) verdadeiro se l1 e l2 sao iguais, false caso contrario
     */
    public static boolean comparaArrayLists(ArrayList l1,ArrayList l2){

        if(l1.size() != l2.size()){
            return false;
        }
        
        for(Object ob: l1){
            if(!l2.contains(ob)){
                return false;
            }
        }
        
        for(Object ob: l2){
            if(!l1.contains(ob)){
                return false;
            }
        }
        return true;
    }
}
