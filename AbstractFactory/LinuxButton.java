// Produto concreto implementando o produto abstrato
class LinuxButton implements Button{
    // Sobrescrevendo o método do produto abstrato
    @Override
    // Método que impimir o produto concreto para o cliente do tipo linux
    public void button(){
        System.out.println("Botão criado");
    }
}