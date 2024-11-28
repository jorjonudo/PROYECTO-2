package dominio;
public class BalonBasket extends Balon {

    public BalonBasket(double precio, String tamaño) {
        super(precio, tamaño);
    }

    /**
     * Representación en cadena de texto para balón de baloncesto.
     * 
     * @return Información específica del balón de baloncesto.
     */
    @Override
    public String toString() {
        return "Balón de Baloncesto - " + super.toString();
    }
}
