// Fábrica dos produtos concretos
public class LoggerFactory {
    // Cria um método novo através de uma composição com o produto abstrato
    // Este método cria os objetos concretos para o usuário
    public static Logger createLogger(String tipo){
        // Lógico dos objetos
        if(tipo.equalsIgnoreCase("console")){
            return new ConsoleLogger();
        } else if(tipo.equalsIgnoreCase("file")){
            return new FileLogger();
        } else {
            throw new IllegalArgumentException("Este tipo de log não existe");
        }
    }
} // fim da classe