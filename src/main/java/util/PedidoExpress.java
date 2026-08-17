package util;

public class PedidoExpress extends Pedido{



    @Override
    public void asignarRepartidor (String idPedido, String direccionEntrega, String tipoPedido){
        System.out.println("Pedido " + tipoPedido + " asignado");
        System.out.println("Asignando repartidor...");
        System.out.println("Verificando requerimientos de su pedido id: " + idPedido + ", a enviar a la siguiente Direccion: " + direccionEntrega);
        System.out.println("Buscando al repartidor mas adecuado para completar su pedido");
        System.out.println("Repartidor ha sido asignado correctamente");

    }
    @Override
    public void asignarRepartidor (String idPedido, String direccionEntrega, String tipoPedido, String nombreRepartidor){
        System.out.println("Pedido " + tipoPedido + " asignado");
        System.out.println("Asignando repartidor...");
        System.out.println("Verificando requerimientos de su pedido id: " + idPedido + ", a enviar a la siguiente Direccion: " + direccionEntrega);
        System.out.println("Buscando al repartidor mas cercano disponible para completar su pedido a la mayor brevedad posible");
        System.out.println("Repartidor " + nombreRepartidor + " ha sido asignado");

    }
}
