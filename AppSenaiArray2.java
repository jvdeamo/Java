
// Autor: João Victor Martins Deamo
// Date: 31/07/2023
// Version: 1.2
// Senai - Desenvolvimento de Sistemas
import java.util.Scanner;
import java.io.PrintStream;
//import java.util.Random;

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
 
Exercício 21: Resolvido

Exercício 22:
Oppenheimer está estudando o desempenho dos alunos em uma prova. Crie um programa que permita à Oppenheimer inserir as notas de até 5 alunos em uma prova. No final, exiba a média das notas e quantos alunos tiveram notas acima da média.
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
        /*
         * Vetores_2.Exercício11();
         * Vetores_2.Exercício12();
         * Vetores_2.Exercício13();
         * Vetores_2.Exercício14();
         * Vetores_2.Exercício15();
         * Vetores_2.Exercício16();
         * Vetores_2.Exercício17();
         * Vetores_2.Exercício18();
         * Vetores_2.Exercício19();
         * Vetores_2.Exercício20();
         * Vetores_2.Exercício20();
         * Vetores_2.Exercício21();
         * Vetores_2.Exercício22();
         * Vetores_2.Exercício22();
         */
        scanner.close();
    }

    /*
     * 
     * scanner.close();
     * }
     * 
     * public static void Exercício11() {
     * PrintStream out = out;
     * Scanner scanner = new Scanner(in);
     * out.println("Exercício 11");
     * String[] vetor = new String[5];
     * 
     * for (int i = 0; i < vetor.length; i++) {
     * out.println("Digite um item para a lista de compras: ");
     * vetor[i] = scanner.next();
     * }
     * out.print("Lista de compras: ");
     * for (String lista : vetor) {
     * out.print(lista + " ");
     * }
     * out.println();
     * }
     * 
     * public static void Exercício12() {
     * PrintStream out = out;
     * Scanner scanner = new Scanner(in);
     * Double[] vetor = new Double[7];
     * String[] Semana = { "Segunda-feira", "Terça-feira", "Quarta-feira",
     * "Quinta-feira", "Sexta-feira", "Sábado",
     * "Domingo" };
     * Double soma = 0.0;
     * Double media = 0.0;
     * out.println("Exercício 12");
     * for (int i = 0; i < vetor.length; i++) {
     * out.println("Digite a temperatura média do dia " + (i + 1) + ": ");
     * vetor[i] = scanner.nextDouble();
     * soma = soma + vetor[i];
     * }
     * out.println("Temperaturas diárias: ");
     * for (int i = 0; i < vetor.length; i++) {
     * out.printf("%s: %.2fºC. \n", Semana[i], vetor[i]);
     * }
     * media = soma / vetor.length;
     * out.printf("A temperatura média da semana foi de: %.2fºC", media);
     * out.println("\n");
     * }
     * 
     * public static void Exercício13() {
     * PrintStream out = out;
     * Scanner scanner = new Scanner(in);
     * out.println("Exercício 13");
     * int numero = 0;
     * int tentativas = 0;
     * boolean acertou = false;
     * Random aleatorio = new Random();
     * int numeroAleatorio = aleatorio.nextInt(100);
     * out.println("Tente adivinhar o número secreto entre 1 e 100: ");
     * out.println(numeroAleatorio);
     * while (acertou == false) {
     * numero = scanner.nextInt();
     * if (numero == numeroAleatorio) {
     * acertou = true;
     * } else if (numero > numeroAleatorio) {
     * out.println("O número secreto é menor que " + numero);
     * } else {
     * out.println("O número secreto é maior que " + numero);
     * }
     * tentativas = tentativas + 1;
     * }
     * out.printf("Parabéns, você acertou o número secreto [%d] em %d tentativas.\n"
     * , numeroAleatorio, tentativas);
     * out.println();
     * }
     * 
     * public static void Exercício14() {
     * PrintStream out = out;
     * Scanner scanner = new Scanner(in);
     * out.println("Exercício 14");
     * Double[] vetor = new Double[5];
     * Double soma = 0.0;
     * for (int i = 0; i < vetor.length; i++) {
     * out.println("Digite a quantidade de horas gastas na tarefa " + (i + 1) +
     * ": ");
     * vetor[i] = scanner.nextDouble();
     * soma = soma + vetor[i];
     * }
     * out.println("Horas gastas em cada tarefa: ");
     * int i = 0;
     * for (double horasG : vetor) {
     * out.printf("Tarefa %d: %.2f horas. \n", i, horasG);
     * i = i + 1;
     * }
     * out.printf("Total de horas gastas: %.2f horas.", soma);
     * out.println("\n");
     * }
     * 
     * public static void Exercício15() {
     * PrintStream out = out;
     * Scanner scanner = new Scanner(in);
     * out.println("Exercício 15");
     * String[] vetor = new String[5];
     * String[] Ordem = { "primeiro", "segundo", "terceiro", "quarto", "quinto" };
     * String[] sorteados = new String[3];
     * Random aleatorio = new Random();
     * int numeroAleatorio = aleatorio.nextInt(5);
     * for (int i = 0; i < vetor.length; i++) {
     * out.printf("Digite o nome do %s convidado: ", Ordem[i]);
     * vetor[i] = scanner.next();
     * }
     * out.print("Convidados - ");
     * for (String convidados : vetor) {
     * out.printf("%s, ", convidados);
     * }
     * out.print(".\n");
     * for (int i = 0; i < sorteados.length; i++) {
     * numeroAleatorio = aleatorio.nextInt(5);
     * sorteados[i] = vetor[numeroAleatorio];
     * /*
     * aqui ele atribui o valor sorteado a cada posição do vetor, por exemplo:
     * se o numeroAleatorio for 1
     * sorteado[0] = vetor[numeroAleatorio];
     * sorteado[1] = vetor[numeroAleatorio];
     * sorteado[2] = vetor[numeroAleatorio];
     * 
     * }
     * out.print("Convidados sorteados - ");
     * for (String sorteadosNomes : sorteados) {
     * out.printf("%s, ", sorteadosNomes);
     * }
     * out.println();
     * }
     * 
     * public static void Exercício16() {
     * PrintStream out = out;
     * Scanner scanner = new Scanner(in);
     * out.println("Exercício 16");
     * float[] vetor = new float[7];
     * String[] Semana = { "Segunda-feira", "Terça-feira", "Quarta-feira",
     * "Quinta-feira", "Sexta-feira", "Sábado",
     * "Domingo" };
     * float soma = 0.0f;
     * float media = 0.0f;
     * 
     * for (int i = 0; i < vetor.length; i++) {
     * out.println("Digite a quantidade de vendas de " + (Semana[i]) + ": ");
     * vetor[i] = scanner.nextFloat();
     * soma = soma + vetor[i];
     * }
     * 
     * out.println("Vendas diárias: ");
     * int dia = 1;
     * for (int i = 0; i < vetor.length; i++) {
     * out.printf("%s: %.1f vendas. \n", Semana[i], vetor[i]);
     * dia = dia + 1;
     * }
     * 
     * media = soma / vetor.length;
     * 
     * // Saídas
     * out.printf("A média de vendas diárias da semana foi de: %.1f vendas.",
     * media);
     * out.println("\n");
     * }
     * 
     * public static void Exercício17() {
     * PrintStream out = out;
     * Scanner scanner = new Scanner(in);
     * out.println("Exercício 17");
     * String[] vetor = new String[5];
     * int[] vetor2 = new int[5];
     * String[] amigos = { "da onça", "do peito", "da barriga", "do coração",
     * "da alma" };
     * 
     * for (int i = 0; i < vetor.length; i++) {
     * out.printf("Digite o nome do amigo %s: ", (amigos[i]));
     * vetor[i] = scanner.next();
     * out.printf("Quebra-cabeças resolvidos pelo %s: ", vetor[i]);
     * vetor2[i] = scanner.nextInt();
     * }
     * 
     * // Saídas
     * out.println("Amigos e quebra-cabeças resolvidos: ");
     * for (int i = 0; i < vetor.length; i++) {
     * out.printf("%s %s: %d quebra-cabeças. \n", vetor[i], amigos[i], vetor2[i]);
     * }
     * out.println();
     * }
     * 
     * public static void Exercício18() {
     * // Declarações
     * PrintStream out = out;
     * Scanner scanner = new Scanner(in);
     * out.println("Exercício 18");
     * 
     * // Inicializações
     * Double[] vetor = new Double[10];
     * String[] Semana = { "Segunda-feira", "Terça-feira", "Quarta-feira",
     * "Quinta-feira", "Sexta-feira", "Sábado",
     * "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira" };
     * Double maiorVariacao = 0.0;
     * Double variacao = 0.0;
     * 
     * out.
     * println("Relatório de variação de preço de ações no período 10 dias, informe os dados necessários: "
     * );
     * 
     * // Entradas
     * for (int i = 0; i < vetor.length; i++) {
     * out.printf("Digite o preço da ação de %s: ", (Semana[i]));
     * vetor[i] = scanner.nextDouble();
     * }
     * 
     * // Consulta preços das ações
     * out.println("Preços da ação: ");
     * int dia = 1;
     * for (int i = 0; i < vetor.length; i++) {
     * out.printf("%s: R$%.4f. \n", Semana[i], vetor[i]);
     * dia = dia + 1;
     * }
     * 
     * // Processamento maior variação de preço
     * for (int i = 0; i < vetor.length - 1; i++) {
     * variacao = vetor[i + 1] - vetor[i];
     * if (variacao > maiorVariacao) {
     * maiorVariacao = variacao;
     * }
     * }
     * 
     * // Saídas
     * out.
     * printf("A maior variação de preço entre dois dias consecutivos foi de: R$%.4f."
     * , maiorVariacao);
     * out.println("\n");
     * }
     * 
     * public static void Exercício19() {
     * // Declarações
     * PrintStream out = out;
     * Scanner scanner = new Scanner(in);
     * out.println("Exercício 19");
     * 
     * // Inicializações
     * String[] vetor = new String[5];
     * float[] vetor2 = new float[5];
     * String[] Ordem = { "primeiro", "segundo", "terceiro", "quarto", "quinto" };
     * String nomeVencedor = vetor[0];
     * float menorTempo = Float.MAX_VALUE; // Inicializa com o primeiro valor do
     * array vetor2
     * 
     * out.println("Relatório de tempo de natação, informe os dados necessários: ");
     * 
     * // Entradas
     * for (int i = 0; i < vetor.length; i++) {
     * out.printf("Digite o nome do %s nadador: ", (Ordem[i]));
     * vetor[i] = scanner.next();
     * out.printf("Digite o tempo de natação do %s: ", vetor[i]);
     * vetor2[i] = scanner.nextFloat();
     * }
     * 
     * // Consulta tempos de natação
     * out.println("Tempos de natação: ");
     * for (int i = 0; i < vetor.length; i++) {
     * out.printf("%s: %.3f segundos. \n", vetor[i], vetor2[i]);
     * }
     * 
     * // Processamento menor tempo de natação
     * // Processamento menor tempo de natação
     * // Processamento do menor tempo de natação
     * for (int i = 0; i < vetor.length; i++) {
     * if (vetor2[i] < menorTempo) {
     * menorTempo = vetor2[i];
     * nomeVencedor = vetor[i];
     * }
     * }
     * 
     * 
     * // Saídas
     * out.printf("O nadador vencedor foi %s com o tempo de %.3f segundos.",
     * nomeVencedor, menorTempo);
     * out.println("\n");
     * }
     * 
     * public static void Exercício20() {
     * // Declarações
     * PrintStream out = out;
     * Scanner scanner = new Scanner(in);
     * out.println("Exercício 20");
     * 
     * // Inicializações
     * float[] vetor = new float[7];
     * String[] Nomes = new String[7];
     * float maiorCaloria = 0.0f;
     * float caloria = 0.0f;
     * String nomeMaiorCaloria = "";
     * 
     * out.
     * println("Relatório de calorias consumidas no período de 7 dias, informe os dados necessários: "
     * );
     * 
     * // Entradas
     * for (int i = 0; i < vetor.length; i++) {
     * out.printf("Digite o nome do paciente %d: ", (i + 1));
     * Nomes[i] = scanner.next();
     * out.printf("Digite a quantidade de calorias consumidas por %s: ",
     * (Nomes[i]));
     * vetor[i] = scanner.nextFloat();
     * }
     * 
     * // Consulta calorias consumidas
     * out.println("Calorias consumidas: ");
     * int dia = 1;
     * for (int i = 0; i < vetor.length; i++) {
     * out.printf("%s: %.1f calorias. \n", Nomes[i], vetor[i]);
     * dia = dia + 1;
     * }
     * 
     * // Processamento maior caloria
     * for (int i = 0; i < vetor.length; i++) {
     * caloria = vetor[i];
     * if (caloria > maiorCaloria) {
     * maiorCaloria = caloria;
     * nomeMaiorCaloria = Nomes[i];
     * }
     * }
     * 
     * // Saídas
     * out.
     * printf("A pessoa que consumiu a maior quantidade de calorias em um único dia foi %s com %.3f calorias."
     * ,
     * nomeMaiorCaloria, maiorCaloria);
     * out.println("\n");
     * }
     * 
     * public static void Exercício21() {
     * // Declarações
     * PrintStream out = System.out;
     * Scanner scanner = new Scanner(System.in);
     * out.println("Exercício 21");
     * out.
     * println("Relatório de calorias consumidas em um determinado período, informe os dados necessários: "
     * );
     * String[] Semana = { "Segunda-feira", "Terça-feira", "Quarta-feira",
     * "Quinta-feira", "Sexta-feira", "Sábado",
     * "Domingo" };
     * 
     * out.println("Quantas pessoas consumiram calorias: ");
     * int numPessoas = scanner.nextInt();
     * out.println("Quantos dias foram registrados: ");
     * int numDias = scanner.nextInt();
     * 
     * // Matriz para armazenar as calorias consumidas por cada pessoa em cada dia
     * int[][] caloriasConsumidas = new int[numPessoas][numDias];
     * 
     * // Solicitar os dados de calorias consumidas a Oppenheimer
     * for (int pessoa = 0; pessoa < numPessoas; pessoa++) {
     * out.printf("Pessoa %d:\n", pessoa + 1);
     * for (int dia = 0; dia < numDias; dia++) {
     * out.printf("Digite a quantidade de calorias consumidas no dia de %s: ",
     * Semana[dia]);
     * caloriasConsumidas[pessoa][dia] = scanner.nextInt();
     * }
     * }
     * 
     * // Encontrar a pessoa que consumiu a maior quantidade de calorias em um único
     * // dia
     * int maiorCalorias = 0;
     * int pessoaMaiorCalorias = -1; // Índice da pessoa que consumiu mais calorias
     * for (int pessoa = 0; pessoa < numPessoas; pessoa++) {
     * for (int dia = 0; dia < numDias; dia++) {
     * if (caloriasConsumidas[pessoa][dia] > maiorCalorias) {
     * maiorCalorias = caloriasConsumidas[pessoa][dia];
     * pessoaMaiorCalorias = pessoa;
     * }
     * }
     * }
     * 
     * // Exibir o resultado
     * out.
     * printf("A pessoa %d consumiu a maior quantidade de calorias em um único dia: %d calorias.\n"
     * ,
     * pessoaMaiorCalorias + 1, maiorCalorias);
     * 
     * }
     * 
     * public static void Exercício22() {
     * // Declarações
     * PrintStream out = System.out;
     * Scanner in = new Scanner(System.in);
     * out.println("Exercício 22");
     * out.
     * println("Relatório de notas de alunos em uma prova, informe os dados necessários: "
     * );
     * String[] Matérias = { "Ciências", "Matemática", "Português", "Geografia",
     * "História" };
     * out.println("Quantos alunos fizeram a prova? ");
     * int qtdAlunos = in.nextInt();
     * int qtdMatérias = Matérias.length;
     * String[] nomes = new String[qtdAlunos];
     * int[] notas = new int[qtdMatérias];
     * float soma = 0;
     * float media = (6 % 10);
     * int acimaMedia = 0;
     * for (int i = 0; i < nomes.length; i++) {
     * out.printf("Digite o nome e sobrenome do aluno: ");
     * nomes[i] = in.next();
     * for (int j = 0; j < notas.length; j++) {
     * out.printf("Digite a nota do %s em %s: ", nomes[i], Matérias[j]);
     * notas[j] = in.nextInt();
     * soma = soma + notas[j];
     * media = ((soma / notas.length * notas.length));
     * if (notas[j] >= media) {
     * acimaMedia = acimaMedia + 1;
     * }
     * 
     * }
     * }
     * out.printf("A média das notas foi %.1f.", media);
     * out.printf("\nA quantidade de alunos acima da média foi de: %d", acimaMedia);
     * in.close();
     * }
     */

}
