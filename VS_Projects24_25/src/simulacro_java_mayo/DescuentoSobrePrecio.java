import java.util.Scanner;

public class DescuentoSobrePrecio {
    
    private String nombreProducto;
    private double precioOriginal;
    private double descuento;

    public DescuentoSobrePrecio (String nombreProducto, double precioOriginal, double descuento) {
        this.nombreProducto = nombreProducto;
        this.precioOriginal = precioOriginal;
        this.descuento = descuento;
    }

    //Método descuento
    public double precioFinalConDescuento() {
        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);
        return Math.round(precioFinal * 100.0) / 100.0;
    }

    //Método detalles
    public void mostrarDetalles() {
        System.out.println("\n_________________________________________");
        System.out.println("\nNombre del producto: " + nombreProducto);
        System.out.println("Precio: " + precioOriginal + "$");
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Precio final con descuento: " + precioFinalConDescuento() + "$\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n__DATOS DEL PRODUCTO__");

        System.out.print("\nIntroduce el nombre del producto: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce el precio original: ");
        double precio = sc.nextDouble();

        System.out.print("Introduce el porcentaje de descuento: ");
        double descuento = sc.nextDouble();
        //Añadimos los valores introducidos por el usuario a los valores de los atributos de nuestro objeto
        DescuentoSobrePrecio producto = new DescuentoSobrePrecio(nombre, precio, descuento);
        producto.mostrarDetalles();

        sc.close();
    }
}