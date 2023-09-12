def CalculadoraMatriz():
    matriz = []
    print("Matriz:")
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
        print(matriz[i])
