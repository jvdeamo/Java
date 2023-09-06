package java_src.Enterprise.Intel;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/* Autor: João Victor Martins Deamo
Date: 06/09/2023
Time: 08:19
IDE: Visual Studio Code
Session Duration: 08:19 - 19:50
Subject: POO & DataBase
Version: 1.0
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
    protected String sistemaOperacionalSistemaOperacional; // Windows 10
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
                            // Cadastrar processador
                            Processadores processador = new Processadores(nomeProcessador, marcaProcessador,
                                    modeloProcessador, socketProcessador, frequenciaProcessador, coresProcessador,
                                    threadsProcessador, TDPProcessador, precoProcessador);
                            processador.DadosProcessadores(in, out);
                            BancoDeDados.inserirProcessador();
                            break;
                        case 2:
                            // Cadastrar sistema operacional
                            SistemasOperacionais sistemaOperacional = new SistemasOperacionais(nomeSistemaOperacional,
                                    marcaSistemaOperacional, modeloSistemaOperacional,
                                    sistemaOperacionalSistemaOperacional, anoLancamentoSistemaOperacional,
                                    precoSistemaOperacional);
                            sistemaOperacional.cadastrarProduto();
                            BancoDeDados.inserirSistemaOperacional();
                            break;
                        case 3:
                            // Cadastrar computador
                            Computadores computador = new Computadores(nomeComputador, marcaComputador,
                                    modeloComputador, processadorComputador, sistemaOperacionalComputador,
                                    precoComputador);
                            computador.cadastrarComputador();
                            BancoDeDados.inserirComputador();
                            break;
                    }
                    break;
                case 2:
                    sair = true;
                    break;
            }

        }
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
    public void cadastrarProduto() {
        // Cadastrar produto
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
    protected String nome;
    protected String marca; // Intel
    protected String modelo; // i5 9400F
    protected String socket; // LGA 1151
    protected String frequencia; // 2.9 GHz
    protected String cores; // 6
    protected String threads; // 6
    protected String TDP; // 65 W
    protected String preco; // R$ 1.000,00
    Scanner in = new Scanner(System.in);
    PrintStream out = System.out;

    // Construtor
    public Processadores(String nome, String marca, String modelo, String socket, String frequencia, String cores,
            String threads, String TDP, String preco) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.socket = socket;
        this.frequencia = frequencia;
        this.cores = cores;
        this.threads = threads;
        this.TDP = TDP;
        this.preco = preco;
    }

    public void DadosProcessadores(Scanner in, PrintStream out) {
        out.println("Digite o nome do processador: ");
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
}

// Criar uma classe para sistemas operacionais
class SistemasOperacionais extends Produtos {
    // Declaração de variáveis
    protected String nome;
    protected String marca; // Intel
    protected String modelo; // Windows 10
    protected String sistemaOperacional; // Windows 10
    protected String anoLancamento; // 2015
    protected String preco; // R$ 1.000,00
    Scanner in = new Scanner(System.in);
    PrintStream out = System.out;

    // Construtor
    public SistemasOperacionais(String nome, String marca, String modelo, String sistemaOperacional,
            String anoLancamento, String preco) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.anoLancamento = anoLancamento;
        this.preco = preco;
    }

    public void DadosSistemasOperacionais(Scanner in, PrintStream out) {
        out.println("Digite o nome do sistema operacional: ");
        nome = in.nextLine();

        out.print("Digite a marca do sistema operacional: ");
        marca = in.nextLine();

        out.print("Digite o modelo do sistema operacional: ");
        modelo = in.nextLine();

        out.print("Digite o sistema operacional do sistema operacional: ");
        sistemaOperacional = in.nextLine();

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
}

// Criar uma classe para computadores
class Computadores extends Produtos {
    // Declaração de variáveis
    protected String nome;
    protected String marca; // Intel
    protected String modelo; // Computador gamer
    protected String processador; // i5 9400F
    protected String sistemaOperacional; // Windows 10
    protected String preco; // R$ 1.000,00

    // Construtor
    public Computadores(String nome, String marca, String modelo, String processador, String sistemaOperacional,
            String preco) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.sistemaOperacional = sistemaOperacional;
        this.preco = preco;
    }

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
}

// Criar uma classe para o Banco de Dados
class BancoDeDados {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/Intel";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String DATABASE_NAME = "Intel";
    PrintStream out = System.out;

    public static void main(String[] args) {
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
            out.println("Banco de dados criado com sucesso.");

        } catch (SQLException e) {
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
                    "modelo VARCHAR(100)," +
                    "socket VARCHAR(100)," +
                    "frequencia VARCHAR(100)," +
                    "cores VARCHAR(100)," +
                    "threads VARCHAR(100)," +
                    "TDP VARCHAR(100)," +
                    "preco VARCHAR(100)" +
                    ")";
            stmt.executeUpdate(TabelaProcessadores);

        } catch (SQLException e) {
            out.println("Erro ao criar tabela: " + e.getMessage());
        }

        try (
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

                Statement stmt = conn.createStatement()) {

            String TabelaSistemasOperacionais = "CREATE TABLE IF NOT EXISTS SistemasOperacionais (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100)," +
                    "marca VARCHAR(100)," +
                    "modelo VARCHAR(100)," +
                    "sistemaOperacional VARCHAR(100)," +
                    "anoLancamento VARCHAR(100)," +
                    "preco VARCHAR(100)" +
                    ")";
            stmt.executeUpdate(TabelaSistemasOperacionais);

        } catch (SQLException e) {
            out.println("Erro ao criar tabela: " + e.getMessage());
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
                    "preco VARCHAR(100)" +
                    "foreign key (processador) references Processadores(modelo)" +
                    "foreign key (sistemaOperacional) references SistemasOperacionais(sistemaOperacional)" +
                    ")";
            stmt.executeUpdate(TabelaComputadores);

        } catch (SQLException e) {
            out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public static void inserirProcessador() {
        PrintStream out = System.out;
        try (
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

                PreparedStatement stmt = conn.prepareStatement(
                        "INSERT INTO Processadores(nome, marca, modelo, socket, frequencia, cores, threads TDP, preco) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)")) {

            stmt.setString(1, "Processador");
            stmt.setString(2, "Intel");
            stmt.setString(3, "i5 9400F");
            stmt.setString(4, "LGA 1151");
            stmt.setString(5, "2.9 GHz");
            stmt.setString(7, "6");
            stmt.setString(6, "6");
            stmt.setString(8, "65 W");
            stmt.setString(9, "R$ 1.000,00");
            stmt.executeUpdate();

        } catch (SQLException e) {
            out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }

    public static void inserirSistemaOperacional() {
        PrintStream out = System.out;
        try (
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

                PreparedStatement stmt = conn.prepareStatement(
                        "INSERT INTO SistemasOperacionais(nome, marca, modelo, sistemaOperacional, anoLancamento, preco) VALUES (?, ?, ?, ?, ?, ?)")) {

            stmt.setString(1, "Sistema Operacional");
            stmt.setString(2, "Intel");
            stmt.setString(3, "22H2");
            stmt.setString(4, "Windows 10");
            stmt.setString(5, "2015");
            stmt.setString(6, "R$ 1.000,00");
            stmt.executeUpdate();

        } catch (SQLException e) {
            out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }

    public static void inserirComputador() {
        PrintStream out = System.out;
        try (
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

                PreparedStatement stmt = conn.prepareStatement(
                        "INSERT INTO Computadores(nome, marca, modelo, processador, sistemaOperacional, preco) VALUES (?, ?, ?, ?, ?, ?)")) {

            stmt.setString(1, "Computador");
            stmt.setString(2, "Intel");
            stmt.setString(3, "Computador gamer");
            stmt.setString(4, "i5 9400F");
            stmt.setString(5, "Windows 10");
            stmt.setString(6, "R$ 1.000,00");
            stmt.executeUpdate();

        } catch (SQLException e) {
            out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }
}
