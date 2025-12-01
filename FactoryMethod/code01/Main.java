public class Main{
    public static void main(String[] args){
        // Instância do produto abstrato com o método que cria o objeto concreto
        // Classe que uso o Factory Method e implementao o método que cria o objeto concreto
        Logger logger1 = LoggerFactory.createLogger("Console");
        Logger logger2 = LoggerFactory.createLogger("file");
        
        // Testando se o objeto retorna o resultado esperado com o método do produto abstrato
        logger1.log("Testando o factory method | Logger do tipo console");
        logger2.log("Testando o factory method | Logger do tipo file");
    }
}