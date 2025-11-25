// Produto concreto implementando o produto abstrato
class MacButton implements Button{
     // Sobrescrevendo o método do produto abstrato
    @Override
    // Método que impimir o produto concreto para o cliente do tipo MacOsX
    public void button(){
        System.out.println("Criando um botão MacOs");
    }
}