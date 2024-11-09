
package formas;

import java.awt.Color;
import java.awt.Graphics2D;

public class Cuadrado extends Figura {
    public Cuadrado(int x, int y, int tamano, Color color) {
        super(x, y, tamano, color);
    }

    @Override
    public void dibujar(Graphics2D g) {
        g.setColor(color);
        g.fillRect(x, y, tamano, tamano);
    }
}