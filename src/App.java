import com.edu.ec.negocio.FacturaService;
import com.edu.ec.negocio.InventarioService;
import com.edu.ec.negocio.Pedido;
import com.edu.ec.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {

        Pedido pedido = new Pedido("1712345678"," Carlos Perez ", " abrigo" ,7, 150.00 , "carlos.perez@example"); // creamos el objeto de la clase pedidod
        PedidoService pedidoService = new PedidoService(); // creamos manualmente el objeto de la clase pedido service
        InventarioService inventarioService = new InventarioService();
        FacturaService facturaService = new FacturaService();
       
        pedidoService.realizar(pedido);
        inventarioService.verificar(pedido);
        facturaService.generar(pedido);

    }
}
