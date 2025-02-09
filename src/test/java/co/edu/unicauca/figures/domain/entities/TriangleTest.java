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
 *
 * @author USUARIO
 */
public class TriangleTest {

    private Triangle triangle;

    public TriangleTest() {
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
