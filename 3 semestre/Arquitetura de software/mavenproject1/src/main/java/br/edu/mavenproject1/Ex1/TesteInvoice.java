
git stpackage br.edu.mavenproject1.Ex1;

/**
 *
 * @author lucia
 */
public class TesteInvoice {
    public static void exercicio6(){
        Invoice prod1 = new Invoice();
        Invoice prod2 = new Invoice();
        
        prod1.setIdentificador("p9Zo3sZkSK");
        prod1.setDescricao("Fone de ouvido Marca iFEI");
        prod1.setPreco(1250.00);
        prod1.setQuantidade(17);
        
        prod2.setIdentificador("p2LsIkns89");
        prod2.setDescricao("Mouse Marca iFEI");
        prod2.setPreco(800.00);
        prod2.setQuantidade(53);
        
        System.out.println("Dados do produto 1");
        System.out.println("Identificador: "+prod1.getIdentificador()+ " |Descricao: " +prod1.getDescricao()+" |Preco: " +prod1.getPreco()+ " |Quantidade: " +prod1.getQuantidade());
        System.out.println("Invoice Amount: " +prod1.getInvoiceAmount());
        
        System.out.println("Dados do produto 2");
        System.out.println("Identificador: "+prod2.getIdentificador()+ " |Descricao: " +prod2.getDescricao()+" |Preco: " +prod2.getPreco()+ " |Quantidade: " +prod2.getQuantidade());
        System.out.println("Invoice Amount: " +prod2.getInvoiceAmount());
        
}
}
