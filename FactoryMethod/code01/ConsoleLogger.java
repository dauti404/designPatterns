// Produto concreto implemento do método do produto abstrato
public class ConsoleLogger extends Logger {
    // Sobrescrevendo o método do produto abstrado
    @Override
    // Implementando lógico no método concreto
    public void log(String texto){
        // Lógica
        System.out.println("Log do Console: " + texto);
    }
}