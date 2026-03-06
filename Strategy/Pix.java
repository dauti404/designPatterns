// Objeto concreto
public class Pix implements MetodoPagamento{
    // Implementando método
    public void pagar(double valor){
        System.out.println("Pago R$: " + valor + " - No PIX.");
    }
}