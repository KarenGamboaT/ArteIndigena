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
        for (int i = 0; i < filas; i++) {
            int y = i * (tamanoFigura + espacioEntreLineas); // Posición inicial en y para cada fila
            boolean direccion = true; // Alterna entre arriba y abajo para formar el zigzag

            for (int j = 0; j < columnas; j++) {
                int x = j * tamanoFigura; // Posición inicial en x para cada columna de la fila

                // Dibuja una línea en zigzag en la dirección indicada
                Linea linea = new Linea(x, y, tamanoFigura, tamanoFigura, color, direccion);
                linea.dibujar(g);

                // Alterna la dirección para el próximo segmento del zigzag en la misma fila
                direccion = !direccion;
            }
        }
    }
}

