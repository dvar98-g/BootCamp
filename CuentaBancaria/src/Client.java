public class Client {

    double account = 0.0;
    String name;

    public void AddMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Error: el monto a depositar debe ser mayor a 0");
        } else {
            account = account + amount;
            System.out.println("Depósito exitoso. Nuevo saldo: " + account);
        }
    }

    public void SubtractMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Error: el monto a retirar debe ser mayor a 0");
        } else if (amount > account) {
            System.out.println("Error: saldo insuficiente. Saldo actual: " + account);
        } else {
            account = account - amount;
            System.out.println("Retiro exitoso. Nuevo saldo: " + account);
        }
    }
}



