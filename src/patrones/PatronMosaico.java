package patrones;

import formas.Figura;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PatronMosaico {
    private int filas;
    private int columnas;
    private int tamanoFigura;
    private Figura figura; // Figura base para clonar
    private List<Color> coloresAztecas;

    public PatronMosaico(int filas, int columnas, int tamanoFigura, Figura figura) {
        this.filas = filas;
        this.columnas = columnas;
        this.tamanoFigura = tamanoFigura;
        this.figura = figura;

        // Define los colores representativos de los aztecas
        coloresAztecas = new ArrayList<>();
        coloresAztecas.add(new Color(139, 0, 0));
        coloresAztecas.add(new Color(0, 100, 0));
        coloresAztecas.add(new Color(0, 0, 139));
        coloresAztecas.add(new Color(255, 215, 0)); 
        coloresAztecas.add(new Color(0, 0, 0));
    }

    public void dibujarMosaico(Graphics2D g) {
        // Define los cinco colores representativos de los aztecas
        List<Color> coloresAztecas = new ArrayList<>();
        coloresAztecas.add(new Color(139, 0, 0)); // Rojo oscuro
        coloresAztecas.add(new Color(0, 100, 0)); // Verde oscuro
        coloresAztecas.add(new Color(0, 0, 139)); // Azul oscuro
        coloresAztecas.add(new Color(255, 215, 0)); // Amarillo dorado
        coloresAztecas.add(new Color(0, 0, 0)); // Negro

        Random rand = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int x = j * tamanoFigura;
                int y = i * tamanoFigura;

                // Selecciona un color al azar de la lista de colores
                Color colorActual = coloresAztecas.get(rand.nextInt(coloresAztecas.size()));

                // Crea una nueva instancia de la figura con la posición y color aleatorio
                Figura figuraActual = figura.newFiguraNewColorNewPosicion(x + tamanoFigura / 2, y + tamanoFigura / 2, colorActual);

                // Dibuja la figura en el gráfico
                figuraActual.dibujar(g);
            }
        }
    }
}
