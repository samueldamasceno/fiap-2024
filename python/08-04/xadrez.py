print("Faça um programa usando laços para desenhar um tabuleiro de xadrez na tela conforme mostrado abaixo:")

num = "#"
for b in range(0, 3):
    print(num * 4 + "  ", num * 4 + "  ", num * 4 + "  ", num * 4 + "  ") 
    print(num * 4 + "  ", num * 4 + "  ", num * 4 + "  ", num * 4 + "  ")
    print(num * 4 + "  ", num * 4 + "  ", num * 4 + "  ", num * 4 + "  ")
    for i in range(0, 3):
        print("   " + 4 * num, "   " + 4 * num, "   " + 4 * num)
        

        
        