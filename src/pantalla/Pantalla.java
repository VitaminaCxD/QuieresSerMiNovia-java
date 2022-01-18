package pantalla;

/**
 *
 * @author VitaminaC
 * @version 1.0
 */
public class Pantalla {

    private int ancho, alto;

    public Pantalla(int ancho, int alto) {
        //Ancho y alto
        this.ancho = ancho;
        this.alto = (int) alto;
    }

    //Getters y setters
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

}
