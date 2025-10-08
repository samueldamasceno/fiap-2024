print("Exercicio de fazer triangulo espelhado")

print("quantas linhas voce deseja utlizar? ")
linhas = int(input())

for i in range (1, linhas + 1):
    separa = " " * (linhas - i)
    asterisco = "*" * i
    print(separa + asterisco) 