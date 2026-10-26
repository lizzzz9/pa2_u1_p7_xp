package ec.edu.uce.pa2.descuento;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped 
@Named("descuentoRegular")
public class DescuentoRegular implements CalculadoraDescuento {

    @Override
    public double calcular(double monto) {
        System.out.println("Descuento Regular: Se aplicara un descuento del 5%");

        return monto * 0.05;
    }

}
