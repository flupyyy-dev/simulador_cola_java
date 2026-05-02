public class Pila {

    private Nodo cima;

    // Verifica si la pila está vacía
    public boolean estaVacia() {
        return cima == null;
    }

    // Agrega un cliente al historial (push)
    public void push(Cliente cliente) {
        Nodo nuevo = new Nodo(cliente);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    // Elimina el último cliente atendido
    public Cliente pop() {
        if (estaVacia()) return null;

        Cliente cliente = cima.dato;
        cima = cima.siguiente;
        return cliente;
    }

    // Devuelve el último cliente atendido sin eliminarlo
    public Cliente peek() {
        if (estaVacia()) return null;
        return cima.dato;
    }

    // Muestra el historial completo
    public void mostrar() {
        Nodo actual = cima;

        if (actual == null) {
            System.out.println("Historial vacío.");
            return;
        }

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}
