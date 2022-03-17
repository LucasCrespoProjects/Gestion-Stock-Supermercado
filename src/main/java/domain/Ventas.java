
package domain;

/**
 *
 * @author Grupo 2
 */
public class Ventas {
    private String mes;
    private double cantidad;
    private double cantidad_online;
    private double total;

    public Ventas(String mes, double cantidad, double cantidad_online) {
        this.mes = mes;
        this.cantidad = cantidad;
        this.cantidad_online = cantidad_online;
//        this.total = total;
    }

    public Ventas() {
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad_online() {
        return cantidad_online;
    }

    public void setCantidad_online(double cantidad_online) {
        this.cantidad_online = cantidad_online;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
