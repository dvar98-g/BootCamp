void main() {

    RegistroZoo registroZoo = new RegistroZoo();
    Scanner sc = new Scanner(System.in);

    while (true) {


        System.out.println("Ingresa el numero de animales del zoo que quieres ver: ");
        int numAnimal = sc.nextInt();

        if (numAnimal == 5){
            System.exit(0);
        }
        registroZoo.mostrarAnimales(numAnimal);


    }

}
