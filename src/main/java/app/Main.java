package app;


import util.PedidoComida;
import util.PedidoEnmienda;
import util.PedidoExpress;

public class Main {
    public static void main(String[] args) {
    System.out.println("Iniciando programa");
    //El orden de llenado de los pedidos es idPedido, direccionEntrega, tipoPedido, distanciaKilometros.

    PedidoComida pedido1 = new PedidoComida(1, "calle Freire 123", "Comida", 2);
        /*pedido1.asignarRepartidor();
        System.out.println("Pedido completado");
        System.out.println("-----------------------------------");*/
        pedido1.mostrarResumen();
        System.out.println("-----------------------------------");
        pedido1.mostrarTiempoEntrega();
        System.out.println("-----------------------------------");
        pedido1.asignarRepartidor("Juan Carlos Parraguez");
        System.out.println("Pedido completado");
        System.out.println("-----------------------------------");




    PedidoEnmienda pedido2 = new PedidoEnmienda(2, "calle Freire 789", "Enmienda", 4.5);
        /*pedido2.asignarRepartidor();
        System.out.println("Pedido completado");
        System.out.println("-----------------------------------");*/
        pedido2.mostrarResumen();
        System.out.println("-----------------------------------");
        pedido2.mostrarTiempoEntrega();
        System.out.println("-----------------------------------");
        pedido2.asignarRepartidor("Ana Maria Garcia");
        System.out.println("Pedido completado");
        System.out.println("-----------------------------------");



    PedidoExpress pedido3 = new PedidoExpress(3, "calle Blanco 456", "Express", 7);
        /*pedido3.asignarRepartidor();
        System.out.println("Pedido completado");
        System.out.println("-----------------------------------");*/
        pedido3.mostrarResumen();
        System.out.println("-----------------------------------");
        pedido3.mostrarTiempoEntrega();
        System.out.println("-----------------------------------");
        pedido3.asignarRepartidor("Pedro Rodrigo Perez");
        System.out.println("Pedido completado");
        System.out.println("-----------------------------------");




    }



}
