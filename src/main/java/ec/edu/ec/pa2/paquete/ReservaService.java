package ec.edu.ec.pa2.paquete;

import ec.edu.ec.pa2.paquete.Interceptors.TiempoEjecucion;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped 
public class ReservaService {

    @Inject 
    private NotificacionService notificacionService;    

    @Inject 
    private FacturacionService facturacionService;  
    @TiempoEjecucion
    public Reserva procesarReserva(String cliente, double monto) {
        try {
            Thread.sleep(300);// 300 ms de demora en el procesamiento de la reserva
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();

        }
        System.out.println("Procesando eserva para el cliente: " + cliente);
        Reserva nuevaReserva =  new Reserva("RES-001" + System.currentTimeMillis(), cliente, monto, "CREADA");

        notificacionService.enviarCorreo(cliente," Su reserva ha sido procesada con éxito. ID de reserva: " + nuevaReserva.getId());
        facturacionService.generarFactura(nuevaReserva);
        return nuevaReserva;
    }
}
