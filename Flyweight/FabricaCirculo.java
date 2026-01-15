import java.util.HashMap;
import java.util.Map;

// Vai fabricar o círculo
// Se ele não estiver instanciado e instância um objeto novo de círculo
public class FabricaCirculo {
    // Variável que guarda os círculos criado
    private Map<String, Circulo> circulos = new HashMap<>();
 
    // Verifica a existência de objetos do tipo círculo
    public Circulo getCirculo(String cor) {
        // Armazena os dados numa composição de círculo
        Circulo circulo = circulos.get(cor);

        // Confirma se ele existe
        if(circulo == null){
            // Instância um novo obejto
            circulo = new Circulo(cor);
            // Atribui os valores a variável que os guarda
            circulos.put(cor, circulo);
            // Confirmação para o usuário
            System.out.println("Criando um circulo com a cor: " + cor);
        }
        // Retorna o círculo já criado
        return circulo;
    }
}