void main() {
    Scanner sc = new Scanner(System.in);
    Inventario inventario = new Inventario();
    int op;

    while (true) {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Agregar producto nuevo");
        System.out.println("2. Ver inventario");
        System.out.println("3. Vender producto");
        System.out.println("4. Salir");
        System.out.print("Elija una opción: ");
        op = sc.nextInt();
        sc.nextLine();

        switch (op) {
            case 1: inventario.agregarProducto(sc); break;
            case 2: inventario.mostrarInventario(); break;
            case 3: inventario.venderProducto(sc); break;
            case 4: System.out.println("Saliendo del programa..."); System.exit(0); break;
        }
    }
}
