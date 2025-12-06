using System;
using System.Collections.Generic;

class NodoDoble {
    public int valor;
    public NodoDoble siguiente;
    public NodoDoble anterior;
    
    public NodoDoble(int v) {
        valor = v;
        siguiente = null;
        anterior = null;
    }
}

class Program {
    static void MostrarLista(NodoDoble inicio, bool esAdelante = true) {
        NodoDoble actual = inicio;
        while (actual != null) {
            Console.Write(actual.valor + " ");
            actual = esAdelante ? actual.siguiente : actual.anterior;
        }
        Console.WriteLine();
    }

    static void Main() {
        int[] valores = {5, 10, 15, 20, 25};
        List<NodoDoble> nodos = new List<NodoDoble>();
        
        foreach (int v in valores) {
            nodos.Add(new NodoDoble(v));
        }
        
        for (int i = 0; i < nodos.Count; i++) {
            if (i > 0) {
                nodos[i].anterior = nodos[i-1];
            }
            if (i < nodos.Count - 1) {
                nodos[i].siguiente = nodos[i+1];
            }
        }
        
        Console.Write("Hacia adelante: ");
        MostrarLista(nodos[0]);
        
        Console.Write("Hacia atrás:    ");
        MostrarLista(nodos[nodos.Count-1], false);
    }
}
