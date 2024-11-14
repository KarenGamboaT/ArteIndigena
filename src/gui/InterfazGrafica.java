
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import patrones.PatronMosaico;
import formas.Circulo;
import formas.Triangulo;
import formas.Cuadrado;
import formas.Figura;
import formas.Rombo;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import gui.VentanaMosaico;
import patrones.PatronZigZag;


public class InterfazGrafica extends javax.swing.JFrame {
    private javax.swing.JPanel PatronAlternante;
    private javax.swing.JPanel PatronZigZagUno;
    private javax.swing.JPanel PatronZigZagDos;
    
   

   
private void abrirVentanaMosaico(){
    VentanaMosaico ventanaMosaico = new VentanaMosaico(this);
    ventanaMosaico.setVisible(true);
}
    public InterfazGrafica() {
        
        initComponents();
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        BotonZigZagDos = new javax.swing.JButton();
        PanelAlternante = new javax.swing.JPanel();
        PanelZigZagUno = new javax.swing.JPanel();
        PanelMosaico = new javax.swing.JPanel();
        PanelZigZagDos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BotonAlternante = new javax.swing.JButton();
        BotonZigZagUno = new javax.swing.JButton();
        BotonMosaico = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane2.setMaximumSize(new java.awt.Dimension(1550, 800));
        jLayeredPane2.setMinimumSize(new java.awt.Dimension(1550, 800));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Sin-título-5.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1300, 800));
        jLabel2.setMinimumSize(new java.awt.Dimension(1300, 800));
        jLayeredPane2.add(jLabel2);
        jLabel2.setBounds(0, -20, 1540, 820);

        BotonZigZagDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/ICONOO.jpg"))); // NOI18N
        BotonZigZagDos.setContentAreaFilled(false);
        BotonZigZagDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonZigZagDosActionPerformed(evt);
            }
        });
        jLayeredPane2.setLayer(BotonZigZagDos, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane2.add(BotonZigZagDos);
        BotonZigZagDos.setBounds(150, 510, 80, 80);

        PanelAlternante.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout PanelAlternanteLayout = new javax.swing.GroupLayout(PanelAlternante);
        PanelAlternante.setLayout(PanelAlternanteLayout);
        PanelAlternanteLayout.setHorizontalGroup(
            PanelAlternanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        PanelAlternanteLayout.setVerticalGroup(
            PanelAlternanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLayeredPane2.setLayer(PanelAlternante, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane2.add(PanelAlternante);
        PanelAlternante.setBounds(280, 200, 1060, 100);

        PanelZigZagUno.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout PanelZigZagUnoLayout = new javax.swing.GroupLayout(PanelZigZagUno);
        PanelZigZagUno.setLayout(PanelZigZagUnoLayout);
        PanelZigZagUnoLayout.setHorizontalGroup(
            PanelZigZagUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        PanelZigZagUnoLayout.setVerticalGroup(
            PanelZigZagUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLayeredPane2.setLayer(PanelZigZagUno, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane2.add(PanelZigZagUno);
        PanelZigZagUno.setBounds(280, 300, 1060, 100);

        PanelMosaico.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout PanelMosaicoLayout = new javax.swing.GroupLayout(PanelMosaico);
        PanelMosaico.setLayout(PanelMosaicoLayout);
        PanelMosaicoLayout.setHorizontalGroup(
            PanelMosaicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        PanelMosaicoLayout.setVerticalGroup(
            PanelMosaicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLayeredPane2.setLayer(PanelMosaico, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane2.add(PanelMosaico);
        PanelMosaico.setBounds(280, 400, 1060, 100);

        PanelZigZagDos.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout PanelZigZagDosLayout = new javax.swing.GroupLayout(PanelZigZagDos);
        PanelZigZagDos.setLayout(PanelZigZagDosLayout);
        PanelZigZagDosLayout.setHorizontalGroup(
            PanelZigZagDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        PanelZigZagDosLayout.setVerticalGroup(
            PanelZigZagDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLayeredPane2.setLayer(PanelZigZagDos, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane2.add(PanelZigZagDos);
        PanelZigZagDos.setBounds(280, 500, 1060, 100);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/presiona.jpg"))); // NOI18N
        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane2.add(jLabel3);
        jLabel3.setBounds(130, 130, 140, 70);

        BotonAlternante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/ICONOO.jpg"))); // NOI18N
        BotonAlternante.setContentAreaFilled(false);
        BotonAlternante.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                BotonAlternanteComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                BotonAlternanteComponentRemoved(evt);
            }
        });
        BotonAlternante.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                BotonAlternanteComponentShown(evt);
            }
        });
        BotonAlternante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAlternanteActionPerformed(evt);
            }
        });
        jLayeredPane2.setLayer(BotonAlternante, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane2.add(BotonAlternante);
        BotonAlternante.setBounds(150, 210, 80, 80);

        BotonZigZagUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/ICONOO.jpg"))); // NOI18N
        BotonZigZagUno.setContentAreaFilled(false);
        BotonZigZagUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonZigZagUnoActionPerformed(evt);
            }
        });
        jLayeredPane2.setLayer(BotonZigZagUno, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane2.add(BotonZigZagUno);
        BotonZigZagUno.setBounds(150, 310, 80, 80);

        BotonMosaico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/ICONOO.jpg"))); // NOI18N
        BotonMosaico.setContentAreaFilled(false);
        BotonMosaico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMosaicoActionPerformed(evt);
            }
        });
        jLayeredPane2.setLayer(BotonMosaico, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane2.add(BotonMosaico);
        BotonMosaico.setBounds(150, 410, 80, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1550, Short.MAX_VALUE)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonZigZagDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonZigZagDosActionPerformed
        PatronZigZag patronZigZag2 = new PatronZigZag(100, 100, 30, Color.BLUE, 10);
        Graphics g = PanelZigZagDos.getGraphics();
        patronZigZag2.dibujarZigZag((Graphics2D) g);
        
    }//GEN-LAST:event_BotonZigZagDosActionPerformed

    private void BotonAlternanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAlternanteActionPerformed
       
        VentanaAlternante escogeFiguras = new VentanaAlternante();
        escogeFiguras.setSize(400,400);
        escogeFiguras.setVisible(true);     
    }//GEN-LAST:event_BotonAlternanteActionPerformed

    private void BotonZigZagUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonZigZagUnoActionPerformed
        PatronZigZag patronZigZag1 = new PatronZigZag(100, 100, 30, Color.RED, 10);
        Graphics g = PanelZigZagUno.getGraphics();
        patronZigZag1.dibujarZigZag((Graphics2D) g);
        
    }//GEN-LAST:event_BotonZigZagUnoActionPerformed

    private void BotonMosaicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMosaicoActionPerformed
       
        VentanaMosaico escogeFigura = new VentanaMosaico(this);
        escogeFigura.setSize(400,400);
        escogeFigura.setVisible(true);
        PanelMosaico.repaint();  // Fuerza la actualización del panel

    }//GEN-LAST:event_BotonMosaicoActionPerformed

    private void BotonAlternanteComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_BotonAlternanteComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAlternanteComponentAdded

    private void BotonAlternanteComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_BotonAlternanteComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAlternanteComponentRemoved

    private void BotonAlternanteComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BotonAlternanteComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAlternanteComponentShown

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAlternante;
    private javax.swing.JButton BotonMosaico;
    private javax.swing.JButton BotonZigZagDos;
    private javax.swing.JButton BotonZigZagUno;
    private javax.swing.JPanel PanelAlternante;
    private javax.swing.JPanel PanelMosaico;
    private javax.swing.JPanel PanelZigZagDos;
    private javax.swing.JPanel PanelZigZagUno;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public JPanel getPanelMosaico(){
    return this.PanelMosaico;
    }
    void dibujarMosaico(String figura) {
    panelMosaico.repaint();
        Graphics g = panelMosaico.getGraphics();

        // Dependiendo de la figura seleccionada, dibujamos una forma
        switch (figura) {
            case "Cuadrado":
                dibujarCuadrado(g);
                break;
            case "Circulo":
                dibujarCirculo(g);
                break;
            case "Triangulo":
                dibujarTriangulo(g);
                break;
            case "Rombo":
                dibujarRombo(g);
                break;
            default:
                break;
        }
    }

    // Método para dibujar un cuadrado
    private void dibujarCuadrado(Graphics g) {
        g.setColor(Color.BLUE);  // Establecemos el color del cuadrado
        g.fillRect(50, 50, 100, 100);  // Dibujamos un cuadrado
    }

    // Método para dibujar un círculo
    private void dibujarCirculo(Graphics g) {
        g.setColor(Color.RED);  // Establecemos el color del círculo
        g.fillOval(50, 50, 100, 100);  // Dibujamos un círculo
    }

    // Método para dibujar un triángulo
    private void dibujarTriangulo(Graphics g) {
        g.setColor(Color.GREEN);  // Establecemos el color del triángulo
        int[] xPoints = {50, 150, 100};  // Coordenadas x de los puntos del triángulo
        int[] yPoints = {50, 50, 150};  // Coordenadas y de los puntos del triángulo
        g.fillPolygon(xPoints, yPoints, 3);  // Dibujamos un triángulo
    }

    // Método para dibujar un rombo
    private void dibujarRombo(Graphics g) {
        g.setColor(Color.YELLOW);  // Establecemos el color del rombo
        int[] xPoints = {100, 150, 100, 50};  // Coordenadas x del rombo
        int[] yPoints = {50, 100, 150, 100};  // Coordenadas y del rombo
        g.fillPolygon(xPoints, yPoints, 4);  // Dibujamos un rombo
    }

    private static class panelMosaico {

        private static Graphics getGraphics() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void repaint() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public panelMosaico() {
        }
    }
}
  
    

    

