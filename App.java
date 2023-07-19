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
        
        System.out.println("=== Fim ===");        

        scanner.close();
    }
}

class Calculos { // Classe Calculos (classe secundária)
    
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
            /* Imprimir com printf
            System.out.printf("%d ", i); */
        }
        System.out.print("\n");
    }

    public static void CalcularLoop1(int numero) {
        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            soma = soma + i;
            /* Imprimir com printf 
            System.out.printf("%d ", i); */
            System.out.print(i + " ");
        }
        System.out.print("\n");
        System.out.println("A soma dos números acima é: " + soma + ".");
        /* Imprimir com printf
        System.out.printf("A soma dos números acima é: %d.\n", soma); */
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
    public static int CalcularFibonacci (int numero){
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
    public static float CalcularMult (float numero){
        float tabuada = 0;
        for (int i = 0; i <= numero; i++) {
            tabuada = numero * i;
            //System.out.println(numero + " x " + i + " = " + tabuada + ".");
            // Imprimindo com printf
            System.out.printf("Tabuada do " + numero + ": ");
            System.out.printf("%.2f x %d = %.2f.\n", numero, i, tabuada);  
        }
        return tabuada;
    }
}