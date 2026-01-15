// Decorador Abstrato - Implementa os métodos
abstract class DecoratorAbstract implements Cafe {
    // Composição da interface 
    protected Cafe cafe;
    
    // Construtor com composição 
    public DecoratorAbstract(Cafe cafe){
        this.cafe = cafe;
    }
    
    // Sobrescreve e retorna os dados
    @Override
    public String getDescricao(){
        return cafe.getDescricao();
    }
    
    // Sobrescreve e retorna os valores
    @Override
    public double getCusto(){
        return cafe.getCusto();
    }
}