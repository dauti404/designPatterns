// Conta concreta - Google
public class Google extends Network{
    // Construct
    public Google(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    // Menu de logIn do usuário
    public boolean logIn(String username, String password){
        System.out.println("\nVerificando usuário...");
        System.out.println("User: " + username);
        System.out.println("Password: " + password);
        // Método simples para esconder senha
        for(int i = 0; i < this.password.length(); i++){
            System.out.print("*");
        }
        // Simula uma latência enquanto verifica o usuário
        latencia();
        System.out.println("\nAcesso Autorizado!");
        return true;
    }
    
    // Mensagem de sucesso
    public boolean sendData(byte[] data){
        boolean messageConfirm = true;
        if(messageConfirm){
            System.out.println("Message: " + new String(data) + " 'conta google acessada!'");
            return true;
        }else{
            return false;
        }
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