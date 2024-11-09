
package prueba;

import formas.Cuadrado;
import formas.Figura;
//import formas.Triangulo;
import formas.Rombo;
//import formas.Circulo;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import patrones.PatronZigZag;
import patrones.PatronMosaico;
import patrones.PatronAlternante;

public class PruebaPatrones extends JFrame {

    public PruebaPatrones() {
        setTitle("Prueba de Patrones");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 3)); // Paneles en fila

        // Crear paneles para cada patrón
        add(new PanelPatronZigZag());
        add(new PanelPatronMosaico());
        add(new PanelPatronAlternante());
    }

    // Panel para probar el patrón Zigzag
    class PanelPatronZigZag extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Ya no necesitas crear una figura como Cuadrado, Triangulo, etc.
            // Solo pasas el tamaño de la figura y el color que desees.

            Color color = Color.BLUE; // Puedes usar cualquier color que desees
            int tamanoFigura = 30;    // El tamaño de cada "segmento" del zigzag
            PatronZigZag zigzag = new PatronZigZag(10, 20, tamanoFigura, color,0); // Sin figura, solo tamaño y color
            zigzag.dibujarZigZag((Graphics2D) g); // Llama al método para dibujar el zigzag
        }
    }
    class PanelPatronMosaico extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Cuadrado cuadrado = new Cuadrado(1,1,1,Color.YELLOW);
            Rombo rombo = new Rombo(1,1,1,Color.BLACK);
            //Triangulo triangulo = new Triangulo (1, 1, 1, Color.RED);
            //Circulo circulo = new Circulo (1, 1, 1, Color.YELLOW);
            
            PatronMosaico mosaico = new PatronMosaico(5, 5, 50, cuadrado, Color.YELLOW, rombo, Color.BLACK);
            mosaico.dibujarMosaico((Graphics2D) g);
        }
    }

    // Panel para probar el patrón Alternante
    class PanelPatronAlternante extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            PatronAlternante alternante = new PatronAlternante(5, 5, 50, "Rombo", Color.GREEN, "Círculo", Color.ORANGE);
            alternante.dibujarAlternante((Graphics2D) g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PruebaPatrones prueba = new PruebaPatrones();
            prueba.setVisible(true);
        });
    }
}