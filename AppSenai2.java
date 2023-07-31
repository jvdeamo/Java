
// João Victor Martins Deamo
// Date: 31/07/2023
// Version: 1.1
// Senai - Desenvolvimento de Sistemas
import java.util.Scanner;
import java.io.PrintStream;

// Exercício 1 Crie um programa que declare um vetor com 5 números inteiros. Em seguida, some todos os elementos do vetor e exiba o resultado.

// Exercício 2 Crie um programa que declare um vetor com 3 nomes de frutas. Peça ao usuário para digitar um número de 0 a 2 e mostre o nome da fruta correspondente.

// Exercício 3 Crie um programa que declare um vetor com 8 números inteiros. Em seguida, encontre e exiba o maior valor presente no vetor.

// Exercício 4 Crie um programa que declare um vetor com 6 notas de alunos (valores de 0 a 10). Calcule a média dessas notas e exiba o resultado.
// Exercício 5 Crie um programa que declare um vetor com 7 números inteiros. Conte quantos deles são números pares e exiba o resultado.
public class AppSenai2 {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
        Vetores.main(main);
        scanner.close();
    }
}

class Vetores {

    public static void main(String[] Resultados) {
        PrintStream out = System.out;
        out.println("\033[H\033[2J");
        Scanner scanner = new Scanner(System.in);
        Vetores.Exercício1();
        Vetores.Exercício2();
        Vetores.Exercício3();
        Vetores.Exercício4();
        Vetores.Exercício5();
        scanner.close();
    }

    public static void Exercício1() {
        PrintStream out = System.out;
        out.println("Exercício 1");
        int[] vetor = { 1, 2, 3, 4, 5 };
        out.println("Elementos do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            out.printf("[%d] ", vetor[i]);
        }
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        out.printf("\nSoma dos elementos do vetor: %d.\n", soma);
    }

    public static void Exercício2() {
        PrintStream out = System.out;
        out.println("\nExercício 2");
        String[] frutas = { "Manga", "Banana", "Tomate" };
        Scanner scanner = new Scanner(System.in);
        out.println("Frutas disponíveis:");
        for (int i = 0; i < frutas.length; i++) {
            out.printf("[%d] %s.\n", i, frutas[i]);
        }
        out.println("Escolha uma fruta: ");
        int valor = scanner.nextInt();
        try {
            frutas[valor].length();
        } catch (Exception e) {
            out.println("Número inválido!");
            out.println("Escolha uma fruta: ");
            valor = scanner.nextInt();
        }
        out.printf("Fruta selecionada: %s.\n", frutas[valor]);
        scanner.close();
    }

    public static void Exercício3() {
        PrintStream out = System.out;
        out.println("\nExercício 3");
        int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8 };
        out.println("Elementos do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            out.printf("[%d] ", vetor[i]);
        }
        int maiorValor = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
                /*
                 * vetor[0] > vetor[0] vetor[1] > vetor[0] vetor[2] > vetor[1] vetor[3] >
                 * vetor[2] vetor[4] > vetor[3]vetor[5] > vetor[4] vetor[6] > vetor[5] vetor[7]
                 * > vetor[6]
                 * 
                 */
            }
        }
        out.printf("\nMaior valor do vetor: %d.\n", maiorValor);
    }

    public static void Exercício4() {
        PrintStream out = System.out;
        Scanner scanner = new Scanner(System.in);
        out.println("\nExercício 4");
        float[] vetor = { 4, 6, 8, 10, 2, 5 };
        out.printf("Notas do aluno: \n");
        for (float notas : vetor) {
            out.printf("Nota [%.1f]\n", notas);
        }

        float soma = 0;
        for (float notas : vetor) {
            soma = soma + notas;
        }
        /*
         * float media = soma / vetor.length;
         * out.printf("Média das notas do aluno: %.2f.\n", media);
         */
        out.printf("Média das notas do aluno: [%.2f].\n", soma / vetor.length);
    }

    public static void Exercício5() {
        PrintStream out = System.out;
        out.println("\nExercício 5");
        int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8 };
        out.println("Elementos do vetor: ");
        for (int numeros : vetor) {
            out.printf("[%d] ", numeros);
        }
        int pares = 0;
        for (int paresVetor : vetor) {
            if (paresVetor % 2 == 0) {
                pares++;
            }
        }
        out.printf("\nQuantidade de números pares: %d.\n", pares);
    }

}
