// Class Handler que processa as requisições e
// solicita um handler de valor diferente
public abstract class Handler {
    // Composição
    protected Handler proximoHandler;

    // Set o handler da solicitação de acordo com o tamanho do valor
    public void setProximoHandler(Handler proximoHandler) {
        this.proximoHandler = proximoHandler;
    }
    
    // Processa a requisição do usuário com composição
    public abstract void processarRequisicao(Requisicao requisicao);
}
