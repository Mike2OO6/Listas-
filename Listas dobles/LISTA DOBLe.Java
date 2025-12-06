class NodoDoble {
    int valor;
    NodoDoble siguiente;
    NodoDoble anterior;
    
    public NodoDoble(int valor) {
        this.valor = valor;
        this.siguiente = null;
        this.anterior = null;
    }
}

public class ListaDoble {
    static void mostrarLista(NodoDoble inicio, boolean esAdelante) {
        NodoDoble actual = inicio;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = esAdelante ? actual.siguiente : actual.anterior;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] valores = {5, 10, 15, 20, 25};
        NodoDoble[] nodos = new NodoDoble[valores.length];
        
        for (int i = 0; i < valores.length; i++) {
            nodos[i] = new NodoDoble(valores[i]);
        }
        
        for (int i = 0; i < nodos.length; i++) {
            if (i > 0) {
                nodos[i].anterior = nodos[i-1];
            }
            if (i < nodos.length - 1) {
                nodos[i].siguiente = nodos[i+1];
            }
        }
        
        System.out.print("Hacia adelante: ");
        mostrarLista(nodos[0], true);
        
        System.out.print("Hacia atrás:    ");
        mostrarLista(nodos[nodos.length-1], false);
    }
}
