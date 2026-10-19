package com.edu.ec.negocio;

public class PedidoService {

    public void realizar(Pedido pedido ){
        System.out.println("Realizando pedido...");
        System.out.println("Pedido realizado por el cliente :" + pedido.getCliente());
        System.out.println("Producto :"+ pedido.getProducto());
        System.out.println("Cantidad:"+ pedido.getCantidad());

    }
}
