package aplicacion;
import java.util.ArrayList;
import dominio.Balon;

/**
 * Clase que gestiona un catálogo de balones.
 * Permite agregar balones y calcular el total de su precio.
 */
public class CatalogoBalones {

    // Lista para almacenar los balones
    private ArrayList<Balon> balones;

    /**
     * Constructor para inicializar el catálogo.
     */
    public CatalogoBalones() {
        balones = new ArrayList<>();
    }

    /**
     * Agrega un balón al catálogo.
     * @param balon El balón a agregar al catálogo.
     */
    public void agregarBalon(Balon balon) {
        balones.add(balon);
    }

    /**
     * Muestra todos los balones del catálogo.
     */
    public void mostrarCatalogo() {
        if (balones.isEmpty()) {
            System.out.println("El catálogo está vacío.");
        } else {
            System.out.println("\n--- Catálogo de Balones ---");
            for (Balon balon : balones) {
                System.out.println(balon); // Imprime la representación del balón
            }
        }
    }

    /**
     * Calcula el precio total de todos los balones en el catálogo.
     * @return El total de los precios.
     */
    public double calcularTotal() {
        double total = 0;
        for (Balon balon : balones) {
            total += balon.getPrecio(); // Suma el precio de cada balón
        }
        return total;
    }
}
