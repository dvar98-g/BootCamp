import java.util.Scanner;

public class Inventario {
    String nombre1 = "", nombre2 = "", nombre3 = "", nombre4 = "", nombre5 = "";
    String nombre6 = "", nombre7 = "", nombre8 = "", nombre9 = "", nombre10 = "";
    int cantidad1 = 0, cantidad2 = 0, cantidad3 = 0, cantidad4 = 0, cantidad5 = 0;
    int cantidad6 = 0, cantidad7 = 0, cantidad8 = 0, cantidad9 = 0, cantidad10 = 0;

    int contador = 0;
    int MAXIMO = 10;

    public void agregarProducto(Scanner sc) {
        int casillaDestino;

        if (contador < MAXIMO) {
            contador = contador + 1;
            casillaDestino = contador;
        } else {
            System.out.println("Inventario lleno. Productos actuales:");
            mostrarInventario();
            System.out.print("¿Qué número de producto desea quitar para poner el nuevo? ");
            casillaDestino = sc.nextInt();
            sc.nextLine();

            if (casillaDestino < 1 || casillaDestino > MAXIMO) {
                System.out.println("Número inválido. Se cancela la operación.");
                casillaDestino = 0;
            }
        }
        if (casillaDestino != 0) {
            System.out.print("Nombre del producto nuevo: ");
            String nombreTemp = sc.nextLine();
            System.out.print("Cantidad inicial: ");
            int cantidadTemp = sc.nextInt();
            sc.nextLine();

            switch (casillaDestino) {
                case 1: nombre1 = nombreTemp; cantidad1 = cantidadTemp; break;
                case 2: nombre2 = nombreTemp; cantidad2 = cantidadTemp; break;
                case 3: nombre3 = nombreTemp; cantidad3 = cantidadTemp; break;
                case 4: nombre4 = nombreTemp; cantidad4 = cantidadTemp; break;
                case 5: nombre5 = nombreTemp; cantidad5 = cantidadTemp; break;
                case 6: nombre6 = nombreTemp; cantidad6 = cantidadTemp; break;
                case 7: nombre7 = nombreTemp; cantidad7 = cantidadTemp; break;
                case 8: nombre8 = nombreTemp; cantidad8 = cantidadTemp; break;
                case 9: nombre9 = nombreTemp; cantidad9 = cantidadTemp; break;
                case 10: nombre10 = nombreTemp; cantidad10 = cantidadTemp; break;
            }
            System.out.println("Producto agregado/reemplazado correctamente.");
        }
    }

    public void mostrarInventario() {
        System.out.println("\n--- Inventario actual ---");
        if (contador >= 1) System.out.println("1. " + nombre1 + " - Cantidad: " + cantidad1);
        if (contador >= 2) System.out.println("2. " + nombre2 + " - Cantidad: " + cantidad2);
        if (contador >= 3) System.out.println("3. " + nombre3 + " - Cantidad: " + cantidad3);
        if (contador >= 4) System.out.println("4. " + nombre4 + " - Cantidad: " + cantidad4);
        if (contador >= 5) System.out.println("5. " + nombre5 + " - Cantidad: " + cantidad5);
        if (contador >= 6) System.out.println("6. " + nombre6 + " - Cantidad: " + cantidad6);
        if (contador >= 7) System.out.println("7. " + nombre7 + " - Cantidad: " + cantidad7);
        if (contador >= 8) System.out.println("8. " + nombre8 + " - Cantidad: " + cantidad8);
        if (contador >= 9) System.out.println("9. " + nombre9 + " - Cantidad: " + cantidad9);
        if (contador >= 10) System.out.println("10. " + nombre10 + " - Cantidad: " + cantidad10);
        if (contador == 0) System.out.println("No hay productos registrados todavía.");
    }

    public void venderProducto(Scanner sc) {
        // Si no hay ningún producto registrado, se avisa y se termina la operación
        if (contador == 0) {
            System.out.println("El inventario está vacío. No hay productos para vender.");
            return;
        }

        mostrarInventario();
        System.out.print("¿Qué número de producto desea vender? ");
        int casilla = sc.nextInt();
        sc.nextLine();

        // Variables temporales para trabajar el caso elegido sin repetir todo el bloque
        String nombreElegido = "";
        int cantidadElegida = 0;
        boolean casillaValida = true;

        switch (casilla) {
            case 1: nombreElegido = nombre1; cantidadElegida = cantidad1; break;
            case 2: nombreElegido = nombre2; cantidadElegida = cantidad2; break;
            case 3: nombreElegido = nombre3; cantidadElegida = cantidad3; break;
            case 4: nombreElegido = nombre4; cantidadElegida = cantidad4; break;
            case 5: nombreElegido = nombre5; cantidadElegida = cantidad5; break;
            case 6: nombreElegido = nombre6; cantidadElegida = cantidad6; break;
            case 7: nombreElegido = nombre7; cantidadElegida = cantidad7; break;
            case 8: nombreElegido = nombre8; cantidadElegida = cantidad8; break;
            case 9: nombreElegido = nombre9; cantidadElegida = cantidad9; break;
            case 10: nombreElegido = nombre10; cantidadElegida = cantidad10; break;
            default:
                casillaValida = false;
                System.out.println("Número de producto inválido.");
                break;
        }

        if (!casillaValida) {
            return;
        }

        // Si la casilla está dentro del rango pero no tiene producto cargado (vacía)
        if (casilla > contador || nombreElegido.isEmpty()) {
            System.out.println("Esa casilla está vacía. No hay producto para vender.");
            return;
        }

        System.out.print("¿Cuántas unidades de " + nombreElegido + " desea vender? ");
        int unidades = sc.nextInt();
        sc.nextLine();

        if (unidades > cantidadElegida) {
            System.out.println("No hay suficiente stock. Solo quedan " + cantidadElegida);
        } else {
            cantidadElegida -= unidades;

            // Como no usamos arreglos, hay que devolver el valor actualizado a la variable original
            switch (casilla) {
                case 1: cantidad1 = cantidadElegida; break;
                case 2: cantidad2 = cantidadElegida; break;
                case 3: cantidad3 = cantidadElegida; break;
                case 4: cantidad4 = cantidadElegida; break;
                case 5: cantidad5 = cantidadElegida; break;
                case 6: cantidad6 = cantidadElegida; break;
                case 7: cantidad7 = cantidadElegida; break;
                case 8: cantidad8 = cantidadElegida; break;
                case 9: cantidad9 = cantidadElegida; break;
                case 10: cantidad10 = cantidadElegida; break;
            }

            System.out.println("Venta realizada. Nueva cantidad de " + nombreElegido + ": " + cantidadElegida);
        }
    }

}