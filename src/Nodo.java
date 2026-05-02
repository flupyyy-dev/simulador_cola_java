// Implementación de una Cola (FIFO)
public class Cola {

    private Nodo frente;
    private Nodo fin;

    // Verifica si la cola está vacía
    public boolean estaVacia() {
        return frente == null;
    }

    // Agrega un cliente al final de la cola
    public void encolar(Cliente cliente) {
        Nodo nuevo = new Nodo(cliente);

        if (estaVacia()) {
            frente = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    // Elimina el primer cliente de la cola
    public Cliente desencolar() {
        if (estaVacia()) return null;

        Cliente cliente = frente.dato;
        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        return cliente;
    }

    // Muestra todos los clientes en la cola
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía.");
            return;
        }

        Nodo actual = frente;

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}
