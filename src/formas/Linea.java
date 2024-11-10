package formas;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

public class Linea extends Figura {
    private int longitud; // Longitud de cada segmento de la línea en zigzag
    private boolean direccion; // true para dirección hacia arriba, false para hacia abajo

    public Linea(int x, int y, int longitud, int tamano, Color color, boolean direccion) {
        super(x, y, tamano, color);
        this.longitud = longitud;
        this.direccion = direccion;
    }

    @Override
    public void dibujar(Graphics2D g) {
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(6));

        int xFinal = x + longitud;
        int yFinal = direccion ? y - tamano : y + tamano; // Alterna dirección

        g.drawLine(x, y, xFinal, yFinal);
    }
}
