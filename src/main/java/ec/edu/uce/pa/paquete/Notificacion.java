package ec.edu.uce.pa.paquete;

public interface Notificacion {
    public void enviar(String destino, String mensaje);

    // para quye funcione hay que poner la interfaz
    public Integer getCantidad();

    public void setCantidad(Integer cantidad);

    public String getNombre();

    public void setNombre(String nombre);

}
