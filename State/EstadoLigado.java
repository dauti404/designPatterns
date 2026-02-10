// Implementa a interface State
public class EstadoLigado implements State{
    private Celular celular;

    // Constructor
    public EstadoLigado(Celular celular){
        this.celular = celular;
    }
    
    // Método que atribui o estado ligado
    public void ligado(){
        System.out.println("Celular ligado!");
        celular.setEstado(celular.getEstadoLigado());
    }
    
    public void conectado(){
        System.out.println("Celular já conectado à internet!");
    }
    
    public void desconectado(){
        System.out.println("Celular não conectado à internet!");
    }
    
    public void desligado(){
        System.out.println("Celular desligado!");
    }
}