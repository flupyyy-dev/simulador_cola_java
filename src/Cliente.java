// Clase que representa un cliente del sistema
public class Cliente {

    String id;
    String nombre;
    String servicio;

    // Constructor
    public Cliente(String id, String nombre, String servicio) {
        this.id = id;
        this.nombre = nombre;
        this.servicio = servicio;
    }

    // Representación en texto del cliente
    @Override
    public String toString() {
        return id + " - " + nombre + " (" + servicio + ")";
    }
}
