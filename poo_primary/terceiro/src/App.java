import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o tipo de usuário (peão, carro, ambulância, caravana)
        System.out.print("Digite o tipo de usuário (peão, carro, ambulância, caravana): ");
        String tipoUsuario = scanner.nextLine();

        // Solicitar o estado do semáforo (vermelho, amarelo, verde)
        System.out.print("Digite o estado do semáforo (vermelho, amarelo, verde): ");
        String estadoSemaforo = scanner.nextLine();

        // Verificar as condições de travessia ou passagem
        if (tipoUsuario.equalsIgnoreCase("peão")) {
            if (estadoSemaforo.equalsIgnoreCase("vermelho")) {
                System.out.println("Pare. Não atravesse a estrada com a luz vermelha do semáforo.");
            } else if (estadoSemaforo.equalsIgnoreCase("amarelo")) {
                System.out.println("Corra. A luz do semáforo está amarela.");
            } else if (estadoSemaforo.equalsIgnoreCase("verde")) {
                System.out.println("Atravesse a estrada. A luz do semáforo está verde.");
            }
        } else if (tipoUsuario.equalsIgnoreCase("carro")) {
            if (estadoSemaforo.equalsIgnoreCase("vermelho")) {
                System.out.println("Pare. Não passe com a luz vermelha do semáforo.");
            } else if (estadoSemaforo.equalsIgnoreCase("amarelo")) {
                System.out.println("Passe com cuidado. A luz do semáforo está amarela.");
            } else if (estadoSemaforo.equalsIgnoreCase("verde")) {
                System.out.println("Passe. A luz do semáforo está verde.");
            }
        } else if (tipoUsuario.equalsIgnoreCase("ambulância")) {
            System.out.println("Passe sempre, mesmo com a luz vermelha. (Casos excecionais)");
        } else if (tipoUsuario.equalsIgnoreCase("caravana")) {
            System.out.print("Digite o número de viaturas na caravana: ");
            int numeroViaturas = scanner.nextInt();

            if (numeroViaturas <= 3 && estadoSemaforo.equalsIgnoreCase("vermelho")) {
                System.out.println("Passe as 3 primeiras viaturas, mesmo com a luz vermelha. (Casos excecionais)");
            } else {
                System.out.println("Aguarde. As caravanas só passam com a luz vermelha em casos excecionais.");
            }
        } else {
            System.out.println("Tipo de usuário inválido.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
