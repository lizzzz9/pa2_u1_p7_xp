package ec.edu.ec.pa2.paquete;

public class Pago {

    public String idPago;
    public String idReserva;
    public double monto;
    public String metodo;// Tarjeta,efectivo,transferencia

    public Pago(String idPago, String idReserva, double monto, String metodo) {
        this.idPago = idPago;
        this.idReserva = idReserva;
        this.monto = monto;
        this.metodo = metodo;

    }

    public String getIdPago() {
        return idPago;
    }

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

}