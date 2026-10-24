package ec.edu.uce.pa.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton 
public class PedidoService {

    @Inject
    @Named("mail")
    private Notificacion notificacionCorreo;

    @Inject
    @Named("sms")
    private Notificacion notificacionSMS;
    

    public void realizar(Pedido pedido) {

        System.out.println("realizando pedido...");
        System.out.println("Pedido realizado por el cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());
        System.out.println("Pedido realizado con exito...");

        String asunto = "Confirmacion de pedido";
        String cuerpo = "Estimado " + pedido.getCliente()
                + ", su pedido de " + pedido.getProducto()
                + " ha sido procesado.";

        this.notificacionCorreo.enviar(pedido.getCorreo(), cuerpo);
        this.notificacionCorreo.setCantidad(this.notificacionCorreo.getCantidad() + 1);
        System.out.println("Cantidad de correos enviados pedido: " + this.notificacionCorreo.getCantidad());

        this.notificacionSMS.enviar(pedido.getTelefono(), cuerpo);
    }
}
