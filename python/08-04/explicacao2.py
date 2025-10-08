lista=["Isabela","Guilherme","Juliana","Pablo","Michael","Enzo","Karina","Guilherme"]

try:
    posicao = lista.index("Guilherme",2)
    print("Guilherme esta na posicao: {posicao}")
except:
    print("elemento nao encontrado")

posicao = lista.index("Pablo")
print("Pablo esta na posicao: {posicao}")

print(lista[-1])

try:
    posicao - lista.index("Joao")
    print("O Joao esta na posicao: {posicao}") 
except ValueError as err:
    print("Joa nao esta na lista")
    print("Erro: ", err)