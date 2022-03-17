
package domain;

/**
 *
 * @author Grupo 2
 */
public class Gastos {
    
    private String mes;
    private double cantidad;
    private double gastos;
//    private double total;

    public Gastos(String mes, double cantidad, double gastos) {
        this.mes = mes;
        this.cantidad = cantidad;
        this.gastos = gastos;
//        this.total = total;
    }

    public Gastos() {
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

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

//    public double getTotal() {
//        return total;
//    }
//
//    public void setTotal(double total) {
//        this.total = total;
//    }
    
}
