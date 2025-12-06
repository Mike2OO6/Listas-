class Nodo {
    constructor(valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}

function crearLista(valores) {
    const nodos = valores.map(v => new Nodo(v));
    nodos.forEach((nodo, i) => {
        if (i < nodos.length - 1) {
            nodo.siguiente = nodos[i + 1];
        }
    });
    return nodos;
}

function mostrarLista(inicio) {
    let actual = inicio;
    const resultado = [];
    while (actual) {
        resultado.push(actual.valor);
        actual = actual.siguiente;
    }
    console.log(resultado.join(' → '));
}

const valores = [5, 10, 15, 20, 25];
const [primero] = crearLista(valores);

console.log("Lista enlazada:");
mostrarLista(primero);
