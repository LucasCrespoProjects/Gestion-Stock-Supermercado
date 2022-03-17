
package domain;

/**
 *
 * @author Grupo 2
 */
public class Pedidos {
    
    private int id;
    private String Nombre;
    private int Cantidad;
    private String Categoria;
    private String Precio;

    public Pedidos(int id,String Nombre, String Categoria,int Cantidad, String Precio) {
        this.id=id;
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
    }

    public Pedidos() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

   

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

   
   
    
    
}
