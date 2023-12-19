import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Salário de Miguel
        double salarioMiguel = 120865.00;

        // Custo por kilowatt (2% do salário)
        double custoPorKw = 0.02 * salarioMiguel;

        // Desconto para novo morador (5%)
        double descontoNovoMorador = 0.05;

        // Custo real por kilowatt com desconto
        double custoRealPorKw = custoPorKw * (1 - descontoNovoMorador);

        // Consumo médio diário de eletrodomésticos e lâmpadas
        int consumoEletrodomesticos = 3; // kW/dia
        int consumoLampadas = 4; // kW/dia

        // Consumo total diário
        int consumoTotalDiario = consumoEletrodomesticos + consumoLampadas;

        // Consumo total mensal
        int diasNoMes = 30; // Supondo um mês com 30 dias
        int consumoTotalMensal = consumoTotalDiario * diasNoMes;

        // Valor total a ser pago
        double valorTotal = custoRealPorKw * consumoTotalMensal;

        // Verificar se o consumo total excede 50% do salário
        if (valorTotal > 0.5 * salarioMiguel) {
            System.out.println("ALERTA: O consumo total excede 50% do salário. Efetue o pagamento urgente!");
        }

        // Imprimir os resultados
        System.out.println("Valor em KZs de cada kilowatt: " + custoPorKw);
        System.out.println("Valor real a ser pago na nova residência: " + valorTotal);
        System.out.println("Valor a ser pago com desconto: " + (valorTotal * (1 - descontoNovoMorador)));
    }
}
