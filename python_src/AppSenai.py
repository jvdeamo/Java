import Calc
import random
import os

def Clear():
    os.system('cls')
'''
Autor: João Victor Martins Deamo
Date: 12/09/2023
Time: 08:20
IDE: Visual Studio Code
Session Duration: 08:20 - 
Subject: Python
Version: 1.1
Senai - Desenvolvimento de Sistemas

def print_delimitador(caractere, vezes):
    print(caractere * vezes)
'''
def Welcome():
    print("Seja bem-vindo(a) ao App Senai!")

def Main():
    Clear()
    Welcome()
    
    while True:
        print("1 - Calculadora de matriz")
        print("2 - Calculadora geométrica")
        print("3 - Calculadora de palíndromo")
        print("4 - Calculadora de fatorial")
        print("12 - Jogo de adivinhação")
        print("13 - Jogo de dados")
        print("14 - Jogo da velha")
        print("15 - Sair")

        opcao = int(input("Digite a opção: "))
        Clear()
        if opcao == 1:
            Calc.CalculadoraMatriz()
            operacao_Matriz()
        elif opcao == 2:
            print("2 - Calculadora de área de formas geométricas")
            operacao_Geometrica()
        elif opcao == 3:
            print("3 - Palíndromo")
            operacao_Palindromo()
        elif opcao == 4:
            print("Calculadora de fatorial - Em desenvolvimento")
        elif opcao == 5:
            print("Calculadora de vogais - Em desenvolvimento")
        elif opcao == 6:
            print("Calculadora de temperatura - Em desenvolvimento")
        elif opcao == 7:
            print("Calculadora de números primos - Em desenvolvimento")
        elif opcao == 8:
            print("Lista de tarefas - Em desenvolvimento")
        elif opcao == 9:
            print("Calculadora de IMC - Em desenvolvimento")
        elif opcao == 10:
            print("Jogo da forca - Em desenvolvimento")
        elif opcao == 11:
            print("Gerador de senhas - Em desenvolvimento")
        elif opcao == 12:
            JogoAdivinhar()
        elif opcao == 13:
            JogoDados()
            break
        elif opcao == 14:
            JogoVelha()
        elif opcao == 15:
            break
        else:
            print("Opção inválida!")

def operacao_Matriz():
    matriz1 = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    matriz2 = [[9, 8, 7], [6, 5, 4], [3, 2, 1]]
    while True:
        print("Que operação deseja fazer?")
        print("1 - Soma")
        print("2 - Subtração")
        print("3 - Multiplicação")
        print("4 - Divisão")
        print("5 - Sair")
        opcao = int(input("Digite a opção: "))
        Clear()
        if opcao == 1:
            matriz_soma = Calc.SomaMatriz(matriz1, matriz2)
            Calc.PrintMatriz(matriz_soma)
        elif opcao == 2:
            matriz_subtracao = Calc.SubMatriz(matriz1, matriz2)
            Calc.PrintMatriz(matriz_subtracao)
        elif opcao == 3:
            matriz_multiplicacao = Calc.MultMatriz(matriz1, matriz2)
            Calc.PrintMatriz(matriz_multiplicacao)
        elif opcao == 4:
            matriz_divisao = Calc.DivMatriz(matriz1, matriz2)
            Calc.PrintMatriz(matriz_divisao)
        elif opcao == 5:
            break
        else:
            print("Opção inválida!")

def operacao_Geometrica():
    while True:
        print("Que forma geométrica deseja calcular a área?")
        print("1 - Círculo")
        print("2 - Triângulo")
        print("3 - Retângulo")
        print("4 - Sair")
        opcao = int(input("Digite a opção: "))
        Clear()
        if opcao == 1:
            raio = float(input("Digite o raio: "))
            area = Calc.CirculoGeometria(raio)
            print(f"A área do círculo é {area:.2f} cm².".format(area))
        elif opcao == 2:
            base = float(input("Digite a base: "))
            altura = float(input("Digite a altura: "))
            area = Calc.TrianguloGeometria(base, altura)
            print(f"A área do triângulo é {area:.2f} cm².".format(area))
        elif opcao == 3:
            comprimento = float(input("Digite o comprimento: "))
            largura = float(input("Digite a largura: "))
            area = Calc.RetanguloGeometria(comprimento, largura)
            print(f"A área do retângulo é {area:.2f} cm².".format(area))
        elif opcao == 4:
            break
        else:
            print("Opção inválida!")

def operacao_Palindromo():
    while True:
        print("Que operação deseja fazer?")
        print("1 - Verificar se é palíndromo")
        print("2 - Sair")
        opcao = int(input("Digite a opção: "))
        Clear()

        if opcao == 1:
            palavra = input("Digite a palavra: ")
            palavra_invertida = palavra[::-1]
            if palavra == palavra_invertida:
                print("É palíndromo!")
            else:
                print("Não é palíndromo!")

        elif opcao == 2:
            break
        else:
            print("Opção inválida!")
       
def JogoAdivinhar():
    numero_secreto = random.randint(1, 100)
    tentativas = 0
    
    print("Jogo de adivinhação")
    print("Acerte o número secreto entre 1 e 100")
    
    while True:
        numero = int(input("Digite um número: "))
        while numero < 1 or numero > 100:
            print("Número inválido!")
            numero = int(input("Digite o número: "))
        
        if numero == numero_secreto:
            print(f"Você acertou! O número secreto era: {numero_secreto}")
            break
        else:
            print("Você errou!")
            tentativas += 1
            
            if numero > numero_secreto:
                print("O número secreto é menor!")
            else:
                print("O número secreto é maior!")
            
            if tentativas == 5:
                print("Você perdeu!")
                print(f"O número secreto era: {numero_secreto}")
                break

def JogoDados():
    print("Jogo de dados")
    print("Em desenvolvimento")

def JogoVelha():
    print("Jogo da velha")
    print("Em desenvolvimento")


if __name__ == "__main__":
    Main()
