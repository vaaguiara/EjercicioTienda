
package unal.poo.practica;


public class Principal {
    public static void main (String [] args)
    {
        Tienda tienda = new Tienda ("A");
        Producto producto = new Producto ("P", 1, 10);
        tienda.producto = producto;
        
        double precioProductoTienda =
                tienda.producto.getPrecio(); //Obtiene el precio del producto
        System.out.println(precioProductoTienda);
    }
}
