package co.edu.unicauca.figures.domain.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 * Pruebas unitarias para la clase Square.
 * 
 * Se verifican los métodos de cálculo de área y perímetro, así como la correcta gestión del atributo lado.
 * Se incluyen pruebas para valores válidos e inválidos.
 * 
 * @author Ana Sofia Arango Yanza
 * @author Juan Diego Gomez Garces
 * @version 1.0
 */
public class SquareIT {
    
    private Square square;
    
    /**
     * Configuración inicial antes de cada prueba.
     */
    @BeforeEach
    public void setUp() {
        square = new Square(5.0); // Inicializamos con un lado de 5.0
    }
    
    /**
     * Prueba para verificar el cálculo correcto del área.
     */
    @Test
    public void testCalcularArea() {
        double expected = 25.0; // 5 * 5
        double actual = square.calcularArea();
        assertEquals(expected, actual, 0.0001, "El área del cuadrado no es correcta");
    }
    
    /**
     * Prueba para verificar el cálculo correcto del perímetro.
     */
    @Test
    public void testCalcularPerimetro() {
        double expected = 20.0; // 4 * 5
        double actual = square.calcularPerimetro();
        assertEquals(expected, actual, 0.0001, "El perímetro del cuadrado no es correcto");
    }
    
    /**
     * Prueba para verificar la obtención del lado.
     */
    @Test
    public void testGetSide() {
        assertEquals(5.0, square.getSide(), "El valor del lado no es correcto");
    }
    
    /**
     * Prueba para verificar la asignación de un nuevo valor al lado.
     */
    @Test
    public void testSetSide() {
        square.setSide(10.0);
        assertEquals(10.0, square.getSide(), "El valor del lado no se actualizó correctamente");
    }
    
    /**
     * Prueba para validar que el constructor lanza una excepción cuando el valor del lado es inválido.
     */
    @Test
    public void testConstructorThrowsExceptionForInvalidSide() {
        assertThrows(IllegalArgumentException.class, () -> new Square(0), "Se esperaba una excepción para lado 0");
        assertThrows(IllegalArgumentException.class, () -> new Square(-5), "Se esperaba una excepción para lado negativo");
    }
    
    /**
     * Prueba para validar que el método setSide lanza una excepción cuando se intenta asignar un valor inválido.
     */
    @Test
    public void testSetSideThrowsExceptionForInvalidValues() {
        assertThrows(IllegalArgumentException.class, () -> square.setSide(0), "Se esperaba una excepción para lado 0");
        assertThrows(IllegalArgumentException.class, () -> square.setSide(-3), "Se esperaba una excepción para lado negativo");
    }
    
}
