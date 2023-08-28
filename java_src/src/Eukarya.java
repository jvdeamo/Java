package java_src.src;

/*  
Autor: João Victor Martins Deamo
Date: 28/08/2023
Time: 08:50
IDE: Visual Studio Code
Session Duration: 08:50 - 11:50
Subject: POO
Version: 1.0
Branch: Animal Land
Senai - Desenvolvimento de Sistemas
*/
import java.io.PrintStream;

public class Eukarya {
    PrintStream out = System.out;
    // Atributos
    private String Dominio;

    // Construtor
    public Eukarya() {
        this.Dominio = "Domínio Eukarya";
    }

    // Métodos Getters e Setters
    public void setDominio(String Dominio) {
        this.Dominio = Dominio;
    }

    public String getDominio() {
        return Dominio;
    }

    public void ImpressaoDominio() {
        out.print(getDominio());
    }

    public static void main(String[] run) {
        PrintStream out = System.out;
        out.println("\033[H\033[2J");
        EukaryaManager Dom = new EukaryaManager();
        Dom.chamarClasses(Dom);
    }
}

// Criar as classes filhas do reino Eukarya

class CaracteristicasEukarya extends Eukarya {
    // Atributos
    private String Caracteristicas;

    // Construtor
    public CaracteristicasEukarya() {
        this.Caracteristicas = "Características do reino Eukarya";
    }

    // Métodos Getters e Setters
    public void setCaracteristicas(String Caracteristicas) {
        this.Caracteristicas = Caracteristicas;
    }

    public String getCaracteristicas() {
        return Caracteristicas;
    }

    // Método Impressão
    public void ImpressaoCaracteristicas() {
        out.print(getCaracteristicas());
    }

    // Método Objetos
    public void Objetos() {
        CaracteristicasEukaryaManager Objetos = new CaracteristicasEukaryaManager(Caracteristicas);
        Objetos.Caracteristicas_Info();
    }
}
// Criar uma classe para armazenar as características do reino Eukarya

class CaracteristicasEukaryaManager extends CaracteristicasEukarya {
    private String Caracteristicas;

    // Método Bem Vindo
    public void Welcome() {
        out.println("\033[H\033[2J");
        out.printf("Conheça as " + getCaracteristicas() + ".\n");
    }

    // Construtor
    public CaracteristicasEukaryaManager(String Caracteristicas) {
        super();
        this.Caracteristicas = Caracteristicas;
    }

    public String getCaracteristicas() {
        return Caracteristicas;
    }

    // Método Geral Objetos
    public void Caracteristicas_Info() {
        // Criar um vetor para armazenar as características do reino Eukarya, isto é, criamos objetos para armazenar as características usando o vetor e o for
        String[] Caracteristicas_Vetor = {
                "As células eucarióticas são mais complexas que as células procarióticas, pois possuem organelas membranosas, como mitocôndrias, complexo de Golgi, retículo endoplasmático, lisossomos, cloroplastos, entre outras.",
                "Os seres vivos do reino Eukarya são classificados em quatro grupos: protistas, fungos, plantas e animais.",
                "Os protistas são seres unicelulares e eucariontes, ou seja, possuem apenas uma célula e esta célula possui núcleo organizado e separado do citoplasma por uma membrana.",
                "Os fungos são seres eucariontes, mas são classificados em um reino à parte, pois possuem características diferentes dos protistas, plantas e animais.",
                "As plantas são seres eucariontes, multicelulares e autotróficos, ou seja, produzem seu próprio alimento.",
                "Os animais são seres eucariontes, multicelulares e heterotróficos, ou seja, não produzem seu próprio alimento." };
        CaracteristicasEukaryaManager[] ArrayObjetos = new CaracteristicasEukaryaManager[Caracteristicas_Vetor.length];

        for (int i = 0; i < Caracteristicas_Vetor.length; i++) {
            ArrayObjetos[i] = new CaracteristicasEukaryaManager(Caracteristicas_Vetor[i]);
            ArrayObjetos[i].setCaracteristicas(Caracteristicas_Vetor[i]);
        }
        for (int i = 1; i < 2; i++) {
            out.println("\nCaracterística " + (i + 1) + ":");
            out.println(ArrayObjetos[i].getCaracteristicas());
        }
        /*
         * CaracteristicasEukaryaManager informacoes1 = new
         * CaracteristicasEukaryaManager("4");
         * CaracteristicasEukaryaManager informacoes = new
         * CaracteristicasEukaryaManager(
         * "\nO reino Eukarya é formado por todos os seres vivos que possuem células eucarióticas, ou seja, células que possuem núcleo organizado e separado do citoplasma por uma membrana.\n"
         * );
         * informacoes.chamarClasses(informacoes);
         * informacoes1.chamarClasses(informacoes1);
         * /*
         * out.printf(
         * "As células eucarióticas são mais complexas que as células procarióticas, pois possuem organelas membranosas, como mitocôndrias, complexo de Golgi, retículo endoplasmático, lisossomos, cloroplastos, entre outras.\n"
         * );
         * out.printf(
         * "Os seres vivos do reino Eukarya são classificados em quatro grupos: protistas, fungos, plantas e animais.\n"
         * );
         * out.printf(
         * "Os protistas são seres unicelulares e eucariontes, ou seja, possuem apenas uma célula e esta célula possui núcleo organizado e separado do citoplasma por uma membrana.\n"
         * );
         * out.printf(
         * "Os fungos são seres eucariontes, mas são classificados em um reino à parte, pois possuem características diferentes dos protistas, plantas e animais.\n"
         * );
         * out.printf(
         * "As plantas são seres eucariontes, multicelulares e autotróficos, ou seja, produzem seu próprio alimento.\n"
         * );
         * out.printf(
         * "Os animais são seres eucariontes, multicelulares e heterotróficos, ou seja, não produzem seu próprio alimento.\n"
         * );
         * out.printf(
         * "Os seres vivos do reino Eukarya são classificados em quatro grupos: protistas, fungos, plantas e animais.\n"
         * );
         * out.printf(
         * "Os protistas são seres unicelulares e eucariontes, ou seja, possuem apenas uma célula e esta célula possui núcleo organizado e separado do citoplasma por uma membrana.\n"
         * );
         * out.printf(
         * "Os fungos são seres eucariontes, mas são classificados em um reino à parte, pois possuem características diferentes dos protistas, plantas e animais.\n"
         * );
         */
    }

    public void chamarClasses(CaracteristicasEukaryaManager Classes) {
        Classes.Welcome();
    }
}
// Criar uma classe para chamar as classes filhas do reino Eukarya

class EukaryaManager extends Eukarya {

    // Método Bem Vindo
    public void Welcome() {
        out.println("\033[H\033[2J");
        out.printf("Conheça o " + getDominio() + ".\n");
    }

    // Construtor
    public EukaryaManager() {
        super();
    }

    // Método Geral Objetos
    public void Objetos() {
        CaracteristicasEukarya Objetos = new CaracteristicasEukarya();
        Objetos.Objetos();
    }

    public void chamarClasses(EukaryaManager Classes) {
        Classes.Welcome();
        Classes.Objetos();
    }
}