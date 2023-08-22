package java_src.src;

// Autor: João Victor Martins Deamo
// Date: 18/08/2023
// Version: 1.3
// Senai - Desenvolvimento de Sistemas

import java.io.PrintStream; // Importar a classe PrintStream para imprimir
import java.util.Random;
import java.util.Scanner; // Importar a classe Scanner para ler

public class AppForca {
    static int[] acertos = new int[3];
    static String[] nome = new String[3];
    static char resposta;
    static int contador = 0;

    public static void main(String[] Forca) {
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        out.println("\033[H\033[2J");
        out.println(Welcome());
        Menu();
        in.close();
    }

    /* 1 */
    public static String Menu() { // método Menu
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        /*
         * Iniciar jogo
         * Verificar pontuação
         * Sair
         */
        out.print("*                Menu \n");
        out.println("1 -         Iniciar jogo");
        out.println("2 -     Verificar pontuação");
        out.println("3 -            Sair");
        out.println("      Digite a opção desejada: ");
        int opcao = in.nextInt();
        switch (opcao) {
            case 1:
                IniciarJogo();
                break;
            case 2:
                VerificarPontuacao();
                break;
            case 3:
                Sair();
                break;
            default:
                out.println("Opção inválida!");
                break;
        }
        in.close();
        return "Menu";
    }

    /* 2 */
    public static String IniciarJogo() { // método IniciarJogo
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        out.println("\033[H\033[2J");
        out.println(Welcome());
        // Coleta o nome para o primeiro jogador
        for (int i = 0; i < 1; i++) {
            if (nome == null || nome[0] == null) {
                out.println("Digite seu nome: ");
                nome[i] = in.nextLine();
                out.printf("Bem vindo, %s!\n", nome[i]);
            } else {
                out.printf("Bem vindo, %s!\n", nome[i]);
            }
        }
        /*
         * if (nome == null) {
         * out.println("Digite seu nome: ");
         * nome[0] = in.nextLine();
         * out.printf("Bem vindo, %s!\n", nome[0]);
         * } else {
         * out.printf("Bem vindo, %s!\n", nome[0]);
         * }
         */

        /*
         * Nome do jogador
         * for (int i = 0; i < 1; i++) {
         * out.println("Digite seu nome: ");
         * nome[i] = in.nextLine();
         * out.printf("Bem vindo, %s!\n", nome[i]);
         * }
         */

        // Palavra secreta
        /*
         * out.println("Digite a palavra secreta: ");
         * String palavraSecreta = in.nextLine();
         * boolean palavraValida = false;
         * StringBuilder palavraAtual = new StringBuilder();
         */
        String[] palavras = { "Venom", "Lemon", "Tenon", "Canon", "Senon" };
        Random random = new Random();
        String palavraSecreta = palavras[random.nextInt(palavras.length)];
        StringBuilder palavraAtual = new StringBuilder();
        boolean palavraValida = false;
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
            // se o jogador digitar mais de uma letra
            if (letra == ' ') {
                out.println("Você digitou mais de uma letra!");
                tentativas = tentativas + 1;
            }
            out.printf("Palavra atual : %s\n", palavraAtual);

            if (LetraVerdadeiro) {
                out.println("Letra correta! ");
            } else {
                tentativas = tentativas + 1;
                out.println("Letra incorreta! ");
            }
            if (tentativas == 5) {
                out.printf("Você perdeu %s!", nome[0]);
                palavraValida = true;
                out.printf("\nPontuação do jogador %s: %d\n", nome[0], acertos[0]);
                out.printf("A palavra secreta era: [%s]. ", palavraSecreta);
                out.printf("\n%s, você deseja jogar novamente? (S/N): ", nome[0]);
                char resposta = in.next().charAt(0);
                if (resposta == 'S' || resposta == 's') {
                    out.println("\033[H\033[2J");
                    IniciarJogo();
                }
                if (resposta == 'N' || resposta == 'n') {
                    nome[0] = null;
                    Sair();
                    palavraValida = true;
                    break;
                }
                break;
            }

            if (palavraAtual.toString().equals(palavraSecreta)) {
                out.println("\033[H\033[2J");
                out.printf("Parabéns %s, você acertou a palavra: [%s]. ", nome[0], palavraSecreta);
                palavraValida = true;
                /*
                 * if (contador == 1) {
                 * acertos[0] = acertos[0] + 1;
                 * }
                 */
                for (int i = 0; i < nome.length; i++) {
                    if (nome[i] != null) {
                        acertos[i] = acertos[i] + 1;
                        out.printf("\nPontuação do jogador %s: %d\n", nome[i], acertos[i]);
                    }
                }
                contador = contador + 1;

                // out.printf("\nPontuação do jogador %s: %d\n", nome[0], acertos[0]);
                out.printf("\n%s, você deseja jogar novamente? (S/N): ", nome[0]);
                char resposta = in.next().charAt(0);
                if (resposta == 'S' || resposta == 's') {
                    // Coleta o nome para o próximo jogador
                    in.nextLine(); // Limpar o buffer
                    out.println("\033[H\033[2J");
                    out.println(Welcome());
                    Menu();
                }
                if (resposta == 'N' || resposta == 'n') {
                    contador = contador + 1;
                    Menu();
                    palavraValida = true;
                    break;
                }
                break;
            }
        }
        in.close();
        return "IniciarJogo";
    }

    /* 3 */
    public static String VerificarPontuacao() { // método VerificarPontuacao
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        out.println("\033[H\033[2J");
        boolean palavraValida = false;

        while (!palavraValida) {
            /*
             * if (contador == 0) {
             * palavraValida = true;
             * // out.println("Nenhum jogador jogou ou acertou alguma palavra ainda!");
             * // Resto do código continua igual
             * }
             */

            if (contador == 0) {
                palavraValida = true;
                out.println("Você ainda não jogou ou não acertou nenhuma palavra!");
                out.printf("\nVocê deseja ir para o menu? (S/N): ");
                char resposta = in.next().charAt(0);
                if (resposta == 'S' || resposta == 's') {
                    out.println("\033[H\033[2J");
                    out.println(Welcome());

                    Menu();
                }
                if (resposta == 'N' || resposta == 'n') {
                    out.println("\033[H\033[2J");
                    Sair();
                    palavraValida = true;
                    break;

                }
                break;
            }

            /*
             * if (acertos == 0 || nome == null) {
             * out.printf("Você ainda não jogou ou não acertou nenhuma palavra!\n");
             * } else if (acertos == 1 || nome == null) {
             * out.printf("Você acertou %d palavras!", acertos);
             * } else if (acertos > 1 || nome == null) {
             * out.printf("vapo\n");
             * }
             */

            if (nome[0] == null) {
                if (resposta == 'S' || resposta == 's') {
                    out.println("\033[H\033[2J");

                    out.println(Welcome());
                    Menu();
                }
                if (resposta == 'N' || resposta == 'n') {
                    Sair();
                    palavraValida = true;
                    break;
                }
            }
            for (int i = 0; i < nome.length; i++) {
                if (nome[i] != null) {
                    // verificar as pontuações dos jogadores
                    out.printf("\nPontuação do jogador %s: %d.\n", nome[i], acertos[i]);
                }
            }
            out.printf("\n%s, você deseja ir para o menu? (S/N): ", nome[0]);
            char resposta = in.next().charAt(0);
            if (resposta == 'S' || resposta == 's') {
                out.println("\033[H\033[2J");
                out.println(Welcome());
                Menu();
            }
            if (resposta == 'N' || resposta == 'n') {
                Sair();
                palavraValida = true;
                break;
            } else if (resposta != 'S' || resposta != 's' || resposta != 'N' || resposta != 'n') {
                /*out.printf("\nVocê deseja ir para o menu? (S/N): ");
                resposta = in.next().charAt(0);
                */
            }
            palavraValida = true;

            if (resposta == 'N' || resposta == 'n') {
                Sair();
                palavraValida = true;
                break;
            }
        }
        nome[0] = "";
        acertos[0] = 0;
        contador = 0;
        in.close();
        return "VerificarPontuacao";

    }

    /* 4 */
    public static String Sair() { // método Sair
        PrintStream out = System.out;
        out.println("\033[H\033[2J");
        out.println("Jogo encerrado.");
        nome[0] = "";
        acertos[0] = 0;
        contador = 0;
        return "Jogo encerrado";
    }

    /* 5 */
    public static String Welcome() { // método boas vindas
        return "    Bem vindo ao Jogo da Forca!\n";
    }

}
