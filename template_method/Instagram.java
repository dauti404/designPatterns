// Rede Social - Instagram
public class Instagram extends Network{
    // Construct
    public Instagram(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    // Menu de logIn 
    public boolean logIn(String username, String password){
        System.out.println("\nVerificando usuário...");
        System.out.println("User: " + username);
        System.out.println("Password: " + password);
        for(int i = 0; i < this.password.length(); i++){
            System.out.print("*");
        }
        // Latência
        latencia();
        System.out.println("\nLogado com sucesso!");
        return true;
    }
    
    // Mensagem para logIn com sucesso
    public boolean sendData(byte[] data){
        boolean messageConfirm = true;
        if(messageConfirm){
            System.out.println("Message: " + new String(data) + " 'login com sucesso!'");
            return true;
        }else{
            return false;
        }
        
    // Método que desloda o usuário
    public void logOut(){
        System.out.println("User " + username + " 'deslogado'");
    }
    
    // Método de latência
    private void latencia(){
        try{
            int i = 0;
            System.out.println();
            while(i < 10){
                System.out.print(".");
                // Thread com 500ms de delay
                Thread.sleep(500);
                i++;
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}