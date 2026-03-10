package Data;


//ver isso de ver
public class Data {

    private int dia;
    private int mes;
    private int ano;

    // Construtor com mês inteiro
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Construtor com mês em String
    public Data(int dia, String mes, int ano) {
        this.dia = dia;
        this.mes = mesStringParaInt(mes);
        this.ano = ano;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    // Converte número do mês para nome
    public String mesIntParaString() {
        switch (this.mes) {
            case 1: return "Janeiro";
            case 2: return "Fevereiro";
            case 3: return "Março";
            case 4: return "Abril";
            case 5: return "Maio";
            case 6: return "Junho";
            case 7: return "Julho";
            case 8: return "Agosto";
            case 9: return "Setembro";
            case 10: return "Outubro";
            case 11: return "Novembro";
            case 12: return "Dezembro";
            default: return "Mês inválido";
        }
    }

    // Converte nome do mês para número
    private int mesStringParaInt(String mes) {
        switch (mes.toLowerCase()) {
            case "janeiro": return 1;
            case "fevereiro": return 2;
            case "março": return 3;
            case "abril": return 4;
            case "maio": return 5;
            case "junho": return 6;
            case "julho": return 7;
            case "agosto": return 8;
            case "setembro": return 9;
            case "outubro": return 10;
            case "novembro": return 11;
            case "dezembro": return 12;
            default: return 0;
        }
    }

    // Formato: Março 10, 2025
    public void data1() {
        System.out.printf("%s %d, %d\n", mesIntParaString(), dia, ano);
    }

    // Formato: 10 Março 2025
    public void data2() {
        System.out.printf("%d %s %d\n", dia, mesIntParaString(), ano);
    }

    // Formato: 10/03/2025
    public void data3() {
        System.out.printf("%02d/%02d/%d\n", dia, mes, ano);
    }
}