void main() {

    Operaciones operaciones = new Operaciones();

    Scanner sc = new Scanner(System.in);
    double in1, in2;
    int op;
    

    while (true) {

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Resultado anterior");
        System.out.println("6. Salir ");

        op = sc.nextInt();

        if (op == 6) {
            System.exit(0);
        }

        switch (op) {
            case 1:
                System.out.println("Ingrese el primer valor:");
                in1 = sc.nextDouble();
                System.out.println("Ingrese el segundo valor:");
                in2 = sc.nextDouble();
                operaciones.sumar(in1, in2);
                break;
            case 2:
                System.out.println("Ingrese el primer valor:");
                in1 = sc.nextDouble();
                System.out.println("Ingrese el segundo valor:");
                in2 = sc.nextDouble();
                operaciones.restar(in1, in2);
                break;
            case 3:
                System.out.println("Ingrese el primer valor:");
                in1 = sc.nextDouble();
                System.out.println("Ingrese el segundo valor:");
                in2 = sc.nextDouble();
                operaciones.multiplicar(in1, in2);
                break;
            case 4:
                System.out.println("Ingrese el primer valor:");
                in1 = sc.nextDouble();
                System.out.println("Ingrese el segundo valor:");
                in2 = sc.nextDouble();
                operaciones.dividir(in1, in2);
                break;
            case 5:
                operaciones.TraerResultado();

        }
    }
}
