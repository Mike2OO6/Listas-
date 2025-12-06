class NodoDoble {
    constructor(valor) {
        this.valor = valor;
        this.siguiente = null;
        this.anterior = null;
    }
}

function crearLista(valores) {
    const nodos = valores.map(v => new NodoDoble(v));
    for (let i = 0; i < nodos.length; i++) {
        if (i > 0) nodos[i].anterior = nodos[i-1];
        if (i < nodos.length - 1) nodos[i].siguiente = nodos[i+1];
    }
    return nodos;
}

function mostrarLista(inicio, direccion = 'adelante') {
    let actual = inicio;
    const resultado = [];
    while (actual) {
        resultado.push(actual.valor);
        actual = direccion === 'adelante' ? actual.siguiente : actual.anterior;
    }
    console.log(resultado.join(' → '));
}

const valores = [5, 10, 15, 20, 25];
const [primero, , , , ultimo] = crearLista(valores);

console.log("Hacia adelante:");
mostrarLista(primero);

console.log("Hacia atrás:");
mostrarLista(ultimo, 'atras');
