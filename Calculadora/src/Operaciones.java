public class Operaciones {

    double resultado;

    public void sumar(double a, double b){
        double suma = a + b;
        resultado = suma;
        System.out.println("El resultado es: " + suma);
    }

    public void restar(double a, double b){
        double resta = a - b;
        resultado = resta;
        System.out.println("El resultado es: "+resta);
    }

    public void multiplicar(double a, double b){
        double multiplicacion = a * b;
        resultado = multiplicacion;
        System.out.println("El resultado es: "+multiplicacion);
    }

    public void dividir(double a, double b){
        if  (a == 0){
            System.out.println("El resultado es: 0");
        }
        if  (b == 0){
            System.out.println("Error no se puede dividir en 0");
        }else {
            double dividir = a / b;
            resultado = dividir;
            System.out.println("El resultado es: " + dividir);
        }
    }

    public void TraerResultado(){
        System.out.println("El resultado anterior es:" + resultado);
    }
}
