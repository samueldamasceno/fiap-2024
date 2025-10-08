print("Imprimir linha de 1 a 5")

print("Quantas colunas voce deseja colocar?")
coluna = int(input())
print("Quantas linhas voce deseha colocar?")
linha = int(input())

for l in range(0, linha):
    for c in range (0, coluna):
     print(c + 1, end="")
    print("")