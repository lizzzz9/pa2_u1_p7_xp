package ec.edu.ec.pa2.paquete;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FacturacionService {
    public void generarFactura(Reserva reserva) {
        System.out.println("FACTURACION: Generando factura electronica para la reserva:" + reserva.getId()
                + "por un valor de $" + reserva.getMonto());
    }

}
