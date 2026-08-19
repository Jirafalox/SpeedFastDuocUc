package util;

public class PedidoExpress extends Pedido{


    public PedidoExpress(int idPedido, String direccionEntrega, String tipoPedido, double distanciaKilometros) {
        super(idPedido, direccionEntrega, tipoPedido, distanciaKilometros);
        calcularTiempoEntrega();
    }


    @Override
    public double calcularTiempoEntrega() {
        if(distanciaKilometros > 5){
            tiempoEntrega = 15 ;
            return tiempoEntrega;
        }
        else tiempoEntrega = 10;
        return tiempoEntrega;
    }



    @Override
    public void asignarRepartidor (){
        System.out.println("Pedido " + tipoPedido + " asignado");
        System.out.println("Asignando repartidor...");
        System.out.println("Verificando requerimientos de su pedido id: " + idPedido + ", a enviar a la siguiente Direccion: " + direccionEntrega+ ", distancia: " + distanciaKilometros + " km");
        System.out.println("Buscando al repartidor mas adecuado para completar su pedido");
        System.out.println("Repartidor ha sido asignado correctamente, tiempo estimado de entrega: " + calcularTiempoEntrega() + " minutos");

    }
    @Override
    public void asignarRepartidor (String nombreRepartidor){
        System.out.println("Pedido " + tipoPedido + " asignado");
        System.out.println("Asignando repartidor...");
        System.out.println("Verificando requerimientos de su pedido id: " + idPedido + ", a enviar a la siguiente Direccion: " + direccionEntrega+ ", distancia: " + distanciaKilometros + " km");
        System.out.println("Buscando al repartidor mas cercano disponible para completar su pedido a la mayor brevedad posible");
        System.out.println("Repartidor " + nombreRepartidor + " ha sido asignado, tiempo estimado de entrega: " + calcularTiempoEntrega() + " minutos");

    }

    public void mostrarTiempoEntrega(){
        super.mostrarTiempoEntrega();
    }
}
