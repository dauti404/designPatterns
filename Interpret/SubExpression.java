// Class que faz soma de números
class SubExpression implements Expression {
    // Variáreis do tipo expression
    private Expression left, right;
    
    // Construtor
    public SubExpression(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    
    // Implementando o interpret
    @Override
    public int interpret(){
        // Retornar a expression left e right e subtraí os números digitados pelo usuário
        return left.interpret() - right.interpret();
    }
}