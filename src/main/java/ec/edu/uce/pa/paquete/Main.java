package ec.edu.uce.pa.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    PedidoService pedidoService;

    @Inject 
    MailService mailService;

    public static void main(String[] args) {
        System.out.println("Iniciando la aplicacion Quarkus...");
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) {
        System.out.println("Iniciando la aplicacion Quarkus...");
        Pedido pedido = new Pedido("Juan Perez", "juan.perez@example.com","Laptop","147852399", 1500.00); 
        this.pedidoService.realizar(pedido);
        Quarkus.waitForExit();
        return 0;
    }
}