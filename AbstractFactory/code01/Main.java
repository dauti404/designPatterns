import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opc = 0;

        System.out.println("1. Botão Linux");
        System.out.println("2. Botão Windows");
        System.out.println("3. Botão MacOsX");
        System.out.println("Qual o tipo de botão");
        opc = scan.nextInt();

        switch (opc) {
            case 1:
                // Mostrar um confirmação para o usuário
                System.out.println("\nCriando um botão Linux");
                LinuxButton linuxbutton = new LinuxButton();
                linuxbutton.button();
                // Instância do objeto Application e no construct uma Instância de Factory (sub fábrica)
                Application appLinux = new Application(new LinuxFactory());
                // Cria a interface do button - produto concreto
                appLinux.buttonUI();
                break;
            case 2:
                System.out.println("\nCriando um botão Windows");
                WinButton winbutton = new WinButton();
                winbutton.button();
                Application appWin = new Application(new WinFactory());
                appWin.buttonUI();
                break;
            case 3:
                System.out.println("\nCriando um botão MacOsX");
                MacButton macbutton = new MacButton();
                macbutton.button();
                Application appMac = new Application(new MacFactory());
                appMac.buttonUI();
                break;
        }
    }
}
