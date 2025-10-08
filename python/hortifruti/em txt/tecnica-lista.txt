# Assumindo a seguinte lista:
# índices  0   1    2  3  4   5    6    7  8    9    10, 11
numeros = [34, 67, 12, 9, 52, 13, 126, 42, 1, -128, -54, 87]

# a) A soma de todos os elementos da lista
# b) O produto de todos os elementos da lista
# c) O agrupamento desta lista em blocos de 3 números
# d) A soma dos números em cada bloco
# e) O maior numero da lista
# f) 2º maior número da lista
# g) O menor número da lista
# h) 2º menor número da lista


soma = sum(numeros)
print("Resultado da soma:", soma)

print("todos os elementos da lista:", soma * 2)

for i in range(1):
    bloco1 = numeros[0:3]
    bloco2 = numeros[3:6]
    bloco3 = numeros[6:9]
    bloco4 = numeros[9:12]
    print("Blocos de 3:", bloco1, bloco2, bloco3, bloco4)

for a in range(1):
    soma1 = sum(bloco1)
    soma2 = sum(bloco2)
    soma3 = sum(bloco3)
    soma4 = sum(bloco4)

    print("Soma do bloco 1:", soma1, "\nSoma do bloco 2:", soma2, "\nSoma do bloco 3:", soma3, "\nSoma do bloco 4:", soma4)


num = max(numeros)
print("O maior numero da lista é:", num)

num1 = max(numeros)
numeros.remove(num1)
num2 = max(numeros)
print("O segundo maior numero da lista é:", num2)

num3 = min(numeros)
print("O maior numero da lista é:", num3)

num4 = min(numeros)
numeros.remove(num4)
num5 = min(numeros)
print("O segundo menor numero da lista é:", num5)