print("Programa para dar bom dia")
executar = True
while executar == True:
    print("Digite seu nome:")
    nome = input()
    print("Bom dia", nome)
    print("Você deseja continuar? (S/N)")
    continuar = input() # S ou N
    if executar == 'N':
        executar = False