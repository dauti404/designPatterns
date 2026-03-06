public class Main{
    public static void main(String[] args){
        // Realizando pedido
        Context pedido = new Context();
        // Pago no pix
        pedido.setMetodoPagamento(new Pix());
        pedido.finalizar(1.000);
        // Pago no débito
        pedido.setMetodoPagamento(new Debito());
        pedido.finalizar(150.00);
    }
}