
package formas;

import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Figura {
    protected int x, y, tamano;
    protected Color color;

    public Figura(int x, int y, int tamano, Color color) {
        this.x = x;
        this.y = y;
        this.tamano = tamano;
        this.color = color;
    }

    public abstract void dibujar(Graphics2D g);
    
    public Color getColor(){
        return color;
    }
}

