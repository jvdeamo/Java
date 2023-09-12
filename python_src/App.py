# Calculando a soma, média, resto, ano bissexto e fatorial
# Autor: João Victor Martins Deamo

# Date: 12/09/2023
# Time: 08:15
# IDE: Visual Studio Code
# Session Duration: 08:15 -
# Subject: Python
# Version: 1.0
# Senai - Desenvolvimento de Sistemas


# Definindo a função delimitador
def imprimir_delimitador(caractere, vezes):
    print(caractere * vezes)
imprimir_delimitador("-", 20)

# 1 Calculando a soma
def soma(j, v):
    resultadoSoma = j + v
    print("A soma dos números digitados é:", resultadoSoma)
    # format print('A soma dos números digitados é: {}'.format(resultadoSoma))
    # f print(f'A soma dos números digitados é: {resultadoSoma}')
    return resultadoSoma
resultadoSoma = soma(2, 3)

imprimir_delimitador("-", 20)

# 2 Calculando a média
def media(j, v, d):
    resultadoMedia = (j + v + d) / 3
    print("A média dos números digitados é:", resultadoMedia)
    # Usando f-string
    # print(f'A média dos números digitados é: {resultadoMedia:.2f}')
    return resultadoMedia
resultadoMedia = media(5, 4, 3)

imprimir_delimitador("-", 20)

# 3 Calculando o resto
def resto(j, v):
    if v == 0:
        return "Não é possível dividir por zero"
    else:
        resultadoResto = j % v  # Cálculo do resto
        if resultadoResto % 2 == 0:
            print("O número {} é par!".format(j))
            # Usando f-string
            # print(f'O número {j} é par!')
            print("O resto da divisão é:", resultadoResto)
            # Usando f-string
            # print(f'O resto da divisão é: {resultadoResto:.2f}')
            return resultadoResto
        if resultadoResto % 2 != 0:
            print("O número {} é ímpar!".format(j))
            # Usando f-string
            # print(f'O número {j} é ímpar!')
            print("O resto da divisão é:", resultadoResto)
            # Usando f-string
            # print(f'O resto da divisão é: {resultadoResto:.2f}')
            return resultadoResto
resultadoResto = resto(15, 6)

imprimir_delimitador("-", 20)

# 4 Calculando o ano bissexto
def ano_bissexto(ano):
    resultadoAno = ano
    if ano % 4 == 0 and (ano % 100 != 0 or ano % 400 == 0):
        print("O ano {} é bissexto!".format(ano))
        # Usando f
        # print(f'O ano {ano} é bissexto!')
        return resultadoAno
    else:
        print("O ano {} não é bissexto!".format(ano))
        # Usando f
        # print(f'O ano {ano} não é bissexto!')
        return
resultadoAno = ano_bissexto(2020)

imprimir_delimitador("-", 20)

# 5 Calculando o fatorial
def fatorial(j):
    resultado = 1
    if j < 0:
        print("Não existe fatorial de número negativo!")
        # Usando f-string:
        # print("Não existe fatorial de número negativo!")
    else:
        for i in range(1, j + 1):
            resultado = resultado * i
        if resultado >= 0:
            print("O fatorial de {} é: {}".format(j, resultado))
            # Usando f-string:
            # print(f"O fatorial de {j} é: {resultado}")
    return resultado
fatorial(2)

imprimir_delimitador("-", 20)

# 6 Calculando o número primo
def primo(j):
    if j < 2:
        print("Não existe número primo menor que 2!")
        # Usando f-string:
        # print(f'Não existe número primo menor que 2!')
    else:
        for i in range(2, j):
            if j % i == 0:
                print("O número {} não é primo!".format(j))
                # Usando f-string:
                # print(f'O número {j} não é primo!')
                return
        print("O número {} é primo!".format(j))
        # Usando f-string:
        # print(f'O número {j} é primo!')
        return
primo(8)

# 7	Escreva um programa que lê um número do usuário e imprime o número quadrado.
def entrada():
    try:
        def input_7():
            try:
                j = float(input("Digite um número: "))
                resultado = j**2
                # Usando f-string:
                print(f"{j} ao quadrado é: {resultado:.2f}.")
                return resultado
            except ValueError:
                print("Digite apenas números!")
                return input_7()

        def input_8():
            try:
                j = float(input("Digite um número: "))
                v = float(input("Digite outro número: "))
                resultado = j + v
                print(f"A soma dos números digitados é: {resultado:.2f}.")
                return resultado
            except ValueError:
                print("Digite apenas números!")
                return input_8()
        
        def input_9():
            try:
                # receber uma lista de números
                vetor = []
                n = int(input("Digite a quantidade de números que deseja inserir: "))
                for i in range(n):
                    vetor.append(int(input("Digite um número: ")))
                resultado = min(vetor)
                print(f"O menor número digitado é: {resultado}.")
                return resultado
            except ValueError:
                print("Digite apenas números!")
                return input_9()
            
        def input_10():
            try:
                # receber uma lista de Strings
                vetor = []
                txt = int(input("Digite a quantidade de frutas que deseja inserir: "))
                for i in range(txt):
                    fruta = input("Digite uma fruta: ")
                    fruta = fruta.replace("&", "e")
                    vetor.append(fruta)               
                resultado = ', '.join(vetor)
                print(f"O cesto de frutas tem as seguintes frutas: {resultado}.")
                return resultado
            except ValueError:
                print("Digite apenas texto!")
                return input_10()
                
    except Exception:
        print("Digite os valores corretamente!")
        return entrada()

    # 1 -> chamada delimitador
    # 2 -> chamada função
    imprimir_delimitador("-", 20)
    input_7()
    imprimir_delimitador("-", 20)
    input_8()
    imprimir_delimitador("-", 20)
    input_9()
    imprimir_delimitador("-", 20)
    input_10()


entrada()
# 8	Escreva um programa que lê dois números do usuário e imprime a soma.
# 9	Escreva um programa que lê uma lista de números do usuário e imprime o menor número.
# 10	Escreva um programa que lê uma lista de números do usuário e imprime a média dos números.
# 11	Escreva um programa que lê uma lista de palavras do usuário e imprime as palavras que começam com a letra "A".
# 12	Escreva um programa que lê uma lista de palavras do usuário e imprime as palavras que têm exatamente cinco letras.
# 13	Escreva um programa que lê uma lista de palavras do usuário e imprime as palavras que são anagramas umas das outras.
# 14	Escreva um programa que lê uma lista de números do usuário e imprime os números primos.
# 15	Escreva um programa que lê uma lista de números do usuário e imprime os números pares.
