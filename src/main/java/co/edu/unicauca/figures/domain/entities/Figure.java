/*
 * 
 */
package co.edu.unicauca.figures.domain.entities;

/**
 * Clase abstracta que representa una figura geométrica.
 * Define el comportamiento común que deben implementar todas las figuras.
 * 
 * @author Ana Sofia Arango Yanza
 * @author Juan Diego Gomez Garces
 * @version 1.0
 */
public abstract class Figure {
    
    /**
     * Calcula el área de la figura geométrica.
     * @return área de la figura como un valor double
     */
    public abstract double calcularArea();
    
    /**
     * Calcula el perímetro de la figura geométrica.
     * @return perímetro de la figura como un valor double
     */
    public abstract double calcularPerimetro();
    
}
