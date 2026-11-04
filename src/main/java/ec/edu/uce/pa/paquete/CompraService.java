package ec.edu.uce.pa.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
public class CompraService {
    @Inject
    @Named("mail")
    private Notificacion notificacionCorreo;

    public void realizar(Compra compra) {
        System.out.println("Realizando compra...");
        System.out.println("Compra realizada por el cliente: " + compra.getCliente());
        System.out.println("Producto: " + compra.getProducto());
        System.out.println("Total: " + compra.getTotal());
        System.out.println("Correo: " + compra.getCorreo());
        System.out.println("Compra realizada con éxito...");

        String cuerpo = "Estimado " + compra.getCliente()
                + ", su compra de " + compra.getProducto()
                + " ha sido procesada.";

        this.notificacionCorreo.enviar(compra.getCorreo(), cuerpo);
        this.notificacionCorreo.setCantidad(this.notificacionCorreo.getCantidad() + 1);
        System.out.println("Cantidad de correos enviados compra: " + this.notificacionCorreo.getCantidad());
        System.out.println("nombre: "+this.notificacionCorreo.getNombre());
    }
}
