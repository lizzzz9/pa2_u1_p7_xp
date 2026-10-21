package ec.edu.uce.p2.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication{
@Inject
private PedidoService pedidoService;


    public static void main(String [] args){
        System.out.println("Iniciando la aplicacion Quarkus...");
        Quarkus.run(Main.class,args);
    }
    @Override
    public int run(String ... args){
        System.out.println("Inicando la aplicacion Quarkus");
        Pedido pedido = new Pedido("1712345678"," Carlos Perez ", " abrigo" ,7, 150.00 , "carlos.perez@example");
        this.pedidoService.realizar(pedido);
        return 0;
    }
}
