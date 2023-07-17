public class App {
    public static void main(String[] args) {
        System.out.println("Ola Mundo!");
        int valor1 = 10;
        int valor2 = 4;
        Numero.soma(valor1, valor2);

        float valor3 = 2.5f;
        float valor4 = 4.5f;
        float valor5 = 6.5f;

        Numero1.media(valor3, valor4, valor5);

        int ano = 2020;
        bissexto.bih(ano);
    }
}

class Numero {
    public static void soma(int a, int b) {
        System.out.println("A soma de " + a + " + " + b + " é: " + (a + b) + ".");
    }
}

class Numero1 {
    public static void media(float c, float d, float e) {
        float num1 = (c);
        float num2 = (d);
        float num3 = (e);
        float media = (num1 + num2 + num3) / 3;
        System.out.println("Média de " + num1 + " + " + num2 + " + " + num3 + ": " + media + ".");
    }
}

class bissexto {
    public static void bih(int ano) {
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
    }
}