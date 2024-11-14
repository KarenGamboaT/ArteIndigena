package patrones;

import formas.Figura;
import java.awt.Color;
import java.awt.Graphics2D;

public class PatronAlternante {
    private int filas;
    private int columnas;
    private int tamanoFigura;
    private Figura figura1; // Figura 1 para el patrón
    private Color colorFigura1;
    private Figura figura2; // Figura 2 para el patrón
    private Color colorFigura2;

    // Constructor para el patrón alternante
    public PatronAlternante(int filas, int columnas, int tamanoFigura, 
                            Figura figura1, Color colorFigura1, 
                            Figura figura2, Color colorFigura2) {
        this.filas = filas;
        this.columnas = columnas;
        this.tamanoFigura = tamanoFigura;
        this.figura1 = figura1;
        this.colorFigura1 = colorFigura1;
        this.figura2 = figura2;
        this.colorFigura2 = colorFigura2;
    }

    // Método para dibujar el patrón alternante
    public void dibujarAlternante(Graphics2D g) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int x = j * tamanoFigura;
                int y = i * tamanoFigura;

                // Alterna entre figura1 y figura2
                Figura figuraActual = (i + j) % 2 == 0 ? 
                    figura1.newFiguraNewColorNewPosicion(x, y, colorFigura1) : 
                    figura2.newFiguraNewColorNewPosicion(x, y, colorFigura2);

                // Dibuja la figura actual en el gráfico
                figuraActual.dibujar(g);
            }
        }
    }
}
