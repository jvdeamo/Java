
// Autor: João Victor Martins Deamo
// Date: 31/07/2023
// Version: 1.2
// Senai - Desenvolvimento de Sistemas
import java.util.Scanner;
import java.io.PrintStream;
import java.util.Random;

/*
Exercício 11:
A Barbie está organizando uma lista de compras para uma festa que ela vai realizar. Crie um programa que permita à Barbie adicionar até 5 itens diferentes à lista de compras. Em seguida, exiba a lista completa para ela conferir.

Exercício 12:
Oppenheimer está estudando as temperaturas de diferentes cidades. Crie um programa que permita a Oppenheimer registrar as temperaturas médias diárias de uma cidade durante uma semana (7 dias). Ao final, exiba a temperatura média da semana.

Exercício 13:
A Barbie está brincando com seus amigos e criou um jogo em que eles devem adivinhar um número secreto entre 1 e 100. Crie um programa que gere um número aleatório entre 1 e 100 e permita que os amigos da Barbie tentem adivinhar o número até acertarem. Informe quantas tentativas foram necessárias.

Exercício 14:
Oppenheimer está trabalhando em um projeto e precisa armazenar as horas gastas em cada tarefa. Crie um programa que permita a Oppenheimer inserir as horas gastas em até 5 tarefas diferentes. Em seguida, exiba o total de horas trabalhadas.

Exercício 15:
A Barbie está organizando um sorteio de brindes para sua festa e precisa sortear aleatoriamente 3 números dentre os convidados. Crie um programa que permita à Barbie registrar os nomes dos convidados e, ao final, exiba os nomes dos 3 sorteados.

Exercício 16:
Oppenheimer está estudando as vendas de um produto em uma loja. Crie um programa que permita a Oppenheimer registrar as vendas diárias desse produto durante uma semana (7 dias). Ao final, exiba a média de vendas diárias da semana.

Exercício 17:
A Barbie está organizando um torneio de quebra-cabeças para seus amigos. Cada amigo resolveu um certo número de quebra-cabeças e ela precisa saber quantos quebra-cabeças cada amigo resolveu. Crie um programa que permita à Barbie inserir o nome de até 5 amigos e a quantidade de quebra-cabeças resolvidos por cada um. Ao final, exiba o nome e a quantidade de quebra-cabeças de cada amigo.

Exercício 18:
Oppenheimer está estudando a variação do preço de uma ação na bolsa de valores. Crie um programa que permita a Oppenheimer registrar o preço da ação em até 10 dias diferentes. Em seguida, exiba a maior variação de preço entre dois dias consecutivos.

Exercício 19:
A Barbie está organizando uma competição de natação e precisa registrar os tempos de cada nadador. Crie um programa que permita à Barbie inserir o nome de até 5 nadadores e o tempo que cada um levou para concluir a prova. Ao final, exiba o nome do nadador vencedor.

Exercício 20:
Oppenheimer está estudando os hábitos alimentares de um grupo de pessoas. Crie um programa que permita a Oppenheimer registrar a quantidade de calorias consumidas por cada pessoa durante uma semana (7 dias). Ao final, exiba a pessoa que consumiu a maior quantidade de calorias em um único dia.

 */
public class AppSenaiArray2 {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
        Vetores_2.main(main);
        scanner.close();
    }

}

class Vetores_2 {
    public static void main(String[] Resultados) {
        PrintStream out = System.out;
        out.println("\033[H\033[2J");
        Scanner scanner = new Scanner(System.in);
        Vetores_2.Exercício11();
        Vetores_2.Exercício12();
        Vetores_2.Exercício13();
        Vetores_2.Exercício14();
        Vetores_2.Exercício15();
        /*
         * Vetores_2.Exercício15();
         * Vetores_2.Exercício16();
         * Vetores_2.Exercício17();
         * Vetores_2.Exercício18();
         * Vetores_2.Exercício19();
         * Vetores_2.Exercício20();
         */
        scanner.close();
    }

    public static void Exercício11() {
        PrintStream out = System.out;
        Scanner scanner = new Scanner(System.in);
        out.println("Exercício 11");
        String[] vetor = new String[5];

        for (int i = 0; i < vetor.length; i++) {
            out.println("Digite um item para a lista de compras: ");
            vetor[i] = scanner.next();
        }
        out.print("Lista de compras: ");
        for (String lista : vetor) {
            out.print(lista + " ");
        }
        out.println();
    }

    public static void Exercício12() {
        PrintStream out = System.out;
        Scanner scanner = new Scanner(System.in);
        Double[] vetor = new Double[7];
        String[] Semana = { "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado",
                "Domingo" };
        Double soma = 0.0;
        Double media = 0.0;
        out.println("Exercício 12");
        for (int i = 0; i < vetor.length; i++) {
            out.println("Digite a temperatura média do dia " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }
        out.println("Temperatudas diárias: ");
        for (int i = 0; i < vetor.length; i++) {
            out.printf("%s: %.2fºC. \n", Semana[i], vetor[i]);
        }
        media = soma / vetor.length;
        out.printf("A temperatura média da semana foi de: %.2fºC", media);
        out.println("\n");
    }

    public static void Exercício13() {
        PrintStream out = System.out;
        Scanner scanner = new Scanner(System.in);
        out.println("Exercício 13");
        int numero = 0;
        int tentativas = 0;
        boolean acertou = false;
        Random aleatorio = new Random();
        int numeroAleatorio = aleatorio.nextInt(100);
        out.println("Tente adivinhar o número secreto entre 1 e 100: ");
        out.println(numeroAleatorio);
        while (acertou == false) {
            numero = scanner.nextInt();
            if (numero == numeroAleatorio) {
                acertou = true;
            } else if (numero > numeroAleatorio) {
                out.println("O número secreto é menor que " + numero);
            } else {
                out.println("O número secreto é maior que " + numero);
            }
            tentativas = tentativas + 1;
        }
        out.printf("Parabéns, você acertou o número secreto [%d] em %d tentativas.\n", numeroAleatorio, tentativas);
        out.println();
    }

    public static void Exercício14() {
        PrintStream out = System.out;
        Scanner scanner = new Scanner(System.in);
        out.println("Exercício 14");
        Double[] vetor = new Double[5];
        Double soma = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            out.println("Digite a quantidade de horas gastas na tarefa " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }
        out.println("Horas gastas em cada tarefa: ");
        int i = 0;
        for (double horasG : vetor) {
            out.printf("Tarefa %d: %.2f horas. \n", i, horasG);
            i = i + 1;
        }
        out.printf("Total de horas gastas: %.2f horas.", soma);
        out.println("\n");
    }

    public static void Exercício15() {
        PrintStream out = System.out;
        Scanner scanner = new Scanner(System.in);
        out.println("Exercício 15");
        String[] vetor = new String[5];
        String[] Ordem = {"Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto"};
        String[] sorteados = new String[3];
        Random aleatorio = new Random();
        int numeroAleatorio = aleatorio.nextInt(5);
        for (int i = 0; i < vetor.length; i++) {
            out.printf("Digite o nome do %s convidado: ", Ordem[i]);
            vetor[i] = scanner.next();
        }
        out.println("Convidados: ");
        for (String convidados : vetor) {
            out.printf("%s, ", convidados);
        }
        out.print(".\n");
        for (int i = 0; i < sorteados.length; i++) {
            numeroAleatorio = aleatorio.nextInt(5);
            sorteados[i] = vetor[numeroAleatorio];
        }
        out.print("Convidados sorteados - ");
        for (String sorteadosNomes : sorteados) {
            out.printf("%s ", sorteadosNomes);
        }
        out.println();
    }

}
