// Classe abstrata
abstract class Aviao {
    protected Mediator mediator;
    protected String nome;

    public Aviao(Mediator mediator, String nome) {
        this.mediator = mediator;
        this.nome = nome;
    }

    public abstract void enviar(String mensagem);
    public abstract void receber(String mensagem);
}