/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.figures.domain.entities;

/**
 * Clase que representa un triángulo.
 * Extiende de la clase Figure e implementa los métodos para calcular área y perímetro.
 * 
 * @author Ana Sofia Arango Yanza
 * @author Juan Diego Gomez Garces
 * @version 1.0
 */
public class Triangle extends Figure {
    
    private double base;
    private double height;
    private double side2;
    private double side3;
    
    /**
     * Constructor para crear un nuevo triángulo.
     * 
     * @param base base del triángulo
     * @param height altura del triángulo
     * @param side2 segundo lado del triángulo
     * @param side3 tercer lado del triángulo
     * @throws IllegalArgumentException si algún lado o la altura es menor o igual a cero,
     *         o si los lados no pueden formar un triángulo válido
     */
    public Triangle(double base, double height, double side2, double side3) {
        if (base <= 0 || height <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalArgumentException("Todos los lados y la altura deben ser mayores que cero");
        }
        if (!isValidTriangle(base, side2, side3)) {
            throw new IllegalArgumentException("Los lados no pueden formar un triangulo valido");
        }
        this.base = base;
        this.height = height;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    /**
     * Verifica si los lados pueden formar un triángulo válido usando la desigualdad triangular.
     * 
     * @param a primer lado
     * @param b segundo lado
     * @param c tercer lado
     * @return true si los lados pueden formar un triángulo válido, false en caso contrario
     */
    private boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }
    
    @Override
    public double calcularArea() {
        return (base * height) / 2;
    }
    
    @Override
    public double calcularPerimetro() {
        return base + side2 + side3;
    }
    
    
    /**
     * Obtiene la longitud de la base del triángulo.
     * 
     * @return la longitud de la base como valor double
     */
    public double getBase() {
        return base;
    }
    
    /**
     * Establece la longitud de la base del triángulo.
     * Verifica que la nueva base sea positiva y que forme un triángulo válido
     * con los otros dos lados existentes.
     * 
     * @param base nueva longitud de la base del triángulo
     * @throws IllegalArgumentException si la base es menor o igual a cero o
     *         si la nueva base no puede formar un triángulo válido con los otros lados
     */
    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("La base debe ser mayor que cero");
        }
        if (!isValidTriangle(base, side2, side3)) {
            throw new IllegalArgumentException("La nueva base no forma un triangulo valido");
        }
        this.base = base;
    }
    
    /**
     * Obtiene la altura del triángulo.
     * 
     * @return la altura del triángulo como valor double
     */
    public double getHeight() {
        return height;
    }
    
    /**
     * Establece la altura del triángulo.
     * Verifica que la nueva altura sea un valor positivo.
     * 
     * @param height nueva altura del triángulo
     * @throws IllegalArgumentException si la altura es menor o igual a cero
     */
    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor que cero");
        }
        this.height = height;
    }
    
    /**
     * Obtiene la longitud del segundo lado del triángulo.
     * 
     * @return la longitud del segundo lado como valor double
     */
    public double getSide2() {
        return side2;
    }
    
    /**
     * Establece la longitud del segundo lado del triángulo.
     * Verifica que el nuevo lado sea positivo y que forme un triángulo válido
     * con la base y el tercer lado existentes.
     * 
     * @param side2 nueva longitud del segundo lado del triángulo
     * @throws IllegalArgumentException si el lado es menor o igual a cero o
     *         si el nuevo lado no puede formar un triángulo válido con los otros lados
     */
    public void setSide2(double side2) {
        if (side2 <= 0) {
            throw new IllegalArgumentException("El lado debe ser mayor que cero");
        }
        if (!isValidTriangle(base, side2, side3)) {
            throw new IllegalArgumentException("El nuevo lado no forma un triangulo valido");
        }
        this.side2 = side2;
    }
    
    /**
     * Obtiene la longitud del tercer lado del triángulo.
     * 
     * @return la longitud del tercer lado como valor double
     */
    public double getSide3() {
        return side3;
    }
    
    /**
     * Establece la longitud del tercer lado del triángulo.
     * Verifica que el nuevo lado sea positivo y que forme un triángulo válido
     * con la base y el segundo lado existentes.
     * 
     * @param side3 nueva longitud del tercer lado del triángulo
     * @throws IllegalArgumentException si el lado es menor o igual a cero o
     *         si el nuevo lado no puede formar un triángulo válido con los otros lados
     */
    public void setSide3(double side3) {
        if (side3 <= 0) {
            throw new IllegalArgumentException("El lado debe ser mayor que cero");
        }
        if (!isValidTriangle(base, side2, side3)) {
            throw new IllegalArgumentException("El nuevo lado no forma un triangulo valido");
        }
        this.side3 = side3;
    }
}
