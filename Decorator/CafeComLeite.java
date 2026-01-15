// Componente Concreto - o que vamos modificar
// Delega responsabilidades para uma classe diferente
class CafeComLeite extends DecoratorAbstract {
    // Construtor com composição do Componente Abstrato
    public CafeComLeite(Cafe cafe){
        // Chamando a interface Cafe
        super(cafe);
    }
    
    // Sobrescreve o getDescricao com novos dados
    @Override
    public String getDescricao(){
        return super.getDescricao() + ", com leite";
    }
    
    // Sobrescreve o getCusto com novos dados 
    @Override
    public double getCusto(){
        return super.getCusto() + 2.00;
    }
}