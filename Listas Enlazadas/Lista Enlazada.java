class Nodo {
    int valor;
    Nodo siguiente;
    
    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}

public class ListaEnlazada {
    static void mostrarLista(Nodo inicio) {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] valores = {5, 10, 15, 20, 25};
        Nodo[] nodos = new Nodo[valores.length];
        
        for (int i = 0; i < valores.length; i++) {
            nodos[i] = new Nodo(valores[i]);
            if (i > 0) {
                nodos[i-1].siguiente = nodos[i];
            }
        }
        
        System.out.print("Lista enlazada: ");
        mostrarLista(nodos[0]);
    }
}
