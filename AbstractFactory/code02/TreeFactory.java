// Fábrica concreta do produto
class TreeFactory implements FactoryAbstract {
    // Sobrescreve o método da fábrica abstrata
    @Override
    // Composição do produto abstrato e o método de criação concreto
    public Product createProductConcrete(){
        return new Tree();
    }
}