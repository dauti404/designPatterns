// Class main
public class App{
    public static void main(String[] args){
        // Objeto a ter estado atribuídos
        Celular c1 = new Celular();
        
        // Estado do celular conectao à internet
        c1.conectado();
        // Estado do celular desconectado da internet
        c1.desconectado();
        
        System.out.println();
        
        Celular c2 = new Celular();
        
        c2.ligado();
        c2.desligado();
    }
}