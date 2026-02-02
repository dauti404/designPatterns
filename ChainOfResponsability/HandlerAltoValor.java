// Handler para requisições de alto valor
public class HandlerAltoValor extends Handler {
    // Sobrescreve o método 
    @Override
    public void processarRequisicao(Requisicao requisicao) {
        // Verifica o tamanho da requisição acima do valor de escopo
        if (requisicao.getValor() >= 1000) {
            // Mensagem de confirmação
            System.out.println("Alto Valor: Processado por HandlerAltoValor. Valor: " + requisicao.getValor() + " Produto: " + requisicao.getTipo());
        } else {
            // Mensagem de fim de cadeia das requisições
            System.out.println("Alto Valor: Não processado. Fim da cadeia.");
        }
    }
}
