package com.edu.ec.negocio;

public class PagoService {
    public boolean procesar(Pedido pedido) {
        System.out.println("Iniciando proceso de pago del cliente: " +pedido.getCliente());
        System.out.println("monto a cobrar: $" +pedido.getTotal()+"por cantidad: "+pedido.getCantidad());
        return true;
    }

}
