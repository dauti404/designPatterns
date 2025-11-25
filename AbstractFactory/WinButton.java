// Produto concreto implementando o produto abstrato
class WinButton implements Button{
    // Sobrescrevendo o método do produto abstrato
    @Override
    // Método que impimir o produto concreto para o cliente do tipo Windows
    public void button(){
        System.out.println("Criando um botão Windows");
    }
}