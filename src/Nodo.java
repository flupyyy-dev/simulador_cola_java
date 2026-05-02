// Nodo utilizado para construir la cola y la pila
public class Nodo {

    Cliente dato;
    Nodo siguiente;

    // Constructor del nodo
    public Nodo(Cliente dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
