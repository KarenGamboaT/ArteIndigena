
package formas;

import java.awt.Color;
import java.awt.Graphics2D;

public class Triangulo extends Figura {
    public Triangulo(int x, int y, int tamano, Color color) {
        super(x, y, tamano, color);
    }

    @Override
    public void dibujar(Graphics2D g) {
        g.setColor(color);
        int[] xPoints = {x, x - tamano / 2, x + tamano / 2};
        int[] yPoints = {y - tamano / 2, y + tamano / 2, y + tamano / 2};
        g.fillPolygon(xPoints, yPoints, 3);
    }
}