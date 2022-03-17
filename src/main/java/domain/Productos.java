
package domain;

/**
 *
 * @author Grupo 2
 */
public class Productos {
    private int id_producto;
    private String nombre;
    private String categoria;
    private int cantidad;
    private String stock;
    private String precio;
    private String oferta;

    public Productos(int id_producto, String nombre, String categoria, int cantidad, String stock, String precio, String oferta) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.stock = stock;
        this.precio = precio;
        this.oferta = oferta;
    }

    public Productos() {
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

   
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getOferta() {
        return oferta;
    }

    public void setOferta(String oferta) {
        this.oferta = oferta;
    }
    
}
