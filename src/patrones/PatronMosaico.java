
package patrones;

import formas.Circulo;
import formas.Cuadrado;
import formas.Figura;
import formas.Rombo;
import formas.Triangulo;
import java.awt.Color;
import java.awt.Graphics2D;

public class PatronMosaico {
    private int filas;
    private int columnas;
    private int tamanoFigura;
    private String tipoFigura1; 
    private Color colorFigura1;
    private String tipoFigura2; 
    private Color colorFigura2;
    private final Figura figura;
    private final Figura figura2;

    public PatronMosaico(int filas, int columnas, int tamanoFigura, Figura figura, Color colorFigura1, Figura figura2, Color colorFigura2) {
        this.filas = filas;
        this.columnas = columnas;
        this.tamanoFigura = tamanoFigura;
        this.figura = figura;
        this.colorFigura1 = colorFigura1;
        this.figura2 = figura2;
        this.colorFigura2 = colorFigura2;
    }

    public void dibujarMosaico(Graphics2D g) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int x = j * tamanoFigura;
                int y = i * tamanoFigura;
                Circulo cuadrado1 = new Circulo(1,1,1,Color.BLACK);
                System.out.print("-------------------------------");

        
                figura.dibujar(g);
                figura2.dibujar(g);
                
                Cuadrado cuadrado = new Cuadrado(x + tamanoFigura / 2, y + tamanoFigura / 2, tamanoFigura / 2, colorFigura1);
                cuadrado.dibujar(g);
                
               Rombo rombo = new Rombo(x + tamanoFigura / 2, y + tamanoFigura / 2, tamanoFigura / 2, colorFigura2);
               rombo.dibujar(g);
                
               // Circulo circulo = new Circulo(x + tamanoFigura / 2, y + tamanoFigura / 2, tamanoFigura / 2, colorFigura1);
                //circulo.dibujar(g);
                
               // Triangulo triangulo = new Triangulo (x + tamanoFigura / 2, y + tamanoFigura / 2, tamanoFigura / 2 , colorFigura2);
                //triangulo.dibujar(g);
                
                
            }
        }
    }
}
