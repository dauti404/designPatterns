// Objeto a ser atribuído estados
public class Celular{
    // Variáveis
    private State conectado;
    private State desconectado;
    private State estadoAtual;
    
    // Constructor
    public Celular(){
        // Instância novo do estado atribuído a variáveis
        conectado = new EstadoConectado(this);
        desconectado = new EstadoDesconectado(this);
        // Guarda o estado atual
        estadoAtual = desconectado;
    }
  
    // Seta o estado
    public void setEstado(State novoEstado){
        this.estadoAtual = novoEstado;
    }
    
    // Retorna os estados
    public State getEstadoConectado(){
        return conectado;
    }
    
    public State getEstadoDesconectado(){
        return desconectado;
    }
    
    // atribui os estado quando solicitados
    public void conectado(){
        estadoAtual.conectado();
    }

    public void desconectado(){ 
        estadoAtual.desconectado();
    }
}