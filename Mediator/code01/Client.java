import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client{
    // Porta do servidor
    public static final int PORTA = 8089;
    public static void main(String[] args){
        
        try{
            // Socket para iniciar a conexão com o server
            Socket socket = new Socket("localhost", PORTA);
            System.out.println("Conectando ao chat!");
            // Thread para enviar mensagens ao server
            new Thread(() -> {
                // Pega dados de entrada
                try(BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()))){
                    // Confirma o recebimento de mensagens
                    String serverMSG;
                    while((serverMSG = entrada.readLine()) != null){
                        System.out.println("[Mensagem Recebida]: " + serverMSG);
                    }
                }catch(IOException e){
                    System.out.println("Conexão encerrada!");
                }
            }).start();
            
            // Dados de saída
            PrintWriter saida = new PrintWriter(socket.getOutputStream(), true);
            Scanner scan = new Scanner(System.in);
            // Impressão
            while(true){
                String msg = scan.nextLine();
                saida.println(msg);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}