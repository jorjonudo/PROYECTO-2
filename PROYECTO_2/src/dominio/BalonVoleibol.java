package dominio;
public class BalonVoleibol extends Balon {

    public BalonVoleibol(double precio, String tamaño) {
        super(precio, tamaño);
    }

    /**
     * Representación en cadena de texto para balón de voleibol.
     * 
     * @return Información específica del balón de voleibol.
     */
    @Override
    public String toString() {
        return "Balón de Voleibol - " + super.toString();
    }
}
