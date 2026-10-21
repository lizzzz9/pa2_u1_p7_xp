package ec.edu.uce.p2.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Singleton;

//@Singleton 
@RequestScoped 

public class PagoService {

  public boolean procesar(Pedido pedido) {
        System.out.println("Iniciando proceso de pago del cliente: " +pedido.getCliente());
        System.out.println("monto a cobrar: $" +pedido.getTotal()+"por cantidad: "+pedido.getCantidad());
        return true;
    }
}
