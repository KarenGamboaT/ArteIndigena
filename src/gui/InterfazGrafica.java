package gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import formas.Circulo;
import formas.Cuadrado;
import formas.Figura;
import formas.Rombo;
import formas.Triangulo;
import patrones.PatronZigZag;
import patrones.PatronMosaico;
import patrones.PatronAlternante;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InterfazGrafica extends JFrame {
    private JPanel[] paneles = new JPanel[4];
    private JButton[] botones = new JButton[4];
    private String[] nombresBotones = {"Panel 1", "Panel 2", "Panel 3", "Panel 4"};
    private JButton guardarImagenBtn;
    private BufferedImage fondo;

    public InterfazGrafica() {
        setTitle("Interfaz de Patrones");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Cargar imagen de fondo
        try {
            fondo = ImageIO.read(getClass().getResource("/gui/imagen.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar la imagen de fondo");
        }

        // Panel principal para componentes
        JPanel mainPanel = new JPanel(new GridBagLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (fondo != null) {
                    g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };
        mainPanel.setOpaque(false); 
        mainPanel.setPreferredSize(new Dimension((int) (800 * 0.8), (int) (600 * 0.8)));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(2, 2, 2, 2);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridwidth = 1;

        // Crear botones y paneles
        for (int i = 0; i < 4; i++) {
            // Configuración del botón
            botones[i] = new JButton();
            ImageIcon iconoImagen = new ImageIcon(getClass().getResource("/gui/imagen2.jpg"));
            Image imagenBoton = iconoImagen.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            botones[i].setIcon(new ImageIcon(imagenBoton));
            botones[i].setForeground(Color.WHITE);
            botones[i].setFont(new Font("Arial", Font.BOLD, 16));
            botones[i].setBorderPainted(false);
            botones[i].setContentAreaFilled(false);
            botones[i].setFocusPainted(false);
            botones[i].setHorizontalTextPosition(SwingConstants.CENTER);
            botones[i].setVerticalTextPosition(SwingConstants.CENTER);

            int index = i;
            botones[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    seleccionarPatron(index);
                }
            });

            gbc.gridx = 0;
            gbc.gridy = i;
            mainPanel.add(botones[i], gbc);

            // Configuración del panel
            paneles[i] = new JPanel() {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(900, 80);
                }

                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    setDoubleBuffered(true);
                }
            };
            paneles[i].setBackground(new Color(255, 255, 255, 150));
            gbc.gridx = 1;
            mainPanel.add(paneles[i], gbc);
        }

        // Botón para guardar imagen
        guardarImagenBtn = new JButton("Guardar Captura");
        guardarImagenBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarImagenPatrones();
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        mainPanel.add(guardarImagenBtn, gbc);

        add(mainPanel, BorderLayout.CENTER);
    }

    private Color obtenerColorAztecaAleatorio() {
        List<Color> coloresAztecas = new ArrayList<>();
        coloresAztecas.add(new Color(139, 0, 0)); // Rojo oscuro
        coloresAztecas.add(new Color(0, 100, 0)); // Verde oscuro
        coloresAztecas.add(new Color(0, 0, 139)); // Azul oscuro
        coloresAztecas.add(new Color(255, 215, 0)); // Dorado
        coloresAztecas.add(new Color(0, 0, 0)); // Negro
        Random random = new Random();
        return coloresAztecas.get(random.nextInt(coloresAztecas.size()));
    }

    private void seleccionarPatron(int index) {
        String[] patrones = {"Mosaico", "Zigzag", "Alternante"};
        String seleccion = (String) JOptionPane.showInputDialog(
                this,
                "Selecciona un patrón:",
                "Opciones de Patrón",
                JOptionPane.PLAIN_MESSAGE,
                null,
                patrones,
                patrones[0]
        );

        if (seleccion != null) {
            switch (seleccion) {
                case "Mosaico":
                    dibujarMosaico(paneles[index]);
                    break;
                case "Zigzag":
                    dibujarZigZag(paneles[index]);
                    break;
                case "Alternante":
                    dibujarAlternante(paneles[index]);
                    break;
            }
        }
    }

    private void dibujarMosaico(JPanel panel) {
        BufferedImage imagen = new BufferedImage(panel.getWidth(), panel.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = imagen.createGraphics();

        String[] figuras = {"Cuadrado", "Círculo", "Triángulo", "Rombo"};
        String seleccionFigura = (String) JOptionPane.showInputDialog(
                this,
                "Selecciona una figura para el mosaico:",
                "Opciones de Figura",
                JOptionPane.PLAIN_MESSAGE,
                null,
                figuras,
                figuras[0]
        );

        if (seleccionFigura != null) {
            Figura figura = null;
            switch (seleccionFigura) {
                case "Cuadrado":
                    figura = new Cuadrado(20, 20, 50, obtenerColorAztecaAleatorio());
                    break;
                case "Círculo":
                    figura = new Circulo(20, 20, 50, obtenerColorAztecaAleatorio());
                    break;
                case "Triángulo":
                    figura = new Triangulo(20, 20, 50, obtenerColorAztecaAleatorio());
                    break;
                case "Rombo":
                    figura = new Rombo(20, 20, 50, obtenerColorAztecaAleatorio());
                    break;
            }
            if (figura != null) {
                PatronMosaico mosaico = new PatronMosaico(20, 20, 50, figura);
                mosaico.dibujarMosaico(g);
            }
        }
        g.dispose();
        panel.getGraphics().drawImage(imagen, 0, 0, panel.getWidth(), panel.getHeight(), panel);
        panel.putClientProperty("backgroundImage", imagen);
    }

    private void dibujarZigZag(JPanel panel) {
        BufferedImage imagen = new BufferedImage(panel.getWidth(), panel.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = imagen.createGraphics();
        PatronZigZag zigzag = new PatronZigZag(200, 200, 30, obtenerColorAztecaAleatorio(), 5);
        zigzag.dibujarZigZag(g);
        g.dispose();
        panel.getGraphics().drawImage(imagen, 0, 0, panel.getWidth(), panel.getHeight(), panel);
        panel.putClientProperty("backgroundImage", imagen);
    }

    private void dibujarAlternante(JPanel panel) {
        BufferedImage imagen = new BufferedImage(panel.getWidth(), panel.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = imagen.createGraphics();

        String[] figuras = {"Cuadrado", "Círculo", "Triángulo", "Rombo"};
        String seleccionFigura1 = (String) JOptionPane.showInputDialog(this, "Selecciona la primera figura para el alternante:", "Opciones de Figura", JOptionPane.PLAIN_MESSAGE, null, figuras, figuras[0]);
        String seleccionFigura2 = (String) JOptionPane.showInputDialog(this, "Selecciona la segunda figura para el alternante:", "Opciones de Figura", JOptionPane.PLAIN_MESSAGE, null, figuras, figuras[0]);

        if (seleccionFigura1 != null && seleccionFigura2 != null) {
            Figura figura1 = crearFigura(seleccionFigura1);
            Figura figura2 = crearFigura(seleccionFigura2);
            if (figura1 != null && figura2 != null) {
                PatronAlternante alternante = new PatronAlternante(20, 20, 50, figura1, obtenerColorAztecaAleatorio(), figura2, obtenerColorAztecaAleatorio());
                alternante.dibujarAlternante(g);
            }
        }
        g.dispose();
        panel.getGraphics().drawImage(imagen, 0, 0, panel.getWidth(), panel.getHeight(), panel);
        panel.putClientProperty("backgroundImage", imagen);
    }

    private Figura crearFigura(String tipo) {
        switch (tipo) {
            case "Cuadrado": return new Cuadrado(20, 20, 50, obtenerColorAztecaAleatorio());
            case "Círculo": return new Circulo(20, 20, 50, obtenerColorAztecaAleatorio());
            case "Triángulo": return new Triangulo(20, 20, 50, obtenerColorAztecaAleatorio());
            case "Rombo": return new Rombo(20, 20, 50, obtenerColorAztecaAleatorio());
            default: return null;
        }
    }

    private void guardarImagenPatrones() {
        int width = paneles[0].getWidth();
        int height = paneles[0].getHeight() * 4;
        BufferedImage capturaPatrones = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = capturaPatrones.createGraphics();

        for (int i = 0; i < paneles.length; i++) {
            BufferedImage panelImagen = (BufferedImage) paneles[i].getClientProperty("backgroundImage");
            if (panelImagen != null) {
                int y = i * panelImagen.getHeight();
                g2d.drawImage(panelImagen, 0, y, null);
            }
        }

        g2d.dispose();

        try {
            File archivo = new File("captura_solo_patrones.png");
            ImageIO.write(capturaPatrones, "png", archivo);
            JOptionPane.showMessageDialog(this, "Imagen guardada como captura_solo_patrones.png");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar la imagen");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InterfazGrafica interfaz = new InterfazGrafica();
            interfaz.setVisible(true);
        });
    }
}
