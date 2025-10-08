print("Aproveite o exercicio 1, mostre a lista de nomes na ordem inversa que foi digitada")

lista = [input("Digite um nome: ")
for i in range (int(input("Quantos nomes você deseja armazenar?")))]

print("Nomes inversos:")
print(lista.reverse())
print(lista)