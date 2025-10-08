print("Faca um programa que peca ao usuario para informar quantos nomes devem ser armazenados, e em seguida deve pedir os nomes e guardá-los em uma lista")

lista = [input("Digite um nome: ")
for i in range (int(input("Quantos nomes você deseja armazenar?")))]

print("Nomes inversos:")
print(lista.reverse())
print(lista)