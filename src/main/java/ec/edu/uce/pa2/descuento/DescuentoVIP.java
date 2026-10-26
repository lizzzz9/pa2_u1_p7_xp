package ec.edu.uce.pa2.descuento;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped 
@Named("descuentoVIP")
public class DescuentoVIP implements CalculadoraDescuento {

    @Override
    public double calcular(double monto) {
        System.out.println("Descuento VIP se aplicara un descuento del 15%");
        return monto * 0.15;
    }

}
