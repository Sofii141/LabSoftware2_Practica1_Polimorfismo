/*
 * 
 */
package co.edu.unicauca.figures.domain.entities;

/**
 * Clase que representa un cuadrado.
 * Extiende de la clase Figure e implementa los métodos para calcular área y perímetro.
 * 
 * @author Ana Sofia Arango Yanza
 * @author Juan Diego Gomez Garces
 * @version 1.0
 */

public class Square extends Figure {
    private double side;
   
    /**
     * Constructor para crear un nuevo cuadrado.
     * @param side longitud del lado del cuadrado
     * @throws IllegalArgumentException si el lado es menor o igual a cero
     */
    public Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("El lado del cuadrado debe ser mayor que cero");
        }
        this.side = side;
    }
    
    
    @Override
    public double calcularArea() {
        return side*side;
    }

    @Override
    public double calcularPerimetro() {
        return 4*side;
    }
    
    /**
     * Obtiene la longitud del lado del cuadrado.
     * @return longitud del lado como valor double
     */
    public double getSide() {
        return side;
    }
    
    /**
     * Establece la longitud del lado del cuadrado.
     * @param side nueva longitud del lado
     * @throws IllegalArgumentException si el lado es menor o igual a cero
     */
    public void setSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("El lado del cuadrado debe ser mayor que cero");
        }
        this.side = side;
    }
}
