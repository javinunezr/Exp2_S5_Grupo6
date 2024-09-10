
package exp2_s4_grupo6;

import java.util.Scanner;

public class MenuPrincipal {
    
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    Inventario inventario = new Inventario(); // Aquí se inicializa el inventario creado en la clase Inventario
        int opcion;

        do {
            System.out.println("Bienvenido a botillería Desarrollo orientado a objetos");
            System.out.println("------------------------------------------------------");
            System.out.println("Seleccione una opción: ");
            System.out.println("---------------------");
            System.out.println("\nMenú Principal");
            System.out.println("1. Agregar productos");
            System.out.println("2. Eliminar productos");
            System.out.println("3. Buscar productos");
            System.out.println("4. Ver inventario");
            System.out.println("5. Modificar precio de producto");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarProducto(scanner, inventario);
                    break;
                case 2:
                    eliminarProducto(scanner, inventario);
                    break;
                case 3:
                    buscarProducto(scanner, inventario);
                    break;
                case 4:
                    inventario.mostrarProductos();
                    break;
                case 5:
                    actualizarPrecio(scanner, inventario);  
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 6);

        scanner.close();
    }
    
    private static void agregarProducto(Scanner scanner, Inventario inventario) {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese el precio: ");
        double precio = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Ingrese la cantidad en stock que habrá: ");
        int stock = Integer.parseInt(scanner.nextLine());
        
        Producto producto = new Producto(nombre, precio, stock);
        inventario.agregarProducto(nombre, producto);
        
        System.out.println("Producto agregado: " + nombre);
    }
    
    private static void eliminarProducto(Scanner scanner, Inventario inventario) {
        System.out.print("Ingrese el ID del producto que desea eliminar: ");
        int codigoProducto = Integer.parseInt(scanner.nextLine());

        inventario.eliminarProducto(codigoProducto);
    } 
    
    private static void buscarProducto(Scanner scanner, Inventario inventario) {
        System.out.print("Ingrese el nombre del producto que desea buscar: ");
        String nombre = scanner.nextLine();

        Producto producto = inventario.buscarProducto(nombre);
        if (producto != null) {
            System.out.println("Producto encontrado:");
            System.out.println("Código: " + producto.getCodigoProducto() +
                               ", Nombre: " + producto.getNombre() +
                               ", Precio: " + producto.getPrecio() +
                               ", Stock: " + producto.getStock());
        } else {
            System.out.println("Producto no encontrado en el inventario.");
        }
    }
    
    private static void actualizarPrecio(Scanner scanner, Inventario inventario) {
        System.out.print("Ingrese el nombre del producto cuyo precio desea modificar: ");
        String nombre = scanner.nextLine();

        Producto producto = inventario.buscarProducto(nombre);
        if (producto != null) {
            System.out.print("Ingrese el nuevo precio para el producto " + nombre + ": ");
            double nuevoPrecio = Double.parseDouble(scanner.nextLine());
            
            producto.setPrecio(nuevoPrecio);
            System.out.println("El precio del producto " + nombre + " ha sido actualizado a " + nuevoPrecio);
        } else {
            System.out.println("Producto no encontrado en el inventario.");
        }
    }

}

