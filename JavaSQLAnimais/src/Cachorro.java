import java.io.PrintStream;

public class Cachorro extends Mamifero {
    protected String late;
    PrintStream out = System.out;
    public Cachorro(String nome, int idade, String raca, String late) {
        super(nome, idade, raca, late);
        this.late = late;
    }

    public String getTipoAnimal() {
        return "Cachorro";
    }

    public String comportamento() {
        super.exibirInfo();
        return late;
    }
}
