package util;

public class Pedido {
     String idPedido;
     String direccionEntrega;
     String tipoPedido;
     String nombreRepartidor;


    public void asignarRepartidor (String idPedido, String direccionEntrega, String tipoPedido){
          System.out.println("Pedido de" + tipoPedido + " asignado");
          System.out.println("Asignando repartidor...");
         System.out.println("Verificando requerimientos de su pedido id: " + idPedido + ", a enviar a la siguiente Direccion: " + direccionEntrega);
          System.out.println("Buscando al repartidor mas adecuado para completar su pedido");
          System.out.println("Repartidor ha sido asignado");
    }


    public void asignarRepartidor (String idPedido, String direccionEntrega, String tipoPedido, String nombreRepartidor){
         System.out.println("Pedido" + tipoPedido + " asignado");
         System.out.println("Asignando repartidor...");
         System.out.println("Verificando requerimientos de su pedido");
         System.out.println("Repartidor " + nombreRepartidor + " ha sido asignado");

    }






}
