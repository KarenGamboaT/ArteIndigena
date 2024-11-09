
package formas;

import java.awt.Color;
import java.awt.Graphics2D;

public class Rombo extends Figura {
    public Rombo(int x, int y, int tamano, Color color) {
        super(x, y, tamano, color);
    }

    @Override
    public void dibujar(Graphics2D g) {
        g.setColor(color);
        
       
        int[] xPoints = {x, x + tamano / 2, x, x - tamano / 2};
        int[] yPoints = {y - tamano / 2, y, y + tamano / 2, y};
        
        
        g.fillPolygon(xPoints, yPoints, 4);
    }
}