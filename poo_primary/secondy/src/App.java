import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obter dados do cidadão
        System.out.print("Nome do cidadão: ");
        String nome = scanner.nextLine();

        System.out.print("Profissão: ");
        String profissao = scanner.nextLine();

        System.out.print("Local de trabalho: ");
        String localTrabalho = scanner.nextLine();

        System.out.print("Salário base (em KZs): ");
        double salarioBase = scanner.nextDouble();

        System.out.print("Índice de álcool no sangue: ");
        double indiceAlcool = scanner.nextDouble();

        // Verificar as condições e aplicar multas
        if (indiceAlcool >= 3 && indiceAlcool <= 5) {
            // Condução suspensa por uma semana e multa de 12%
            System.out.println("Condução suspensa por uma semana. Aplicada multa de 12% do salário.");
            double multa = 0.12 * salarioBase;
            System.out.println("Multa a pagar: " + multa + " KZs");
        } else if (indiceAlcool > 5) {
            // Condução suspensa por 30 dias e multa de 30%
            System.out.println("Condução suspensa por 30 dias. Aplicada multa de 30% do salário.");
            double multa = 0.30 * salarioBase;
            System.out.println("Multa a pagar: " + multa + " KZs");
        } else if (indiceAlcool < 3) {
            // Condução suspensa por 72 horas, sem multa
            System.out.println("Condução suspensa por 72 horas. Sem multa.");
        }

        // Verificar o pagamento da multa antes de liberar a viatura
        System.out.print("Confirmar pagamento da multa (S/N): ");
        char confirmacao = scanner.next().charAt(0);

        if (confirmacao == 'S' || confirmacao == 's') {
            System.out.println("Viatura liberada.");
        } else {
            System.out.println("Viatura não liberada até o pagamento da multa.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
