// Classe que colhe os dados da gramática
public class TerminalExpression implements Expression {
    // Colhendo números inseridos pelo usuário
    private int number;
    
    // Construtor
    public TerminalExpression(int number){
        this.number = number;
    }
    
    // Implementação do interpret
    @Override
    public int interpret(){
        // Retorna o número digitado pelo usuário
        return number;
    }
}