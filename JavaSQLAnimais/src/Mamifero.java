public class Mamifero extends Animal {
    protected String comportamento;

    public Mamifero(String nome, int idade, String raca, String comportamento) {
        super(nome, idade, raca, comportamento);
        this.comportamento = comportamento;
    }

    public String getTipoAnimal() {
        return "Mamifero";
    }

    public String comportamento() {
        super.exibirInfo();
        return comportamento;
    }
    
}
