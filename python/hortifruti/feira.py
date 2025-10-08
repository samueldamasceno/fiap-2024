print("Faca um programa para cadastrar produtos da feira, o programa devera perguntar ao usuario sobre detalhes do produto como: (nome, cor, preco, unidade_medida) e em seguida devera guardar as informacoes em um dicionario, em seguida o programa devera adicionar este dicionario dentro de uma lista previamente criada.")

# dict = {input("Digite o nome do seu produto: "), input("Digite a cor: "), input("digite o preco, lembrando que cada kg é 9,99: "), input("Digite a unidade de medida: ")}

# print(dict)

#correcao:
lista = []
executando = True
 
while executando:
    menu = '''
        SISTEMA PARA HORT-FRUT
        (A)dicionar um novo produto
        (L)istar todos os produtos
        (P)esquisar por um produto específico
        (S)air do sistema
        \n\n\n
        Digite sua opção ==>
    '''
 
    print(menu)
    opcao = input().lower()[0]
 
    if opcao == 'a':
        #for i in range(3):
        produto = {}
        #nome = input("Digite o nome do produto: ")
        produto["nome"] = input("Digite o nome do produto: ")
        produto["cor"] = input("Digite a cor do produto: ")
        produto["preco"] = float(input("Digite o preço do produto: "))
        produto["unidade_medida"] = input("Informe a unidade de medida: ")
        lista.append(produto)
    elif opcao == 'l':
        for p in lista:
            print("Produto: ", p["nome"])
            print(f"Cor: {p['cor']}  Preço: {p['preco']}  Unidade de Medida: {p['unidade_medida']}")
    elif opcao == 'p':
        print("Digite o nome do prodtuo a ser pesquisado ==> ")
        n1 = input()
        for p in lista:
            if n1 == p["nome"]:
                print("Produto: ", p["nome"])
            print(f"Cor: {p['cor']}  Preço: {p['preco']}  Unidade de Medida: {p['unidade_medida']}")