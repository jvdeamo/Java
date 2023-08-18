package java_src.src;

// Autor: João Victor Martins Deamo
// Date: 18/08/2023
// Version: 1.0
// Senai - Desenvolvimento de Sistemas
import java.util.*;
import java.io.PrintStream; // Importar a classe PrintStream para imprimir
import java.util.Scanner; // Importar a classe Scanner para ler
import java.util.Random; // Importar a classe Random para gerar números aleatórios

/*
Título do Trabalho: Jogo da Forca em Java

Descrição:
Você foi contratado como desenvolvedor(a) para criar um Jogo da Forca em Java para auxiliar estudantes no aprendizado de palavras e vocabulário. O jogo deverá ser implementado em modo texto (console) e seguir as seguintes especificações:

*/
public class AppTrabalho1 {
    public static void main(String[] Forca) {
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        out.println("\033[H\033[2J");
        /* Palavra secreta
        out.println("Digite a palavra secreta: ");
        String palavraSecreta = in.nextLine();
         */
        boolean palavraValida = false;
        String[] palavraAtual = {"Java", "Lemon", "Venon", "Demon", "Canon" };
        int tentativas = 0;
        Random aleatorio = new Random(); // Cria um objeto Random para gerar números aleatórios

        for (int i = 0; i < palavraAtual.length; i++) {
            out.print("_");
            // randomizar a palavra atual
            palavraAtual[i] = aleatorio.toString();
            palavraAtual[i] = palavraAtual[i].substring(0, 1).toUpperCase() + palavraAtual[i].substring(1);
            out.printf("Palavra atual : %s\n", palavraAtual[i]);
        }
        /* Exibe a palavra atual
        out.printf("Você tem 5 tentativas para acertar. \nPalavra atual : %s\n", palavraAtual[i]]);
 */
        // Loop principal do jogo
        while (!palavraValida) {
            // Solicita ao jogador que digite uma letra
            out.print("Digite uma letra: ");
            char letra = in.next().charAt(0);
            boolean LetraVerdadeiro = false;
            for (int i = 0; i < palavraAtual.length; i++) {
                if (palavraAtual[i].charAt(i) == letra) {
                    LetraVerdadeiro = true;
                    letra = palavraAtual[i].charAt(i);
                    // definir cada caractere para a palavra atual
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

            if (palavraAtual.toString().equals(palavraAtual)) {
                out.println("\033[H\033[2J");
                out.printf("\nParabéns, você acertou a palavra: [%s]. ", palavraAtual);
                palavraValida = true;
            }
        }

        in.close();
    }

}
