// Componente Concreto - o que vamos decorar
class CafeSimples implements Cafe{
    // Sobrescreve o método getDescricao
    // Inserindo dados
    @Override
    public String getDescricao(){
        return "Café simples";
    }
    
    // Sobrescreve o método getCusto
    // Inserindo valor
    @Override
    public double getCusto(){
        return 10.00;
    }
}