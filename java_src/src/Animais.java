package java_src.src;

/*  
Autor: João Victor Martins Deamo
Date: 24/08/2023
Time: 18:23
IDE: Visual Studio Code
Session Duration: 18:23 - 19:50
Subject: POO
Version: 1.2
Branch: Animal Land
Senai - Desenvolvimento de Sistemas

 
 ESTRUTURA DO ALGORITMO
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
import java.io.PrintStream;

// Interface para os comportamentos dos animais
interface Acessorio {
    void usarAcessorio();
}

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

public class Animais extends Animalia implements Acessorio {
    PrintStream out = System.out;
    private String nome;
    private int idade;
    private String sexo;

    // Métodos getters
    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    // Construtor
    public Animais(String nome, int idade, String sexo, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void usarAcessorio() {
        out.print(nome + " está usando um chapéu.\n");
    }

    // Método imprimirReino
    public void imprimirReino() {
        out.println(super.getReino());
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    // Método main
    public static void main(String[] args) {
        // Criar um objeto da classe Animais e chamar o método imprimirReino
        Animais animais = new Animais("", 0, "", 0);
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

    // Método Bem Vindo
    public void Welcome() {
        out.println("\033[H\033[2J");
        out.println("Conheça as classes dos animais!");
    }

    // Construtor
    public Classes() {
        super("", 0, "", 0);
    }

    // Método Geral Objetos
    public void Objetos() {
        ObjetosMamiferos();
        ObjetosAves();
        ObjetosRepteis();
    }

    // Método ObjetosMamiferos
    public void ObjetosMamiferos() {
        Mamifero leao = new Mamifero("Leão", 5, "Macho", 200);
        leao.Executar(); // Forma 1
        leao.usarAcessorio();
        // Forma 2 leao.Executar(leao);
        Mamifero Macaco = new Mamifero("Macaco", 6, "Macho", 50);
        Macaco.Executar(); // Forma 1
        Macaco.usarAcessorio();

        // Forma 2 Macaco.Executar(Macaco);
    }

    // Método ObjetosAves
    public void ObjetosAves() {
        // Defina os objetos aguia e cobra de forma semelhante
        Ave aguia = new Ave("Águia", 3, "Macho", 2.2);
        aguia.Executar(); // Forma 1
        aguia.usarAcessorio();
        // Forma 2 aguia.Executar(aguia);
    }

    // Método ObjetosRepteis
    public void ObjetosRepteis() {
        Reptil cobra = new Reptil("Cobra", 2, "Fria", 1.5);
        cobra.Executar(); // Forma 1
        cobra.usarAcessorio();
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

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    // Método Executar
    public void Executar() {// Executar todas as ações
        out.println("\nClasse Mamifero:");
        // Precisamos fazer a referência ao objeto que não é estático
        this.Comportamentos(this);
    }

    // Definir a classe Mamifero

    // Construtor
    public Mamifero(String nome, int idade, String sexo, double peso) {
        super(nome, idade, sexo, peso); // Chamar construtor da classe pai (Animais)
        this.nome = nome;
    }
    // Métodos da classe Mamifero

    // Definir o nome do animal
    public void setNome(String novoNome) {
        nome = novoNome;
    }

    // Definir os comportamentos do animal

    public void ComportamentoLocomover() {
        out.println(getNome() + " está se movendo.");
    }

    public void ComportamentoSom() {
        out.println(getNome() + " está fazendo um som!");
    }

    public void ComportamentoAmamentar() {
        out.println(getNome() + " está amamentando seus filhotes.");
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

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    // Método Executar
    public void Executar() {// Executar todas as ações
        out.println("\nClasse Ave:");
        // Precisamos fazer a referência ao objeto que não é estático
        this.Comportamentos(this);
    }

    // Construtor
    public Ave(String nome, int idade, String sexo, double peso) {
        super(nome, idade, sexo, peso); // Chamar construtor da classe pai (Animais)
        this.nome = nome;

    }

    // Métodos da classe Ave

    // Definir o nome do animal
    public void setNome(String novoNome) {
        nome = novoNome;
    }

    // Definir os comportamentos do animal

    public void ComportamentoVoar() {
        out.println(getNome() + " está voando.");
    }

    public void ComportamentoCantar() {
        out.println(getNome() + " está cantando!");
    }

    public void ComportamentoNinho() {
        out.println(getNome() + " está fazendo um ninho.");
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

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    // Método Executar
    public void Executar() {
        out.println("\nClasse Reptil:");
        // Precisamos fazer a referência ao objeto que não é estático
        this.Comportamentos(this);
    }

    // Construtor
    public Reptil(String nome, int idade, String sexo, double peso) {
        super(nome, idade, sexo, peso); // Chamar construtor da classe pai (Animais)
        this.nome = nome;
    }

    // Métodos da classe Reptil

    // Definir o nome do animal

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    // Definir os comportamentos do animal

    public void ComportamentoRastejar() {
        out.println(getNome() + " está rastejando.");
    }

    public void ComportamentoSom() {
        out.println(getNome() + " está fazendo um som!");
    }

    public void ComportamentoRegularTemperatura() {
        out.println(getNome() + " está regulando sua temperatura.");
    }

    // Criar um método geral Comportamentos

    public void Comportamentos(Reptil Comportamento) {
        Comportamento.ComportamentoRastejar();
        Comportamento.ComportamentoSom();
        Comportamento.ComportamentoRegularTemperatura();
    }

}