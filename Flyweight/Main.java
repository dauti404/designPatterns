public class Main {
    // String com as cores desejadas pelo usuário
    private static final String cores[] = {"Azul", "Vermelho"};
    
    public static void main(String[] args) {
        // Instância da fábrica 
        FabricaCirculo fabrica = new FabricaCirculo();
        
        // Defini a quantidade de círculo que vão ser criados
        for(int i = 0; i <=10; i++){
            // Composição para a fabricação de círculos com uma cor definida no construtor
            Circulo circulo = fabrica.getCirculo("Vermelho");
            // Valores para desenhar o círculo, X, Y e raio.
            circulo.desenhar(10, 15, 5);
        }
    
    }
}