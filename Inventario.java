
package exp2_s4_grupo6;

import java.util.HashMap;


public final class Inventario {
    private final HashMap<String, Producto> productos;
    
    public Inventario (){
        productos = new HashMap<>();
               
        agregarProducto ("Producto 1", new Producto("Pisco",7000, 20));
        agregarProducto ("Producto 2", new Producto("Coca Cola",2500, 15));
        agregarProducto ("Producto 3", new Producto("Sprite",2500, 12));
        agregarProducto ("Producto 4", new Producto("Jugo",1500, 10));
        agregarProducto ("Producto 5", new Producto("Ron",7000, 8));
        agregarProducto ("Producto 6", new Producto("Vodka",4000, 16));  
        agregarProducto ("Producto 7", new Producto("Hielo",1000, 25));
        agregarProducto ("Producto 8", new Producto("Cerveza",2000, 4));
        agregarProducto ("Producto 9", new Producto("Vino",4500, 3));
        agregarProducto ("Producto 10", new Producto("Whisky",10000, 2));
        }
    
    void agregarProducto(String nombre, Producto producto) {
    productos.put(nombre, producto);
    }

    public void mostrarProductos() {
        for (String codigo : productos.keySet()) {
            Producto producto = productos.get(codigo);
            System.out.println("ID producto " + producto.getCodigoProducto() + " | " + producto.getNombre() + ", Precio: " + producto.getPrecio() + ", Stock: " + producto.getStock());
        }
    }
        
    public void eliminarProducto(int codigoProducto) {
        Producto productoAEliminar = null;

        for (Producto producto : productos.values()) {
            if (producto.getCodigoProducto() == codigoProducto) {
                productoAEliminar = producto;
                break;
            }
        }

        if (productoAEliminar != null) {
            productos.values().remove(productoAEliminar);
            System.out.println("Producto con ID '" + codigoProducto + "' eliminado con éxito.");
        } else {
            System.out.println("El producto con ID '" + codigoProducto + "' no se encuentra en el inventario.");
        }
    }
        
    public Producto buscarProducto(String nombre) {
        for (Producto producto : productos.values()) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }
       
}
