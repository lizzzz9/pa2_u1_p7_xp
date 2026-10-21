package ec.edu.uce.p2.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Singleton;

//@ApplicationScoped
//@Singleton 
@RequestScoped 
public class FacturaService {
    public void generar(Pedido pedido) {
        double totalConIva = pedido.getTotal();
        double subTotal = totalConIva / 1.15;
        double iva = totalConIva - subTotal;
        System.out.println("Generando factura electrónica...");
        System.out.println("---------------------------------------------");
        System.out.println("Número de cédula: " + pedido.getCedulaCliente());
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("detalle :" + pedido.getProducto() + "x " + pedido.getCantidad());
        System.out.println("Correo :" + pedido.getCorreo());
        System.out.println(String.format("Subtotal (7x $150): $%.2f", subTotal));
        System.out.println(String.format("IVA (15%%): $%.2f", iva));
        System.out.println(String.format("Total a pagar: $%.2f", totalConIva));
        System.out.println("---------------------------------------------");
        System.out.println("Factura exitosamente generada.");

    }
}
