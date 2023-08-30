package java_src.src;
// Autor: João Victor Martins Deamo

// Date: 24/08/2023
// Time: 18:23
// IDE: Visual Studio Code
// Session Duration: 18:23 - 19:50
// Subject: POO
// Version: 1.2
// Senai - Desenvolvimento de Sistemas

/* ESTRUTURA DO ALGORITMO
Classe

OBSERVAÇÕES
 No método Executar, há 2 formas de declarar aquilo que é necessário para executar as ações. 
Forma 1: public void Executar(Ave ave) {// Executar todas as ações
        out.println("Classe Ave:");
        // Precisamos fazer a referência ao objeto que não é estático
        ave.Comportamentos(ave);
    }
Forma 2: public void Executar() {// Executar todas as ações
        out.println("Classe Ave:");
        // Precisamos fazer a referência ao objeto que não é estático
        this.Comportamentos(this);
    }
*/
import java.util.Scanner;
import java.io.PrintStream;

class Animalia {
    // Atributos
    private String reino;

    // Construtor
    public Animalia() {
        this.reino = "Reino Animalia.";
    }

    // Definir o reino
    public void setReino(String reino) {
        this.reino = reino;
    }

    // Retornar o reino
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

public class Animais extends Animalia {
    PrintStream out = System.out;

    // Método imprimirReino
    public void imprimirReino() {
        out.println(super.getReino());
    }

    // Método main
    public static void main(String[] args) {
        // Criar um objeto da classe Animais e chamar o método imprimirReino
        Animais animais = new Animais();
        animais.imprimirReino();
        // Criar um objeto da classe e chamar o método chamarClasses
        Classes classes = new Classes();
        classes.chamarClasses(classes);
        /*
         * =
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

    // Método Bem Vindo
    public void Welcome() {
        out.println("\033[H\033[2J");
        out.println("Conheça as classes dos animais!\n");
    }

    // Método Geral Objetos
    public void Objetos() {
        ObjetosMamiferos();
        ObjetosAves();
        ObjetosRepteis();
    }

    // Método ObjetosMamiferos
    public void ObjetosMamiferos() {
        Mamifero leao = new Mamifero("Leão", 5, "Macho");
        leao.Executar(); // Forma 1
        // Forma 2 leao.Executar(leao);
        Mamifero Macaco = new Mamifero("Macaco", 6, "Macho");
        Macaco.Executar(); // Forma 1
        // Forma 2 Macaco.Executar(Macaco);
    }

    // Método ObjetosAves
    public void ObjetosAves() {
        // Defina os objetos aguia e cobra de forma semelhante
        Ave aguia = new Ave("Águia", 3, 2.2);
        aguia.Executar(); // Forma 1
        // Forma 2 aguia.Executar(aguia);
    }

    // Método ObjetosRepteis
    public void ObjetosRepteis() {
        Reptil cobra = new Reptil("Cobra", 2, "Fria");
        cobra.Executar(); // Forma 1
        Reptil jacare = new Reptil("Jacaré", 4, "Frio");
        jacare.Executar(); // Forma 1
        // Forma 2 cobra.executar(cobra);
    }

    // Método Geral Classes
    public void chamarClasses(Classes Classes) {
        Classes.Welcome();
        Classes.Objetos();
    }

}

class Mamifero extends Animais {
    PrintStream out = System.out;
    // Atributos
    private String nome;
    private int idade;
    private String sexo;

    // Método Executar
    public void Executar() {// Executar todas as ações
        out.println("Classe Mamifero:");
        // Precisamos fazer a referência ao objeto que não é estático
        this.Comportamentos(this);
    }

    // Definir a classe Mamifero

    // Construtor
    public Mamifero(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    // Métodos da classe Mamifero

    // Definir o nome do animal
    public void setNome(String novoNome) {
        nome = novoNome;
    }

    // Definir os comportamentos do animal

    public void ComportamentoLocomover() {
        out.println(nome + " está se movendo.");
    }

    public void ComportamentoSom() {
        out.println(nome + " está fazendo um som!");
    }

    public void ComportamentoAmamentar() {
        out.println(nome + " está amamentando seus filhotes.\n");
    }

    // Criar um método geral Comportamentos
    public void Comportamentos(Mamifero Comportamento) {
        Comportamento.ComportamentoLocomover();
        Comportamento.ComportamentoSom();
        Comportamento.ComportamentoAmamentar();
    }

}

class Ave extends Animais {
    PrintStream out = System.out;
    // Atributos
    private String nome;
    private int idade;
    private double peso;

    // Método Executar
    public void Executar() {// Executar todas as ações
        out.println("Classe Ave:");
        // Precisamos fazer a referência ao objeto que não é estático
        this.Comportamentos(this);
    }

    // Construtor
    public Ave(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    // Métodos da classe Ave

    // Definir o nome do animal
    public void setNome(String novoNome) {
        nome = novoNome;
    }

    // Definir os comportamentos do animal

    public void ComportamentoVoar() {
        out.println(nome + " está voando.");
    }

    public void ComportamentoCantar() {
        out.println(nome + " está cantando!");
    }

    public void ComportamentoNinho() {
        out.println(nome + " está fazendo um ninho.\n");
    }

    // Criar um método geral Comportamentos
    public void Comportamentos(Ave Comportamento) {
        Comportamento.ComportamentoVoar();
        Comportamento.ComportamentoCantar();
        Comportamento.ComportamentoNinho();
    }
}

class Reptil extends Animais {
    PrintStream out = System.out;
    // Atributos
    private String nome;
    private int idade;
    private String sexo;

    // Método Executar
    public void Executar() {
        out.println("Classe Reptil:");
        // Precisamos fazer a referência ao objeto que não é estático
        this.Comportamentos(this);
    }

    // Construtor
    public Reptil(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Métodos da classe Reptil

    // Definir o nome do animal

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    // Definir os comportamentos do animal

    public void ComportamentoRastejar() {
        out.println(nome + " está rastejando.");
    }

    public void ComportamentoSom() {
        out.println(nome + " está fazendo um som!");
    }

    public void ComportamentoRegularTemperatura() {
        out.println(nome + " está regulando sua temperatura.\n");
    }

    // Criar um método geral Comportamentos

    public void Comportamentos(Reptil Comportamento) {
        Comportamento.ComportamentoRastejar();
        Comportamento.ComportamentoSom();
        Comportamento.ComportamentoRegularTemperatura();
    }

}