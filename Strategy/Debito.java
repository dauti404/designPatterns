// Objeto concreto
public class Debito implements MetodoPagamento{
    // Implementando método
    public void pagar(double valor){
        System.out.println("Pago R$: " + valor + " - No Débito.");
    }
}