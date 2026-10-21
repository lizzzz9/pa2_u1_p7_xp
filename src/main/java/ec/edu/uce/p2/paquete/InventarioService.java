package ec.edu.uce.p2.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@RequestScoped  

public class InventarioService {
    @Inject
    private PagoService pagoService;
    @Inject 
    private FacturaService facturaService;

public boolean verificar(Pedido pedido) {
 

        System.out.println("verificando si existe el producto... ");
        boolean hayStock = true;
        if (hayStock) {
            System.out.println("si hay stock disponible. Se han descontado " + pedido.getCantidad() + " unidades de " + pedido.getProducto());
            System.out.println("Pedido realizado con exito...");
            this.pagoService.procesar(pedido);
            this.facturaService.generar(pedido);
            return true;
        } else {
            System.out.println("No esta en stock para " + pedido.getProducto());
            return false;
        }
    }
}
