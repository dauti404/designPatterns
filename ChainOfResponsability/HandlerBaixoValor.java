// Handler para requisições de baixo valor
public class HandlerBaixoValor extends Handler {
    // Sobrescreve o método 
    @Override
    public void processarRequisicao(Requisicao requisicao) {
        // Verifica o tamanho da requisição 
        if (requisicao.getValor() < 100) {
            // Retorna se for muito baixo
            System.out.println("Baixo Valor: Processado por HandlerBaixoValor. Valor: " + requisicao.getValor() + " Produto: " + requisicao.getTipo());
        } else {
            // Retorno se a requisição não for processado no handler
            System.out.println("Baixo Valor: Não processado. Repassando...");
            // Atribui o valor ao próximo handler
            if (proximoHandler != null) {
                proximoHandler.processarRequisicao(requisicao);
            }
        }
    }
}
