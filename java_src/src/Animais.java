package java_src.src;
// Autor: João Victor Martins Deamo

// Date: 24/08/2023
// Version: 1.0
// Senai - Desenvolvimento de Sistemas

/*
                                            ESTRUTURA DO ALGORITMO
 * Criando classe Animais, classe Mamiferos e demais classes, e criando objetos para cada animal, com seus respectivos atributos.
 * Criando métodos para cada classe, e chamando os métodos das outras classes.
 * Criando um método geral para todas as classes.
 * Criando um método geral para todos os comportamentos.
 * Criando um método para executar todas as ações.
*/
import java.util.Scanner;
import java.io.PrintStream;

// Criar uma classe "científica" para os animais

class AnimaisDesignacao {
    private String reino;

    // Construtor
    public AnimaisDesignacao() {
        this.reino = "Reino Animalia.";
    }

    // Definir o reino
    public void setReino(String reino) {
        this.reino = reino;
    }

    // Retorna o reino
    public String getReino() {
        return reino;
    }
    /*
     * public static void main(String[] args) {
     * PrintStream out = System.out;
     * out.println("\033[H\033[2J");
     * out.flush();
     * // Criar um objeto da classe AnimaisReino
     * AnimaisDesignacao animaisDesignacao = new AnimaisDesignacao();
     * }
     */
}

public class Animais extends AnimaisDesignacao {

    // Criar método para impressão de texto
    public void imprimirReino() {
        System.out.println(super.getReino());
    }

    public static void main(String[] args) {
        PrintStream out = System.out;
        Animais animais = new Animais();
        // Chamar o método imprimirReino da classe Animais
        animais.imprimirReino();
        // Criar um objeto da classe Classes
        Classes classes = new Classes();
        // Chamar o método chamarClasses
        classes.chamarClasses(classes);
        /*
         * Mamifero leao = new Mamifero("Leão", 5, "Macho");
         * // Define o nome do leão como "Cachorro"
         * // leao.setNome("TESTE");
         * leao.executar(leao);
         * 
         * Mamifero Macaco = new Mamifero("Macaco", 6, "Macho");
         * Macaco.executar(Macaco);
         * 
         * // Defina os objetos aguia e cobra de forma semelhante
         * Ave aguia = new Ave("Águia", 3, 2.2);
         * aguia.executar(aguia);
         * /*
         * 
         * /*
         * 
         * Reptil cobra = new Reptil("Cobra", 2, "Fria");
         * 
         * /*
         * aguia.fazerSom();
         * aguia.mover();
         * aguia.voar();
         * 
         * cobra.fazerSom();
         * cobra.mover();
         * cobra.regularTemperatura();
         * 
         */
    }
}

class Classes extends Animais {
    PrintStream out = System.out;

    // Definir a classe Classes
    public void Welcome() {
        out.println("\033[H\033[2J");
        System.out.println("Conheça as classes dos animais!\n");
    }

    // Criar objetos para cada animal, com seus respectivos atributos
    public void Objetos() {
        Mamifero leao = new Mamifero("Leão", 5, "Macho");
        leao.executar(leao);

        Mamifero Macaco = new Mamifero("Macaco", 6, "Macho");
        Macaco.executar(Macaco);

        Ave ave = new Ave("Ave", 0, 0);
        ave.classeAve();
        ave.executar(ave);

        // Reptil reptil = new Reptil("Reptil", 0, "Fria");
        // reptil.classeReptil();
    }

    // Criar um método geral para todas as classes
    public void chamarClasses(Classes Classes) {
        Classes.Welcome();
        Classes.Objetos();
    }

}

class Mamifero extends Animais {
    PrintStream out = System.out;
    private String nome;
    private int idade;
    private String sexo;

    // Definir a classe Mamifero

    // Construtor
    public Mamifero(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    // Chamar todos os métodos abaixo

    // Definir o nome do animal
    public void setNome(String novoNome) {
        nome = novoNome;
    }

    // Definir o comportamento do animal

    public void ComportamentoLocomover() {
        System.out.println(nome + " está se movendo.");
    }

    public void ComportamentoSom() {
        System.out.println(nome + " está fazendo um som!");
    }

    public void ComportamentoAmamentar() {
        System.out.println(nome + " está amamentando seus filhotes.\n");
    }

    // Criar um método geral Comportamento
    public void Comportamentos(Mamifero Comportamento) {
        Comportamento.ComportamentoLocomover();
        Comportamento.ComportamentoSom();
        Comportamento.ComportamentoAmamentar();
    }

    // Executar todas as ações
    public void executar(Mamifero mamifero) {
        // Precisamos fazer a referência ao objeto que não é estático
        mamifero.Comportamentos(mamifero);
    }
}

class Ave extends Animais {
    PrintStream out = System.out;
    private String nome;
    private int idade;
    private double peso;

    // Definir a classe Ave
    public void classeAve() {
        System.out.println("Classe Ave:");
    }

    // Construtor
    public Ave(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    // Chamar todos os métodos abaixo

    // Definir o nome do animal
    public void setNome(String novoNome) {
        nome = novoNome;
    }

    // Definir o comportamento do animal
    public void ComportamentoVoar() {
        System.out.println(nome + " está voando.");
    }

    public void ComportamentoCantar() {
        System.out.println(nome + " está cantando!");
    }

    public void ComportamentoNinho() {
        System.out.println(nome + " está fazendo um ninho.\n");
    }

    // Criar um método geral Comportamento
    public void Comportamentos(Ave Comportamento) {
        Comportamento.ComportamentoVoar();
        Comportamento.ComportamentoCantar();
        Comportamento.ComportamentoNinho();
    }

    // Executar todas as ações
    public void executar(Ave ave) {
        // Precisamos fazer a referência ao objeto que não é estático
        ave.Comportamentos(ave);
    }
}

class Reptil extends Animais {
    PrintStream out = System.out;
    private String nome;
    private int idade;
    private String sexo;

    // Definir a classe Reptil
    public void classeReptil() {
        System.out.println("Classe Reptil:");
    }

    // Construtor
    public Reptil(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Chamar todos os métodos abaixo

    // Definir o nome do animal

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    // Definir o comportamento do animal

    public void ComportamentoRastejar() {
        System.out.println(nome + " está rastejando.");
    }

    public void ComportamentoSom() {
        System.out.println(nome + " está fazendo um som!");
    }

    public void ComportamentoRegularTemperatura() {
        System.out.println(nome + " está regulando sua temperatura.\n");
    }

    // Criar um método geral Comportamento

    public void Comportamentos(Reptil Comportamento) {
        Comportamento.ComportamentoRastejar();
        Comportamento.ComportamentoSom();
        Comportamento.ComportamentoRegularTemperatura();
    }

    // Executar todas as ações

    public void executar(Reptil reptil) {
        // Precisamos fazer a referência ao objeto que não é estático
        reptil.Comportamentos(reptil);
    }

}
