package java_src.src;

// Autor: João Victor Martins Deamo
// Date: 11/08/2023
// Version: 1.2
// Senai - Desenvolvimento de Sistemas

import java.io.PrintStream; // Importar a classe PrintStream para imprimir
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
        out.println("1 - Iniciar jogo");
        out.println("2 - Verificar pontuação");
        out.println("3 - Sair");
        out.println("Digite a opção desejada: ");
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

        for (int i = 0; i < nome.length; i++) {
            nome[i] = null;
        }
        // Nome do jogador
        for (int i = 0; i < 1; i++) {
            out.println("Digite seu nome: ");
            nome[i] = in.nextLine();
            out.printf("Bem vindo, %s!\n", nome[i]);
        }

        // Palavra secreta
        out.println("Digite a palavra secreta: ");
        String palavraSecreta = in.nextLine();
        boolean palavraValida = false;
        StringBuilder palavraAtual = new StringBuilder();
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
            if (letra > 1) {
                out.println("Digite apenas uma letra!");
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
                out.printf("\n%s, você deseja jogar novamente? (S/N): ", nome[0]);
                char resposta = in.next().charAt(0);
                if (resposta == 'S' || resposta == 's') {
                    IniciarJogo();
                }
                if (resposta == 'N' || resposta == 'n') {
                    Sair();
                    palavraValida = true;
                    break;
                }
                break;
            }

            if (palavraAtual.toString().equals(palavraSecreta)) {
                out.printf("Parabéns %s, você acertou a palavra: [%s]. ", nome[0], palavraSecreta);
                palavraValida = true;
                contador = contador + 1;
                if (contador == 1) {
                    acertos[0] = acertos[0] + 1;
                }
                out.printf("\nPontuação do jogador %s: %d\n", nome[0], acertos[0]);
                out.printf("\n%s, você deseja jogar novamente? (S/N): ", nome[0]);
                char resposta = in.next().charAt(0);
                if (resposta == 'S' || resposta == 's') {
                    IniciarJogo();
                }
                if (resposta == 'N' || resposta == 'n') {
                    Menu();
                    palavraValida = true;
                    break;
                }
                contador = contador + 1;

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
            if (contador == 0 || nome[0] == null){
                palavraValida = true;
                out.println("Você ainda não jogou ou não acertou nenhuma palavra!");
                out.printf("\nVocê deseja ir para o menu? (S/N): ");
                char resposta = in.next().charAt(0);
                if (resposta == 'S' || resposta == 's') {
                    Menu();
                }
                if (resposta == 'N' || resposta == 'n') {
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
                    Menu();
                }
                if (resposta == 'N' || resposta == 'n') {
                    Sair();
                    palavraValida = true;
                    break;
                }
            }
            if (nome[0] != null) {
                // verificar as pontuações dos jogadores
                for (int i = 0; i < nome.length; i++) {
                    out.printf("\nPontuação do jogador %s: %d.\n", nome[i], acertos[i]);
                }
                out.printf("\n%s, você deseja ir para o menu? (S/N): ", nome[0]);
                char resposta = in.next().charAt(0);
                if (resposta == 'S' || resposta == 's') {
                    Menu();
                }
                if (resposta == 'N' || resposta == 'n') {
                    Sair();
                    palavraValida = true;
                    break;
                }
                palavraValida = true;
            }

            if (resposta == 'N' || resposta == 'n') {
                Sair();
                palavraValida = true;
                break;
            }
        }
        in.close();
        return "VerificarPontuacao";
    }

    /* 4 */
    public static String Sair() { // método Sair
        PrintStream out = System.out;
        out.println("\033[H\033[2J");
        out.println("Jogo encerrado.");
        return "Jogo encerrado";
    }

    /* 5 */
    public static String Welcome() { // método boas vindas
        return "Bem vindo ao Jogo da Forca!";
    }

}
