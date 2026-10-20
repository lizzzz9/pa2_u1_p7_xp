package ec.edu.uce.pa.paquete;
import jakarta.enterprise.context.ApplicationScoped;

//@ApplicationScoped//delego el control al contendor ArC
//@RequestScoped 
@Singleton
public class PedidoService {
    private MailService mailService;
     public void realizar(Pedido pedido ){
        System.out.println("realizando pedido...");
        System.out.println("Pedido realizado por el cliente :" + pedido.getCliente());
        System.out.println(" Producto :"+ pedido.getProducto());
        System.out.println("Total:"+ pedido.getTotal());
        System.out.println("Correo:"+ pedido.getCorreo());
        System.out.println(" Pedido realizado con exito..."); 
    
        MailService mailService = new MailService();
        String asunto = " Confirmacion de pedido";
       String cuerpo = "Estimado " + pedido.getCliente() + ", su pedido de " + pedido.getProducto() + " ha sido procesado.";
        
        // CORREGIDO: El método void se ejecuta abajo en su propia línea
        mailService.enviar(pedido.getCorreo(), asunto, cuerpo);

    }

}
