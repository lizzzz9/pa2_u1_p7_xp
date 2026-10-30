package ec.edu.ec.pa2.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain

public class Main implements QuarkusApplication {
    @Inject
    private ReservaService reservaService;

    @Inject
    private PagoService pagoService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);

    }

    @Override
    public int run(String... args) throws Exception {

        System.out.println("---------Iniciando la aplicacion Quarkus---------");
        Reserva miReserva = reservaService.procesarReserva("Carlos Perez", 150.0);
        System.out.println("Reserva creada con ID: " + miReserva.getId() + " -Estado: " + miReserva.getEstado());

        boolean pagoExitoso = pagoService.realizarPago(miReserva, "1234567890123456");
        if (pagoExitoso) {
            System.out.println("Pago realizado con exito para la reserva: " + miReserva.getId() + " -Estado: "
                    + miReserva.getEstado());
        } else {
            System.out.println(
                    "Fallo en el pago para la reserva: " + miReserva.getId() + " -Estado: " + miReserva.getEstado());
        }
        System.out.println("---------Finalizando la aplicacion Quarkus---------");

        return 0;
    }

}
