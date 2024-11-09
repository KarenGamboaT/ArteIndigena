
package formas;

import java.awt.Color;
import java.awt.Graphics2D;

public class Circulo extends Figura {
    public Circulo(int x, int y, int tamano, Color color) {
        super(x, y, tamano, color);
    }

    @Override
    public void dibujar(Graphics2D g) {
        g.setColor(color);
        g.fillOval(x - tamano / 2, y - tamano / 2, tamano, tamano);
    }
}