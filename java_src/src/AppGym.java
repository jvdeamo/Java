package java_src.src;

// Autor: João Victor Martins Deamo
// Date: 31/07/2023
// Version: 1.1
// Senai - Desenvolvimento de Sistemas

import java.io.PrintStream;
import java.util.Scanner;

public class AppGym {
    // Estudo de caso: Treinamento Simples de Academia
    public static void main(String[] Controle) { // Método principal da classe AppGym
        Scanner scanner = new Scanner(System.in); // Instância da classe Scanner
        System.out.println("Hello World!"); // Teste

        String nome = ""; // Variável para armazenar o nome do usuário
        String peso = ""; // Variável para armazenar o peso do usuário
        String altura = ""; // Variável para armazenar a altura do usuário
        String academia = ""; // Variável para armazenar o nome da academia
        String TreinoAtual = ""; // Variável para armazenar o treino atual
        String ExercicioAtual = ""; // Variável para armazenar o exercício atual
        float repeticoes = 0; // Variável para armazenar a quantidade de repetições
        String[] a = new String[500]; // Variável para armazenar o peso
        String[] b = new String[500]; // Variável para armazenar a quantidade de séries

        /*
         * System.out.println("Qual é o seu nome?"); // Solicitação do nome do usuário
         * String nome = scanner.next(); // Variável para armazenar o nome do usuário
         * System.out.println("Qual o nome da sua academia?"); // Solicitação do nome da
         * academia
         * String academia = scanner.next(); // Variável para armazenar o nome da
         * academia
         * System.out.printf("Olá, %s ! \n Seja bem vindo ao %s", nome, academia); //
         * Mensagem de boas-vindas
         * String TreinoAtual = scanner.next(); // Variável para armazenar o treino
         * atual
         */
        Dados(nome, academia, peso, altura);

        Calculadora(a[0], b[0], TreinoAtual, ExercicioAtual, repeticoes, peso);

        scanner.close(); // Fechamento da instância da classe Scanner
    }

    public static void Dados(String nome, String academia, String peso, String Altura) { // Armazenamento de dados
        PrintStream out = System.out;
        Scanner scanner = new Scanner(System.in); // Instância da classe Scanner
        System.out.println("Qual é o seu nome?"); // Solicitação do nome do usuário
        nome = scanner.next(); // Variável para armazenar o nome do usuário
        System.out.println("Qual seu peso?");
        peso = scanner.next();
        System.out.println("Qual sua altura?");
        Altura = scanner.next();
        System.out.println("*- Qual o nome da sua academia? *-"); // Solicitação do nome da academia
        academia = scanner.next(); // Variável para armazenar o nome da academia
        out.println("\033[H\033[2J");
        System.out.printf("* Olá, %s! Seja bem vindo à academia %s. * \n", nome, academia); // Mensagem de boas-vindas

        scanner.close(); // Fechamento da instância da classe Scanner
    }

    public static void Calculadora(String a, String b, String TreinoAtual, String ExercicioAtual, float repeticoes,
            String peso) { // Calculadora de treino
        Scanner scanner = new Scanner(System.in);
        boolean operacaoValida = false; // Variável de controle para verificar se a operação é válida

        while (!operacaoValida) { // Enquanto a operação não for válida, o loop continua
            System.out.println("---------------------------------");
            System.out.println("Hoje é dia de treinar qual músculo?");
            System.out.println("---------------------------------");
            System.out.println("1 - Peito");
            System.out.println("2 - Costas");
            System.out.println("3 - Braço");
            System.out.println("4 - Perna");
            System.out.println("5 - Abdominal");
            System.out.println("6 - Descanso");
            System.out.println("0 - Sair");
            TreinoAtual = scanner.next();

            switch (TreinoAtual) {
                case "1":
                    System.out.println("Qual desses exercícios você quer fazer?");
                    System.out.println("1 - Supino Reto");
                    System.out.println("2 - Supino Inclinado");
                    System.out.println("3 - Supino Declinado");
                    System.out.println("4 - Crucifixo");
                    System.out.println("5 - Cross Over");
                    ExercicioAtual = scanner.next();
                    while (!operacaoValida) {
                        switch (ExercicioAtual) {
                            case "1":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.println("Qual será o peso utilizado?");
                                a = scanner.next();
                                System.out.printf("Você fez %s repetições com %s em %s séries. \n", repeticoes, a,
                                        b);
                                operacaoValida = true;
                                break;
                            case "2":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.println("Qual será o peso utilizado?");
                                a = scanner.next();
                                System.out.printf("Você fez %s repetições com %s em %s séries. \n", repeticoes, a, b);
                                operacaoValida = true;
                                break;
                            case "3":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.println("Qual será o peso utilizado?");
                                a = scanner.next();
                                System.out.printf("Você fez %s repetições com %s em %s séries. \n", repeticoes, a,
                                        b);
                                operacaoValida = true;
                                break;
                            case "4":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.println("Qual será o peso utilizado?");
                                a = scanner.next();
                                System.out.printf("Você fez %s repetições com %s em %s séries. \n", repeticoes, a, b);
                                break;
                            case "5":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.println("Qual será o peso utilizado?");
                                a = scanner.next();
                                System.out.printf("Você fez %s repetições com %s em %s séries. \n", repeticoes, a,
                                        b);
                                operacaoValida = true;
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                        operacaoValida = true;
                        break;
                    }
                    operacaoValida = true;
                    break;
                case "2":
                    System.out.println("Qual desses exercícios você quer fazer?");
                    System.out.println("1 - Barra Fixa");
                    System.out.println("2 - Puxada Frontal");
                    System.out.println("3 - Puxada Traseira");
                    System.out.println("4 - Remada Curvada");
                    System.out.println("5 - Remada Unilateral");
                    ExercicioAtual = scanner.next();
                    while (!operacaoValida) {
                        switch (ExercicioAtual) {
                            case "1":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.println("O peso será o seu peso corporal.");
                                a = peso;
                                System.out.printf("Você fez %s repetições com %s em %s séries. \n", repeticoes, a,
                                        b);
                                operacaoValida = true;

                                break;
                            case "2":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.println("Qual será o peso utilizado?");
                                a = scanner.next();
                                System.out.printf("Você fez %s repetições com %s em %s séries. \n", repeticoes, a,
                                        b);
                                operacaoValida = true;

                                break;
                            case "3":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.println("Qual será o peso utilizado?");
                                a = scanner.next();
                                ;
                                System.out.printf("Você fez %s repetições com %s em %s séries. \n", repeticoes, a,
                                        b);
                                operacaoValida = true;

                                break;
                            case "4":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.println("Qual será o peso utilizado?");
                                a = scanner.next();
                                System.out.printf("Você fez %s repetições com %s em %s séries. \n", repeticoes, a,
                                        b);
                                operacaoValida = true;
                                break;
                            case "5":
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Qual será o peso utilizado?");
                                a = scanner.next();
                                System.out.printf("Você fez %s repetições com %s em %s séries. \n", repeticoes, a,
                                        b);
                                operacaoValida = true;
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                        operacaoValida = true;
                        break;
                    }
                    operacaoValida = true;
                    break;
                case "3":
                    System.out.println("Qual desses exercícios você quer fazer?");
                    System.out.println("1 - Rosca Direta");
                    System.out.println("2 - Rosca Alternada");
                    System.out.println("3 - Rosca Martelo");
                    System.out.println("4 - Rosca Concentrada");
                    System.out.println("5 - Rosca Inversa");
                    ExercicioAtual = scanner.next();
                    while (!operacaoValida) {
                        switch (ExercicioAtual) {
                            case "1":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.println("Qual será o peso utilizado?");
                                a = scanner.next();
                                System.out.printf("Você fez %s repetições com %s em %s séries. \n", repeticoes, a,
                                        b);
                                operacaoValida = true;
                                break;
                            case "2":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.println("Qual será o peso utilizado?");
                                a = scanner.next();
                                System.out.printf("Você fez %s repetições com %s em %s séries. \n", repeticoes, a,
                                        b);
                                operacaoValida = true;
                                break;
                            case "3":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.println("Qual será o peso utilizado?");
                                a = scanner.next();
                                System.out.printf("Você fez %s repetições com %s em %s séries. \n", repeticoes, a,
                                        b);
                                operacaoValida = true;
                                break;
                            case "4":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.println("Qual será o peso utilizado?");
                                a = scanner.next();
                                System.out.printf("Você fez %s repetições com %s em %s séries. \n", repeticoes, a,
                                        b);
                                operacaoValida = true;
                                break;
                            case "5":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.println("Qual será o peso utilizado?");
                                a = scanner.next();
                                System.out.printf("Você fez %s repetições com %s em %s séries. \n", repeticoes, a,
                                        b);
                                operacaoValida = true;
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                        operacaoValida = true;
                        break;
                    }
                    operacaoValida = true;
                    break;
                case "4":
                    System.out.println("Qual desses exercícios você quer fazer?");
                    System.out.println("1 - Agachamento Livre");
                    System.out.println("2 - Agachamento Hack");
                    System.out.println("3 - Leg Press");
                    System.out.println("4 - Cadeira Extensora");
                    System.out.println("5 - Cadeira Flexora");
                    ExercicioAtual = scanner.next();
                    while (!operacaoValida) {
                        switch (ExercicioAtual) {
                            case "1":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.println("Qual será o peso utilizado?");
                                a = scanner.next();
                                System.out.printf("Você fez %s repetições com %s em %s séries. \n", repeticoes, a, b);
                                operacaoValida = true;
                                break;
                            case "2":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.println("Qual será o peso utilizado?");
                                a = scanner.next();
                                System.out.printf("Você fez %s repetições com %s em %s séries. \n",
                                        repeticoes, a, b);
                                operacaoValida = true;
                                break;
                            case "3":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.println("Qual será o peso utilizado?");
                                a = scanner.next();
                                System.out.printf("Você fez %s repetições com %s em %s séries. \n", repeticoes, a, b);
                                operacaoValida = true;
                                break;
                            case "4":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.println("Qual será o peso utilizado?");
                                a = scanner.next();
                                System.out.printf("Você fez %s repetições com %s em %s séries. \n", repeticoes, a, b);
                                operacaoValida = true;
                                break;
                            case "5":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.println("Qual será o peso utilizado?");
                                a = scanner.next();
                                System.out.printf("Você fez %s repetições com %s em %s séries. \n", repeticoes, a, b);
                                operacaoValida = true;
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                        operacaoValida = true;
                        break;
                    }
                    operacaoValida = true;
                    break;
                case "5":
                    /* Exercicios para abdominal */
                    System.out.println("Qual desses exercícios você quer fazer?");
                    System.out.println("1 - Abdominal Supra");
                    System.out.println("2 - Abdominal Infra");
                    System.out.println("3 - Abdominal Obliquo");
                    System.out.println("4 - Abdominal Grupado");
                    System.out.println("5 - Abdominal Inverso");
                    ExercicioAtual = scanner.next();
                    while (!operacaoValida) {
                        switch (ExercicioAtual) {
                            case "1":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.printf("Você fez %s repetições em %s séries. \n", repeticoes, b);
                                operacaoValida = true;
                                break;
                            case "2":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.printf("Você fez %s repetições em %s séries. \n",
                                        repeticoes, a, b);
                                operacaoValida = true;
                                break;
                            case "3":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.printf("Você fez %s repetições em %s séries. \n", repeticoes, b);
                                operacaoValida = true;
                                break;
                            case "4":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.printf("Você fez %s repetições em %s séries. \n", repeticoes, b);
                                operacaoValida = true;
                                break;
                            case "5":
                                System.out.println("Quantas séries você quer fazer?");
                                b = scanner.next();
                                System.out.println("Quantas repetições você quer fazer?");
                                repeticoes = scanner.nextFloat();
                                System.out.printf("Você fez %s repetições em %s séries. \n", repeticoes, b);
                                operacaoValida = true;
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                        operacaoValida = true;
                        break;
                    }
                    operacaoValida = true;
                    break;
                case "6":
                    System.out.println("Hoje é dia de descanso!");
                    operacaoValida = true;
                    break;

                case "0":
                    System.out.println("Fim!");
                    operacaoValida = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        scanner.close();
    }
}
/*
 * Neste estudo de caso, solicitaremos aos
 * alunos que criem cinco variáveis para representar o nome dos exercícios e
 * outras cinco variáveis para armazenar a quantidade de repetições de cada
 * exercício. Em seguida, criaremos um loop que permitirá ao usuário indicar o
 * exercício atual que está realizando.
 */
