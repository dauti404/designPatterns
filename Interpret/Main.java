public class Main{
    public static void main(String[] args){
        // Faz a substração de números
        Expression expr = new SubExpression(
            // Chama uma nova instância e inseri dois valores pelo TerminalExpression()
            new SubExpression(new TerminalExpression(8), new TerminalExpression(10)),
            // Uso da variável right
            new TerminalExpression(2)
        );
        
        // Faz a adição de números
        Expression expr2 = new AddExpression(
            // Chama uma nova instância e inseri dois valores pelo TerminalExpression()
            new AddExpression(new TerminalExpression(8), new TerminalExpression(8)),
            // Uso da variável right
            new TerminalExpression(2)
        );
        
        System.out.println("Resultado: " + expr.interpret());
        System.out.println("Resultado: " + expr2.interpret());
    }
}