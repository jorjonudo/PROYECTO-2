package dominio;
public abstract class Balon {
    private double precio;
    private String tamaño;

    /**
     * Constructor de la clase Balon.
     *
     * @param precio El precio del balón.
     * @param tamaño El tamaño del balón.
     */
    public Balon(double precio, String tamaño) {
        this.precio = precio;
        this.tamaño = tamaño;
    }

    /**
     * Obtiene el precio del balón.
     *
     * @return El precio del balón.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Representación en cadena de texto del balón.
     *
     * @return La información del balón en formato legible.
     */
    @Override
    public String toString() {
        return "Precio: $" + precio + ", Tamaño: " + tamaño;
    }
}
