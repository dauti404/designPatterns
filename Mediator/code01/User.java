// Métodos para criar e armazenar os usuários
abstract class User{
    protected ChatMediator mediator;
    protected String name;
    
    public User(ChatMediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }
    
    // Métodos para receber e enviar mensagens
    public abstract void send(String msg);
    public abstract void receive(String msg);
}