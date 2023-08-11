package java_src.src;

// Autor: João Victor Martins Deamo
// Date: 31/07/2023
// Version: 1.1
// Senai - Desenvolvimento de Sistemas

import java.io.PrintStream; // Importar a classe PrintStream para imprimir
import java.util.Scanner; // Importar a classe Scanner para ler

public class App { // Classe App (classe principal)
    public static void main(String[] Resultados) { // Método principal da classe App
        Scanner scanner = new Scanner(System.in);
        PrintStream out = System.out;
        out.println("\033[H\033[2J");
        System.out.println("Ola Mundo!");
        // Imprimir com PrintStream
        /* out.println("Ola Mundo!"); */

        /* 1 - Calculando a soma */
        System.out.println("=== Exercício 1 - Calculando a soma ===");
        float valor1 = 10;
        float valor2 = 4;
        float soma = Calculos.CalcularSoma(valor1, valor2);
        System.out.println("Soma (" + valor1 + " + " + valor2 + ") = " + soma + ".");

        /*
         * Imprimir com printf
         * %.2f = 2 casas decimais
         * System.out.printf("Soma (%.2f + %.2f) = %.2f.\n", valor1, valor2, soma);
         */

        /* 2 - Calculando a média */
        System.out.println("=== Exercício 2 - Calculando a média ===");
        float valor3 = 2.5f;
        float valor4 = 4.5f;
        float valor5 = 6.5f;
        float media = Calculos.CalcularMedia(valor3, valor4, valor5);
        System.out.println("Média (" + valor3 + " + " + valor4 + " + " + valor5 + ") : " + media + ".");
        /*
         * Imprimir com printf
         * %.2f = 2 casas decimais
         * System.out.printf("Média (%.2f + %.2f + %.2f) : %.2f.\n", valor3, valor4,
         * valor5, media);
         */

        /* 3 - Verificando se o número é par ou ímpar */
        System.out.println("=== Exercício 3 - Par ou Ímpar ===");
        int valor6 = 23;
        Calculos.CalcularIP(valor6);

        /* 4 - Verificando se o ano é bissexto */
        System.out.println("=== Exercício 4 - Ano bissexto ===");
        int valor7 = 1720;
        Calculos.CalcularAno(valor7);

        /* 5 - Calculando o fatorial */
        System.out.println("=== Exercício 5 - Calculando o fatorial ===");
        int valor8 = 3;
        Calculos.CalcularFatorial(valor8);

        /* 6 - Verificando se o número é primo */
        System.out.println("=== Exercício 6 - Número primo ===");
        int valor9 = 8;
        Calculos.CalcularPrimo(valor9);

        /* 7 - Verificando a nota */
        System.out.println("=== Exercício 7 - Verificando a nota ===");
        float valor10 = 100;
        Calculos.CalcularNota(valor10);

        /* 8 - Verificando a variável */
        System.out.println("=== Exercício 8 - Verificando a variável ===");
        String valor11 = "Teste";
        String resultado = Calculos.CalcularVariável(valor11);
        System.out.println("O valor da variável é '" + resultado + "'.");

        /* 9 - Loop1 */
        System.out.println("=== Exercício 9 - Fazendo o loop ===");
        int valor12 = 5;
        Calculos.CalcularLoop(valor12);

        /* 10 - Loop2 */
        System.out.println("=== Exercício 10 - Fazendo o loop ===");
        int valor13 = 5;
        Calculos.CalcularLoop1(valor13);

        /* 11 - Maior número */
        System.out.println("=== Exercício 11 - Verificando o maior número ===");
        System.out.println("Digite o primeiro valor: ");
        float valor14 = scanner.nextFloat();
        System.out.println("Digite o segundo valor: ");
        float valor15 = scanner.nextFloat();
        Calculos.CalcularMaior(valor14, valor15);

        /* 12 - Sequência de Fibonacci */
        System.out.println("=== Exercício 12 - Verificando a sequência de Fibonacci ===");
        System.out.println("Digite o número: ");
        int valor16 = scanner.nextInt();
        Calculos.CalcularFibonacci(valor16);

        /* 13 Tabuada */
        System.out.println("=== Exercício 13 - Verificando a tabuada ===");
        System.out.println("Digite o número: ");
        float valor17 = scanner.nextFloat();
        Calculos.CalcularMult(valor17);

        /* 14 - Soma 2 */
        System.out.println("=== Exercício 14 - Verificando a soma ===");
        System.out.println("Digite o primeiro valor: ");
        float valor18 = scanner.nextFloat();
        System.out.println("Digite o segundo valor: ");
        float valor19 = scanner.nextFloat();
        soma = Calculos.CalcularSoma1(valor18, valor19);
        System.out.println("Soma (" + valor18 + " + " + valor19 + ") = " + soma + ".");

        /* 15 - Média 2 */
        System.out.println("=== Exercício 15 - Verificando a média ===");
        System.out.println("Digite o primeiro valor: ");
        float valor20 = scanner.nextFloat();
        System.out.println("Digite o segundo valor: ");
        float valor21 = scanner.nextFloat();
        System.out.println("Digite o terceiro valor: ");
        float valor22 = scanner.nextFloat();
        media = Calculos.CalcularMedia1(valor20, valor21, valor22);
        System.out.printf("Média (" + valor20 + " + " + valor21 + " + " + valor22 + ") : %.2f. \n", media);

        /* 16 - Par ou Ímpar */
        System.out.println("=== Exercício 16 - Par ou Ímpar ===");
        System.out.println("Digite o número: ");
        int valor23 = scanner.nextInt();
        Calculos.CalcularIP1(valor23);

        /* 17 - Calculadora básica */
        System.out.println("=== Exercício 17 - Calculadora básica ===");
        System.out.println("Digite o primeiro valor: ");
        float valor24 = scanner.nextFloat();
        System.out.println("Digite o segundo valor: ");
        float valor25 = scanner.nextFloat();
        /*
         * System.out.println("Digite a operação: ");
         * String operacao = scanner.next();
         */
        Calculos.Calculadora(valor24, valor25, "");

        /* 18 - Fatorial 2 */
        System.out.println("=== Exercício 18 - Calculando o fatorial ===");
        System.out.println("Digite o número: ");
        int valor26 = scanner.nextInt();
        Calculos.CalcularFatorial(valor26);

        /* 19 - Número primo 2 */
        System.out.println("=== Exercício 19 - Número primo ===");
        System.out.println("Digite o número: ");
        int valor27 = scanner.nextInt();
        Calculos.CalcularPrimo1(valor27);

        /* 5 - Verificando se o ano é bissexto 2 */
        System.out.println("=== Exercício 20 - Ano bissexto 2 ===");
        int valor28 = scanner.nextInt();
        Calculos.CalcularAno(valor28);

        /* 21 - Média de um array */
        System.out.println("=== Exercício 21 - Média de um vetor ===");
        Calculos.CalcularMediaVetor();

        System.out.println("=== Fim ===");
        scanner.close();
    }
}

class Calculos { // Classe Calculos (classe secundária)
    /* Exercícios Java 01 */
    public static float CalcularSoma(float a, float b) { // Método CalcularSoma da classe Calculos
        return a + b;
    }

    public static float CalcularMedia(float a, float b, float c) { // Método CalcularMedia da classe Calculos
        return (a + b + c) / 3;
    }

    public static int CalcularIP(int a) { // Método CalcularIP da classe Calculos
        if (a % 2 == 0) {
            System.out.println("O número " + a + " é par.");
            // Imprimir com printf
            /* System.out.printf("O número %d é par.\n", a); */
        } else {
            System.out.println("O número " + a + " é ímpar.");
            // Imprimir com printf
            /* System.out.printf("O número %d é ímpar.\n", a); */
        }
        return a;
    }

    public static void CalcularAno(int ano) { // Método CalcularAno da classe Calculos
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            // Ano bissexto é divisível por 4 e não é divisível por 100 ou é divisível por
            // 400
            // se o ano for divisível por 4 e não for divisível por 100 então é bissexto
            // se o ano for divisível por 400 então é bissexto
            System.out.println("O ano " + ano + " é bissexto.");
            // Imprimir com printf
            /* System.out.printf("O ano %d é bissexto.\n", ano); */
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
            // Imprimir com printf
            /* System.out.printf("O ano %d não é bissexto.\n", ano); */
        }
    }

    public static void CalcularFatorial(int numero) { // Método CalcularFatorial da classe Calculos
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }
        System.out.println("Fatorial de " + numero + " é " + fatorial + ".");
        // Imprimir com printf
        /* System.out.printf("Fatorial de %d é %d.\n", numero, fatorial); */
    }

    public static void CalcularPrimo(int numero) { // Método CalcularPrimo da classe Calculos
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println("O número " + numero + " é primo.");
            // Imprimir com printf
            /* System.out.printf("O número %d é primo.\n", numero); */
        } else {
            System.out.println("O número " + numero + " não é primo.");
            // Imprimir com printf
            /* System.out.printf("O número %d não é primo.\n", numero); */
        }
    }

    public static void CalcularNota(float numero) {
        if (numero >= 90 && numero <= 100) {
            System.out.println("Sua nota foi " + numero + ". Excelente!");
        } else if (numero <= 90 || numero >= 70) {
            System.out.println("Sua nota foi " + numero + ".Muito bom!");
        } else if (numero <= 70 || numero >= 50) {
            System.out.println("Sua nota foi " + numero + ".Bom!");
        } else if (numero <= 50 || numero >= 30) {
            System.out.println("Sua nota foi " + numero + ".Regular!");
        } else if (numero <= 30 || numero >= 0) {
            System.out.println("Sua nota foi " + numero + ".Ruim!");
        } else {
            System.out.println("Nota inválida!");
        }
    }

    public static String CalcularVariável(String variavel) {
        return variavel;
    }

    public static void CalcularLoop(int numero) {
        for (int i = 0; i <= numero; i++) {
            System.out.print(i + " ");
            /*
             * Imprimir com printf
             * System.out.printf("%d ", i);
             */
        }
        System.out.print("\n");
    }

    public static void CalcularLoop1(int numero) {
        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            soma = soma + i;
            /*
             * Imprimir com printf
             * System.out.printf("%d ", i);
             */
            System.out.print(i + " ");
        }
        System.out.print("\n");
        System.out.println("A soma dos números acima é: " + soma + ".");
        /*
         * Imprimir com printf
         * System.out.printf("A soma dos números acima é: %d.\n", soma);
         */
    }

    public static float CalcularMaior(float a, float b) {
        if (a > b) {
            System.out.println("O maior valor é " + a + ".");
            return a;
        } else if (b > a) {
            System.out.println("O maior valor é " + b + ".");
            return b;
        } else {
            System.out.println("Os valores são iguais.");
        }
        return a;
    }

    public static int CalcularFibonacci(int numero) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i <= numero; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
        System.out.print("\n");
        return c;
    }

    public static float CalcularMult(float numero) { // Método CalcularMult da classe Calculos
        float tabuada = 0;
        for (int i = 0; i <= 10; i++) {
            tabuada = numero * i;
            if (i >= 11 || i == 11) {
                break;
            }
            // System.out.println(numero + " x " + i + " = " + tabuada + ".");
            // Imprimindo com printf
            System.out.printf("Tabuada do " + numero + ": ");
            System.out.printf("%.2f x %d = %.2f.\n", numero, i, tabuada);
        }
        return tabuada;
    }

    /* Exercícios Java 02 */

    public static float CalcularSoma1(float a, float b) { // Método CalcularSoma1 da classe Calculos
        float soma = a + b;
        return soma;
    }

    public static float CalcularMedia1(float a, float b, float c) { // Método CalcularMedia1 da classe Calculos
        return (a + b + c) / 3;
    }

    public static int CalcularIP1(int a) { // Método CalcularIP1 da classe Calculos
        if (a % 2 == 0) {
            System.out.println("O número " + a + " é par.");
            // Imprimir com printf
            /* System.out.printf("O número %d é par.\n", a); */
        } else {
            System.out.println("O número " + a + " é ímpar.");
            // Imprimir com printf
            /* System.out.printf("O número %d é ímpar.\n", a); */
        }
        return a;
    }

    /*
     * Exercício 4 - Calculadora básica:
     * Crie um programa que permita ao usuário escolher entre as operações de soma,
     * subtração, multiplicação e divisão de dois números.
     * Dica: Use um menu para mostrar as opções de operações.
     */
    // calculadora básica
    public static void Calculadora(float a, float b, String operacao) {
        Scanner scanner = new Scanner(System.in);
        float resultado = 0;
        boolean operacaoValida = false; // Variável de controle para verificar se a operação é válida

        while (!operacaoValida) { // Enquanto a operação não for válida, o loop continua
            System.out.println("Escolha a operação: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            operacao = scanner.next();

            switch (operacao) {
                case "1":
                    resultado = a + b;
                    System.out.printf("A soma de (%.2f + %.2f) = %.2f.\n", a, b, resultado);
                    operacaoValida = true; // Se a operação for válida, o loop é interrompido
                    break;
                case "2":
                    resultado = a - b;
                    System.out.printf("A subtração de (%.2f - %.2f) = %.2f.\n", a, b, resultado);
                    operacaoValida = true;
                    break;
                case "3":
                    resultado = a * b;
                    System.out.printf("A multiplicação de (%.2f x %.2f) = %.2f.\n", a, b, resultado);
                    operacaoValida = true;
                    break;
                case "4":
                    resultado = a / b;
                    System.out.printf("A divisão de (%.2f / %.2f) = %.2f.\n", a, b, resultado);
                    operacaoValida = true;
                    break;
                case "0":
                    System.out.println("Fim!");
                    operacaoValida = true;
                    break;
                default:
                    System.out.println("Operação inválida! Digite novamente.");
                    break;

            }
        }
        /*
         * Usamos switch-case pois já podemos inserir o valor diretamente, por exemplo:
         * case "/":, ao invés de usar o IF, que necessitaria de usar .equals (método de
         * comparação)
         */
        /*
         * System.out.println("Deseja realizar outra operação? (S/N)");
         * String resposta = scanner.next();
         * if (resposta.equals("S") || resposta.equals("s")) {
         * System.out.println("Digite o primeiro valor: ");
         * float valor1 = scanner.nextFloat();
         * System.out.println("Digite o segundo valor: ");
         * float valor2 = scanner.nextFloat();
         * System.out.println("Digite a operação: ");
         * String operacao1 = scanner.next();
         * Calculadora(valor1, valor2, operacao1);
         * } else {
         * System.out.println("Fim!");
         * }
         */
        scanner.close();
    }

    public static void CalcularPrimo1(int numero) { // Método CalcularPrimo da classe Calculos
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println("O número " + numero + " é primo.");
            // Imprimir com printf
            /* System.out.printf("O número %d é primo.\n", numero); */
        } else {
            System.out.println("O número " + numero + " não é primo.");
            // Imprimir com printf
            /* System.out.printf("O número %d não é primo.\n", numero); */
        }
    }

    // Crie um programa que calcule a média dos elementos de um array de números
    // inteiros fornecido pelo usuário.
    // Dica: Percorra o array somando todos os elementos e divida pelo número total
    // de elementos.
    // Exercício 21 - Média de um array
    public static void CalcularMediaVetor() {
        Scanner scanner = new Scanner(System.in);
        float soma = 0;
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        float[] vetor = new float[tamanho];

        // Preenchendo o array
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = scanner.nextFloat(); // Atribuindo o valor digitado pelo usuário ao array no índice i
        }

        // Preenchendo o array de forma automática
        /*
         * for (int i = 0; i < vetor.length; i++) {
         * vetor[i] = i;
         * }
         */

        // Cálculo da média

        // Como preencher um array com 1000 números aleatórios
        /*
        * for (int i = 0; i < vetor.length; i++) {
        * vetor[i] = (int) (Math.random() * 1000);
        * }
        */
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i]; // vetor 1, 5, 6
            /*
             * soma = 0 + vetor[0]; 0 + 1 = 1
             * soma = 1 + vetor[1]; 1 + 5 = 6
             * soma = 6 + vetor[2]; 6 + 6 = 12
             */
        }
        float media = soma / vetor.length; // 12 / 3 = 4
        System.out.println("A média dos elementos do array é: " + media + ".");

        scanner.close();
    }
}