// Factory Method - implementado
public class FactoryAnimal {
    // Método concreto com composição da classe abstrata
    // Cria outro método para geração de novos objetos
    public static Animals createAnimal(String tipo){
        // Lógica do método que instância as subclasses e cria os objetos
        if(tipo.equalsIgnoreCase("gato")){
            return new GatoAnimal();
        } else if(tipo.equalsIgnoreCase("cachorro")){
            return new CachorroAnimal();
        }
        // Caso não exista a classe-objeto desejada pelo usuário
        else {
            throw new IllegalArgumentException("Esse animal não existe!");
        }
    }
}// fim da classe