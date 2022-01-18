package botones;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author VitaminaC
 * @version 1.0
 */
public class BotonSi {

    ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/corazon.png"));

    public void botonSi() {
        JOptionPane.showMessageDialog(null, "¡No me esperaba que aceptarás antes de tiempo :0!", "Aceptaste.", JOptionPane.PLAIN_MESSAGE, icono);

        try {
            Thread.sleep(1000);
            System.exit(0);
        } catch (InterruptedException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }

}
