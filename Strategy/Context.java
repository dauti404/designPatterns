// Contexto que o objeto será usadp
class Context {
    // Composição
    private MetodoPagamento metodoPagamento;
    
    // Seta o tipo de objeto
    public void setMetodoPagamento(MetodoPagamento metodoPagamento){
        this.metodoPagamento = metodoPagamento;
    }
    
    // Finaliza o pagamento
    public void finalizar(double valor){
        metodoPagamento.pagar(valor);
    }
}