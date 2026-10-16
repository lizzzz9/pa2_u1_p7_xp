import com.edu.ec.negocio.Pedido;
import com.edu.ec.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
      //  System.out.println("Hello, World!");
        Pedido pedido = new Pedido(" Juan Perez ", " Laptop" , 1500.00 , "juan.perez@example"); // creamos el objeto de la clase pedidod
        PedidoService pedidoService = new PedidoService(); // creamos manualmente el objeto de la clase pedido service
       
        pedidoService.realizar(pedido);
        pedido = null ;
       pedidoService = null; // el objeto sea elegible por GC ( garbach colector)


        // es un entorno que se encarga de gestionar el ciclo de vida de los objetos
        // como no elegir el garbach colector es poner null el objeto 

    }
}
