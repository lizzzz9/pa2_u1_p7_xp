package com.edu.ec.negocio;

public class InventarioService {
    public boolean verificar(Pedido pedido) {
        PagoService pagoService = new PagoService();
        System.out.println("verificando si existe el producto... ");
        boolean hayStock = true;
        if (hayStock) {
            System.out.println("si hay stock disponible. Se han descontado " + pedido.getCantidad() + " unidades de " + pedido.getProducto());
            System.out.println("Pedido realizado con exito...");
            pagoService.procesar(pedido);
            return true;
        } else {
            System.out.println("No esta en stock para " + pedido.getProducto());
            return false;
        }
    }
}
