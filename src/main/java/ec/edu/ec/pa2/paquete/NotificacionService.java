package ec.edu.ec.pa2.paquete;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificacionService {
    public void enviarCorreo(String cliente, String mensaje) {
        System.out.println("_Mail_: Enviando correo a :" + cliente + " : " + mensaje);
    }

}
