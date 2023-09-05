import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoDeDados {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/animais";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String DATABASE_NAME = "animais";
    PrintStream out = System.out;

    public static void main(String[] args) {
        BancoDeDados.CreateDatabase();
        BancoDeDados.criarTabela();
    }

    public static void CreateDatabase() {
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

    public static void criarTabela() {
        PrintStream out = System.out;
        try (
                Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);

                Statement stmt = conn.createStatement()) {

            String createTableSQL = "CREATE TABLE IF NOT EXISTS animais (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100)," +
                    "idade INT," +
                    "raca VARCHAR(100)," +
                    "tipo_animal VARCHAR(50)," +
                    "comportamento VARCHAR(50)" +
                    ")";
            stmt.executeUpdate(createTableSQL);

        } catch (SQLException e) {
            out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public static void inserirAnimal(Animal animal) {
        PrintStream out = System.out;
        criarTabela();

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                // Criar um comando SQL passando consulta preparada
                PreparedStatement stmt = conn
                        .prepareStatement(
                                "INSERT INTO animais(nome, idade, raca, tipo_animal, comportamento) VALUES (?, ?, ?, ?, ?)")) {

            // Passar os parâmetros para o comando SQL
            stmt.setString(1, animal.nome);
            stmt.setInt(2, animal.idade);
            stmt.setString(3, animal.raca);
            stmt.setString(4, animal.getTipoAnimal());
            stmt.setString(5, animal.comportamento());

            stmt.executeUpdate();
            out.println("Animal inserido no banco de dados.");

        } catch (SQLException e) {
            out.println("Erro ao inserir no banco de dados: " + e.getMessage());
        }
    }

    public static void InserirMamifero(Mamifero mamifero) {
        PrintStream out = System.out;
        criarTabela();

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                // Criar um comando SQL passando consulta preparada
                PreparedStatement stmt = conn
                        .prepareStatement(
                                "INSERT INTO animais(nome, idade, raca, tipo_animal, comportamento) VALUES (?, ?, ?, ?, ?)")) {

            // Passar os parâmetros para o comando SQL
            stmt.setString(1, mamifero.nome);
            stmt.setInt(2, mamifero.idade);
            stmt.setString(3, mamifero.raca);
            stmt.setString(4, mamifero.getTipoAnimal());
            stmt.setString(5, mamifero.comportamento());

            stmt.executeUpdate();
            out.println("Animal inserido no banco de dados.");

        } catch (SQLException e) {
            out.println("Erro ao inserir no banco de dados: " + e.getMessage());
        }

    }
/*
    public static void inserirCachorro(Cachorro cachorro) {
        PrintStream out = System.out;
        criarTabela();

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                // Criar um comando SQL passando consulta preparada
                PreparedStatement stmt = conn
                        .prepareStatement(
                                "INSERT INTO animais(nome, idade, raca, tipo_animal, comportamento) VALUES (?, ?, ?, ?, ?)")) {

            // Passar os parâmetros para o comando SQL
            stmt.setString(1, cachorro.nome);
            stmt.setInt(2, cachorro.idade);
            stmt.setString(3, cachorro.raca);
            stmt.setString(4, cachorro.getTipoAnimal());
            stmt.setString(5, cachorro.comportamento());

            stmt.executeUpdate();
            out.println("Animal inserido no banco de dados.");

        } catch (SQLException e) {
            out.println("Erro ao inserir no banco de dados: " + e.getMessage());
        }
    }

    public static void inserirGato(Gato gato) {
        PrintStream out = System.out;
        criarTabela();

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                // Criar um comando SQL passando consulta preparada
                PreparedStatement stmt = conn
                        .prepareStatement(
                                "INSERT INTO animais(nome, idade, raca, tipo_animal, comportamento) VALUES (?, ?, ?, ?, ?)")) {

            // Passar os parâmetros para o comando SQL
            stmt.setString(1, gato.nome);
            stmt.setInt(2, gato.idade);
            stmt.setString(3, gato.raca);
            stmt.setString(4, gato.getTipoAnimal());
            stmt.setString(5, gato.comportamento());

            stmt.executeUpdate();
            out.println("Animal inserido no banco de dados.");

        } catch (SQLException e) {
            out.println("Erro ao inserir no banco de dados: " + e.getMessage());
        }
    }
 */
}
