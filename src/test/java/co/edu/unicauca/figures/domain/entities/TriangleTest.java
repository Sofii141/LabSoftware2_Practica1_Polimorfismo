/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package co.edu.unicauca.figures.domain.entities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase Triangle.
 * Se encarga de verificar el correcto cálculo del área y el perímetro
 * de un triángulo. 
 * 
 * @author Ana Sofia Arango Yanza
 * @author Juan Diego Gomez Garces
 * @version 1.0
 */
public class TriangleTest {

    private Triangle triangle;

    public TriangleTest() {
    }
    
    @Test
    public void testConstructor_ValidTriangle() {
        Triangle tri = new Triangle(7, 4, 9, 5);
        assertNotNull(tri, "El triángulo no debería ser nulo");
        assertEquals(7, tri.getBase(), "Base incorrecta");
        assertEquals(4, tri.getHeight(), "Altura incorrecta");
        assertEquals(9, tri.getSide2(), "Lado 2 incorrecto");
        assertEquals(5, tri.getSide3(), "Lado 3 incorrecto");
    }
    
    @Test
    public void testConstructor_InvalidSides() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Triangle(0, 4, 5, 6);
        });
        assertEquals("Todos los lados y la altura deben ser mayores que cero", exception.getMessage());
    }
    
    @Test
    public void testConstructor_InvalidTriangleInequality() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Triangle(10, 4, 2, 3); // No cumple con la desigualdad
        });
        assertEquals("Los lados no pueden formar un triangulo valido", exception.getMessage());
    }

    /**
     * Configuración inicial antes de cada prueba.
     */
    @BeforeEach
    public void setUp() {
        triangle = new Triangle(7, 4, 9, 5);
    }

    /**
     * Test of calcularArea method, of class Triangle.
     */
    @Test
    public void testCalcularArea() {
        System.out.println("calcularArea");
        double expResult = 14;
        double result = triangle.calcularArea();
        assertEquals(expResult, result, 0.0001, "El área del triangulo no es correcta");
    }

    /**
     * Test of calcularPerimetro method, of class Triangle.
     */
    @Test
    public void testCalcularPerimetro() {
        System.out.println("calcularPerimetro");
        double expResult = 21;
        double result = triangle.calcularPerimetro();
        assertEquals(expResult, result, 0.0001, "El perimetro del triangulo no es correcto");
    }

    /**
     * Test of getBase method, of class Triangle.
     */
    @Test
    public void testGetBase() {
        System.out.println("getBase");
        double expResult = 7;
        double result = triangle.getBase();
        assertEquals(expResult, result, 0.0001, "El valor de la base no es correcto");
    }

    /**
     * Test of setBase method, of class Triangle.
     */
    @Test
    public void testSetBase() {
        System.out.println("SetBase");
        assertEquals(7, triangle.getBase(), "El valor de la base no se actualizó correctamente");
    }

    /**
     * Test of getHeight method, of class Triangle.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        double expResult = 4;
        double result = triangle.getHeight();
        assertEquals(expResult, result, 0.0001, "El valor de la altura no es correcto");
    }

    /**
     * Test of setHeight method, of class Triangle.
     */
    @Test
    public void testSetHeight() {
        System.out.println("SetHeight");
        assertEquals(4, triangle.getHeight(), "El valor de la altura no se actualizó correctamente");
    }

    /**
     * Test of getSide2 method, of class Triangle.
     */
    @Test
    public void testGetSide2() {
        System.out.println("getSide2");
        double expResult = 9;
        double result = triangle.getSide2();
        assertEquals(expResult, result, 0.0001, "El valor del lado 2 no es correcto");
    }

    /**
     * Test of setSide2 method, of class Triangle.
     */
    @Test
    public void testSetSide2() {
        System.out.println("SetSide2");
        assertEquals(9, triangle.getSide2(), "El valor del lado 2 no se actualizó correctamente");

    }

    /**
     * Test of getSide3 method, of class Triangle.
     */
    @Test
    public void testGetSide3() {
        System.out.println("getSide3");
        double expResult = 5;
        double result = triangle.getSide3();
        assertEquals(expResult, result, 0.0001, "El valor del lado 3 no es correcto");

    }

    /**
     * Test of setSide3 method, of class Triangle.
     */
    @Test
    public void testSetSide3() {
        System.out.println("SetSide3");
        assertEquals(5, triangle.getSide3(), "El valor del lado 3 no se actualizó correctamente");
    }

}
