package util;

public abstract class Pedido {
      int  idPedido;
      String direccionEntrega;
      String tipoPedido;
      double distanciaKilometros;
      double tiempoEntrega;
      String nombreRepartidor;


      public Pedido(int idPedido, String direccionEntrega, String tipoPedido, double distanciaKilometros){
          this.idPedido = idPedido;
          this.direccionEntrega = direccionEntrega;
          this.tipoPedido = tipoPedido;
          this.distanciaKilometros = distanciaKilometros;
      }


    public void asignarRepartidor (){
          System.out.println("Pedido de" + tipoPedido + " asignado");
          System.out.println("Asignando repartidor...");
          System.out.println("Verificando requerimientos de su pedido id: " + idPedido + ", a enviar a la siguiente Direccion: " + direccionEntrega+ ", distancia: " + distanciaKilometros + " km");
          System.out.println("Buscando al repartidor mas adecuado para completar su pedido");
          System.out.println("Repartidor ha sido asignado");
    }


    public void asignarRepartidor (String nombreRepartidor){
         System.out.println("Pedido" + tipoPedido + " asignado");
         System.out.println("Asignando repartidor...");
         System.out.println("Verificando requerimientos de su pedido");
         System.out.println("Repartidor " + nombreRepartidor + " ha sido asignado");

    }

    public void mostrarResumen(){
        System.out.println("Resumen del pedido:");
          System.out.println("Tipo de Pedido: " + tipoPedido + " || id: " + idPedido + " || Direccion: " + direccionEntrega + " || Distancia: " + distanciaKilometros + " km" + " || Tiempo de entrega: " + tiempoEntrega + " minutos");
    }


public abstract double calcularTiempoEntrega();

public void mostrarTiempoEntrega(){
    System.out.println("Tiempo estimado de entrega: " + tiempoEntrega + " minutos");
}
}
