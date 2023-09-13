import Calc
import random
import os

def Clear():
    os.system('cls' if os.name == 'nt' else 'clear')

# limpa o console
Clear()


'''
Autor: João Victor Martins Deamo
Date: 12/09/2023
Time: 23:15
IDE: Visual Studio Code
Session Duration: 23:15 - 00:15
Subject: Python
Version: 1.0
Senai - Desenvolvimento de Sistemas

'''
def print_delimitador(caractere, vezes):
    print(caractere * vezes)

def print_boas_vindas():
    print("Seja bem-vindo(a) ao App Senai!")

def blub():
    a = list()
    a.append(1.0)
    return a

def chamar_funcao():
    print_delimitador("-", 20)
    print_boas_vindas()
    
    while True:
        print("1 - Calculadora de matriz")
        print("2 - Jogo de adivinhação")
        print("3 - Jogo de dados")
        print("4 - Jogo da velha")
        print("5 - Sair")

        opcao = int(input("Digite a opção: "))
        
        if opcao == 1:
            Calc.CalculadoraMatriz()
            operacao_matriz()
        elif opcao == 2:
            JogoAdivinhar()
        elif opcao == 3:
            print("Jogo de dados - Em desenvolvimento")
        elif opcao == 4:
            print("Jogo da velha - Em desenvolvimento")
        elif opcao == 5:
            break
        else:
            print("Opção inválida!")

def operacao_matriz():
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
        

# Resto do seu código...

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

if __name__ == "__main__":
    chamar_funcao()
