print("Faça um programa usando laços para desenhar um  X grande na tela conforme mostrado abaixo:")

for i in range(9):
    for b in range(9):
        if i == b or i + b == 8:
            print("*", end="")
        else:
            print(" ", end="")
    print()