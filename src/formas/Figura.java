
package formas;

import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Figura {
    protected int x, y, tamano;
    protected Color color;

    public Figura(int x, int y, int tamano, Color color) {
        this.x = x;
        this.y = y;
        this.tamano = tamano;
        this.color = color;
    }

    public abstract void dibujar(Graphics2D g);
    
    public Color getColor(){
        return color;
    }
    
    public void setColor(Color newColor){
        this.color = newColor;
    }
    
    public void setX(int newX){
        this.x = newX;
    }
    
       public void setY(int newY){
        this.y = newY;
    }
       
    public Figura newFiguraNewColorNewPosicion(int newX, int newY, Color newColor) {
        if (this instanceof Cuadrado) {
            return new Cuadrado(newX, newY, tamano, newColor);
        } else if (this instanceof Circulo) {
            return new Circulo(newX, newY, tamano, newColor);
        } else if (this instanceof Triangulo) {
            return new Triangulo(newX, newY, tamano, newColor);
        } else if (this instanceof Rombo) {
            return new Rombo(newX, newY, tamano, newColor);
        } else {
            return null; // En caso de que se agregue un nuevo tipo de figura en el futuro
        }
    }
}

