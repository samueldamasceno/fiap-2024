print("Fazer retangulo")


print("quantas linhas voce deseja colocar? ")
linha = int(input())
print("quantas colunas voce deseja colocar? ")
coluna = int(input())

for l in range(0, linha):
    for c in range (0, coluna):
        print(c + 1, end="")
    print("")