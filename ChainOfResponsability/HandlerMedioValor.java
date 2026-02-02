// Handler para requisições de médio valor
public class HandlerMedioValor extends Handler {
    // Sobrescreve o método 
    @Override
    public void processarRequisicao(Requisicao requisicao) {
        // Verifica o tamanho da requisição de acordo com um escopo 
        if (requisicao.getValor() >= 100 && requisicao.getValor() < 1000) {
            // Valores médios
            System.out.println("Médio Valor: Processado por HandlerMedioValor. Valor: " + requisicao.getValor() + " Produto: " + requisicao.getTipo());
        } else {
            System.out.println("Médio Valor: Não processado. Repassando...");
            // Verifica se o handler é diferente de null
            if (proximoHandler != null) {
                // Solicita o próximo handler
                proximoHandler.processarRequisicao(requisicao);
            }
        }
    }
}
