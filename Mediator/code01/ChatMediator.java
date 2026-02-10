// Mediator
interface ChatMediator{
    // Enviar a mensagem (Aguarda a mensagem, user que envio a mensagem)
    void sendMessage(String msg, User user);
    // Método que adiciona usuários ao socket
    void addUser(User user);
}