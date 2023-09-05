import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream out = System.out;
        boolean sair = false;
        // BancoDeDados.CreateDatabase();
        // // Criar um while para que o usuário possa adicionar mais de um animal
        // while (!sair) {
        while (!sair) {
            out.println("Escolha uma opção:");
            out.println("1. Inserir Animal");
            out.println("2. Sair");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    // Criar um laço de repetição para que o usuário possa inserir mais de um animal
                    out.println("Escolha o tipo de animal:");
                    out.println("1. Cachorro");
                    out.println("2. Gato");
                    out.println("3. Consultar Animais");
                    int escolha = scanner.nextInt();
                    switch (escolha) {
                        case 1:
                            out.println("Digite o nome do cachorro: ");
                            String nomeCachorro = scanner.nextLine();

                            out.print("Digite a idade do cachorro: ");
                            int idadeCachorro = scanner.nextInt();
                            // Limpar o buffer
                            scanner.nextLine();
                            out.print("Digite a raça do cachorro: ");
                            String racaCachorro = scanner.nextLine();

                            out.print("Digite o comportamento do cachorro: ");
                            String late = scanner.nextLine();

                            Cachorro novoCachorro = new Cachorro(nomeCachorro, idadeCachorro, racaCachorro, late);
                            novoCachorro.comportamento();
                            BancoDeDados.main(args);
                            out.println("\033[H\033[2J");
                            BancoDeDados.InserirMamifero(novoCachorro);
                            // BancoDeDados.inserirCachorro(novoCachorro);
                            break;

                        case 2:
                            out.print("Digite o nome do gato: ");
                            String nomeGato = scanner.nextLine();

                            out.print("Digite a idade do gato: ");
                            int idadeGato = scanner.nextInt();
                            scanner.nextLine();

                            out.print("Digite a raça do gato: ");
                            String racaGato = scanner.nextLine();
                            scanner.nextLine();

                            out.print("Digite o comportamento do gato: ");
                            String mia = scanner.nextLine();

                            Gato novoGato = new Gato(nomeGato, idadeGato, racaGato, mia);
                            novoGato.comportamento();
                            BancoDeDados.main(args);
                            out.println("\033[H\033[2J");
                            BancoDeDados.InserirMamifero(novoGato);
                            // BancoDeDados.inserirGato(novoGato);
                            break;
                        case 3:
                            ConsultaSQL novaConsulta = new ConsultaSQL();
                            out.println("\033[H\033[2J");
                            novaConsulta.Consulta();
                            break;
                        default:
                            out.println("Opção inválida.");
                            break;
                    }
                    sair = true;
                    break;
                case 2:
                    sair = true;
                    break;
                default:
                    out.println("Opção inválida.");
                    break;
            }
        }
    }
}
