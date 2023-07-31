// Autor: João Victor Martins Deamo
// Date: 31/07/2023
// Version: 1.0
// Senai - Desenvolvimento de Sistemas
import java.util.Scanner;
import java.io.PrintStream; // Importar a classe PrintStream para imprimir
import java.util.Arrays; // Importar a classe Arrays para ordenar o vetor

public class AppSenai {
    private float largura;
    private float altura;

    public static void main(String[] args) {

        // Instanciando a classe AppSenai
        AppSenai app = new AppSenai();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a largura do retângulo: ");
        float valor1 = scanner.nextFloat();
        System.out.println("Digite a altura do retângulo: ");
        float valor2 = scanner.nextFloat();
        app.CalcularRetangulo(valor1, valor2);
        System.out.printf("Largura: %.2f.\n", app.largura);
        System.out.printf("Altura: %.2f.\n", app.altura);
        System.out.printf("Área do retângulo: %.2f.\n", app.CalcularRetangulo(valor1, valor2));

        // AppSenai.vetor();
        vetor();

        scanner.close();
    }

    // Construtor
    public float CalcularRetangulo(float largura, float altura) {
        this.largura = largura;
        this.altura = altura;
        return this.largura * this.altura;
    }

    public static void vetor() {
        PrintStream out = System.out;
        out.println("\033[H\033[2J");
        Scanner scanner = new Scanner(System.in);

        // Vetor com tamanho definido pelo usuário
        System.out.println("Digite o tamanho do vetor:");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];
        System.out.println("Elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println();

        // Vetor com valores pré-definidos
        int[] vetor2 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        System.out.println("Elementos do vetor:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " ");
        }
        System.out.println();
        System.out.println("Primeiro elemento do vetor: " + vetor2[0]);
        System.out.println("Último elemento do vetor: " + vetor2[vetor2.length - 1]);
        System.out.println("Comprimento do vetor: " + vetor2.length);

        // Ordenando o vetor
        Arrays.sort(vetor2);
        System.out.println("Elementos do vetor ordenado:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " ");
        }
        System.out.println();
        System.out.print("Digite o tamanho do array: ");
        int tamanho1 = scanner.nextInt();

        float[] vetor1 = new float[tamanho1];

        // Preenchendo o array
        for (int i = 0; i < tamanho1; i++) {
            System.out.print((i + 1) + " ");
            vetor1[i] = i;
            System.out.println();
        }
        scanner.close();
    }

}
