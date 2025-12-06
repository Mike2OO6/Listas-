#include <iostream>
#include <vector>

struct NodoDoble {
    int valor;
    NodoDoble* siguiente;
    NodoDoble* anterior;
    
    NodoDoble(int v) : valor(v), siguiente(nullptr), anterior(nullptr) {}
};

void mostrarLista(NodoDoble* inicio, bool haciaAdelante = true) {
    NodoDoble* actual = inicio;
    while (actual != nullptr) {
        std::cout << actual->valor << " ";
        actual = haciaAdelante ? actual->siguiente : actual->anterior;
    }
    std::cout << std::endl;
}

int main() {
    std::vector<int> valores = {5, 15, 25, 35, 45};
    std::vector<NodoDoble*> nodos;
    
    for (int v : valores) {
        nodos.push_back(new NodoDoble(v));
    }
    
    for (size_t i = 0; i < nodos.size(); ++i) {
        if (i > 0) {
            nodos[i]->anterior = nodos[i-1];
        }
        if (i < nodos.size() - 1) {
            nodos[i]->siguiente = nodos[i+1];
        }
    }
    
    std::cout << "Hacia adelante: ";
    mostrarLista(nodos.front());
    
    std::cout << "Hacia atras:    ";
    mostrarLista(nodos.back(), false);
    
    for (auto& nodo : nodos) {
        delete nodo;
    }
    
    return 0;
}
