package app;


import util.PedidoComida;
import util.PedidoEnmienda;
import util.PedidoExpress;

public class Main {
    public static void main(String[] args) {
    System.out.println("Iniiando programa");

    PedidoComida pedido1 = new PedidoComida();
        pedido1.asignarRepartidor("1", "calle Freire 123", "Comida");
        System.out.println("Pedido completado");
        System.out.println("-----------------------------------");

        pedido1.asignarRepartidor("2", "calle Freire 456", "Comida", "Juan Carlos Parraguez");
        System.out.println("Pedido completado");
        System.out.println("-----------------------------------");



    PedidoEnmienda pedido2 = new PedidoEnmienda();
        pedido2.asignarRepartidor("3", "calle Freire 789", "Enmienda");
        System.out.println("Pedido completado");
        System.out.println("-----------------------------------");

        pedido2.asignarRepartidor("4", "calle Blanco 123", "Enmienda", "Ana Maria Garcia");
        System.out.println("Pedido completado");
        System.out.println("-----------------------------------");


    PedidoExpress pedido3 = new PedidoExpress();
        pedido3.asignarRepartidor("5", "calle Blanco 456", "Express");
        System.out.println("Pedido completado");
        System.out.println("-----------------------------------");

        pedido3.asignarRepartidor("6", "calle Blanco 789","Express","Pedro Rodrigo Perez");
        System.out.println("Pedido completado");
        System.out.println("-----------------------------------");



    }



}
