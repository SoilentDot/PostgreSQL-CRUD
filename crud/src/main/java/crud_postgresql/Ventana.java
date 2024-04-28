package crud_postgresql;

import javax.swing.JFrame;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class Ventana extends JFrame {

    Toolkit t = Toolkit.getDefaultToolkit();
    int ancho = (int) t.getScreenSize().getWidth();
    int altura = (int) t.getScreenSize().getHeight();
    Rectangle pantalla = new Rectangle(ancho / 2, altura / 2);
    Panel p = new Panel();

    Ventana() {
        add(p);
        
        setDefaultCloseOperation(3);
        setTitle("CRUD w PostgreSQL");
        setBounds(pantalla);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
