
package prueba;

import formas.Cuadrado;
import formas.Rombo;
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
            Color color = Color.BLUE;
            int tamanoFigura = 30;
            PatronZigZag zigzag = new PatronZigZag(10, 20, tamanoFigura, color,0);
            zigzag.dibujarZigZag((Graphics2D) g);
        }
    }
    
    class PanelPatronMosaico extends JPanel {
    @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);           
            Rombo rombo = new Rombo(5,5,50, Color.black);
            
            Cuadrado cuadrado1 = new Cuadrado(5,5,50,Color.black);
            
            PatronMosaico mosaico = new PatronMosaico(5, 5, 50, cuadrado1);
            mosaico.dibujarMosaico((Graphics2D) g);
        }
    }
        
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