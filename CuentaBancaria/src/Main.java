void main() {

    boolean init = true;
    Client client = new Client();
    Scanner sc = new Scanner(System.in);

    while (init) {
        System.out.println("1. Create account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            System.out.println("Enter name: ");
            client.name = sc.nextLine();
        }
        if (choice == 2) {
            System.out.println("Enter amount to deposit");
            double amount = sc.nextDouble();
            client.AddMoney(amount);
        }
        if (choice == 3) {
            System.out.println("Enter amount to withdraw");
            double amount = sc.nextDouble();
            client.SubtractMoney(amount);
        }
        if (choice == 4) {
            init = false;
        }

    }




}