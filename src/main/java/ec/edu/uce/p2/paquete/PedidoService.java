package ec.edu.uce.p2.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

//@ApplicationScoped//delego el control al contendor ArC
@RequestScoped 
//@Singleton
public class PedidoService {
    @Inject 
    private InventarioService inventarioService;
     public void realizar(Pedido pedido ){
        System.out.println("realizando pedido...");
        System.out.println("Pedido realizado por el cliente :" + pedido.getCliente());
        System.out.println(" Producto :"+ pedido.getProducto());
        System.out.println("Cantidad:"+ pedido.getCantidad());
        this.inventarioService.verificar(pedido);

    }

}

