# Path: python_src/Calc.py
'''
Exercício 1: Calculadora de Área de Formas Geométricas

Crie um programa que permite ao usuário escolher entre calcular a área de um círculo, triângulo ou retângulo. O programa deve solicitar os dados necessários (raio para o círculo, base e altura para o triângulo, e comprimento e largura para o retângulo) e, em seguida, exibir a área calculada.

Exercício 2: Palíndromo

Escreva um programa que verifica se uma palavra ou frase fornecida pelo usuário é um palíndromo (ou seja, pode ser lida da mesma forma da esquerda para a direita e vice-versa). Ignore espaços em branco e letras maiúsculas/minúsculas.

Exercício 3: Calculadora de Fatorial

Crie um programa que permite ao usuário calcular o fatorial de um número inteiro não negativo. Lembre-se de verificar se o número fornecido é válido.

Exercício 4: Contagem de Vogais

Desenvolva um programa que conta o número de vogais em uma frase fornecida pelo usuário. Ignore letras maiúsculas/minúsculas.

Exercício 5: Conversor de Temperatura

Crie um programa que permita ao usuário converter uma temperatura de graus Celsius para graus Fahrenheit e vice-versa. Forneça um menu para o usuário escolher a conversão desejada.

Exercício 6: Números Primos

Escreva um programa que verifica se um número fornecido pelo usuário é um número primo.

Exercício 7: Lista de Tarefas

Crie um programa que permita ao usuário gerenciar uma lista de tarefas. O programa deve permitir adicionar, remover e listar tarefas.

Exercício 8: Calculadora de IMC

Desenvolva um programa que calcula o índice de massa corporal (IMC) com base no peso e altura fornecidos pelo usuário. Informe a categoria do IMC (exemplo: abaixo do peso, peso normal, sobrepeso, etc.).

Exercício 9: Jogo da Forca

Implemente o jogo da forca em Python. O programa deve escolher uma palavra aleatória de uma lista e permitir que o usuário adivinhe letras até acertar a palavra ou perder todas as tentativas.

Exercício 10: Gerador de Senhas

Crie um programa que gere senhas aleatórias com base nas preferências do usuário. Permita que o usuário escolha o comprimento da senha e quais tipos de caracteres devem ser incluídos (letras maiúsculas, minúsculas, números, símbolos, etc.).
'''
def CalculadoraMatriz():
    matriz = []
    for i in range(3):
        matriz.append([])
        for j in range(3):
            matriz[i].append(i+j)
            '''
            exemplo: i = 0, j = 0 -> matriz[0].append(0+0) -> matriz[0].append(0)
            exemplo: i = 0, j = 1 -> matriz[0].append(0+1) -> matriz[0].append(1)
            exemplo: i = 0, j = 2 -> matriz[0].append(0+2) -> matriz[0].append(2)
            exemplo: i = 1, j = 0 -> matriz[1].append(1+0) -> matriz[1].append(1)
            exemplo: i = 1, j = 1 -> matriz[1].append(1+1) -> matriz[1].append(2)
            exemplo: i = 1, j = 2 -> matriz[1].append(1+2) -> matriz[1].append(3)
            exemplo: i = 2, j = 0 -> matriz[2].append(2+0) -> matriz[2].append(2)
            exemplo: i = 2, j = 1 -> matriz[2].append(2+1) -> matriz[2].append(3)
            exemplo: i = 2, j = 2 -> matriz[2].append(2+2) -> matriz[2].append(4)
            '''

def CirculoGeometria(raio: float):
    area = 3.14 * raio * raio
    return area
def TrianguloGeometria(base, altura):
    area = (base * altura) / 2
    return area

def RetanguloGeometria(comprimento, largura):
    area = comprimento * largura
    return area

def SomaMatriz(matriz1, matriz2):
    matriz = []
    for i in range(3):
        matriz.append([])
        for j in range(3):
            resultado_soma = matriz1[i][j] + matriz2[i][j]
            matriz[i].append(resultado_soma)
    return matriz
def SubMatriz(matriz1, matriz2):
    matriz = []
    for i in range(3):
        matriz.append([])
        for j in range(3):
            resultado_subtracao = matriz1[i][j] - matriz2[i][j]
            matriz[i].append(resultado_subtracao)
    return matriz
def MultMatriz(matriz1, matriz2):
    matriz = []
    for i in range(3):
        matriz.append([])
        for j in range(3):
            resultado_multiplicacao = matriz1[i][j] * matriz2[i][j]
            matriz[i].append(resultado_multiplicacao)
    return matriz
def DivMatriz(matriz1, matriz2):
    matriz = []
    for i in range(3):
        matriz.append([])
        for j in range(3):
            resultado_divisao = matriz1[i][j] / matriz2[i][j]
            matriz[i].append(resultado_divisao)
    return matriz
def PrintMatriz(matriz):
    for linha in matriz:
        print(linha)


