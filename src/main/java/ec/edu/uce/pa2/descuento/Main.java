package ec.edu.uce.pa2.descuento;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {
    @Inject
    private VentaService ventaService;

    public static void main(String[] args) {

        Quarkus.run(Main.class, args);

    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("Bienvenido al sistema de calculo de descuentos...");
        // Venta 1: REGULAR | $100.00 | 5% | $95.00
        System.out.println("--- Venta 1 ---");
        ventaService.procesar(1, "REGULAR", 100.00);

        // Venta 2: VIP | $200.00 | 15% | $170.00
        System.out.println("--- Venta 2 ---");
        ventaService.procesar(2, "VIP", 200.00);

        // Venta 3: REGULAR | $300.00 | 5% | $285.00[
        System.out.println("--- Venta 3 ---");
        ventaService.procesar(3, "REGULAR", 300.00);

        // Venta 4: VIP | $500.00 | 15% | $425.00
        System.out.println("--- Venta 4 ---");
        ventaService.procesar(4, "VIP", 500.00);

        System.out.println("=== FIN DEL PROCESAMIENTO ===");
        return 0;
    }

}
