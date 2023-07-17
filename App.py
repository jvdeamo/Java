
print('salve');
print("Olá, mundo!");

print('-----------------------------------------------------------------------------------------------');

#  Soma1
def soma(x, y):
    return x + y;
print('A soma dos números digitados é: ', soma(2, 3));

print('-----------------------------------------------------------------------------------------------');

# Media1
def media(a, b, c):
    return (a + b + c) / 3;
print('A média dos números digitados é: ', media(10, 3, 5));

# Media2 #
print('-----------------------------------------------------------------------------------------------');

# Resto
def resto(x, y):
    return x % y;
print('O resto da divisão é: ', resto(10, 3));
print('Portanto, o número é par!');

print('-----------------------------------------------------------------------------------------------');

# Ano bissexto
def ano_bissexto(ano):
    if ano % 4 == 0 and (ano % 100 != 0 or ano % 400 == 0):
        return 'Sim.';
    else:
        return 'Não.';
print('O ano é bissexto? ', ano_bissexto(2020));


print('Obrigado por utililizar o programa!');
print('*-*');

# 