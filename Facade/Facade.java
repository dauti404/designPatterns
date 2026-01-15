// Façade - código que fica entre o usuário e um
// subsistema complexo
class Facade{
    // Composição da função que estar sendo implementada
    private Digitar digitar;
    
    // Construtor que recebe uma instância do façade
    public Facade() {
        this.digitar = new Digitar();
    }
    
    // Método que o usuário usa para acessar a função
    // do subsistema
    public void iniciarDigitacao(){
        System.out.println("--- Início da digitação");
        digitar.Digitar();
    }
}