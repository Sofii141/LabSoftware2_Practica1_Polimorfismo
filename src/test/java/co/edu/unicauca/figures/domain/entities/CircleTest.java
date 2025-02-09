package co.edu.unicauca.figures.domain.entities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase Circle.
 * 
 * Esta clase realiza pruebas para verificar el correcto funcionamiento de los métodos 
 * que calculan el área y el perímetro del círculo, así como la correcta gestión del atributo radio.
 * Incluye validaciones para valores válidos e inválidos del radio.
 * 
 * @author Ana Sofia Arango Yanza
 * @author Juan Diego Gomez Garces
 * @version 1.0
 */
public class CircleTest {

    private Circle circle;

    public CircleTest() {
    }
    /**
     * Configuración inicial antes de cada prueba.
     */
    @BeforeEach
    public void setUp() {
        circle = new Circle(5); // Inicializamos con un radio de 5.0
    }

    /**
     * Test of calcularArea method, of class Circle.
     */
    @Test
    public void testCalcularArea() {
        System.out.println("calcularArea");
        double expResult = 25 * Math.PI;
        double result = circle.calcularArea();
        assertEquals(expResult, result, 0.0001, "El área del circulo no es correcta");
    }

    /**
     * Test of calcularPerimetro method, of class Circle.
     */
    @Test
    public void testCalcularPerimetro() {
        System.out.println("calcularPerimetro");
        double expResult = 2 * Math.PI * 5;
        double result = circle.calcularPerimetro();
        assertEquals(expResult, result, 0.0001, "El perimetro del circulo no es correcto");

    }

    /**
     * Test of getRadius method, of class Circle.
     */
    @Test
    public void testGetRadius() {
        System.out.println("getRadius");
        double expResult = 5;
        double result = circle.getRadius();
        assertEquals(expResult, result, 0.0001, "El radio del circulo no es correcto");
    }

    /**
     * Test of setRadius method, of class Circle.
     */
    @Test
    public void testSetRadius() {
        System.out.println("setRadius");
        double radius = 5;
        circle.setRadius(radius);
        assertEquals(5, circle.getRadius(), "El valor del radio no se actualizó correctamente");
    }
    /**
     * Prueba para validar que el constructor lanza una excepción cuando el valor del radio es inválido.
     */
    public void testConstructorThrowsExceptionForInvalidRadius() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(0), "Se esperaba una excepción para radio 0");
        assertThrows(IllegalArgumentException.class, () -> new Circle(-5), "Se esperaba una excepción para radio negativo");
    }
    /**
     * Prueba para validar que el método setRadius lanza una excepción cuando se intenta asignar un valor inválido.
     */    
    public void testSetRadiusThrowsExceptionForInvalidValues() {
        assertThrows(IllegalArgumentException.class, () -> circle.setRadius(0), "Se esperaba una excepción para radio 0");
        assertThrows(IllegalArgumentException.class, () -> circle.setRadius(-3), "Se esperaba una excepción para radio negativo");
    }

}
