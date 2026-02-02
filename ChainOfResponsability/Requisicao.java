// Classe objeto da requisição
public class Requisicao {
    // Variáveis da requisição
    private String tipo;
    private double valor;

    // Construtor
    public Requisicao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    // Métodos de retorno dos dados
    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}