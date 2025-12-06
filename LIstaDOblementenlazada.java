public class main {
    static class NodoDoble {
        int valor;
        NodoDoble siguiente;
        NodoDoble previo;
        
        public NodoDoble(int valor) {
            this.valor = valor;
            this.siguiente = null;
            this.previo = null;
        }
    }

    public static void main(String[] args) {
        // Inicializar arreglo de nodos
        NodoDoble[] listaNodos = new NodoDoble[10];
        int[] numeros = {5, 24, 8, 15, 42, 17, 9, 63, 28, 11};
        
        // Crear nodos con valores
        for (int i = 0; i < numeros.length; i++) {
            listaNodos[i] = new NodoDoble(numeros[i]);
        }

        // Establecer conexiones
        for (int i = 0; i < listaNodos.length; i++) {
            if (i > 0) {
                listaNodos[i].previo = listaNodos[i-1];
            }
            if (i < listaNodos.length - 1) {
                listaNodos[i].siguiente = listaNodos[i+1];
            }
        }

        // Mostrar lista hacia adelante
        System.out.println("Recorriendo de inicio a fin:");
        NodoDoble actual = listaNodos[0];
        while (actual != null) {
            System.out.print(actual.valor + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");

        // Mostrar lista hacia atrás
        System.out.println("\nRecorriendo de fin a inicio:");
        actual = listaNodos[listaNodos.length - 1];
        while (actual != null) {
            System.out.print(actual.valor + " <- ");
            actual = actual.previo;
        }
        System.out.println("null");
    }
}