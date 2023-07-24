import java.io.PrintStream;
import java.util.Scanner;

public class AppIndustria {
    /*
     * Uma indústria de manufatura deseja desenvolver um sistema de controle de
     * produção para gerenciar a fabricação de seus produtos. O sistema deve
     * permitir que os funcionários da indústria cadastrem novos produtos,
     * acompanhem o status de produção e realizem a contagem regressiva para o prazo
     * de entrega de cada pedido.
     * 
     * 1. Cadastrar novo produto: O sistema deve permitir que os funcionários da
     * indústria cadastrem novos produtos, informando o nome do produto, código de
     * identificação, quantidade a ser produzida e prazo de entrega. PUBLIC
     * 
     * 2. Acompanhar o status de produção: O sistema deve exibir o status de
     * produção de cada produto, mostrando a quantidade produzida até o momento e a
     * quantidade restante para atingir a meta estabelecida. PRIVATE
     * 
     * 3. Verificar prazo de entrega: O sistema deve verificar se o prazo de entrega
     * de cada pedido foi cumprido. Caso o prazo seja atingido, o produto é
     * considerado pronto para entrega.
     * 
     * 4. Modificadores de acesso: As informações sobre o status de produção de cada
     * produto devem ser armazenadas de forma privada, e o sistema deve utilizar
     * modificadores de acesso adequados (public, private e protected) para
     * controlar a visibilidade e o acesso aos atributos e métodos da classe.
     * 
     * 5. Entrada e saída de dados: O sistema deve permitir a entrada de dados do
     * usuário para cadastrar novos produtos e exibir mensagens formatadas no
     * console para informar o status de produção e o prazo de entrega
     * 
     */
    public static void main(String[] Controle) {
        PrintStream out = System.out;
        out.println("\033[H\033[2J");
        Menu.MenuExibir();
    }

}

class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void MenuExibir() {
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Cadastrar novo produto");
        /*
         * System.out.println("2 - Acompanhar o status de produção");
         * System.out.println("3 - Verificar prazo de entrega");
         * System.out.println("4 - Modificadores de acesso");
         * System.out.println("5 - Entrada e saída de dados");
         */
        Integer escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                MenuProduto();
                break;
            case 2:
                System.out.println("Acompanhar o status de produção");
                break;
            case 3:
                System.out.println("Verificar prazo de entrega");
                break;
            case 4:
                System.out.println("Modificadores de acesso");
                break;
            case 5:
                System.out.println("Entrada e saída de dados");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        scanner.close();
    }

    private static void MenuProduto() {
        boolean sair = false;
        while (!sair) {
            System.out.println("Nome do produto: ");
            String nomeProduto = scanner.next();
            System.out.println("Código de identificação: ");
            int codigoProduto = scanner.nextInt();
            System.out.println("Quantidade a ser produzida: ");
            int quantidadeProduto = scanner.nextInt();
            System.out.println("Prazo de entrega: ");
            String prazoProduto = scanner.next();
            Produto.CadastrarProduto(nomeProduto, codigoProduto, quantidadeProduto, prazoProduto);
            /*
             * caso queira exibir os dados do produto cadastrado
             * System.out.println("Produto cadastrado: " + nomeProduto);
             * System.out.println("Código do produto: " + codigoProduto);
             * System.out.println("Quantidade: " + quantidadeProduto);
             * System.out.println("Prazo: " + prazoProduto);
             */
            System.out.println("Produto cadastrado com sucesso!");

            System.out.println("Deseja exibir os dados do produto? (S/N)");
            String exibirProduto = scanner.next();
            exibirProduto = exibirProduto.toUpperCase();

            switch (exibirProduto.toUpperCase()) {
                case "S":
                    PrintStream out = System.out;
                    out.println("\033[H\033[2J");
                    System.out.printf("Informações do produto ID (%d)\n", codigoProduto);
                    System.out.printf("Nome do produto: %s \n", nomeProduto);
                    System.out.printf("Código do produto: %d \n", codigoProduto);
                    System.out.printf("Quantidade: %d \n", quantidadeProduto);
                    System.out.printf("Prazo: %s \n", prazoProduto);
                    sair = true;
                    break;
                case "N":
                    sair = true;
                    break;
                default:
                    System.out.println("Não entendi, você quer exibir os dados do produto? (S/N)");
                    exibirProduto = scanner.next();
                    exibirProduto = exibirProduto.toUpperCase();
                    switch (exibirProduto.toUpperCase()) {
                        case "S":
                            out = System.out;
                            out.println("\033[H\033[2J");
                            System.out.printf("Informações do produto ID (%d)\n", codigoProduto);
                            System.out.printf("Nome do produto: %s \n", nomeProduto);
                            System.out.printf("Código do produto: %d \n", codigoProduto);
                            System.out.printf("Quantidade: %d \n", quantidadeProduto);
                            System.out.printf("Prazo: %s \n", prazoProduto);
                            sair = true;
                            break;
                        case "N":
                            sair = true;
                            break;
                        default:
                            MenuExibir();
                            sair = true;
                            break;
                    }
                    break;
            }

            System.out.println("Deseja cadastrar outro produto? (S/N)");
            String cadastrarProduto = scanner.next();
            cadastrarProduto = cadastrarProduto.toUpperCase();
            switch (cadastrarProduto.toUpperCase()) {
                case "S":
                    PrintStream out = System.out;
                    out.println("\033[H\033[2J");
                    MenuExibir();
                    break;
                case "N":
                    System.out.println("Obrigado por utilizar o sistema!");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            sair = true;
            break;
        }
    }
}

class Produto {
    // Scanner
    static Scanner scanner = new Scanner(System.in);
    // Atributos
    private String nomeProduto;
    private Integer codigoProduto;
    private Integer quantidadeProduto;
    private String prazoProduto;

    // Construtor
    public Produto(String nomeProduto, Integer codigoProduto, Integer quantidadeProduto, String prazoProduto) {
        this.nomeProduto = nomeProduto;
        this.codigoProduto = codigoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.prazoProduto = prazoProduto;
    }

    // Métodos
    public static Produto CadastrarProduto(String nomeProduto, int codigoProduto, int quantidadeProduto,
            String prazoProduto) {
        Produto produto = new Produto(nomeProduto, codigoProduto, quantidadeProduto, prazoProduto);
        return produto;
    }
}
