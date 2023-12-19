import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String palavraSecreta = "banana";
        int tentativas = 6;
        StringBuilder palavraDescoberta = new StringBuilder();
        StringBuilder letrasErradas = new StringBuilder();

        inicializarPalavraDescoberta(palavraSecreta, palavraDescoberta);

        try (Scanner scanner = new Scanner(System.in)) {
            while (tentativas > 0 && palavraDescoberta.toString().contains("_")) {
                exibirStatusJogo(palavraDescoberta, tentativas, letrasErradas);

                char letra = obterLetra(scanner);

                if (palavraSecreta.contains(String.valueOf(letra))) {
                    atualizarPalavraDescoberta(palavraSecreta, palavraDescoberta, letra);
                } else {
                    atualizarLetrasErradas(letrasErradas, letra);
                    tentativas--;
                }
            }

            exibirResultadoFinal(palavraSecreta, palavraDescoberta);
        }
    }

    private static void inicializarPalavraDescoberta(String palavraSecreta, StringBuilder palavraDescoberta) {
        for (int i = 0; i < palavraSecreta.length(); i++) {
            palavraDescoberta.append("_");
        }
    }

    private static void exibirStatusJogo(StringBuilder palavraDescoberta, int tentativas, StringBuilder letrasErradas) {
        System.out.println("Palavra: " + palavraDescoberta);
        System.out.println("Tentativas restantes: " + tentativas);
        System.out.println("Letras erradas: " + letrasErradas);
        System.out.print("Digite uma letra: ");
    }

    private static char obterLetra(Scanner scanner) {
        String entrada;
        do {
            System.out.print("Digite uma letra: ");
            entrada = scanner.nextLine();
        } while (entrada.isEmpty() || !Character.isLetter(entrada.charAt(0)));

        return entrada.charAt(0);
    }

    private static void atualizarPalavraDescoberta(String palavraSecreta, StringBuilder palavraDescoberta, char letra) {
        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (palavraSecreta.charAt(i) == letra) {
                palavraDescoberta.setCharAt(i, letra);
            }
        }
    }

    private static void atualizarLetrasErradas(StringBuilder letrasErradas, char letra) {
        letrasErradas.append(letra).append(" ");
    }

    private static void exibirResultadoFinal(String palavraSecreta, StringBuilder palavraDescoberta) {
        if (palavraDescoberta.toString().contains("_")) {
            System.out.println("Você perdeu! A palavra secreta era: " + palavraSecreta);
        } else {
            System.out.println("Parabéns! Você acertou a palavra: " + palavraDescoberta);
        }
    }
}
