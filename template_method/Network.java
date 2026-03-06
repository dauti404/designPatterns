// Template Method
public abstract class Network {
    // Etapas a serem usados em subclasses
    String username;
    String password;
    
    // Construct
    Network(){}
    
    // Método de confirmação de acesso
    public boolean post(String message){
        if(logIn(this.username, this.password)){
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }
    
    // Métodos para uso das subclasses
    abstract boolean logIn(String username, String password);
    abstract boolean sendData(byte[] date);
    abstract void logOut();
}