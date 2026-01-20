package org.cuatrovientos.ed;

import java.util.Scanner;

public class Utils {

    public static int show_menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("***** Welcome *****");
        System.out.println("0: Salir");
        System.out.println("1: Añadir producto");
        System.out.println("2: Borrar producto");
        System.out.println("3: Mostrar total");

        return Integer.parseInt(sc.nextLine());
    }

    public static void state_machine(int opt, Invoice factura) {
        Scanner sc = new Scanner(System.in);

        switch (opt) {

            case 1: { // AÑADIR
                System.out.print("Nombre del producto: ");
                String name = sc.nextLine();

                System.out.print("Cantidad: ");
                int qty = Integer.parseInt(sc.nextLine());

                System.out.print("Precio: ");
                float price = Float.parseFloat(sc.nextLine());

                Product p = new Product(name, qty, price);
                factura.add(p);

                System.out.println("Producto añadido correctamente.");
                break;
            }

            case 2: { // BORRAR
                System.out.print("Índice del producto a borrar: ");
                int index = Integer.parseInt(sc.nextLine());

                factura.remove(index);
                System.out.println("Producto borrado (si el índice era válido).");
                break;
            }

            case 3: { // MOSTRAR TOTAL
                System.out.println("Total de la factura: " + factura.total() + " €");
                break;
            }

            case 0:
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opción no válida");
        }
    }
}
