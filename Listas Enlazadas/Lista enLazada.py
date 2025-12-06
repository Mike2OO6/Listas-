class Nodo:
    def __init__(self, valor):
        self.valor = valor
        self.siguiente = None

def crear_lista(valores):
    nodos = [Nodo(v) for v in valores]
    for i in range(len(nodos) - 1):
        nodos[i].siguiente = nodos[i + 1]
    return nodos[0] if nodos else None

def mostrar_lista(inicio):
    actual = inicio
    while actual:
        print(actual.valor, end=" ")
        actual = actual.siguiente
    print()

valores = [5, 10, 15, 20, 25]
primero = crear_lista(valores)

print("Lista enlazada:", end=" ")
mostrar_lista(primero)
