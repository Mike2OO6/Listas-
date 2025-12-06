using System;

class Program {
    static void MostrarArreglo(int[] arreglo) {
        foreach (int num in arreglo) {
            Console.Write($"{num} ");
        }
        Console.WriteLine();
    }

    static void Main() {
        int[] numeros = {5, 10, 15, 20, 25, 30, 35, 40};
        
        Console.Write("Elementos del arreglo: ");
        MostrarArreglo(numeros);
    }
}
