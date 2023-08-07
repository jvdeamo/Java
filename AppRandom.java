import java.util.Scanner;
import java.io.PrintStream;
import java.util.Random;

/*
  Fazer um jogo da forca, onde o usuário digita um número de 0 a 9, caso o número digitado esteja presente, o programa deve informar que o usuário acertou, caso contrário, adicione uma tentativa e informe que o usuário errou, caso o usuário erre 5 vezes, o programa deve informar que o usuário perdeu o jogo.
 */
public class AppRandom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        Random[] aleatorio = new Random[3];
        int tentativas = 0;
        int[] numerosAleatorios = new int[3];

        out.println("\033[H\033[2J");
        out.println("Jogo da Forca");
        out.println("-------------");

        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = new Random();
            numerosAleatorios[i] = aleatorio[i].nextInt(10);
            out.print("   _");
        }
        out.println("\n");
        for (int i = 0; i < numerosAleatorios.length; i++) {
            out.print(" " + numerosAleatorios[i]);
        }

        out.println();
        out.println("\nVocê tem 5 tentativas para acertar o número!");

        boolean acertou = false;

        while (acertou == false && tentativas < 5) {
            out.print("Digite um número de 0 a 9: ");
            int numero = in.nextInt();

            for (int i = 0; i < numerosAleatorios.length; i++) {
                if (numero == numerosAleatorios[i]) {
                    acertou = true;
                    break; // Sai do loop
                }
            }

            if (acertou == true) {
                out.println("Parabéns, você acertou um número!");
                break;
            } else {
                out.println("O número não está presente!");
                tentativas = tentativas + 1;
                out.println("Tentativas: " + (5 - tentativas));
            }
        }

        if (!acertou) {
            out.println("Você perdeu o jogo!");
        }

        in.close();
    }
}
