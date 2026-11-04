package ec.edu.uce.pa.paquete;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton // delego el control al contendor ArC
//@Dependent
@Named("mail")
public class MailService implements Notificacion {

    private Integer cantidad = 0;
    private String nombre;

    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Enviando correo a :" + destino);
        System.out.println("Mensaje :" + mensaje);
        System.out.println("Correo enviado con exito");
        System.out.println("Fin del envio de correo");

    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
