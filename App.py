# Calculando a soma, média, resto, ano bissexto e fatorial
# Autor: João Victor Martins Deamo


# Calculando a soma
def soma(j, v):
    print("A soma dos números digitados é:", resultadoSoma)
    return j + v


resultadoSoma = soma(2, 3)
# Usando format
# print('A soma dos números digitados é: {}'.format(resultadoSoma))
# Usando f
# print(f'A soma dos números digitados é: {resultadoSoma}')
print("----------------------------------------------")


# Calculando a média
def media(j, v, d):
    print("A média dos números digitados é:", resultadoMedia)
    return (j + v + d) / 3


resultadoMedia = media(5, 4, 3)
print("--------------------------------")


# Calculando o resto
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
            # print(f'O resto da divisão é: {resultadoResto}')
            return resultadoResto
        if resultadoResto % 2 != 0:
            print("O número {} é ímpar!".format(j))
            # Usando f-string
            # print(f'O número {j} é ímpar!')
            print("O resto da divisão é:", resultadoResto)
            # Usando f-string
            # print(f'O resto da divisão é: {resultadoResto}')
            return resultadoResto


resultadoResto = resto(15, 6)
print("--------------------------------")


# Calculando se o ano é bissexto
def ano_bissexto(ano):
    if ano % 4 == 0 and (ano % 100 != 0 or ano % 400 == 0):
        print("O ano {} é bissexto!".format(ano))
        # Usando f
        # print(f'O ano {ano} é bissexto!')
        return
    else:
        print("O ano {} não é bissexto!".format(ano))
        # Usando f
        # print(f'O ano {ano} não é bissexto!')
        return


resultadoAno = ano_bissexto(2021)
print("--------------------------------")


# Calculando o fatorial
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
print("--------------------------------")

# Calculando o primo
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
