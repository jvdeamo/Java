import java.io.PrintStream;

public class Animal {
    String nome;
    int idade;
    String raca;
    String comportamento;
    PrintStream out = System.out;

    public Animal(String nome, int idade, String raca, String comportamento) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.comportamento = comportamento;
    }

    public void exibirInfo() {
        out.println("Nome: " + nome);
        out.println("Idade: " + idade);
        out.println("Raça: " + raca);
        out.println("Comportamento: " + comportamento);
    }

    public String getTipoAnimal() {
        return "Animal";
    }

    public String comportamento() {
        return "Lacoste";
    }
}
