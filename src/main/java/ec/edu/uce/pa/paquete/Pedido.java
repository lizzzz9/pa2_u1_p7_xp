package ec.edu.uce.pa.paquete;

public class Pedido {

    private String cliente;
    private String producto;
    private double total;
    private String correo;
    private String telefono;

    public Pedido() {

    }

    public Pedido(String cliente, String correo, String producto, String telefono, double total) {
        this.cliente = cliente;
        this.correo = correo;
        this.producto = producto;
        this.telefono = telefono;
        this.total = total;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
