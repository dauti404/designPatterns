// Implementa a interface State
public class EstadoConectado implements State{
    // Composição do objeto Celular
    private Celular celular;
    
    // Constructor
    public EstadoConectado(Celular celular){
        this.celular = celular;
    }
    
    // Método que retorna o estado conectado
    public void conectado(){
        System.out.println("Celular conectado à internet!");
        // Externo: seta o estado atual - conectado
        // Interno: retorna o estado conectado
        celular.setEstado(celular.getEstadoConectado());
    }
    
    // Caso o celular não conecte na internet
    public void desconectado(){
        System.out.println("Celular não conectado à internet!");
    }
}