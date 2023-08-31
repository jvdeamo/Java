package java_src.src;

/*  
Autor: João Victor Martins Deamo
Date: 31/08/2023
Time: 08:20
IDE: Visual Studio Code
Path: java_src/src/HCO.java
Session Duration: 08:20 - 
Subject: POO & Herança & Polimorfismo & HashMap
Version: 1.1
Branch: Main
Senai - Desenvolvimento de Sistemas

1. Exercício - Conta Bancária:
Crie uma classe `ContaBancaria` que tenha atributos para o número da conta, nome do titular e saldo. Implemente métodos para depositar, sacar e exibir o saldo.

2. Exercício - Livro:
Crie uma classe `Livro` com atributos para título, autor e ano de publicação. Implemente um método para exibir as informações do livro.

3. Exercício - Carro:
Crie uma classe `Carro` com atributos para marca, modelo e ano. Implemente métodos para ligar o carro e desligar o carro.

4. Exercício - Aluno:
Crie uma classe `Aluno` com atributos para nome, matrícula e notas (um array de notas). Implemente métodos para calcular a média das notas e exibir os detalhes do aluno.

5. Exercício - Produto:
Crie uma classe `Produto` com atributos para nome, preço e quantidade em estoque. Implemente métodos para calcular o valor total do estoque e exibir os detalhes do produto.

6. Exercício - Banco:
Crie uma classe Banco com atributos para o nome do banco e uma lista de contas bancárias. Implemente métodos para adicionar uma conta, remover uma conta e exibir o saldo total do banco (soma dos saldos de todas as contas).

7. Exercício - Biblioteca:
Crie uma classe Biblioteca com atributos para o nome da biblioteca e uma lista de livros. Implemente métodos para adicionar um livro, remover um livro e encontrar livros por autor.

8. Exercício - Concessionária:
Crie uma classe Concessionaria com atributos para o nome da concessionária e uma lista de carros disponíveis. Implemente métodos para adicionar um carro, vender um carro e calcular o lucro total da concessionária.

9. Exercício - Escola:
Crie uma classe Escola com atributos para o nome da escola e uma lista de alunos matriculados. Implemente métodos para matricular um aluno, excluir um aluno e encontrar alunos acima de uma certa média de notas.

10. Exercício - Loja Online:
Crie uma classe LojaOnline com atributos para o nome da loja e uma lista de produtos à venda. Implemente métodos para adicionar um produto, remover um produto, calcular o valor total do carrinho de um cliente e processar uma compra.
*/
import java.io.PrintStream;
import java.util.Scanner;

public class HCO {
    PrintStream out = System.out;

    // Atributos
    public static void main(String[] run) {
        PrintStream out = System.out;
        out.println("\033[H\033[2J");
        Chamada chamada = new Chamada();
        chamada.chamada();
    }
}

// Criar uma classe para fazer a chamada dos métodos
class Chamada {
    // Métodos
    public static void contaBancaria() {
        PrintStream out = System.out;
        out.println("1. Exercício - Conta Bancária:");
        ContaBancaria conta = new ContaBancaria(123, "João Victor", 1000);
        conta.exibirDados(conta);
    }

    public static void livro() {
        PrintStream out = System.out;
        out.println("\n2. Exercício - Livro:");
        Livro livro = new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954);
        livro.exibirDados(livro);
    }

    public static void carro() {
        PrintStream out = System.out;
        out.println("\n3. Exercício - Carro:");
        Carro carro = new Carro("Fiat", "Uno", 1998);
        carro.exibirDados();
        carro.getEstado();
    }

    public static void aluno() {
        PrintStream out = System.out;
        out.println("\n4. Exercício - Aluno:");
        double[] notas = { 10, 9, 8, 7 };
        Aluno aluno = new Aluno("João Victor", 123, notas);
        aluno.exibirDados();
    }

    public static void produto() {
        PrintStream out = System.out;
        out.println("\n5. Exercício - Produto:");
        ProdutoEstoque produto = new ProdutoEstoque("Arroz", 10, 100);
        produto.exibirDados();
    }

    public static void banco() {
        PrintStream out = System.out;
        out.println("\n6. Exercício - Banco:");
        Banco banco = new Banco("Banco do Brasil", "123");
        banco.chamada();
    }

    public void chamada() {
        contaBancaria();
        livro();
        carro();
        aluno();
        produto();
        banco();
    }
}

class ContaBancaria {
    // Atributos
    private int numeroDaConta;
    private String nomeDoTitular;
    private double saldo;
    PrintStream out = System.out;

    // Construtor
    public ContaBancaria(int numeroDaConta, String nomeDoTitular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = saldo;
    }

    // Método geral
    public void exibirDados(ContaBancaria conta) {
        out.println("Número da conta: " + this.numeroDaConta);
        out.println("Nome do titular: " + this.nomeDoTitular);
        out.println("Saldo: R$" + this.saldo);
        depositar(1200);
        sacar(100);
        getSaldo();
    }

    // Métodos
    public void depositar(double valor) {
        out.println("Você depositou: R$" + valor);
        this.saldo = this.saldo + valor;
    }

    public void sacar(double valor) {
        out.println("Você sacou: R$" + valor);
        this.saldo = this.saldo - valor;
    }

    public void exibirSaldo() {
        out.printf("Saldo atual:\n", this.saldo);
    }

    // Método para retornar o saldo atual
    public double getSaldo() {
        out.println("Saldo atual: R$" + this.saldo);
        return this.saldo;
    }

}

class Livro {
    // Atributos
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    PrintStream out = System.out;

    // Construtor
    public Livro(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    // Método geral
    public void exibirDados(Livro livro) {
        out.println("Título: " + this.titulo);
        out.println("Autor: " + this.autor);
        out.println("Ano de publicação: " + this.anoDePublicacao);
    }
}

class Carro {
    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;
    PrintStream out = System.out;

    // Construtor
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
    }

    public void getEstado() {
        if (this.ligado == true) {
            out.println("O carro está ligado!");
        } else {
            out.println("O carro está desligado!");
        }
    }

    public void exibirDados() {
        out.println("Marca: " + this.marca);
        out.println("Modelo: " + this.modelo);
        out.println("Ano: " + this.ano);
    }

}

class Aluno {
    // Atributos
    private String nome;
    private int matricula;
    private double[] notas;
    PrintStream out = System.out;

    // Construtor
    public Aluno(String nome, int matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    // Métodos
    public double calcularMedia() {
        double soma = 0;
        for (double notas : this.notas) {
            soma = soma + notas;
        }
        return soma / this.notas.length;
    }

    public void exibirDados() {
        out.println("Nome: " + this.nome);
        out.println("Matrícula: " + this.matricula);
        out.println("Média: " + calcularMedia());
    }
}

class ProdutoEstoque {
    // Atributos
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;
    PrintStream out = System.out;

    // Construtor
    public ProdutoEstoque(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Métodos
    public double calcularValorTotalEmEstoque() {
        return this.preco * this.quantidadeEmEstoque;
    }

    public void exibirDados() {
        out.println("Nome: " + this.nome);
        out.println("Preço: R$" + this.preco);
        out.println("Quantidade em estoque: " + this.quantidadeEmEstoque);
        out.println("Valor total em estoque: R$" + calcularValorTotalEmEstoque());
    }
}

class Banco {
    // Atributos
    private String nomeBanco;
    private String ContasBancarias;
    PrintStream out = System.out;

    // Construtor
    public Banco(String nomeBanco, String ContasBancarias) {
        this.nomeBanco = nomeBanco;
        this.ContasBancarias = ContasBancarias;
    }

    public void exibirDados() {
        out.println("Nome do banco: " + this.nomeBanco);
        out.println("Contas bancárias: " + this.ContasBancarias);
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        out.println("O que você deseja fazer?");
        out.println("1. Acessar como cliente");
        out.println("2. Acessar como funcionário");
        opcao();
    }

    public void opcao() {
        Scanner in = new Scanner(System.in);
        int opcao = in.nextInt();
        switch (opcao) {
            case 1:
                menuCliente();
                break;
            case 2:
                menuFuncionario();
                break;
            default:
                out.println("Opção inválida!");
                menu();
                break;
        }
    }

    public void menuCliente() {
        Scanner in = new Scanner(System.in);
        out.println("O que você deseja fazer?");
        out.println("1. Criar conta");
        out.println("2. Excluir conta");
        out.println("3. Exibir saldo total do banco");
        ProcessamentoCliente();
    }

    public void menuFuncionario() {
        Scanner in = new Scanner(System.in);
        out.println("O que você irá fazer?");
        out.println("1. Atender cliente");
        out.println("2. Processar transações");
        out.println("3. Emitir cartões");
        ProcessamentoFuncionario();
    }

    public void ProcessamentoCliente() {
        Scanner in = new Scanner(System.in);
        int opcao = in.nextInt();
        switch (opcao) {
            case 1:
                out.println("Digite o nome da conta:");
                String nomeConta = in.next();
                out.println("Digite o número da conta:");
                String numeroConta = in.next();
                out.println("Digite o depósito inicial:");
                String depositoInicial = in.next();
                out.print("Conta criada!\n");
                ClienteCriarConta(nomeConta, numeroConta, depositoInicial);
                break;
            case 2:
                out.println("Digite o nome da conta:");
                String nomeConta2 = in.next();
                out.println("Digite o número da conta:");
                String numeroConta2 = in.next();
                out.print("Conta excluída!\n");
                ClienteExcluirConta(nomeConta2, numeroConta2);
                break;
            case 3:
                ClienteExibirSaldoTotalDoBanco(1000);
                break;
            default:
                out.println("Opção inválida!");
                menuCliente();
                break;
        }
    }

    public void ProcessamentoFuncionario() {
        Scanner in = new Scanner(System.in);
        int opcao = in.nextInt();
        switch (opcao) {
            case 1:
                out.println("Digite o nome do cliente:");
                String nomeCliente = in.next();
                out.println("Digite o número da conta:");
                String numeroConta = in.next();
                out.println("Qual a dúvida do cliente?");
                String ajuda = in.next();
                FuncionarioAtenderCliente(nomeCliente, numeroConta, ajuda);
                break;
            case 2:
                out.println("Digite o número da conta:");
                String numeroConta2 = in.next();
                out.println("Digite o código da transação:");
                String codigoTransacao = in.next();
                FuncionarioProcessarTransacoes(numeroConta2, codigoTransacao);
                out.println("Digite o registro da transação:");
                String registroTransacao = in.next();
                FuncionarioRegistroTransacoes(registroTransacao);
                break;
            case 3:
                out.println("Digite o nome do cliente:");
                String nomeCliente2 = in.next();
                out.println("Digite o número da conta:");
                String numeroConta3 = in.next();
                out.println("Qual o tipo do cartão?");
                out.println("1. Débito");
                out.println("2. Crédito");
                int opcao2 = in.nextInt();
                switch (opcao2) {
                    case 1:
                        FuncionarioEmitirCartoes(nomeCliente2, numeroConta3, "Débito");
                        break;
                    case 2:
                        FuncionarioEmitirCartoes(nomeCliente2, numeroConta3, "Crédito");
                        break;
                    default:
                        out.println("Opção inválida!");
                        ProcessamentoFuncionario();
                        break;
                }
                break;
            default:
                out.println("Opção inválida!");
                menuFuncionario();
                break;
        }
    }

    // Métodos Clientes
    public void ClienteCriarConta(String nomeConta, String numeroConta, String depositoInicial) {
        out.println("Nome da conta: " + nomeConta);
        out.println("Número da conta: " + numeroConta);
        out.println("Depósito inicial: " + depositoInicial);
    }

    public void ClienteExcluirConta(String nomeConta, String numeroConta) {
        out.println("Nome da conta: " + nomeConta);
        out.println("Número da conta: " + numeroConta);
    }

    public void ClienteExibirSaldoTotalDoBanco(double saldoTotal) {
        out.println("Saldo total do banco: R$" + saldoTotal);
    }

    // Métodos Funcionários
    public void FuncionarioAtenderCliente(String nomeCliente, String numeroConta, String ajuda) {
        out.println("Nome do cliente: " + nomeCliente);
        out.println("Número da conta: " + numeroConta);
        out.println("Ajuda: " + ajuda);
    }

    public void FuncionarioProcessarTransacoes(String numeroConta, String codigoTransacao) {
        out.println("Número da conta: " + numeroConta);
        out.println("Número da transação: " + codigoTransacao);
    }

    public void FuncionarioRegistroTransacoes(String registroTransacao) {
        out.println("Registro da transação: " + registroTransacao);
    }

    public void FuncionarioEmitirCartoes(String nomeCliente, String numeroConta, String tipoCartao) {
        out.println("Nome do cliente: " + nomeCliente);
        out.println("Número da conta: " + numeroConta);
        out.println("Tipo do cartão: " + tipoCartao);
    }

    // Método de chamada
    public void chamada() {
        exibirDados();
        menu();
    }
}