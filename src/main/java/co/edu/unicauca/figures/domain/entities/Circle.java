/*
 * 
 */
package co.edu.unicauca.figures.domain.entities;


/**
 * Clase que representa un círculo.
 * Extiende de la clase Figure e implementa los métodos para calcular área y perímetro.
 * 
 * @author Ana Sofia Arango Yanza
 * @author Juan Diego Gomez Garces
 * @version 1.0
 */
public class Circle extends Figure {

    private double radius;

    
    /**
     * Constructor para crear un nuevo círculo.
     * @param radius radio del círculo
     * @throws IllegalArgumentException si el radio es menor o igual a cero
     */
    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("El radio debe ser mayor que cero");
        }
        this.radius = radius;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radius;
    }
    
    /**
     * Obtiene el radio del círculo.
     * @return radio como valor double
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Establece el radio del círculo.
     * @param radius nuevo radio
     * @throws IllegalArgumentException si el radio es menor o igual a cero
     */
    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("El radio debe ser mayor que cero");
        }
        this.radius = radius;
    }
}
