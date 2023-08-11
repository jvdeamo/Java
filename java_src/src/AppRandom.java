package java_src.src;

// Autor: João Victor Martins Deamo
// Date: 07/08/2023
// Version: 1.1
// Senai - Desenvolvimento de Sistemas

import java.util.Scanner;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;

/*
  Fazer um jogo da forca, onde o usuário digita um número de 0 a 9, caso o número digitado esteja presente, o programa deve informar que o usuário acertou, caso contrário, adicione uma tentativa e informe que o usuário errou, caso o usuário erre 5 vezes, o programa deve informar que o usuário perdeu o jogo.
  */
public class AppRandom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        /*
         * Random[] aleatorio = new Random[3];
         * int tentativas = 0;
         * int[] numerosAleatorios = new int[3];
         * 
         * out.println("\033[H\033[2J");
         * out.println("Jogo da Forca");
         * out.println("-------------");
         * 
         * for (int i = 0; i < aleatorio.length; i++) {
         * aleatorio[i] = new Random();
         * numerosAleatorios[i] = aleatorio[i].nextInt(10);
         * out.print("   _");
         * }
         * out.println("\n");
         * for (int i = 0; i < numerosAleatorios.length; i++) {
         * out.print(" " + numerosAleatorios[i]);
         * }
         * 
         * out.println();
         * out.println("\nVocê tem 5 tentativas para acertar o número!");
         * 
         * boolean acertou = false;
         * 
         * while (acertou == false && tentativas < 5) {
         * out.print("Digite um número de 0 a 9: ");
         * int numero = in.nextInt();
         * 
         * for (int i = 0; i < numerosAleatorios.length; i++) {
         * if (numero == numerosAleatorios[i]) {
         * acertou = true;
         * break; // Sai do loop
         * }
         * }
         * 
         * if (acertou == true) {
         * out.println("Parabéns, você acertou um número!");
         * break;
         * } else {
         * out.println("O número não está presente!");
         * tentativas = tentativas + 1;
         * out.println("Tentativas: " + (5 - tentativas));
         * }
         * }
         * 
         * if (!acertou) {
         * out.println("Você perdeu o jogo!");
         * }
         * 
         * in.close();
         */
        Random random = new Random(); // Cria um objeto Random para gerar números aleatórios

        // Inicializa o array para armazenar os números secretos
        int[] numerosSecretos = new int[3];

        // Número máximo de tentativas permitidas
        int tentativasMaximas = 5;

        // Variável para contar as tentativas feitas pelo jogador
        int tentativas = 0;

        // Array para controlar quais números já foram revelados pelo jogador
        boolean[] numerosRevelados = new boolean[3];
        out.println("\033[H\033[2J");
        // Mensagem de boas-vindas e instruções para o jogador
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar um número de 3 casas decimais. Você tem " + tentativasMaximas
                + " tentativas.");

        // Gera os números secretos aleatoriamente e os armazena no array
        // numerosSecretos
        for (int i = 0; i < numerosSecretos.length; i++) {
            numerosSecretos[i] = random.nextInt(10); // Gera um número aleatório entre 0 e 9
            // out.print(" _");
            out.print(numerosSecretos[i]); // Exibe "_" para cada número secreto
        }
        out.println("\n");
        /*
         * Loop principal do jogo, que executa enquanto o número de tentativas for menor
         * que o máximo e enquanto o jogador não tiver acertado todos os números
         */
        boolean acertouTodos = false;
        while (tentativas < tentativasMaximas && !acertouTodos) {
            System.out.print("Tentativa " + (tentativas + 1) + ": ");

            // Lê a tentativa do jogador
            long tentativa = in.nextLong();

            // Verifica se a tentativa está dentro do intervalo válido (0 a 9999999999)
            if (tentativa < 0 || tentativa > 9999999999L) {
                System.out.println("Número inválido. Digite um número entre 0 e 9999999999.");
                continue; // Volta para o início do loop e pede uma nova tentativa
            }
            // Verifica se a tentativa acertou algum número e revela os números iguais
            for (int i = 0; i < numerosSecretos.length; i++) {
                if (numerosSecretos[i] == tentativa) {
                    numerosRevelados[i] = true; // Marca o número como revelado no array numerosRevelados
                }
            }

            // Exibe os números secretos com "_" para as casas não reveladas
            for (int i = 0; i < numerosSecretos.length; i++) {
                if (numerosRevelados[i]) {
                    System.out.print(numerosSecretos[i]); // Exibe o número se estiver revelado
                } else {
                    System.out.print("_"); // Exibe "_" se a casa ainda não foi revelada
                }
            }
            // Verifica se a tentativa do jogador é igual aos números secretos
            if (Arrays.stream(numerosSecretos).anyMatch(num -> num == tentativa)) {
                if (acertouTodos) {
                    System.out.println("\nParabéns! Você acertou um número secreto!");
                    acertouTodos = true;
                } else if (acertouTodos) {
                    System.out.println("Parabéns! Você acertou todos os números secretos!");
                    in.close(); // Encerra o Scanner
                    return; // Encerra o programa
                }
                // Verifica se o jogador acertou todos os números secretos
                for (boolean revelado : numerosRevelados) {
                    if (!revelado) {
                        acertouTodos = false;
                        break;
                    }
                }
                // Se o jogador acertou todos os números, exibe a mensagem de vitória e encerra
                // o programa

            } else if (tentativas < tentativasMaximas - 1 && !acertouTodos) {
                System.out.println("\nNenhum número correto encontrado. Tente novamente.");
            } else if (tentativas == tentativasMaximas - 1 && !acertouTodos) {
                acertouTodos = false;
                break;
            }
            if (acertouTodos) {
                System.out.println("Parabéns! Você acertou todos os números secretos!");
                in.close(); // Encerra o Scanner
                return; // Encerra o programa
            }

            tentativas++; // Incrementa o número de tentativas
        }
        out.println("\nVocê perdeu o jogo!");

        // Se chegou aqui, o jogador esgotou todas as tentativas ou acertou todos os
        // números

        // Exibe os números secretos
        System.out.print("Número secreto: ");
        for (int i = 0; i < numerosSecretos.length; i++) {
            System.out.print(numerosSecretos[i]);
        }

        System.out.println("");

        in.close(); // Encerra o Scanner
    }
}
