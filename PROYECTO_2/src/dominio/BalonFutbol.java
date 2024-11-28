package dominio;
public class BalonFutbol extends Balon {

    public BalonFutbol(double precio, String tamaño) {
        super(precio, tamaño);
    }

    /**
     * Representación en cadena de texto para balón de fútbol.
     * 
     * @return Información específica del balón de fútbol.
     */
    @Override
    public String toString() {
        return "Balón de Fútbol - " + super.toString();
    }
}
