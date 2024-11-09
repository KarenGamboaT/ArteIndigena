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

    public Linea(int xInicial, int yInicial, int xFinal, int yFinal, Color color) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void dibujar(Graphics2D g) {
        g.setColor(color);
        g.setStroke(new BasicStroke(2)); // Define el grosor de la línea

        int xFinal = x + longitud;
        int yFinal = direccion ? y - tamano : y + tamano; // Alterna dirección

        // Dibuja la línea desde el punto inicial (x, y) hasta el punto final (xFinal, yFinal)
        g.drawLine(x, y, xFinal, yFinal);
    }
}
