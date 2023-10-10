package java_src.src;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

public class atividadeSenai {
    public static void main(String[] Resultados) { // Método principal da classe App
        PrintStream out = System.out;
        out.println("Ola Mundo!");
        out.println("\033[H\033[2J");
        Calculos1 calc = new Calculos1();
        calc.calcular();
    }

}

class Calculos1 { // Classe Calculos (classe secundária)
    public void calcular() { // Método Calculos
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        out.println("=== Exercício 1 - Número primo ===");
        out.println("Digite um número inteiro: ");
        int valor9 = in.nextInt();
        calcularPrimo(valor9);
        out.println("=== Exercício 2 - Quantidade de vogais ===");
        out.println("Digite uma palavra: ");
        String valor10 = in.next();
        valor10 = valor10.toLowerCase();
        calcularVogais(valor10);
        out.println("=== Exercício 3 - Quantidade de números pares ===");
        out.println("Digite a quantidade de números da lista: ");
        int valor11 = in.nextInt();
        int[] lista = new int[valor11];
        for (int i = 0; i < valor11; i++) {
            out.printf("Digite o %dº número: ", i + 1);
            lista[i] = in.nextInt();
        }
        calcularPares(lista);
        out.println("=== Exercício 4 - Quantidade de palavras ===");
        out.println("Digite uma frase:");
        in.next();
        String valor12 = in.nextLine();
        calcularPalavras(valor12);
        out.println("=== Exercício 5 - Média da lista ===");
        out.println("Digite a quantidade de números da lista: ");
        int valor13 = in.nextInt();
        float[] lista2 = new float[valor13];
        for (int i = 0; i < valor13; i++) {
            out.printf("Digite o %dº número: ", i + 1);
            lista2[i] = in.nextFloat();
        }
        calcularMediaLista(lista2);
        out.println("=== Exercício 6 - Palíndromo ===");
        out.println("Digite uma palavra: ");
        String valor14 = in.next();
        valor14 = valor14.toLowerCase();
        calcularPalindromo(valor14);

        out.println("=== Exercício 7 - Busca binária ===");
        out.println("Digite a quantidade de números da lista: ");
        int valor15 = in.nextInt();
        int[] lista3 = new int[valor15];
        for (int i = 0; i < valor15; i++) {
            out.printf("Digite o %dº número: ", i + 1);
            lista3[i] = in.nextInt();
        }
        out.println("Digite o número que deseja buscar: ");
        int valor16 = in.nextInt();
        calcularBuscarBinaria(lista3, valor16);

        out.println("=== Exercício 8 - Ordem crescente ===");
        out.println("Digite a quantidade de números da lista: ");
        int valor17 = in.nextInt();
        int[] lista4 = new int[valor17];
        for (int i = 0; i < valor17; i++) {
            out.printf("Digite o %dº número: ", i + 1);
            lista4[i] = in.nextInt();
        }
        calcularOrdemLista(lista4);
        System.out.println("=== Exercício 9 - Calculando o fatorial ===");
        System.out.println("Digite um número inteiro: ");
        int valor18 = in.nextInt();
        calcularFatorial(valor18);
        System.out.println("=== Exercício 10 - Validando senha ===");
        System.out.println("Digite uma senha: ");
        String valor19 = in.next();
        validarSenha(valor19);
        in.close();

    }

    public void calcularPrimo(int numero) { // Método CalcularPrimo da classe Calculos
        PrintStream out = System.out;
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            out.printf("O número %d é primo.\n", numero);
        } else {
            out.printf("O número %d não é primo.\n", numero);
        }
    }

    public void calcularVogais(String palavra) {
        PrintStream out = System.out;
        int contador = 0;
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i'
                    || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u') {
                contador = contador + 1;
            }
        }
        if (contador == 0) {
            out.printf("A palavra %s não possui vogais.\n", palavra);
        } else if (contador == 1) {
            out.printf("A palavra %s possui %d vogal.\n", palavra, contador);
        } else {
            out.printf("A palavra %s possui %d vogais.\n", palavra, contador);
        }
    }

    public void calcularPares(int[] lista) {
        PrintStream out = System.out;
        int contador = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                contador = contador + 1;
            }
        }
        if (contador == 0) {
            out.printf("A lista não possui números pares.\n");
        } else if (contador == 1) {
            out.printf("A lista possui %d número par.\n", contador);
        } else {
            out.printf("A lista possui %d números pares.\n", contador);
        }
    }

    public void calcularPalavras(String frase) {
        PrintStream out = System.out;
        int contador = 0;
        String[] palavras = frase.split(" "); // Divide a frase em palavras usando espaço em branco como delimitador
        contador = palavras.length;

        if (contador == 1) {
            out.printf("A frase possui %d palavra.\n", contador);
        } else {
            out.printf("A frase possui %d palavras.\n", contador);
        }
    }

    public void calcularMediaLista(float[] lista) {
        PrintStream out = System.out;
        float soma = 0;
        for (int i = 0; i < lista.length; i++) {
            soma = soma + lista[i];
        }
        float media = (soma / lista.length);
        out.printf("A média da lista é %.2f.\n", media);
    }

    public void calcularPalindromo(String palavra) {
        PrintStream out = System.out;
        String palavraInvertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida = palavraInvertida + palavra.charAt(i);
        }
        if (palavra.equals(palavraInvertida)) {
            out.printf("A palavra %s é um palindromo.\n", palavra);
        } else {
            out.printf("A palavra %s não é um palindromo.\n", palavra);
        }
    }

    public void calcularBuscarBinaria(int[] lista, int numero) {
        PrintStream out = System.out;
        int inicio = 0;
        int fim = lista.length - 1;
        int meio = (inicio + fim) / 2;
        while (inicio <= fim) {
            if (lista[meio] < numero) {
                inicio = meio + 1;
            } else if (lista[meio] == numero) {
                out.printf("O número %d está na posição %d.\n", numero, meio + 1);
                break;
            } else {
                fim = meio - 1;
            }
            meio = (inicio + fim) / 2;
        }
        if (inicio > fim) {
            out.printf("O número %d não está na lista.\n", numero);
        }
    }

    public void calcularOrdemLista(int[] lista) {
        PrintStream out = System.out;
        int auxiliar = 0;
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    auxiliar = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = auxiliar;
                }
            }
        }
        out.printf("A lista em ordem crescente é: ");
        for (int i = 0; i < lista.length; i++) {
            out.printf("[%d] ", lista[i]);
        }
        out.printf("\n");
    }

    public void calcularFatorial(int numero) {
        PrintStream out = System.out;
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }
        out.printf("O fatorial de %d é %d.\n", numero, fatorial);
    }

    public void validarSenha(String senha) {
        PrintStream out = System.out;
        int contador = 0;
        while (senha.length() < 8) {
            out.printf("A senha deve conter pelo menos 8 caracteres.\n");
            out.printf("Digite uma nova senha: ");
            senha = new Scanner(System.in).next();
        }
        if (senha.length() >= 8) {
            // tambem exigir que tenha letra maiuscula e minuscula
            // e que tenha pelo menos um caracter especial
            for (int i = 0; i < senha.length(); i++) {
                if (senha.charAt(i) == '!' || senha.charAt(i) == '@' || senha.charAt(i) == '#'
                        || senha.charAt(i) == '$' || senha.charAt(i) == '%' || senha.charAt(i) == '&'
                        || senha.charAt(i) == '*' || senha.charAt(i) >= 'A' && senha.charAt(i) <= 'Z') {
                    contador = contador + 1;
                }
            }

            if (contador == 0) {
                out.printf("A senha deve conter pelo menos uma letra maiúscula.\n");
            } else if (contador == 0) {
                out.printf("A senha deve conter pelo menos um caracter especial.\n");
            } else {
                out.printf("A senha é válida.\n");
            }
        } else {
            out.printf("A senha deve conter pelo menos 8 caracteres.\n");
        }

    }
}

class appForca1 {
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
        String[] tamanhoLetraVetor = { "a ", "b ", "c ", "d ", "e ", "f ", "g ", "h ", "i ", "j ",
                "k ", "l ", "m ", "n ", "o ", "p ", "q ", "r ", "s ", "t ",
                "u ", "v ", "x ", "w ", "y ", "z ", "ç ", "á ", "é ", "í ", "ó ", "ú ", "ã ", "õ ", "â ", "ê ", "î ",
                "ô ", "û ", "à ", "è ", "ì ", "ò ", "ù ", "â ", "ê ", "î ", "ô ", "û ", "à ", "è ", "ì ", "ò ", "ù " };
        String tamanhoLetra = tamanhoLetraVetor[tamanhoLetraVetor.length - 1];
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
            String letra = in.next();
            char letraChar = letra.charAt(0);
            boolean LetraVerdadeiro = false;
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letraChar) {
                    LetraVerdadeiro = true;
                    palavraAtual.setCharAt(i, letraChar);
                }
            }
            /*
             * se o jogador digitar mais de uma letra
             * if (letra == ' ') {
             * out.println("Você digitou mais de uma letra!");
             * tentativas = tentativas + 1;
             * }
             * // usando a função isLetter para verificar se o jogador digitou um número
             * if (Character.isLetter(letra) == false) {
             * out.println("Você digitou um número!");
             * tentativas = tentativas + 1;
             * }
             * 
             * verificar se o jogador digitou mais uma letra a partir do tamanho da palavra
             * if (letraChar > tamanhoLetra.length()) {
             * out.println("Você digitou mais de uma letra!1232");
             * tentativas = tentativas + 1;
             * }
             */
            out.printf("Palavra atual : %s\n", palavraAtual);
            if (letra.length() > 1) {
                out.println("Você digitou mais de uma letra! SALVE");
                tentativas = tentativas + 1;
            }
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
                /*
                 * out.printf("\nVocê deseja ir para o menu? (S/N): ");
                 * resposta = in.next().charAt(0);
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

class Banco {
    // Atributos
    private String nomeBanco;
    private String ContasBancarias;
    PrintStream out = System.out;

    public static void main(String[] Forca) {
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        out.println("\033[H\033[2J");
        out.println();
        out.println("=== Bem vindo ao Banco Senai ===");
        out.println();
        Banco banco = new Banco("Senai", "12");
        banco.exibirDados();
        banco.menu();
        in.close();
    }

    // Construtor
    public Banco(String nomeBanco, String ContasBancarias) {
        this.nomeBanco = nomeBanco;
        this.ContasBancarias = ContasBancarias;
    }

    public void exibirDados() {
        out.println("Nome do banco: " + this.nomeBanco);
        out.println("Contas bancárias: " + this.ContasBancarias);
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        out.println("O que você deseja fazer?");
        out.println("1. Acessar como cliente");
        out.println("2. Acessar como funcionário");
        opcao();
    }

    public void opcao() {
        Scanner in = new Scanner(System.in);
        int opcao = in.nextInt();
        switch (opcao) {
            case 1:
                menuCliente();
                break;
            case 2:
                menuFuncionario();
                break;
            default:
                out.println("Opção inválida!");
                menu();
                break;
        }
    }

    public void menuCliente() {
        Scanner in = new Scanner(System.in);
        out.println("O que você deseja fazer?");
        out.println("1. Criar conta");
        out.println("2. Excluir conta");
        out.println("3. Exibir saldo total do banco");
        out.println("4. Sacar");
        out.println("5. Depositar");
        ProcessamentoCliente();
    }

    public void menuFuncionario() {
        Scanner in = new Scanner(System.in);
        out.println("O que você irá fazer?");
        out.println("1. Atender cliente");
        out.println("2. Processar transações");
        out.println("3. Emitir cartões");
        ProcessamentoFuncionario();
    }

    public void ProcessamentoCliente() {
        Scanner in = new Scanner(System.in);
        int opcao = in.nextInt();
        double saldoTotal = 0;
        saldoTotal = ClienteExibirSaldoTotalDoBanco(1000);
        switch (opcao) {
            case 1:
                out.println("Digite o nome da conta:");
                String nomeConta = in.next();
                out.println("Digite o número da conta:");
                String numeroConta = in.next();
                out.println("Digite o depósito inicial:");
                String depositoInicial = in.next();
                out.print("Conta criada!\n");
                ClienteCriarConta(nomeConta, numeroConta, depositoInicial);
                break;
            case 2:
                out.println("Digite o nome da conta:");
                String nomeConta2 = in.next();
                out.println("Digite o número da conta:");
                String numeroConta2 = in.next();
                out.print("Conta excluída!\n");
                ClienteExcluirConta(nomeConta2, numeroConta2);
                break;
            case 3:
                ClienteExibirSaldoTotalDoBanco(1000);
                break;
            case 4:
                out.println("Digite o nome do cliente:");
                String nomeCliente = in.next();
                out.println("Digite o número da conta:");
                String numeroConta3 = in.next();
                out.println("Digite o valor do saque:");
                double valorSaque = in.nextDouble();
                // Passar valorSaque para double
                // Verificar se o valorSaque é maior que o saldo da conta

                if (valorSaque > 1000) {
                    out.println("Saldo insuficiente!");
                    menuCliente();
                } else {
                    ClienteSaque(nomeCliente, numeroConta3, valorSaque);
                }
                break;
            case 5:
                out.println("Digite o nome do cliente:");
                String nomeCliente2 = in.next();
                out.println("Digite o número da conta:");
                String numeroConta4 = in.next();
                out.println("Digite o valor do depósito:");
                String valorDeposito = in.next();
                ClienteDeposito(nomeCliente2, numeroConta4, valorDeposito);
                // Receber o valor do saldo da conta e somar com o valorDeposito
                saldoTotal = saldoTotal + Double.parseDouble(valorDeposito);
                out.println("Saldo total: R$" + saldoTotal);
                break;
            default:
                out.println("Opção inválida!");
                menuCliente();
                break;
        }
    }

    public void ProcessamentoFuncionario() {
        Scanner in = new Scanner(System.in);
        int opcao = in.nextInt();
        switch (opcao) {
            case 1:
                out.println("Digite o nome do cliente:");
                String nomeCliente = in.next();
                out.println("Digite o número da conta:");
                String numeroConta = in.next();
                out.println("Qual a dúvida do cliente?");
                String ajuda = in.next();
                FuncionarioAtenderCliente(nomeCliente, numeroConta, ajuda);
                break;
            case 2:
                out.println("Digite o número da conta:");
                String numeroConta2 = in.next();
                out.println("Digite o código da transação:");
                String codigoTransacao = in.next();
                FuncionarioProcessarTransacoes(numeroConta2, codigoTransacao);
                out.println("Digite o registro da transação:");
                String registroTransacao = in.next();
                FuncionarioRegistroTransacoes(registroTransacao);
                break;
            case 3:
                out.println("Digite o nome do cliente:");
                String nomeCliente2 = in.next();
                out.println("Digite o número da conta:");
                String numeroConta3 = in.next();
                out.println("Qual o tipo do cartão?");
                out.println("1. Débito");
                out.println("2. Crédito");
                int opcao2 = in.nextInt();
                switch (opcao2) {
                    case 1:
                        FuncionarioEmitirCartoes(nomeCliente2, numeroConta3, "Débito");
                        break;
                    case 2:
                        FuncionarioEmitirCartoes(nomeCliente2, numeroConta3, "Crédito");
                        break;
                    default:
                        out.println("Opção inválida!");
                        ProcessamentoFuncionario();
                        break;
                }
                break;
            default:
                out.println("Opção inválida!");
                menuFuncionario();
                break;
        }
    }

    // Métodos Clientes
    public void ClienteCriarConta(String nomeConta, String numeroConta, String depositoInicial) {
        out.println("Nome da conta: " + nomeConta);
        out.println("Número da conta: " + numeroConta);
        out.println("Depósito inicial: " + depositoInicial);
    }

    public void ClienteExcluirConta(String nomeConta, String numeroConta) {
        out.println("Nome da conta: " + nomeConta);
        out.println("Número da conta: " + numeroConta);
    }

    public double ClienteExibirSaldoTotalDoBanco(double saldoTotal) {
        out.println("Saldo total do banco: R$" + saldoTotal);
        return saldoTotal;
    }

    public void ClienteSaque(String nomeCliente, String numeroConta, double valorSaque) {
        out.println("Nome do cliente: R$ " + nomeCliente);
        out.println("Número da conta: " + numeroConta);
        out.println("Valor do saque: R$ " + valorSaque);
    }

    public void ClienteDeposito(String nomeCliente, String numeroConta, String valorDeposito) {
        out.println("Nome do cliente: R$ " + nomeCliente);
        out.println("Número da conta: " + numeroConta);
        out.println("Valor do depósito: R$ " + valorDeposito);
    }

    // Métodos Funcionários
    public void FuncionarioAtenderCliente(String nomeCliente, String numeroConta,
            String ajuda) {
        out.println("Nome do cliente: " + nomeCliente);
        out.println("Número da conta: " + numeroConta);
        out.println("Ajuda: " + ajuda);
    }

    public void FuncionarioProcessarTransacoes(String numeroConta, String codigoTransacao) {
        out.println("Número da conta: " + numeroConta);
        out.println("Número da transação: " + codigoTransacao);
    }

    public void FuncionarioRegistroTransacoes(String registroTransacao) {
        out.println("Registro da transação: " + registroTransacao);
    }

    public void FuncionarioEmitirCartoes(String nomeCliente, String numeroConta,
            String tipoCartao) {
        out.println("Nome do cliente: " + nomeCliente);
        out.println("Número da conta: " + numeroConta);
        out.println("Tipo do cartão: " + tipoCartao);
    }

    // Método de chamada
    public void chamada() {
        exibirDados();
        menu();
    }
}
