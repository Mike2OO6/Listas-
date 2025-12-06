class NodoDoble:
    def __init__(self, valor):
        self.valor = valor
        self.siguiente = None
        self.anterior = None

def crear_lista(valores):
    nodos = [NodoDoble(v) for v in valores]
    for i in range(len(nodos)):
        if i > 0:
            nodos[i].anterior = nodos[i-1]
        if i < len(nodos) - 1:
            nodos[i].siguiente = nodos[i+1]
    return nodos

def mostrar_lista(inicio, direccion='adelante'):
    actual = inicio
    while actual:
        print(actual.valor, end=" ")
        actual = actual.siguiente if direccion == 'adelante' else actual.anterior
    print()

valores = [5, 10, 15, 20, 25, 30, 35, 40]
nodos = crear_lista(valores)
primero, *_, ultimo = nodos

print("Hacia adelante:", end=" ")
mostrar_lista(primero)

print("Hacia atrás:   ", end=" ")
mostrar_lista(ultimo, 'atras')
