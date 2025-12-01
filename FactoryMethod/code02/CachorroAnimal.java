// Subclasse concreta extendendo a classe abstrata
public class CachorroAnimal extends Animals {
    // Sobrescrevendo o método da classe abstrata
    @Override
    // Implementando o método
    public void animal(String nome){
        // Lógica do método
        System.out.println("Animal! : " + nome);
    }
}