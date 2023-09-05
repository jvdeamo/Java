public class Gato extends Animal {
    public Gato(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public String getTipoAnimal() {
        return "Gato";
    }
}
