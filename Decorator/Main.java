public class Main {
    public static void main(String[] args) {
        // Instância de café do tipo simples
        Cafe meuCafe = new CafeSimples();
        System.out.println("Café: " + meuCafe.getDescricao());
        System.out.println("Custo: " + meuCafe.getCusto());
        
        // Instância de café do tipo com leite com variável no construtor
        meuCafe = new CafeComLeite(meuCafe);
        System.out.println("Café: " + meuCafe.getDescricao());
        System.out.println("Custo: " + meuCafe.getCusto());
    }
}