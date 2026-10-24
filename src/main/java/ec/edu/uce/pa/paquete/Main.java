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
    CompraService compraService;


    public static void main(String[] args) {
        System.out.println("Iniciando la aplicacion Quarkus...");
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) {
        System.out.println("-----Iniciando la aplicacion Quarkus...");
        Pedido pedido = new Pedido("Juan Perez", "juan.perez@example.com","Laptop","147852399", 1500.00); 
        this.pedidoService.realizar(pedido);
       
        Compra compra = new Compra("Maria lopez","maria98@example.com", "Smartphone","147852936",450.0);   
        this.compraService.realizar(compra);

        return 0;
    }
}