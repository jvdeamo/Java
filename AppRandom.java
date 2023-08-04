import java.util.Scanner;
import java.io.PrintStream;
import java.util.Random;

/*
 * Fazer um jogo da forca, onde o usuário digita um número de 0 a 9, caso o número digitado esteja presente, o programa deve informar que o usuário acertou, caso contrário, adicione uma tentativa e informe que o usuário errou, caso o usuário erre 5 vezes, o programa deve informar que o usuário perdeu o jogo.
 * */
public class AppRandom {
    public static void main(String[] Resultado) {
        PrintStream out = System.out;
        Scanner in = new Scanner(System.in);
        Random[] aleatorio = new Random[3];
        int tentativas = 0;
        int numeroAleatorio = 0;

        out.println("Jogo da Forca");
        out.println("-------------");

        /*
         * Para o tamanho do vetor, imprima um underline para cada posição, isto é, para
         * o tamanho do vetor.
         * Por exemplo, vetor tamanho 3, imprima ___
         * vetor tamanho 5, imprima _____
         */
        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = new Random();
            numeroAleatorio = aleatorio[i].nextInt(10);
            out.print(numeroAleatorio);
            out.print("   _");
        }

        out.println();
        out.println("\nDigite um número de 0 a 9: ");
        int numero = in.nextInt();
        boolean acertou = false;

        while (!acertou && tentativas < 5) {
            for (int i = 0; i < aleatorio.length; i++) {
                if (numero == aleatorio[i].nextInt(10)) {
                    out.println("O número está presente!");
                    acertou = true;
                    break; // Encerra o loop ao encontrar o número
                } else if (numero != aleatorio[i].nextInt(10)) {
                    tentativas = tentativas + 1;
                    out.println("O número não está presente!");
                    out.println("Tentativas restantes: " + (6 - (+tentativas)));
                    out.println("Digite outro número:");
                    numero = in.nextInt();
                }
            }

            if (!acertou && tentativas < 5) {
                tentativas = tentativas + 1;
            } else if (tentativas < 5) {
                out.println("Digite outro número:");
                numero = in.nextInt();
            }
        }

        if (!acertou) {
            out.println("Você perdeu o jogo!");
        }

        // out.println("Você acertou o número!");

        in.close();
        // int numeroAleatorio = aleatorio.nextInt(10);
        // System.out.println(aleatorio[i]);
    }
}
