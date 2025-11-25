public class Main{
    public static void main(String[] args){
        System.out.println("Criando uma interface\n");
        
        // Mostrar um confirmação para o usuário
        System.out.println("Criando um botão Linux");
        // Instância do objeto Application e no construct uma Instância de Factory (sub fábrica)
        Application appLinux = new Application(new LinuxFactory());
        // Cria a interface do button - produto concreto
        appLinux.buttonUI();
        
        System.out.println("\n-----------------------\n");
        
        System.out.println("Criando um botão Windows");
        Application appWin = new Application(new WinFactory());
        appWin.buttonUI();
        
        System.out.println("\n-----------------------\n");
        
        System.out.println("Criando um botão MacOsX");
        Application appMac = new Application(new MacFactory());
        appMac.buttonUI();
    }
}