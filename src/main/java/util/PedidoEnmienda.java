package util;

public class PedidoEnmienda extends Pedido{


    @Override
    public void asignarRepartidor (String idPedido, String direccionEntrega, String tipoPedido){
        System.out.println("Pedido de " + tipoPedido + " asignado");
        System.out.println("Asignando repartidor...");
        System.out.println("Verificando requerimientos de su pedido id: " + idPedido + ", a enviar a la siguiente Direccion: " + direccionEntrega);
        System.out.println("Buscando al repartidor mas adecuado para completar su pedido");
        System.out.println("Repartidor ha sido asignado correctamente");
    }

    @Override
    public void asignarRepartidor (String idPedido, String direccionEntrega, String tipoPedido, String nombreRepartidor){
        System.out.println("Pedido de " + tipoPedido + " asignado");
        System.out.println("Asignando repartidor...");
        System.out.println("Verificando requerimientos de su pedido id: " + idPedido + ", a enviar a la siguiente Direccion: " + direccionEntrega);
        System.out.println("Validando el Peso y el Embalaje de su pedido");
        System.out.println("Repartidor " + nombreRepartidor + " ha sido asignado");

    }
}
