import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de animal:");
        System.out.println("1. Cachorro");
        System.out.println("2. Gato");
        System.out.println("3. Consultar Animais");
        int escolha = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer

        switch (escolha) {
            case 1:
                System.out.print("Digite o nome do cachorro: ");
                String nomeCachorro = scanner.nextLine();

                System.out.print("Digite a idade do cachorro: ");
                int idadeCachorro = scanner.nextInt();

                System.out.print("Digite a raça do cachorro: ");
                String racaCachorro = scanner.nextLine();

                Animal novoCachorro = new Cachorro(nomeCachorro, idadeCachorro, racaCachorro);
                novoCachorro.exibirInfo();
                BancoDeDados.inserirAnimal(novoCachorro);
                break;

            case 2:
                System.out.print("Digite o nome do gato: ");
                String nomeGato = scanner.nextLine();

                System.out.print("Digite a idade do gato: ");
                int idadeGato = scanner.nextInt();
                scanner.nextLine();  // Limpar o buffer

                System.out.print("Digite a raça do gato: ");
                String racaGato = scanner.nextLine();

                Animal novoGato = new Gato(nomeGato, idadeGato, racaGato);
                novoGato.exibirInfo();
                BancoDeDados.inserirAnimal(novoGato);
                break;

            case 3:
                ConsultaSQL novaConsulta = new ConsultaSQL();
                novaConsulta.ConsultaSQL();
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
