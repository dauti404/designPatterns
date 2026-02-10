import java.util.List;
import java.util.ArrayList;

class ChatRoom implements ChatMediator{
    // Lista de usuários do chat
    private List<User> users;
    
    public ChatRoom(){
        this.users = new ArrayList<>();
    }
    
    // Adicionando users a lista do server socket
    @Override
    public void addUser(User user){
        this.users.add(user);
    }
    
    // Método que verifica se o user é diferente do originator
    // Garantindo que ele não receba sua própria mensagem
    @Override
    public void sendMessage(String msg, User originator){
        for(User u: users){
            if(u != originator){
                u.receive(msg);
            }
        }
    }
    
    
}