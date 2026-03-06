import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Entrada do usuário: ");
        String username = reader.readLine();
        System.out.print("Senha de entrada: ");
        String password = reader.readLine();
        
        // Mensagem de entrada
        System.out.print("Mensagem de entrada: ");
        String message = reader.readLine();
        
        System.out.println("\nChoose social network for posting message.\n" + 
            "1 - Google" + 
            "\n2 - Instagram");
        int choice = Integer.parseInt(reader.readLine());
        
        // Inicia o serviço solicitado pelo usuário
        if (choice == 1) {
            System.out.println("-> Acessando conta Google!");
            network = new Google(username, password);
        } else if (choice == 2){
            System.out.println("-> Entrando no Instagram.");
            network = new Instagram(username, password);
        }
        
        network.post(message);
    }
}