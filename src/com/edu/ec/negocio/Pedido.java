package com.edu.ec.negocio;

public class Pedido {
    private String cedulaCliente;
    private String cliente;
    private String producto;
    private int cantidad;
    private double total;
    private String correo;

    public Pedido() {

    }

    public Pedido(String cedulaCliente, String cliente, String producto, int cantidad, double total, String correo) {
        this.cedulaCliente = cedulaCliente;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
        this.correo = correo;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
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
        double precioUnitario = this.total; // Usamos el atributo total como precio base unitario
        double subtotalSinIva = precioUnitario * this.cantidad;
        double valorIva = subtotalSinIva * 0.15; // IVA del 15% en Ecuador

        return subtotalSinIva + valorIva; // Retorna el gran total con IVA incluido
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
