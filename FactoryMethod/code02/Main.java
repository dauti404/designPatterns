import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Scanner
        Scanner scan = new Scanner(System.in);
        
        // Objeto instanciado da classe abstrata
        // Usando a classe com Factory Method
        // Implementando o método que cria os objeto desejados pelo usuário
        Animals animal1 = FactoryAnimal.createAnimal("gato");
        Animals animal2 = FactoryAnimal.createAnimal("cachorro");
        
        // variável
        int opc;
        // GUI
        System.out.println("1. Gato");
        System.out.println("2. Cachorro");
        System.out.println("Qual animal?");
        // Capta o valor digitado pelo usuário
        opc = scan.nextInt();
        
        switch(opc){
            // Retornado o objeto gato
            case 1:
                animal1.animal("Criando um gato 🐱");
            break;
            // Retornado o objeto cachorro
            case 2:
                animal2.animal("Criando um cachorro 🐶");
            break;
            // Caso o valor digitado não exista
            default:
                System.out.println("Esse animal não existe!");
        }
    }
}// fim da classe Main