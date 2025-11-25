// Produto concreto implementando o produto abstrato
class MacButton implements Button{
     // Sobrescrevendo o método do produto abstrato
    @Override
    // Método que imprimi o produto concreto para o cliente do tipo MacOsX
    public void button(){
        System.out.println("Botão MacOs criado!");
    }
}