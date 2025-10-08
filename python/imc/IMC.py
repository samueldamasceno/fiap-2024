"Calcular IMC"
print("Programa para calcular o IMC")
altura = int(input("Digite sua altura: "))
peso = int(input("Digite seu peso: "))
"float = número fracionado/fatiado"
imc = peso/((altura/ 100)**2)
if imc >= 25:
    print("Você precisa emagrecer")
else:
    print("Você não precisa emagrecer")