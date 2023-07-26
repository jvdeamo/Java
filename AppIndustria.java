import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
    private static Produto produtoAtual;
    static Scanner scanner = new Scanner(System.in);

    public static void MenuExibir() {
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Cadastrar novo produto");
        System.out.println("2 - Acompanhar o status de produção");
        System.out.println("3 - Verificar prazo de entrega");
        System.out.println("4 - Modificadores de acesso");
        System.out.println("5 - Entrada e saída de dados");
        Integer escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                MenuProduto();
                break;
            case 2:
                System.out.println("Acompanhar o status de produção");
                MenuStatusProducao();
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
    }

    private static void MenuProduto() {
        boolean sair = false;
        boolean DataValida = false;
        while (!sair) {
            System.out.println("Nome do produto: ");
            String nomeProduto = scanner.next();
            System.out.println("Código de identificação: ");
            int codigoProduto = scanner.nextInt();
            System.out.println("Quantidade a ser produzida: ");
            int quantidadeProduto = scanner.nextInt();
            String prazoProduto = "";
            Date dataPrazoEntrega = null;
            while (!DataValida) {
                System.out.println("Prazo de entrega (dd-MM-yyyy): ");
                prazoProduto = scanner.next();

                // Convertendo o prazo de entrega digitado pelo usuário para Date
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                dataPrazoEntrega = null;
                try {
                    dataPrazoEntrega = dateFormat.parse(prazoProduto);
                    DataValida = true; // Se a data for válida, saímos do loop
                } catch (ParseException e) {
                    System.out.println("Formato esperado: dd-MM-yyyy");
                    prazoProduto = scanner.next();
                }
            }

            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.MONTH, 1);
            Date prazoEntregaGeral = cal.getTime();

            // Verificando se o prazo de entrega digitado pelo usuário está dentro do limite
            if (dataPrazoEntrega.before(prazoEntregaGeral)) {
                produtoAtual = Produto.CadastrarProduto(nomeProduto, codigoProduto, quantidadeProduto, prazoProduto);
                String StatusProducao = produtoAtual.getStatusProduto();
                System.out.println("Produto cadastrado com sucesso!");
                System.out.println("Status de produção: " + StatusProducao);
            } else {
                /*System.out.println("Formato esperado: dd-MM-yyyy");
                prazoProduto = scanner.next();*/
                System.out.println("O prazo de entrega ultrapassa o limite de 1 mês. \nOs produtos da fábrica devem ser entregues até: " + prazoEntregaGeral);
            }
            /*
             * while (prazoProduto.length() < 10) {
             * 
             * if (prazoProduto.charAt(i) == '-') {
             * continue;
             * }
             * if (!Character.isDigit(prazoProduto.charAt(i))) {
             * System.out.println("Data inválida");
             * System.out.println("Prazo de entrega: dd-MM-yyyy");
             * prazoProduto = scanner.next();
             * }
             * 
             * // O prazo de entrega deve estar no formato dd-MM-yyyy (26-07-2023), para
             * isso devemos fazer uma condição para verificar se o usuário digitou a data
             * corretamente
             * 
             * System.out.println("Data inválida");
             * System.out.println("Prazo de entrega: dd-MM-yyyy");
             * prazoProduto = scanner.next();
             * }
             */
            produtoAtual = Produto.CadastrarProduto(nomeProduto, codigoProduto, quantidadeProduto, prazoProduto);
            Produto.CadastrarProduto(nomeProduto, codigoProduto, quantidadeProduto, prazoProduto);
            Produto produto = Produto.CadastrarProduto(nomeProduto, codigoProduto, quantidadeProduto, prazoProduto);
            String StatusProducao = produto.getStatusProduto();
            /*
             * caso queira exibir os dados do produto cadastrado
             * System.out.println("Produto cadastrado: " + nomeProduto);
             * System.out.println("Código do produto: " + codigoProduto);
             * System.out.println("Quantidade: " + quantidadeProduto);
             * System.out.println("Prazo: " + prazoProduto);
             */

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
                    out = System.out;
                    out.println("\033[H\033[2J");
                    MenuExibir();
                    sair = true;
                    break;
                default:
                    while (!sair) {
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
                                System.out.printf("Status de produção: %s \n", StatusProducao);
                                sair = true;
                                break;
                            case "N":
                                out = System.out;
                                out.println("\033[H\033[2J");
                                MenuExibir();
                                sair = true;
                                break;
                            default:
                                out = System.out;
                                out.println("\033[H\033[2J");
                                MenuExibir();
                                break;
                        }
                    }
            }

            System.out.println("Deseja cadastrar outro produto? (S/N)");
            String cadastrarProduto = scanner.next();
            cadastrarProduto = cadastrarProduto.toUpperCase();
            switch (cadastrarProduto.toUpperCase()) {
                case "S":
                    PrintStream out = System.out;
                    out.println("\033[H\033[2J");
                    MenuExibir();
                    sair = true;
                    break;
                case "N":
                    out = System.out;
                    out.println("\033[H\033[2J");
                    MenuExibir();
                    sair = true;
                    break;
                default:
                    System.out.println("Não entendi, você quer cadastrar outro produto? (S/N)");
                    cadastrarProduto = scanner.next();
                    cadastrarProduto = cadastrarProduto.toUpperCase();
                    switch (cadastrarProduto.toUpperCase()) {
                        case "S":
                            out = System.out;
                            out.println("\033[H\033[2J");
                            MenuProduto();
                            sair = true;
                            break;
                        case "N":
                            out = System.out;
                            out.println("\033[H\033[2J");
                            MenuExibir();
                            sair = true;
                            break;
                        default:
                            out = System.out;
                            out.println("\033[H\033[2J");
                            MenuExibir();
                            break;
                    }

            }
            sair = true;
            break;
        }
        scanner.close(); // Mova esta linha para fora do loop while
    }

    private static void MenuStatusProducao() {
        boolean sair = false;

        while (!sair) {
            System.out.println("Status de produção: ");
            System.out.println("1 - Em fila de produção");
            System.out.println("2 - Em produção");
            System.out.println("3 - Pronto para entrega");
            System.out.println("4 - Entregue");
            String exibirStatus = scanner.next();
            produtoAtual = Produto.CadastrarProduto(exibirStatus, 0, 0, exibirStatus);
            exibirStatus = exibirStatus.toUpperCase();

            switch (exibirStatus) {
                case "1":

                    produtoAtual.setStatusProduto("Em fila de produção");
                    System.out.printf(
                            "Status de produção do produto %s foi alterado para " + produtoAtual.getStatusProduto()
                                    + "\n",
                            produtoAtual);
                    sair = true;
                    break;
                case "2":
                    produtoAtual.setStatusProduto("Em produção");
                    System.out.printf(
                            "Status de produção do produto %s foi alterado para " + produtoAtual.getStatusProduto()
                                    + "\n",
                            produtoAtual);
                    sair = true;
                    break;
                case "3":
                    produtoAtual.setStatusProduto("Pronto para entrega");
                    System.out.printf(
                            "Status de produção do produto %s foi alterado para " + produtoAtual.getStatusProduto()
                                    + "\n",
                            produtoAtual);
                    sair = true;
                    break;
                case "4":
                    produtoAtual.setStatusProduto("Entregue");
                    System.out.printf(
                            "Status de produção do produto %s foi alterado para " + produtoAtual.getStatusProduto()
                                    + "\n",
                            produtoAtual);
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    private static boolean isValidDateFormat(String inputDate) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        format.setLenient(false);
        try {
            Date date = format.parse(inputDate);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            return true;
        } catch (ParseException e) {
            return false;
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
    private String StatusProducao;

    // Construtor
    public Produto(String nomeProduto, Integer codigoProduto, Integer quantidadeProduto, String prazoProduto,
            String StatusProducao) {
        this.nomeProduto = nomeProduto;
        this.codigoProduto = codigoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.prazoProduto = prazoProduto;
        this.StatusProducao = StatusProducao;
    }

    // Métodos
    public static Produto CadastrarProduto(String nomeProduto, int codigoProduto, int quantidadeProduto,
            String prazoProduto) {
        Produto produto = new Produto(nomeProduto, codigoProduto, quantidadeProduto, prazoProduto,
                prazoProduto);
        return produto;
    }

    /* Métodos Getters e Setters */

    // Definir nome do produto
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    // Retornar nome do produto
    public String getNomeProduto() {
        return this.nomeProduto;
    }

    // Definir status de produção
    public void setStatusProduto(String StatusProducao) {
        this.StatusProducao = StatusProducao;
    }

    // Retornar status de produção
    public String getStatusProduto() {
        return this.StatusProducao;
    }

    // Definir código do produto

}
