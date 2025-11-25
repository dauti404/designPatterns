// Fábrica abstrata
interface FactoryAbstract{
    // Método da fábrica abstrata
    // Composição do produto - Crianda uma herança com o produto abstrato
    // Cria um método para as fábricas concretas
    Product createProductConcrete();
}