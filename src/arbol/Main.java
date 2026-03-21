package arbol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Insertar número");
            System.out.println("2. Mostrar recorrido inorden");
            System.out.println("3. Buscar número");
            System.out.println("4. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese número: ");
                    int num = sc.nextInt();
                    arbol.insertar(num);
                    break;

                case 2:
                    System.out.println("Recorrido inorden:");
                    arbol.inorden();
                    break;

                case 3:
                    System.out.print("Número a buscar: ");
                    int buscar = sc.nextInt();
                    if (arbol.buscar(buscar)) {
                        System.out.println("Número encontrado");
                    } else {
                        System.out.println("No existe");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 4);

        sc.close();
    }
}