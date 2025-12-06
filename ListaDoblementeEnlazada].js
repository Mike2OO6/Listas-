class Elemento {
    constructor(valor) {
        this.valor = valor;
        this.proximo = null;
        this.previo = null;
    }
}

// Crear elementos
const numeros = [2, 16, 8, 24, 4, 12, 20, 28];
const elementos = numeros.map(num => new Elemento(num));

// Conectar elementos
elementos.forEach((elemento, indice) => {
    if (indice > 0) {
        elemento.previo = elementos[indice - 1];
    }
    if (indice < elementos.length - 1) {
        elemento.proximo = elementos[indice + 1];
    }
});

// Función para mostrar la lista
function mostrarLista(inicio, direccion) {
    let actual = inicio;
    const resultado = [];
    while (actual !== null) {
        resultado.push(actual.valor);
        actual = direccion === 'adelante' ? actual.proximo : actual.previo;
    }
    return resultado.join(' → ');
}

// Mostrar en consola
console.log("🌐 Lista Enlazada Doble 🌐");
console.log("-------------------------");
console.log("Hacia adelante:", mostrarLista(elementos[0], 'adelante'));
console.log("Hacia atrás:   ", mostrarLista(elementos[elementos.length - 1], 'atras'));

// Mostrar detalles de la estructura
console.log("\n🔍 Detalles de la estructura:");
elementos.forEach((el, i) => {
    console.log(`Nodo ${i}: ${el.previo?.valor || 'null'} ← ${el.valor} → ${el.proximo?.valor || 'null'}`);
});