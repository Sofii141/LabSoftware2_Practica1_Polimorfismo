/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.figures;


import co.edu.unicauca.figures.domain.entities.*;
import java.util.Scanner;

/**
 * Clase que maneja la interfaz de usuario y la lógica del menú
 * para la aplicación de figuras geométricas.
 * 
 * @author Tu_Nombre
 * @version 1.0
 */

public class Menu {
    private Scanner scanner;
    
    /**
     * Constructor de la clase Menu.
     * Inicializa el scanner para la entrada de datos.
     */
    public Menu() {
        this.scanner = new Scanner(System.in);
    }
    
    /**
     * Inicia la ejecución del menú principal.
     */
    public void iniciar() {
        while (true) {
            mostrarTitulo();
            mostrarMenuPrincipal();
            
            int opcion = leerOpcion();
            
            switch (opcion) {
                case 1:
                    menuCirculo();
                    break;
                case 2:
                    menuCuadrado();
                    break;
                case 3:
                    menuTriangulo();
                    break;
                case 4:
                    System.out.println("\n¡Gracias por usar el programa!");
                    return;
                default:
                    System.out.println("\nOpcion no válida. Por favor intente de nuevo.");
            }
        }
    }
    
    private void mostrarTitulo() {
        System.out.println("\n*************************************************");
        System.out.println("*                                               *");
        System.out.println("*            FIGURAS GEOMETRICAS               *");
        System.out.println("*                                               *");
        System.out.println("*************************************************");
    }
    
    private void mostrarMenuPrincipal() {
        System.out.println("\nSeleccione una figura:");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triangulo");
        System.out.println("4. Salir");
        System.out.print("\nIngrese su opcion: ");
    }
    
    private void mostrarSubMenu(String figura) {
        System.out.println("\n--- " + figura + " ---");
        System.out.println("1. Calcular Area");
        System.out.println("2. Calcular Perimetro");
        System.out.println("3. Volver al menu principal");
        System.out.print("\nIngrese su opcion: ");
    }
    
    private int leerOpcion() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    
    private double leerDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un numero valido.");
            }
        }
    }
    
    private void menuCirculo() {
        while (true) {
            mostrarSubMenu("Circulo");
            int opcion = leerOpcion();
            
            if (opcion == 3) break;
            
            if (opcion == 1 || opcion == 2) {
                try {
                    double radio = leerDouble("Ingrese el radio del circulo: ");
                    Circle circulo = new Circle(radio);
                    
                    if (opcion == 1) {
                        System.out.printf("\nEl area del circulo es: %.2f\n", circulo.calcularArea());
                    } else {
                        System.out.printf("\nEl perimetro del circulo es: %.2f\n", circulo.calcularPerimetro());
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("\nError: " + e.getMessage());
                }
            } else {
                System.out.println("\nOpcion no valida. Por favor intente de nuevo.");
            }
        }
    }
    
    private void menuCuadrado() {
        while (true) {
            mostrarSubMenu("Cuadrado");
            int opcion = leerOpcion();
            
            if (opcion == 3) break;
            
            if (opcion == 1 || opcion == 2) {
                try {
                    double lado = leerDouble("Ingrese el lado del cuadrado: ");
                    Square cuadrado = new Square(lado);
                    
                    if (opcion == 1) {
                        System.out.printf("\nEl area del cuadrado es: %.2f\n", cuadrado.calcularArea());
                    } else {
                        System.out.printf("\nEl perimetro del cuadrado es: %.2f\n", cuadrado.calcularPerimetro());
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("\nError: " + e.getMessage());
                }
            } else {
                System.out.println("\nOpcion no valida. Por favor intente de nuevo.");
            }
        }
    }
    
    private void menuTriangulo() {
        while (true) {
            mostrarSubMenu("Triangulo");
            int opcion = leerOpcion();
            
            if (opcion == 3) break;
            
            if (opcion == 1 || opcion == 2) {
                try {
                    double base = leerDouble("Ingrese la base del triangulo: ");
                    double altura = leerDouble("Ingrese la altura del triangulo: ");
                    double lado2 = leerDouble("Ingrese el segundo lado del triangulo: ");
                    double lado3 = leerDouble("Ingrese el tercer lado del triangulo: ");
                    
                    Triangle triangulo = new Triangle(base, altura, lado2, lado3);
                    
                    if (opcion == 1) {
                        System.out.printf("\nEl area del triangulo es: %.2f\n", triangulo.calcularArea());
                    } else {
                        System.out.printf("\nEl perimetro del triangulo es: %.2f\n", triangulo.calcularPerimetro());
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("\nError: " + e.getMessage());
                }
            } else {
                System.out.println("\nOpcion no valida. Por favor intente de nuevo.");
            }
        }
    }
}