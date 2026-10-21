package ec.edu.uce.pa.paquete;
import jakarta.enterprise.context.ApplicationScoped;
import  jakarta.inject.Singleton;
import jakarta.inject.Inject;

@ApplicationScoped//delego el control al contendor ArC
//@RequestScoped 
//@Singleton  //para funciones que no son logica de negocios
public class PedidoService {
    
    //inyeccion de dependencias por atributo
    @Inject
    private MailService mailService;
    
   // private MailService mailService;
 /* 
    //Inyeccion de dependencias por constructor
    @Inject
    public PedidoService(MailService mailService){
        this.mailService = mailService;
    }
        */
/*

    //Inyeccion de dependencias por setter
    @Inject
    public void setMailService(MailService mailService){
        this.mailService = mailService;
}
*/


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
        
      
        mailService.enviar(pedido.getCorreo(), asunto, cuerpo);

    }

}
