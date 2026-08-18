public class Producto {
    String name;
    int cantidad;

    public Producto(String name, int cantidad) {
        this.name = name;
        this.cantidad = cantidad;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}