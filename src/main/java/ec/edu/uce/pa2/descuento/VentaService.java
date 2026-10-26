package ec.edu.uce.pa2.descuento;

import java.util.UUID;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
public class VentaService {
    private final String id = UUID.randomUUID().toString();

    // Inyeccíon por constructor
    private final CalculadoraDescuento regular;

    // Inyeccíon por atributo
    @Inject
    @Named("descuentoVIP")
    private CalculadoraDescuento vip;

    @Inject
    Instance<Auditoria> auditorias;

    @Inject
    public VentaService(@Named("descuentoRegular") CalculadoraDescuento regular) {
        this.regular = regular;
    }

    public double procesar(int numero, String tipo, double monto) {

        CalculadoraDescuento calculadora;

        if (tipo.equals("VIP")) {
            calculadora = vip;
        } else {
            calculadora = regular;
        }

        double descuento = calculadora.calcular(monto);
        double total = monto - descuento;

        Auditoria auditoria = auditorias.get();
        auditoria.registrar("Venta " + numero + " [" + tipo + "] monto=" + monto
                + " descuento=" + descuento + " total=" + total + " |");
        auditorias.destroy(auditoria);
        return total;

    }
}
