import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

// Clase principal con el menú del sistema
public class Simulador {

    // Carga clientes desde el archivo y los encola
    public static void cargarArchivo(Cola cola) {
        try (BufferedReader br = new BufferedReader(new FileReader("data/clientes.txt"))) {

            String linea;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");

                Cliente cliente = new Cliente(
                        partes[0],
                        partes[1],
                        partes[2]
                );

                cola.encolar(cliente);
            }

            System.out.println("Clientes cargados correctamente.");

        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
    }

    // Método para validar entrada numérica
    public static int leerEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Ingrese un número válido.");
            sc.next();
        }
        return sc.nextInt();
    }

    public static void main(String[] args) {

        Cola cola = new Cola();
        Pila historial = new Pila();
        Scanner sc = new Scanner(System.in);

        // Cargar clientes automáticamente al iniciar
        cargarArchivo(cola);

        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Ver cola");
            System.out.println("4. Ver historial");
            System.out.println("5. Último atendido");
            System.out.println("6. Salir");

            opcion = leerEntero(sc);
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Servicio: ");
                    String servicio = sc.nextLine();

                    cola.encolar(new Cliente(id, nombre, servicio));
                    break;

                case 2:
                    Cliente atendido = cola.desencolar();

                    if (atendido != null) {
                        historial.push(atendido);
                        System.out.println("Atendido: " + atendido);
                    } else {
                        System.out.println("Cola vacía.");
                    }
                    break;

                case 3:
                    cola.mostrar();
                    break;

                case 4:
                    historial.mostrar();
                    break;

                case 5:
                    Cliente ultimo = historial.peek();
                    if (ultimo != null) {
                        System.out.println("Último atendido: " + ultimo);
                    } else {
                        System.out.println("No hay historial.");
                    }
                    break;

            }

        } while (opcion != 6);

        sc.close();
    }
}
