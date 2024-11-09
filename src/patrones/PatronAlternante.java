
package patrones;

import formas.Circulo;
import formas.Cuadrado;
import formas.Rombo;
import java.awt.Color;
import java.awt.Graphics2D;

public class PatronAlternante {
    private int filas;
    private int columnas;
    private int tamanoFigura;
    private String tipoFigura1;
    private Color colorFigura1;
    private String tipoFigura2;
    private Color colorFigura2;

    // Constructor para el patrón alternante
    public PatronAlternante(int filas, int columnas, int tamanoFigura, 
                            String tipoFigura1, Color colorFigura1, 
                            String tipoFigura2, Color colorFigura2) {
        this.filas = filas;
        this.columnas = columnas;
        this.tamanoFigura = tamanoFigura;
        this.tipoFigura1 = tipoFigura1;
        this.colorFigura1 = colorFigura1;
        this.tipoFigura2 = tipoFigura2;
        this.colorFigura2 = colorFigura2;
    }

    // Método para dibujar el patrón alternante
    public void dibujarAlternante(Graphics2D g) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int x = j * tamanoFigura;
                int y = i * tamanoFigura;

                    switch (tipoFigura1) {
                        case "Círculo":
                            Circulo circulo = new Circulo(x + tamanoFigura / 2, y + tamanoFigura / 2, tamanoFigura / 2, colorFigura1);
                            circulo.dibujar(g);
                            break;
                        case "Cuadrado":
                            Cuadrado cuadrado = new Cuadrado(x, y, tamanoFigura, colorFigura1);
                            cuadrado.dibujar(g);
                            break;
                        case "Rombo":
                            Rombo rombo = new Rombo(x, y, tamanoFigura, colorFigura1);
                            rombo.dibujar(g);
                        break;
                        // Agregar más figuras si es necesario
                    }
                    switch (tipoFigura2) {
                        case "Círculo":
                            Circulo circulo1 = new Circulo(x + tamanoFigura / 2, y + tamanoFigura / 2, tamanoFigura / 2, colorFigura2);
                            circulo1.dibujar(g);
                            break;
                        case "Cuadrado":
                            Cuadrado cuadrado1 = new Cuadrado(x, y, tamanoFigura, colorFigura2);
                            cuadrado1.dibujar(g);
                            break;
                        case "Rombo":
                            Rombo rombo = new Rombo(x, y, tamanoFigura, colorFigura2);
                            rombo.dibujar(g);
                        break;
                        // Agregar más figuras si es necesario
         
                }
            }
        }
    }
}
