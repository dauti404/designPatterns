public class Main{
    public static void main(String[] args){
        // Cliente criando uma árvore
        System.out.println("Criando uma árvore\n");
        // Instanciando o produto concreto e criando um objeto
        Tree treeConcrete = new Tree();
        // Criando o produto concreto
        treeConcrete.product();
        // Faz uma solicitação para fábrica abstrata - cria o produto abstrato
        Application app = new Application(new TreeFactory());
        // Mostra o produto já criado concretamente
        app.productUI();
    }
}