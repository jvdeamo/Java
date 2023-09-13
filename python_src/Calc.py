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
    