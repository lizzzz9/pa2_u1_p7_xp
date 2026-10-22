package ec.edu.uce.pa.paquete;

import jakarta.inject.Named;
import jakarta.inject.Singleton;


@Singleton//delego el control al contendor ArC
@Named("Mail")
public class MailService implements Notificacion{
    @Override
    public void enviar(String destino,String mensaje) {
        System.out.println("Enviando correo a :" + destino);
        System.out.println("Mensaje :" + mensaje);
        System.out.println("Correo enviado con exito" );
        System.out.println("Fin del envio de correo" );

        
    }

}
