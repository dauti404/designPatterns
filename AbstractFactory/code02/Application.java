class Application {
    // Atributos da classe
    // Composição do produto abstrato - variável que guarda o produto concreto
    private Product product;
    private int eixoX = 0, eixoY = 0, elementK = 0;
    private int altura = 16, copa = 0;
    
    // Construct com composição da fábrica abstrata
    public Application(FactoryAbstract factory) {
        // Criando o produto concreto e armazenando 
        product = factory.createProductConcrete();
    }
    
    // Mostra o produto concreto para o cliente
    public void productUI(){
        for(elementK = 4; elementK <= 8; elementK++) {
            for(eixoX = 1; eixoX < elementK; eixoX++) {
                for(eixoY = altura; eixoY > eixoX; eixoY--) {
                    System.out.print(" ");
                }
                for(eixoY = 0; eixoY < eixoX + copa; eixoY++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
            altura--;
            copa++;
        }
        
        for (eixoX = 1; eixoX < 9; eixoX++) {
            for(eixoY = altura + 1; eixoY > 0; eixoY--) {
                System.out.print(" ");
            }
            for(eixoY = 0; eixoY < 4; eixoY++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}