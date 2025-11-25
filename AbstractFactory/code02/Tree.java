// Produto concreto
class Tree implements Product{
    // Sobrescreve o método do produto abstrato
    @Override
    // Crio o produto concreto
    public void product(){
        System.out.println("Árvore criada!");
    }
}