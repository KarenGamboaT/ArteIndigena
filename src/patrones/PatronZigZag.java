package patrones;

import formas.Linea;
import java.awt.Color;
import java.awt.Graphics2D;

public class PatronZigZag {
    private int filas;
    private int columnas;
    private int tamanoFigura;
    private Color color;
    private int espacioEntreLineas;

    public PatronZigZag(int filas, int columnas, int tamanoFigura, Color color, int espacioEntreLineas) {
        this.filas = filas;
        this.columnas = columnas;
        this.tamanoFigura = tamanoFigura;
        this.color = color;
        this.espacioEntreLineas = espacioEntreLineas;
    }

    public void dibujarZigZag(Graphics2D g) {
        for (int j = 0; j < columnas; j++) {
            int xInicial = j * tamanoFigura; // Posición inicial en x para cada columna
            boolean direccion = true; // Alterna entre arriba y abajo para formar el zigzag

            for (int i = 0; i < filas; i++) {
                int yInicial = i * (tamanoFigura + espacioEntreLineas); // Espacio entre filas

                // Dibuja una línea en zigzag en la dirección indicada
                Linea linea = new Linea(xInicial, yInicial, tamanoFigura, tamanoFigura, color, direccion);
                linea.dibujar(g);

                // Alterna la dirección para el próximo segmento del zigzag
                direccion = !direccion;
            }
        }
    }
}

