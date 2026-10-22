package ec.edu.uce.pa.paquete;

import jakarta.inject.Singleton;

@Singleton
public class SMSService implements Notificacion{
    @Override
    public void enviar(String destino,String mensaje) {
        System.out.println("Enviando correo a :" + destino);
        System.out.println("Mensaje :" + mensaje);
        System.out.println("Correo enviado con exito" );
        System.out.println("Fin del envio de correo" );

    }

}
