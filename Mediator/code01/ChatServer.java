import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ChatServer implements ChatMediator{
    // Lista de usuários
    private List<User> users = new ArrayList<>();
    private int PORTA;
    
    public ChatServer(int PORTA){
        this.PORTA = PORTA;
    }
    
    public void start(){
        try(ServerSocket server = new ServerSocket(PORTA)){
            System.out.println("Servidor criado na porta: " + PORTA);
            
            while(true){
                System.out.println("Aguardando uma conexão...");
                // Server esperando resposta
                Socket socket = server.accept();
                // Criando um usuário
                User newUser = new SocketUser(socket, this);
                this.addUser(newUser);
                
                // Thread para escutar mensagens do chat
                new Thread((SocketUser) newUser).start();
                
                /* 
                System.out.println("Cliente " + costumer.getInetAddress().getHostAddress() + " conectou!");
                
                BufferedReader leitor = new BufferedReader(new InputStreamReader(costumer.getInputStream()));
                PrintWriter escritor = new PrintWriter(costumer.getOutputStream(), true);
                
                String message = leitor.readLine();
                System.out.println("Mensagem do cliente: " + message);
                
                escritor.println("Sua mensagem foi recebida!");
                
                costumer.close();
                */
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
        
    // Adicionando usuário ao chat
    @Override
    public void addUser(User user){
        users.add(user);
    }
    
    // Verificando de quem é a mensagem
    @Override
    public void sendMessage(String msg, User originator){
        for(User u:users){
            if(u != originator){
                u.receive(msg);
            }
        }
    }
}