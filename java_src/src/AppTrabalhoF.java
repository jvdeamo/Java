package java_src.src;

// Autor: João Victor Martins Deamo
// Date: 18/08/2023
// Version: 1.1
// Senai - Desenvolvimento de Sistemas
import java.io.PrintStream; // Importar a classe PrintStream para imprimir
import java.util.Scanner; // Importar a classe Scanner para ler
import java.util.Random; // Importar a classe Random para gerar números aleatórios

public class AppTrabalhoF {
    public static void main(String[] Forca) {
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        out.println("\033[H\033[2J");
        // Palavra secreta
        out.println("Digite a palavra secreta: ");
        String palavraSecreta = in.nextLine();
        boolean palavraValida = false;
        StringBuilder palavraAtual = new StringBuilder();
        int tentativas = 0;

        for (int i = 0; i < palavraSecreta.length(); i++) {
            palavraAtual.append("_");
        }
        // Exibe a palavra atual
        out.printf("Você tem 5 tentativas para acertar. \nPalavra atual : %s\n", palavraAtual);

        // Loop principal do jogo
        while (!palavraValida) {
            // Solicita ao jogador que digite uma letra
            out.print("Digite uma letra: ");
            char letra = in.next().charAt(0);
            boolean LetraVerdadeiro = false;
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    LetraVerdadeiro = true;
                    palavraAtual.setCharAt(i, letra);
                }
            }
            out.printf("Palavra atual : %s\n", palavraAtual);

            if (LetraVerdadeiro) {
                out.println("Letra correta! ");
            } else {
                tentativas = tentativas + 1;
                out.println("Letra incorreta! ");
            }
            if (tentativas == 5) {
                out.println("Você perdeu!");
                palavraValida = true;
                break;
            }

            if (palavraAtual.toString().equals(palavraSecreta)) {
                out.println("\033[H\033[2J");
                out.printf("\nParabéns, você acertou a palavra: [%s]. ", palavraSecreta);
                palavraValida = true;
            }
        }

        in.close();
    }
}
