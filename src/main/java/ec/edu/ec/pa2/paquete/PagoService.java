package ec.edu.ec.pa2.paquete;

import ec.edu.ec.pa2.paquete.Interceptors.TiempoEjecucion;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class PagoService {

    @TiempoEjecucion
    public boolean realizarPago(Reserva reserva, String tarjeta) {
        System.out.println("Procesando pago de $" + reserva.getMonto() + "Para la reserva " + reserva.getId());
        if (tarjeta != null && tarjeta.length() == 16) {
            reserva.setEstado("PAGADA");
            return true;
        }
        return false;
    }
}
