public class Main{
    public static void main(String[] args){
        System.out.println("Criando uma interface");
        
        Application appLinux = new Application(new LinuxFactory());
        appLinux.buttonUI();
        
        System.out.println("\n-----------------------\n");
        
        System.out.println("Criando um botão");
        Application appWin = new Application(new WinFactory());
        appWin.buttonUI();
        // só um teste
    }
}