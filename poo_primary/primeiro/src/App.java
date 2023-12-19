public class App {
    public static void main(String[] args) throws Exception {
        double orcamento_miguel = 120865;
        double umKwat = 0.02 * orcamento_miguel;
        double desconto5P = 0.05 * umKwat;
        
        int eletroDomesticos = 3;
        int lampadas = 4;
        int consumoDiario = eletroDomesticos + lampadas;
        int mensalmente = 31;
        int consumoMensal = consumoDiario * mensalmente;

        double valorReal = desconto5P * consumoMensal;
        if(valorReal > 0.5 * orcamento_miguel)
        {
            System.out.println("Miguel deves efectuar o pagamento urgentemente");
        }

        System.out.println("O valor em KZs de cada KiloWatt é de: " + umKwat + " kws");
        System.out.println("O valor a ser pago na nova resiência, sabendo que tem um desconto de 5 porcento é de: " + valorReal + " kws");
    }
}
