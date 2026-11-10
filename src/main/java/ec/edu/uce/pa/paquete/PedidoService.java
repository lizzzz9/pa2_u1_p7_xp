package ec.edu.uce.pa.paquete;

import jakarta.inject.Singleton;

@Singleton 
public class PedidoService {


    public String realizar(Pedido pedido) {
        Long init  = System.currentTimeMillis();

        System.out.println("realizando pedido...");
        System.out.println("Pedido realizado por el cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());
        System.out.println("Pedido realizado con exito...");
         Long fin = System.currentTimeMillis() -init; 
         return "[PedidoService] Se ha ejecutado correctamente \n Tiempo de ejecucion: " +fin;


    }
}
