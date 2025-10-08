print("Exercicio de fazer Arvore de natal")

print("Quantas  fileiras de galhos a arvore deve conter?")
n = int(input())

for i in range(1, n + 1):
    print(" " * (n - i) + "*" * (2 * i - 1))

print((" " * (n - 1) + "||\n") * 3)