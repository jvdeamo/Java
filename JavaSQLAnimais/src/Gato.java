import java.io.PrintStream;

public class Gato extends Mamifero {
    PrintStream out = System.out;
    String mia;
    public Gato(String nome, int idade, String raca, String mia) {
        super(nome, idade, raca, mia);
        this.mia = mia;
    }

    @Override
    public String getTipoAnimal() {
        return "Gato";
    }

    public String comportamento() {
        super.exibirInfo();
        return mia;
    }
}
