#include <iostream>
#include <vector>

struct Nodo {
    int valor;
    Nodo* siguiente;
    
    Nodo(int v) : valor(v), siguiente(nullptr) {}
};

void mostrarLista(Nodo* inicio) {
    Nodo* actual = inicio;
    while (actual != nullptr) {
        std::cout << actual->valor << " ";
        actual = actual->siguiente;
    }
    std::cout << std::endl;
}

int main() {
    std::vector<int> valores = {5, 10, 15, 20, 25};
    std::vector<Nodo*> nodos;
    
    for (int v : valores) {
        nodos.push_back(new Nodo(v));
    }
    
    for (size_t i = 0; i < nodos.size() - 1; ++i) {
        nodos[i]->siguiente = nodos[i+1];
    }
    
    std::cout << "Lista enlazada: ";
    mostrarLista(nodos[0]);
    
    for (auto& nodo : nodos) {
        delete nodo;
    }
    
    return 0;
}
