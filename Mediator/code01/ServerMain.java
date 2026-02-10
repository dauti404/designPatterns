// Código principal para gerenciar o servidor
public class ServerMain{
    public static void main(String[] args){
        // Porta de acesso do server
        int porta= 8089;
        // Criando um server do chat na porta acima
        ChatServer server = new ChatServer(porta);
        server.start();
    }
}