package ec.edu.ec.pa2.paquete;

public class Reserva {

    public String id;
    public String cliente;
    public double monto;
    public String estado; // creada ,pagada,cancelada

    public Reserva(String id, String cliente, double monto, String estado) {
        this.id = id;
        this.cliente = cliente;
        this.monto = monto;
        this.estado = "CREADA";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
