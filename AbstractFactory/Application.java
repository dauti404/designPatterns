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
        // Composição que armazena o produto concreto no produto abstrato
        button.button();
    }
}