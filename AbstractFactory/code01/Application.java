// Classe concreta
class Application{
    // Composição do objeto Button
    private Button button;

    // Construct de Application com composição da fábrica abstrata do produto
    public Application(GUIFactory factory){
        // variável que usa o método para criar o button, armazena em button e permite imprimir o produto
        button = factory.createButton();
    }
    
    // Método que imprimi o produto concreto
    public void buttonUI(){
        double num = 2;

        for(int i = 0; i <= num * 2; i++){
            for(int j = 0; j <= num * 2; j++){
                if(Math.pow(i - num, 2.0) + Math.pow(j - num, 2.0) <= Math.pow(num, 2.0)){
                    System.out.print("🟣");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        
        // Composição que armazena o produto concreto no produto abstrato
        // Imprimi novamente o processo de criação do button
        //button.button();
    }
}