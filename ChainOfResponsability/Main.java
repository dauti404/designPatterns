public class Main {
    public static void main(String[] args) {
        // Cria os handlers de acordo com o tamanhao
        Handler handlerBaixo = new HandlerBaixoValor();
        Handler handlerMedio = new HandlerMedioValor();
        Handler handlerAlto = new HandlerAltoValor();

        // Monta a cadeia: Baixo -> Médio -> Alto
        handlerBaixo.setProximoHandler(handlerMedio);
        handlerMedio.setProximoHandler(handlerAlto);

        // Requisições do usuário
        Requisicao req1 = new Requisicao("Sandália", 50.0);
        Requisicao req2 = new Requisicao("Mouse", 500.0);
        Requisicao req3 = new Requisicao("Smartphone", 2000.0);

        // Envia as requisições para o início da cadeia
        handlerBaixo.processarRequisicao(req1);
        handlerMedio.processarRequisicao(req2);
        handlerAlto.processarRequisicao(req3);
    }
}