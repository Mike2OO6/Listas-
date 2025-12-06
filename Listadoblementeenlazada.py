class NodoDoble:
    def __init__(self, valor):
        self.valor = valor
        self.siguiente = None
        self.anterior = None

valores = [10, 25, 40, 55, 70, 85]
nodos = [NodoDoble(x) for x in valores]

for i in range(len(nodos)):
    if i > 0:
        nodos[i].anterior = nodos[i-1]
    if i < len(nodos) - 1:
        nodos[i].siguiente = nodos[i+1]

def mostrar_lista(inicio, direccion='adelante'):
    actual = inicio
    while actual:
        print(actual.valor, end=" ")
        actual = actual.siguiente if direccion == 'adelante' else actual.anterior
    print()

print("Hacia adelante:", end=" ")
mostrar_lista(nodos[0])

print("Hacia atrás:   ", end=" ")
mostrar_lista(nodos[-1], 'atras')