
// Autor: João Victor Martins Deamo
// Date: 07/08/2023
// Version: 1.1
// Senai - Desenvolvimento de Sistemas

import java.io.PrintStream;
import java.util.Scanner;

/*
Pergunta 1: Qual é o número de lados do dado RPG que você deseja criar?
Dica: Crie uma variável inteira dentro da classe para armazenar o número de lados.

Pergunta 2: Como você pode garantir que o número de lados seja sempre um valor positivo?
Dica: Implemente um método que defina o número de lados e verifique se ele é maior que 0.

Pergunta 3: Como você pode gerar um número aleatório entre 1 e o número de lados do dado?
Dica: Utilize a classe "Random" do Java para gerar o número aleatório.

Pergunta 4: Qual é o tipo de retorno do método que simula o lançamento do dado?
Dica: O método deve retornar um valor inteiro representando o resultado do lançamento.

 */

public class DadosRPG {

    static int lados;
    static int lancamentos;
    static int[] resultados;
    static int[] frequencia;
    static int[] percentual;
    static int soma;
    static int maior;
    static int menor;
    static int posicaoMaior;
    static int posicaoMenor;

    public static void main(String[] Resultados) {
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        out.println("\033[H\033[2J");
        out.println(Welcome());
        Calculos();
        Impressao();
    }

    public static String Welcome() {
        return "Bem vindo ao Dados RPG!";
    }

    public static void Calculos() {
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        out.println("Digite o número de lados do dado: ");
        lados = in.nextInt();
        if (lados <= 0) {
            out.println("Número de lados inválido!");
            return;
        }
        out.println("Digite o número de lançamentos: ");
        lancamentos = in.nextInt();
        resultados = new int[lancamentos];
        frequencia = new int[lados];
        percentual = new int[lados];
        soma = 0;
        maior = 0;
        menor = lancamentos; // Inicializa com um valor maior que o número de lançamentos
        posicaoMaior = 0;
        posicaoMenor = 0;
        for (int i = 0; i < lancamentos; i++) {
            resultados[i] = (int) (Math.random() * lados + 1);
            soma = soma + resultados[i];
            frequencia[resultados[i] - 1] = frequencia[resultados[i] - 1] + 1;
        }
        for (int i = 0; i < lados; i++) {
            percentual[i] = (frequencia[i] * 100) / lancamentos;
            if (frequencia[i] > maior) {
                maior = frequencia[i];
                posicaoMaior = i;
            }
            if (frequencia[i] < menor) {
                menor = frequencia[i];
                posicaoMenor = i;
            }
        }
    }

    public static void Impressao() {
        PrintStream out = System.out;
        out.println("\033[H\033[2J");
        out.println("Dados RPG");
        out.println("Número de lados: " + lados);
        out.println("Número de lançamentos: " + lancamentos);
        out.println("Resultados: ");
        for (int i = 0; i < lancamentos; i++) {
            out.println("Lançamento " + (i + 1) + " - lado " + resultados[i]);
        }
        out.println("Soma dos resultados: " + soma);
        out.println("Frequência dos resultados: ");
        for (int i = 0; i < lados; i++) {
            out.println("Lado " + (i + 1) + ": " + frequencia[i] + " (" + percentual[i] + "%)");
        }
        out.println("Lado mais frequente: " + (posicaoMaior + 1));
        out.println("Lado menos frequente: " + (posicaoMenor + 1));
    }
}
