void main() {

    Inventario inventario = new Inventario();
    Scanner sc = new Scanner(System.in);
    boolean salir = false;

    while (!salir) {
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Agregar productos");
        System.out.println("2. Listar inventario");
        System.out.println("3. Vender producto");
        System.out.println("4. Salir");

        int opcion = sc.nextInt();
        sc.nextLine(); // limpia el salto de línea pendiente

        switch (opcion) {
            case 1:
                System.out.println("Ingresa el nombre del producto");
                String nombre = sc.nextLine();
                System.out.println("Ingresa la cantidad del producto");
                int cantidad = sc.nextInt();
                sc.nextLine();

                inventario.addProducto( new Producto(nombre, cantidad));
                System.out.println("Producto agregado.");
                break;

            case 2:
                inventario.listarProductos();
                break;

            case 3:
                System.out.println("Ingresa el nombre del producto a vender");
                String nombreVenta = sc.nextLine();
                Producto encontrado = inventario.buscarProducto(nombreVenta);

                if (encontrado == null) {
                    System.out.println("Producto no encontrado.");
                    break;
                }

                System.out.println("Ingresa la cantidad a vender");
                int cantidadVenta = sc.nextInt();
                sc.nextLine();

                inventario.venderProducto(encontrado, cantidadVenta);
                break;

            case 4:
                salir = true;
                System.out.println("Saliendo...");
                break;

            default:
                System.out.println("Opcion invalida.");
        }
    }

    sc.close();



}
