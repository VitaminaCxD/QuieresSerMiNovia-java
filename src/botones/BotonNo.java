package botones;

import java.util.Random;
import javax.swing.JButton;
import pantalla.Pantalla;

/**
 *
 * @author VitaminaC
 * @version 1.0
 */
public class BotonNo {

    Random r = new Random();

    public void botonNo(JButton boton, Pantalla pantalla) {
        boton.setLocation(generacionX(pantalla.getAncho()), generacionY(pantalla.getAlto()));
    }

    private int generacionX(int x) {
        int xRandom = r.nextInt(x);

        if (xRandom < (x - 100)) {
            return xRandom;
        }

        return generacionX(x);
    }

    private int generacionY(int y) {
        int yRandom = r.nextInt(y);

        if (yRandom < (y - 100)) {
            return yRandom;
        }

        return generacionX(y);
    }

}
