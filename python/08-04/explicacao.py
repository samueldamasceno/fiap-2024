lista=["Pedro","joao","Maria","Pedro"]
print(lista)

lista.append("Jose")
print("lista com Jose: ", lista)
tamanho=len(lista)
print("Tamanho:", tamanho)

nome1=lista[1]
print(lista)


lista.insert(1,"Matheus")
print("lista com Matheus: ", lista)
tamanho=len(lista)
print("Tamanho:", tamanho)

lista.pop(3)
print("lista sem a Maria: ", lista)

pedros=lista.count("Pedro")
print(f"Há {pedros} Pedros na lista")

lista.remove("Pedro")
print("lista sem o Pedro: ", lista)
tamanho=len(lista)
print("Tamanho:", tamanho)
