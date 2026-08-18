import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    Menu menu = new Menu();
    while(true) {

        System.out.println("1. Ingrese la receta");
        System.out.println("2. Remplazar receta");
        System.out.println("3. Imprimir cantidad de recetas");
        System.out.println("4. Imprimir Menu");
        System.out.println("5. Salir");

        int opcion = sc.nextInt();
        sc.nextLine();

        switch(opcion) {
            case 1:
                System.out.println("Ingrese la receta");
                String receta = sc.nextLine();
                System.out.println("Ingrese precio de la receta");
                double recetaPrecio = sc.nextDouble();
                menu.addMenuItem(new MenuItem(receta,recetaPrecio));
                break;
            case 2:
                System.out.println("Ingrese la receta a remplazar");
                String recetaARemplazar = sc.nextLine();
                System.out.println("Ingrese el nombre de la nueva receta");
                String recetaNombre = sc.nextLine();
                System.out.println("Ingrese precio de la receta a imprimir");
                double recetaprecio = sc.nextDouble();
                menu.replaceMenuItem(recetaARemplazar,new MenuItem(recetaNombre,recetaprecio));
                break;
            case 3:
                System.out.println("La cantidad de recetas actualmente: " + menu.getMenuItemCount());
                break;
            case 4:
                System.out.println("El menu actualmente:" );
                menu.MenuAll();
                break;
            case 5:
                System.out.println("Saliendo ...");
                System.exit(0);
        }

    }

}
