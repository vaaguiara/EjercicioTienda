
package unal.poo.practica;


public class Producto {
    private String nombre; //Todos los atributos generalmente deben ser private, variables de instancia
    private int cantidad;
    private double precio;

    public Producto(String nombre, int cantidad, double precio) {  //Se creo el constructor
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
