public class Main {
    static void mostrarArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25, 30, 35, 40};
        
        System.out.print("Elementos del arreglo: ");
        mostrarArreglo(numeros);
    }
}
