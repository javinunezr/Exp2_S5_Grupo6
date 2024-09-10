
package exp2_s4_grupo6;

import java.util.Random;

public class Producto {
    private int codigoProducto;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.codigoProducto = generateRandomProductId();
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método para generar un código de producto de 9 dígitos, de forma aleatoria
    private int generateRandomProductId() {
        Random random = new Random();
        return 100000000 + random.nextInt(900000000);
    }
    
    public Producto() {
        this.codigoProducto = generateRandomProductId();
    }
    
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void actualizarPrecio(double nuevoPrecio) {
        if (nuevoPrecio > 0) {
            this.precio = nuevoPrecio;
        } else {
            System.out.println("El precio debe ser mayor que cero.");
        }
    }
}

