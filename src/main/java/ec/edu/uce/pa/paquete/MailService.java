package ec.edu.uce.pa.paquete;

impoer jakarta.inject.Singleton;
//@ApplicationScoped//delego el control al contendor ArC
//@RequestScoped 
@Singleton
public class MailService {
    public void enviar(String correo, String asunto, String cuerpo) {
        System.out.println("Enviando correo a :" + correo);
        System.out.println("Asunto :" + asunto);
        System.out.println("Cuerpo :" + cuerpo);
        System.out.println("Correo enviado con exito...");

        
    }

}
