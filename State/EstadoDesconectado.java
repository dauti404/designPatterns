// Implementa a interface State
public class EstadoDesconectado implements State{
    // Variável
    private Celular celular;
    
    // Constructor
    public EstadoDesconectado(Celular celular){
        this.celular = celular;
    }
    
    // Desconecta o celular da internet
    public void desconectado(){
        System.out.println("Celular desconectado!");
        // Externo: seta o estado atual - desconectado
        // Interno: retorna o estado desconectado da rede
        celular.setEstado(celular.getEstadoDesconectado());
    }
    
    public void conectado(){
        System.out.println("Celular já conectado à internet!");
    }
    
    public void ligado(){
        System.out.println("Celular ligado!");
    }
    
    public void desligado(){
        System.out.println("Celular desligado!");
    }
}