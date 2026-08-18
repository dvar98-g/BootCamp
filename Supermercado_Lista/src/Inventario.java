import java.util.ArrayList;
import java.util.List;

public class Inventario {

    List<Producto> productos = new ArrayList<>();


    public void addProducto(Producto producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        for (int i = 0; i<productos.size(); i++) {
            System.out.println("El producto es:"+productos.get(i).getname());
            System.out.println("La cantidad de producto es:"+productos.get(i).getCantidad());
        }
    }

    public Producto buscarProducto(String name) {
        for (Producto p : productos) {
            if (p.getname().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    private void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public void venderProducto(Producto producto, int cantidadVendida) {

        if (!productos.contains(producto)) {
            System.out.println("Ese producto no está en el inventario.");
            return;
        }

        if (cantidadVendida <= 0) {
            System.out.println("La cantidad a vender debe ser mayor a 0.");
            return;
        }

        if (producto.getCantidad() < cantidadVendida) {
            System.out.println("Stock insuficiente. Disponible: " + producto.getCantidad());
            return;
        }

        producto.setCantidad(producto.getCantidad() - cantidadVendida);
        System.out.println("Venta realizada: " + cantidadVendida + " x " + producto.getname());

        if (producto.getCantidad() == 0) {
            eliminarProducto(producto);
            System.out.println(producto.getname() + " se quedó sin stock y fue eliminado del inventario.");
        }
    }

}