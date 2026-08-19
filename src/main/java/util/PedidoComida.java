package util;

public class PedidoComida extends Pedido {


    public PedidoComida(int idPedido, String direccionEntrega, String tipoPedido, double distanciaKilometros) {
        super(idPedido, direccionEntrega, tipoPedido, distanciaKilometros);
        calcularTiempoEntrega();


    }
    @Override
    public double calcularTiempoEntrega() {
        tiempoEntrega = 15 + (distanciaKilometros*2);
        return tiempoEntrega;
    }



    @Override
    public void mostrarResumen() {
        super.mostrarResumen();
    }

    @Override
    public void asignarRepartidor (){
        System.out.println("Pedido de " + tipoPedido + " asignado");
        System.out.println("Asignando repartidor...");
        System.out.println("Verificando requerimientos de su pedido id: " + idPedido + ", a enviar a la siguiente Direccion: " + direccionEntrega+ ", distancia: " + distanciaKilometros + " km");
        System.out.println("Buscando al repartidor mas adecuado para completar su pedido");
        System.out.println("Repartidor ha sido asignado correctamente, tiempo estimado de entrega: " + calcularTiempoEntrega() + " minutos");
    }


    @Override
    public void asignarRepartidor (String nombreRepartidor){
        System.out.println("Pedido de " + tipoPedido + " asignado");
        System.out.println("Verificando requerimientos de su pedido id: " + idPedido + ", a enviar a la siguiente Direccion: " + direccionEntrega+ ", distancia: " + distanciaKilometros + " km");
        System.out.println("Asignando repartidor...");
        System.out.println("Busando un repartidor con Mochila termica para completar su pedido");
        System.out.println("Repartidor " + nombreRepartidor +  " ha sido asignado, tiempo estimado de entrega: " + calcularTiempoEntrega() + " minutos");

    }

    @Override
    public void mostrarTiempoEntrega() {
        super.mostrarTiempoEntrega();
    }
}
