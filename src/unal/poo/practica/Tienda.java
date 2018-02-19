
package unal.poo.practica;


public class Tienda {
    private String nombre;
    public Producto producto;

    public Tienda(String nombre) { //Cuando creo un objeto de tipo tienda solo pedira nombre, y el producto sera null como en el diagrama del cuaderno
        this.nombre = nombre;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    
}
