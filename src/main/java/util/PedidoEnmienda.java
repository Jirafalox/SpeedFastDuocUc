package util;

public class PedidoEnmienda extends Pedido{


    public PedidoEnmienda(int idPedido, String direccionEntrega, String tipoPedido, double distanciaKilometros) {
        super(idPedido, direccionEntrega, tipoPedido, distanciaKilometros);
        calcularTiempoEntrega();
    }

    @Override
    public double calcularTiempoEntrega() {
        tiempoEntrega = 0;

        int redondeo = Math.toIntExact(Math.round(distanciaKilometros * 1.5));
        tiempoEntrega = 20 + redondeo;

        return tiempoEntrega;
    }

    @Override
    public void asignarRepartidor (){
        System.out.println("Pedido de " + tipoPedido + " asignado");
        System.out.println("Asignando repartidor...");
        System.out.println("Verificando requerimientos de su pedido id: " + idPedido + ", a enviar a la siguiente Direccion: " + direccionEntrega+ ", distancia: " + distanciaKilometros + " km");
        System.out.println("Buscando al repartidor mas adecuado para completar su pedido");
        System.out.println("Repartidor ha sido asignado correctamente, tiempo estimado de entrega:  "+ calcularTiempoEntrega() + " minutos");
    }

    @Override
    public void asignarRepartidor (String nombreRepartidor){
        System.out.println("Pedido de " + tipoPedido + " asignado");
        System.out.println("Asignando repartidor...");
        System.out.println("Verificando requerimientos de su pedido id: " + idPedido + ", a enviar a la siguiente Direccion: " + direccionEntrega+ ", distancia: " + distanciaKilometros + " km");
        System.out.println("Validando el Peso y el Embalaje de su pedido");
        System.out.println("Repartidor " + nombreRepartidor + " ha sido asignado, tiempo estimado de entrega: "+ calcularTiempoEntrega() + " minutos");

    }

    public void mostrarTiempoEntrega(){
        super.mostrarTiempoEntrega();
    }

}
