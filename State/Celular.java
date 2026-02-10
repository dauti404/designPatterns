// Objeto a ser atribuído estados
public class Celular{
    // Variáveis
    private State conectado;
    private State desconectado;
    private State estadoAtual;
    private State desligado;
    private State ligado;
    //private State power;
    
    // Constructor
    public Celular(){
        // Instância novo do estado atribuído a variáveis
        conectado = new EstadoConectado(this);
        desconectado = new EstadoDesconectado(this);
        // Guarda o estado atual
        estadoAtual = desconectado;
        
        desligado = new EstadoDesligado(this);
        ligado = new EstadoLigado(this);
        //estadoAtual = desligado;
    }
  
    // Seta o estado
    public void setEstado(State novoEstado){
        this.estadoAtual = novoEstado;
    }
    
    public void setPower(State estadoNovo){
        this.estadoAtual = estadoNovo;
    }
    
    // Retorna os estados
    public State getEstadoConectado(){
        return conectado;
    }
    
    public State getEstadoDesconectado(){
        return desconectado;
    }
    
    public State getEstadoDesligado(){
        return desligado;
    }
    
    public State getEstadoLigado(){
        return ligado;
    }
    
    // Método que atribui os estado quando solicitados
    public void conectado(){
        estadoAtual.conectado();
    }

    public void desconectado(){ 
        estadoAtual.desconectado();
    }
    
    public void desligado(){
        estadoAtual.desligado();
    }
    
    public void ligado(){
        estadoAtual.ligado();
    }
}