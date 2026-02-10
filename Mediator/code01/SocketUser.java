import java.net.*;
import java.io.*;
//import java.util.Scanner;
//public static final int PORTA = 8089;

public class SocketUser extends User implements Runnable{
    private Socket socket;
    // Para enviar dados 
    private PrintWriter saida;
    // Receber dados digitados pelo usuário
    private BufferedReader entrada;
    
    public SocketUser(Socket socket, ChatMediator mediator){
        // Retornando a porta que o usuário está acessando o chat
        super(mediator, "User: " + socket.getPort());
        this.socket = socket;
        
        // Receber dados de entrada e saída
        try{
            this.saida = new PrintWriter(socket.getOutputStream(), true);
            this.entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            /* 
            Scanner scan = new Scanner(System.in);
            Socket socket = new Socket("localhost", 8089);
        
            BufferedReader leitor = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter escritor = new PrintWriter(socket.getOutputStream(), true);
            
            System.out.println("Digite sua mensagem: ");
            String message = scan.nextLine();
            
            //String messageReceive = leitor.readLine();
            //System.out.println(messageReceive);
            
            escritor.println(message);
            
            socket.close();
            */
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    // Métodos para o controle de mensagens do chat
    @Override
    public void send(String msg){
        mediator.sendMessage(msg, this);
    }
    
    @Override
    public void receive(String msg){
        saida.println(msg);
    }
    
    // Método run() de Runnable
    @Override
    public void run(){
        try{
            String message;
            while((message = entrada.readLine()) != null){
                System.out.println(name + " enviou: " + message);
                send(message);
            } 
        }catch(IOException e){
            System.out.println(name + " desconectado.");
        }
    }
}