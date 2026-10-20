package ec.edu.uce.pa.paquete;

import io.quarkus.runtime.QuarkusMain;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main implements QuarkusApplication{
@Inject
private PedidoService pedidoService;
@Inject MailService mailService;

    public static void main(String [] args){
        System.out.println("Iniciando la aplicacion Quarkus...");
        Quarkus.run(args);
    }
    @Override
    public int run(String ... args){
        System.out.println("Inicando la aplicacion Quarkus");
        Pedido pedido = new Pedido(" Juan Perez ", " Laptop" , 1500.00 , "juan.perez@example"); 
        this.pedidoService.realizar(pedido);
        return 0;
    }
}
