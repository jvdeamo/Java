package java_src.src;

// Autor: João Victor Martins Deamo
// Date: 07/08/2023
// Version: 1.1
// Senai - Desenvolvimento de Sistemas

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

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

public class DadosRPG { // classe

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

    public static void main(String[] Resultados) { // método main
        PrintStream out = System.out;
        out.println("\033[H\033[2J");
        out.println(Welcome());
        Calculos();
        Impressao();
        // Again();
    }

    /* 5 */
    public static String Welcome() { // método boas vindas
        return "Bem vindo ao Dados RPG!";
    }

    public static void Calculos() { // método Calculos
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        boolean erro = true;
        Random aleatorio = new Random();
        while (erro) { // laço de repetição
            try { // bloco try-catch
                /* 1 */
                out.println("Digite o número de lados do dado: ");
                lados = in.nextInt();
                /* 2 */
                if (lados <= 0) {
                    out.println("Número de lados inválido!");
                    return;
                }
                /* 6 */
                out.println("Digite o número de lançamentos: ");
                lancamentos = in.nextInt();
                if (lancamentos <= 0) {
                    out.println("Número de lançamentos inválido!");
                    return;
                } else {
                    erro = false;
                }
            } catch (Exception e) { // Tratamento de erro
                out.println("Valor inválido!");
                in.next();
            }
        }
        resultados = new int[lancamentos]; // Cria um vetor com o número de lançamentos
        frequencia = new int[lados]; // Cria um vetor com o número de lados
        percentual = new int[lados]; // Cria um vetor com o número de lados
        soma = 0;
        maior = 0;
        menor = lancamentos; // Inicializa com um valor maior que o número de lançamentos
        posicaoMaior = 0;
        posicaoMenor = 0;
        /* 3 */
        for (int i = 0; i < lancamentos; i++) { // Cálculo dos resultados
            resultados[i] = aleatorio.nextInt(lados) + 1; /*
                                                           * Gera um número aleatório entre 1 e o número de lados
                                                           * resultados[0] = (numeroaleatorio).nextInt(2) + 1;
                                                           */
            soma = soma + resultados[i];
            frequencia[resultados[i] - 1] = frequencia[resultados[i] - 1] + 1; // frequencia[0] = frequencia[0] + 1;
            // frequencia[1 - 1] = frequencia[1 - 1] + 1;
        }
        /* 7 */
        for (int i = 0; i < lados; i++) { // Cálculo da frequência e percentual
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
        in.close();
    }

    public static void Impressao() { // método Impressao
        PrintStream out = System.out;
        out.println("\033[H\033[2J");
        out.println("Dados RPG");
        out.println("Número de lados: " + lados);
        /* 4 */
        out.println("Número de lançamentos: " + lancamentos);
        out.println("Resultados: ");
        /* 8 */
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

    /* 9 */
    public static void Again() { // método novamente
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        out.println("\nDeseja lançar outro dado? (S/N)");
        String resposta = in.next();
        resposta = resposta.toLowerCase();
        /*
         * if (resposta.equals("S") || resposta.equals("s")) {
         * Calculos();
         * Impressao();
         * Again();
         * } else if (resposta.equals("N") || resposta.equals("n")) {
         * out.println("Obrigado por jogar!");
         * } else {
         * out.println("Resposta inválida!");
         * Again();
         * }
         */
        switch (resposta) {
            case "S":
            case "s":
                Calculos();
                Impressao();
                Again();
                break;
            case "N":
            case "n":
                out.println("\033[H\033[2J");
                out.println("Obrigado por jogar!");
                return;
            default:
                out.println("Resposta inválida!");
                Again();
                break;
        }
    }
}