// Implementa a interface State
public class EstadoDesligado implements State{
    private Celular celular;
    
    // Constructor
    public EstadoDesligado(Celular celular){
        this.celular = celular;
    }
    
    // Método que atribui o estado desligado
    public void desligado(){
        System.out.println("Celular desligado!");
        celular.setEstado(celular.getEstadoDesligado());
    }
    
    public void conectado(){
        System.out.println("Celular já conectado à internet!");
    }
    
    public void desconectado(){
        System.out.println("Celular não conectado à internet!");
    }

    public void ligado(){
        System.out.println("Celular ligado!");
    }
}