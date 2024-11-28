package interfaz;

import java.util.Scanner;
import aplicacion.CatalogoBalones;
import dominio.BalonBasket;
import dominio.BalonFutbol;
import dominio.BalonVoleibol;
/**
 * Clase que proporciona un menú interactivo para gestionar el catálogo de balones.
 */
public class Menu {

    /**
     * Constructor predeterminado para la clase Menu.
     * Se encarga de inicializar el objeto sin parámetros adicionales.
     */
    public Menu() {
        // Constructor vacío
    }

    /**
     * Método principal para ejecutar el programa.
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Instancia el catálogo
        CatalogoBalones catalogo = new CatalogoBalones();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar balón de Fútbol");
            System.out.println("2. Agregar balón de Voleibol");
            System.out.println("3. Agregar balón de Baloncesto");
            System.out.println("4. Mostrar catálogo");
            System.out.println("5. Calcular total");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");

            try {
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese precio: ");
                        double precioFutbol = scanner.nextDouble();
                        System.out.print("Ingrese tamaño: ");
                        String tamañoFutbol = scanner.next();
                        catalogo.agregarBalon(new BalonFutbol(precioFutbol, tamañoFutbol));
                        break;

                    case 2:
                        System.out.print("Ingrese precio: ");
                        double precioVoleibol = scanner.nextDouble();
                        System.out.print("Ingrese tamaño: ");
                        String tamañoVoleibol = scanner.next();
                        catalogo.agregarBalon(new BalonVoleibol(precioVoleibol, tamañoVoleibol));
                        break;

                    case 3:
                        System.out.print("Ingrese precio: ");
                        double precioBasket = scanner.nextDouble();
                        System.out.print("Ingrese tamaño: ");
                        String tamañoBasket = scanner.next();
                        catalogo.agregarBalon(new BalonBasket(precioBasket, tamañoBasket));
                        break;

                    case 4:
                        catalogo.mostrarCatalogo();
                        break;

                    case 5:
                        System.out.println("Total a pagar: $" + catalogo.calcularTotal());
                        break;

                    case 6:
                        salir = true;
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida.");
                scanner.next(); // Limpia la entrada incorrecta
            }
        }
        scanner.close();
    }
}