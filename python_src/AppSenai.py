import calculadora_matriz
import random

'''
Autor: João Victor Martins Deamo
Date: 12/09/2023
Time: 08:15
IDE: Visual Studio Code
Session Duration: 08:15 - 11:50
Subject: Python
Version: 1.0
Senai - Desenvolvimento de Sistemas

'''
def printDelimitador(caractere, vezes):
    print(caractere * vezes)
printDelimitador("-", 20)

def printBoasVindas():
    print("Olá mundo!")
printBoasVindas()

'''
# 11 Calculadora de matriz
# 12 Jogo de adivinhação
# 13 Jogo de dados
# 14 Jogo da velha

'''
def blub():
    a = list()
    a.append(1.0)
    return a
print(blub())
def ChamarFuncao():
    print("1 - Calculadora de matriz")
    print("2 - Jogo de adivinhação")
    print("3 - Jogo de dados")
    print("4 - Jogo da velha")
    print("5 - Sair")
    opcao = int(input("Digite a opção: "))
    return opcao

calculadora_matriz.CalculadoraMatriz()
matriz1 = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
matriz2 = [[9, 8, 7], [6, 5, 4], [3, 2, 1]]
def SomaMatriz(matriz1, matriz2):
    matriz = []
    for i in range(3):
        matriz.append([])
        for j in range(3):
            resultadoSoma = (matriz1[i][j] + matriz2[i][j])
            matriz[i].append(resultadoSoma)
        print(matriz[i])
    return matriz
def SubtracaoMatriz(matriz1, matriz2):
    matriz = []
    for i in range(3):
        matriz.append([])
        for j in range(3):
            resultadoSubtracao = (matriz1[i][j] - matriz2[i][j])
            matriz[i].append(resultadoSubtracao)
        print(matriz[i])
    return matriz
def MultiplicacaoMatriz(matriz1, matriz2):
    matriz = []
    for i in range(3):
        matriz.append([])
        for j in range(3):
            resultadoMultiplicacao = (matriz1[i][j] * matriz2[i][j])
            matriz[i].append(resultadoMultiplicacao)
        print(matriz[i])
    return matriz
def DivisaoMatriz(matriz1, matriz2):
    matriz = []

    for i in range(3):
        matriz.append([])
        for j in range(3):
            resultadoDivisao = (matriz1[i][j] / matriz2[i][j])
            matriz[i].append(resultadoDivisao)
            '''
            Usando o format para formatar a saída
            print("{:.2f}".format(matriz[i][j]))
            '''
        print(matriz[i])
    return matriz
def JogoAdivinhacao():
    numeroSecreto = random.randint(1, 100)
    tentativas = 0
    sair = False
    print("Jogo de adivinhação")
    print("Digite um número entre 1 e 100")
    numero = int(input("Digite o número: "))
    while numero < 1 or numero > 100:
        print("Número inválido!")
        numero = int(input("Digite o número: "))
    while sair == False:
        print("Tentativas: ", tentativas + 1)
        print("Digite outro número: ")
        if (numero == numeroSecreto):
            print("Você acertou!")
            sair = True
        else:
            print("Você errou!")
            tentativas += 1
        if (numero > numeroSecreto):
            print("O número secreto é menor!")
        else:
            print("O número secreto é maior!")
        if (tentativas == 5):
            print("Você perdeu!")
            sair = True
            print("O número secreto era: ", numeroSecreto)

def Menu():
    opcao = ChamarFuncao()
    while opcao != 5:
        if opcao == 1:
            calculadora_matriz.CalculadoraMatriz()
            print("Que operação deseja fazer?")
            print("1 - Soma")
            print("2 - Subtração")
            print("3 - Multiplicação")
            print("4 - Divisão")
            print("5 - Sair")
            opcao = int(input("Digite a opção: "))
            while opcao != 5:
                if opcao == 1:
                    print("A soma das matrizes é:")
                    SomaMatriz(matriz1, matriz2)
                elif opcao == 2:
                    print("A subtração das matrizes é:")
                    SubtracaoMatriz(matriz1, matriz2)
                elif opcao == 3:
                    print("A multiplicação das matrizes é:")
                    MultiplicacaoMatriz(matriz1, matriz2)
                elif opcao == 4:
                    print("A divisão das matrizes é:")
                    DivisaoMatriz(matriz1, matriz2)
                else:
                    print("Opção inválida!")
                print("Que operação deseja fazer?")
                print("1 - Soma")
                print("2 - Subtração")
                print("3 - Multiplicação")
                print("4 - Divisão")
                print("5 - Sair")
                opcao = int(input("Digite a opção: "))
        elif opcao == 2:
            JogoAdivinhacao()
        elif opcao == 3:
            print("teste")
        elif opcao == 4:
            print("teste")
        else:
            print("Opção inválida!")
        opcao = ChamarFuncao()
Menu()

