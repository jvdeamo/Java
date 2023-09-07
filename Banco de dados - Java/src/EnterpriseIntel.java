import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/* Autor: João Victor Martins Deamo
Date: 06/09/2023
Time: 16:30
IDE: Visual Studio Code
Session Duration: 16:30 - 17:45
Subject: POO & DataBase
Version: 1.1
Senai - Desenvolvimento de Sistemas

Atividade: Você é um talentoso programador que trabalha na renomada empresa de tecnologia, a Intel. Como parte da equipe de desenvolvimento, você foi designado para criar um sistema de cadastro para processadores, sistemas operacionais e computadores. Esse sistema permitirá à Intel manter um registro organizado de seus produtos e melhorar a eficiência na gestão interna.
1. **Entendendo os Requisitos:**
   Antes de iniciar o desenvolvimento, é crucial entender os requisitos detalhadamente. Converse com os gestores e obtenha informações claras sobre quais dados precisam ser armazenados para cada tipo de produto (processadores, sistemas operacionais e computadores).

2. **Hierarquia de Classes:**
   Considere a criação de uma hierarquia de classes para representar os diferentes tipos de produtos. Pode ser útil criar uma classe base "Produto" e então subclasses para cada tipo específico.

3. **Cadastro e Armazenamento:**
   Utilize conceitos de banco de dados para armazenar as informações. Considere a estrutura de tabelas e relações necessárias para cada tipo de produto. Lembre-se de implementar funções para inserir novos produtos no banco de dados.

4. **Interface do Usuário:**
   Desenvolva uma interface de usuário intuitiva para que os funcionários da Intel possam facilmente cadastrar novos produtos. Pense em formas de validar os dados inseridos e fornecer feedback ao usuário.

5. **Consulta e Listagem:**
   Implemente funcionalidades para listar os produtos cadastrados, permitindo filtrar por tipo, buscar por nome, etc. Isso ajudará a Intel a encontrar rapidamente as informações necessárias.
*/
public class EnterpriseIntel {
    public static void main(String[] args) {
        // Criar um objeto da classe Menu
        Menu menu = new Menu();
        menu.MenuEmpresa();
        BancoDeDados main = new BancoDeDados();
        main.main(args);
    }

}

// Criar uma classe de menu
class Menu extends Produtos {
    // Declarar os atributos
    /*
     * Declaração de variáveis
     * protected String nome;
     * protected String tipo; // Podendo ser processador, sistema operacional ou
     * computador
     * protected String marca; // Intel
     * protected String modelo; // i5 9400F, Windows 10, computador gamer
     * protected String processador; // i5 9400F
     * protected String sistemaOperacional; // Windows 10
     * protected String Computadores; // Computador gamer
     */

    protected String nomeProcessador;
    protected String marcaProcessador; // Intel
    protected String modeloProcessador; // i5 9400F
    protected String socketProcessador; // LGA 1151
    protected String frequenciaProcessador; // 2.9 GHz
    protected String coresProcessador; // 6
    protected String threadsProcessador; // 6
    protected String TDPProcessador; // 65 W
    protected String precoProcessador; // R$ 1.000,00 }

    protected String nomeSistemaOperacional;
    protected String marcaSistemaOperacional; // Intel
    protected String modeloSistemaOperacional; // Windows 10
    protected String anoLancamentoSistemaOperacional; // 2015
    protected String precoSistemaOperacional; // R$ 1.000,00

    protected String nomeComputador;
    protected String marcaComputador; // Intel
    protected String modeloComputador; // Computador gamer
    protected String processadorComputador; // i5 9400F
    protected String sistemaOperacionalComputador; // Windows 10
    protected String precoComputador; // R$ 1.000,00

    public void MenuEmpresa() {
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        boolean sair = false;
        // BancoDeDados.CreateDatabase();
        // // Criar um while para que o usuário possa adicionar mais de um animal
        // while (!sair) {
        while (!sair) {
            out.println("\033[H\033[2J");
            out.println("Bem-vindo ao sistema da Intel.");
            out.println("Escolha uma opção:");
            out.println("1. Cadastrar produto");
            out.println("2. Sair");
            int opcao = in.nextInt();
            switch (opcao) {
                case 1:
                    // Criar um laço de repetição para que o usuário possa inserir mais de um
                    // produto
                    out.println("Escolha o tipo de produto:");
                    out.println("1. Processador");
                    out.println("2. Sistema Operacional");
                    out.println("3. Computador");
                    int escolha = in.nextInt();
                    switch (escolha) {
                        case 1:
                            Produtos processador = new Produtos();
                            processador.cadastrarProduto(escolha);
                            break;
                        case 2:
                            Produtos sistemaOperacional = new Produtos();
                            sistemaOperacional.cadastrarProduto(escolha);
                            break;
                        case 3:
                            Produtos computador = new Produtos();
                            computador.cadastrarProduto(escolha);
                            break;
                        default:
                            out.println("Opção inválida");
                            break;
                    }
                    break;
                case 2:
                    sair = true;
                    out.println("\033[H\033[2J");
                    out.println("Programa finalizado. Obrigado por utilizar o sistema da Intel.");
                    break;
            }

        }
        in.close();
    }
}

class Produtos extends EnterpriseIntel {
    // Declaração de variáveis
    protected String nome;
    protected String tipo; // Podendo ser processador, sistema operacional ou computador
    protected String marca; // Intel
    protected String modelo; // i5 9400F, Windows 10, computador gamer
    protected String processador; // i5 9400F
    protected String sistemaOperacional; // Windows 10
    protected String Computadores; // Computador gamer

    // Métodos
    public void cadastrarProduto(Integer escolha) {
        switch (escolha) {
            case 1:
                Processadores processador = new Processadores();
                // Chamar o método cadastrarProcessador da instância criada
                processador.cadastrarProcessador();
                BancoDeDados.inserirProcessador();
                break;
            case 2:
                SistemasOperacionais sistemaOperacional = new SistemasOperacionais();
                // Chamar o método cadastrarSistemaOperacional da instância criada
                sistemaOperacional.cadastrarSistemaOperacional();
                BancoDeDados.inserirSistemaOperacional();
                break;
            case 3:
                Computadores computador = new Computadores();
                // Chamar o método cadastrarComputador da instância criada
                computador.cadastrarComputador();
                BancoDeDados.inserirComputador();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    public void listarProdutos() {
        // Listar produtos
    }

    public void buscarProduto() {
        // Buscar produto
    }
}

// Criar uma classe para processadores
class Processadores extends Produtos {
    // Declaração de variáveis
    protected static String nome;
    protected static String marca; // Intel
    protected static String modelo; // i5 9400F
    protected static String socket; // LGA 1151
    protected static String frequencia; // 2.9 GHz
    protected static String cores; // 6
    protected static String threads; // 6
    protected static String TDP; // 65 W
    protected static String preco; // R$ 1.000,00
    Scanner in = new Scanner(System.in);
    PrintStream out = System.out;

    public void DadosProcessadores(Scanner in, PrintStream out) {
        out.println("Digite o nome do processador: ");
        in.next();
        nome = in.nextLine();

        out.print("Digite a marca do processador: ");
        marca = in.nextLine();

        out.print("Digite o modelo do processador: ");
        modelo = in.nextLine();

        out.print("Digite o socket do processador: ");
        socket = in.nextLine();

        out.print("Digite a frequência do processador: ");
        frequencia = in.nextLine();

        out.print("Digite a quantidade de cores do processador: ");
        cores = in.nextLine();

        out.print("Digite a quantidade de threads do processador: ");
        threads = in.nextLine();

        out.print("Digite o TDP do processador: ");
        TDP = in.nextLine();

        out.print("Digite o preço do processador: ");
        preco = in.nextLine();
    }

    // Métodos
    public void cadastrarProcessador() {
        DadosProcessadores(in, out);
        // Cadastrar processador
    }

    public void listarProcessadores() {
        // Listar processadores
    }

    public void buscarProcessador() {
        // Buscar processador
    }

    public static String getProcessadores() {
        return "Processadores";
    }
}

// Criar uma classe para sistemas operacionais
class SistemasOperacionais extends Produtos {
    // Declaração de variáveis
    protected static String nome;
    protected static String marca; // Intel
    protected static String modelo; // Windows 10 22H2
    protected static String anoLancamento; // 2015
    protected static String preco; // R$ 1.000,00
    Scanner in = new Scanner(System.in);
    PrintStream out = System.out;

    public void DadosSistemasOperacionais(Scanner in, PrintStream out) {
        out.println("Digite o nome do sistema operacional: ");
        nome = in.nextLine();

        out.print("Digite a marca do sistema operacional: ");
        marca = in.nextLine();

        out.print("Digite o modelo do sistema operacional: ");
        modelo = in.nextLine();

        out.print("Digite o ano de lançamento do sistema operacional: ");
        anoLancamento = in.nextLine();

        out.print("Digite o preço do sistema operacional: ");
        preco = in.nextLine();
    }

    // Métodos
    public void cadastrarSistemaOperacional() {
        DadosSistemasOperacionais(in, out);
        // Cadastrar sistema operacional
    }

    public void listarSistemasOperacionais() {
        // Listar sistemas operacionais
    }

    public void buscarSistemaOperacional() {
        // Buscar sistema operacional
    }

    public static String getSistemasOperacionais() {
        return "Sistemas Operacionais";
    }
}

// Criar uma classe para computadores
class Computadores extends Produtos {
    // Declaração de variáveis
    protected static String nome;
    protected static String marca; // Intel
    protected static String modelo; // Computador gamer
    protected String processador; // i5 9400F
    protected String sistemaOperacional; // Windows 10
    protected static String preco; // R$ 1.000,00

    // Métodos
    public void cadastrarComputador() {
        // Cadastrar computador
    }

    public void listarComputadores() {
        // Listar computadores
    }

    public void buscarComputador() {
        // Buscar computador
    }

    public static String getComputadores() {
        return "Computadores";
    }
}

// Criar uma classe para o Banco de Dados
class BancoDeDados {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/Intel";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String DATABASE_NAME = "Intel";
    PrintStream out = System.out;

    public void main(String[] args) {
        BancoDeDados.CriarBD();
        BancoDeDados.criarTabelas();
    }

    public static void CriarBD() {
        PrintStream out = System.out;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            out.println("Driver não encontrado: " + e.getMessage());
        }

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                Statement stmtCreate = conn.createStatement()) {

            // Cria o banco de dados "animais" se ele não existir
            String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS " + DATABASE_NAME + "\r\n" + //
                    "    DEFAULT CHARACTER SET = 'utf8mb4';";
            stmtCreate.executeUpdate(createDatabaseSQL);

            // Desativar o check de foreign key
            String disableChecksSQL = "SET FOREIGN_KEY_CHECKS = 0;";
            stmtCreate.executeUpdate(disableChecksSQL);
        } catch (SQLException e) {
            out.println("\033[H\033[2J");
            out.println("Erro ao criar banco de dados: " + e.getMessage());
        }
    }

    public static void criarTabelas() {
        PrintStream out = System.out;
        try (
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

                Statement stmt = conn.createStatement()) {

            String TabelaProcessadores = "CREATE TABLE IF NOT EXISTS Processadores (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100)," +
                    "marca VARCHAR(100)," +
                    "modelo VARCHAR(100) UNIQUE," +
                    "socket VARCHAR(100)," +
                    "frequencia VARCHAR(100)," +
                    "cores VARCHAR(100)," +
                    "threads VARCHAR(100)," +
                    "TDP VARCHAR(100)," +
                    "preco VARCHAR(100)" +
                    ")";
            stmt.executeUpdate(TabelaProcessadores);

        } catch (SQLException e) {
            out.printf("Erro ao criar tabela '%s'.", Processadores.getProcessadores(), e.getMessage());
        }

        try (
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

                Statement stmt = conn.createStatement()) {

            String TabelaSistemasOperacionais = "CREATE TABLE IF NOT EXISTS SistemasOperacionais (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100) UNIQUE," +
                    "marca VARCHAR(100)," +
                    "modelo VARCHAR(100)," +
                    "anoLancamento VARCHAR(100)," +
                    "preco VARCHAR(100)" +
                    ")";
            stmt.executeUpdate(TabelaSistemasOperacionais);

        } catch (SQLException e) {
            out.printf("\nErro ao criar tabela '%s'.", SistemasOperacionais.getSistemasOperacionais(), e.getMessage());
        }

        try (
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

                Statement stmt = conn.createStatement()) {

            String TabelaComputadores = "CREATE TABLE IF NOT EXISTS Computadores (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100)," +
                    "marca VARCHAR(100)," +
                    "modelo VARCHAR(100)," +
                    "processador VARCHAR(100)," +
                    "sistemaOperacional VARCHAR(100)," +
                    "preco VARCHAR(100)," +
                    "foreign key (processador) references Processadores(modelo)," +
                    "foreign key (sistemaOperacional) references SistemasOperacionais(nome)" +
                    ")";
            stmt.executeUpdate(TabelaComputadores);

        } catch (SQLException e) {
            out.printf("\nErro ao criar tabela '%s'.", Computadores.getComputadores(), e.getMessage());
        }
    }

    public static void inserirProcessador() {
        PrintStream out = System.out;
        try (
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

                PreparedStatement stmt = conn.prepareStatement(
                        "INSERT INTO Processadores(nome, marca, modelo, socket, frequencia, cores, threads, TDP, preco) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)")) {

            stmt.setString(1, Processadores.nome);
            stmt.setString(2, Processadores.marca);
            stmt.setString(3, Processadores.modelo);
            stmt.setString(4, Processadores.socket);
            stmt.setString(5, Processadores.frequencia);
            stmt.setString(6, Processadores.cores);
            stmt.setString(7, Processadores.threads);
            stmt.setString(8, Processadores.TDP);
            stmt.setString(9, Processadores.preco);
            stmt.executeUpdate();

            out.println("Processador cadastrado com sucesso.");
        } catch (SQLException e) {
            out.printf("Erro ao inserir dados na tabela '%s'.", Processadores.getProcessadores(), e.getMessage());
        }
    }

    public static void inserirSistemaOperacional() {
        PrintStream out = System.out;
        try (
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

                PreparedStatement stmt = conn.prepareStatement(
                        "INSERT INTO SistemasOperacionais(nome, marca, modelo, anoLancamento, preco) VALUES (?, ?, ?, ?, ?)")) {

            stmt.setString(1, SistemasOperacionais.nome);
            stmt.setString(2, SistemasOperacionais.marca);
            stmt.setString(3, SistemasOperacionais.modelo);
            stmt.setString(4, SistemasOperacionais.anoLancamento);
            stmt.setString(5, SistemasOperacionais.preco);
            stmt.executeUpdate();

            out.println("Sistema Operacional cadastrado com sucesso.");
        } catch (SQLException e) {
            out.printf("Erro ao inserir dados na tabela '%s'.", SistemasOperacionais.getSistemasOperacionais(),
                    e.getMessage());
        }
    }

    public static void inserirComputador() {
        PrintStream out = System.out;
        try (
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

                PreparedStatement stmt = conn.prepareStatement(
                        "INSERT INTO Computadores(nome, marca, modelo, processador, sistemaOperacional, preco) VALUES (?, ?, ?, ?, ?, ?)")) {

            stmt.setString(1, Computadores.nome);
            stmt.setString(2, Computadores.marca);
            stmt.setString(3, Computadores.modelo);
            stmt.setString(4, Processadores.modelo);
            stmt.setString(5, SistemasOperacionais.nome);
            stmt.setString(6, Computadores.preco);
            stmt.executeUpdate();

            out.println("Computador cadastrado com sucesso.");
        } catch (SQLException e) {
            out.printf("Erro ao inserir dados na tabela '%s'.", Computadores.getComputadores(), e.getMessage());
        }
    }
}