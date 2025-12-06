#include <iostream>
#include <vector>
#include <algorithm>

void mostrarVector(const std::vector<int>& vec) {
    for (const auto& elemento : vec) {
        std::cout << elemento << " ";
    }
    std::cout << std::endl;
}

int main() {
    std::vector<int> numeros = {5, 10, 15, 20, 25, 30, 35, 40};
    
    std::cout << "Elementos del vector: ";
    mostrarVector(numeros);
    
    return 0;
}
