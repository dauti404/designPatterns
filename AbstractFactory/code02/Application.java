class Application {

    // Atributos da classe
    // Composição do produto abstrato - variável que guarda o produto concreto
    private Product product;
    // O tamanhoCopa define a Largura da copa da árvore
    private int eixoX = 0,
        eixoY = 0,
        tamanhoCopa = 0;
    private int direcaoX = 16,
        direcaoCopa = 0;

    // Construct com composição da fábrica abstrata
    public Application(FactoryAbstract factory) {
        // Criando o produto concreto e armazenando
        product = factory.createProductConcrete();
    }

    // Mostra o produto concreto para o cliente
    public void productUI() {
        // Define o tamanho da copa da árvore
        // O primeiro condição cria as copas e subcopas
        // O segundo a largura da copa - recomendável os números serem pares ou ímpares
        for (tamanhoCopa = 4; tamanhoCopa <= 8; tamanhoCopa++) {
            // Define a altura da copa de acordo com o eixoX
            for (eixoX = 1; eixoX < tamanhoCopa; eixoX++) {
                // Define o local da copa da árvore
                for (eixoY = direcaoX; eixoY > eixoX; eixoY--) {
                    // Gera os espaços do desenho da árvore
                    System.out.print(" ");
                }
                // Cria a copa da árvore e define o local da copa da árvore
                for (eixoY = 0; eixoY < eixoX + direcaoCopa; eixoY++) {
                    System.out.print("❇️ ");
                }
                // Quebra de linha
                System.out.println(" ");
            }
            // Direção da árvore no eixo X
            direcaoX--;
            // Largura da copa
            direcaoCopa++;
        }

        // Cria o tronco da árvore
        // O primeiro comando - estabiliza o tamanho do tronco
        // O segundo comando - a lagura do tronco
        for (eixoX = 1; eixoX < 8; eixoX++) {
            // Direção do tronco no eixo X
            for (eixoY = direcaoX + 1; eixoY > 0; eixoY--) {
                System.out.print(" ");
            }
            // Largura do tronco no eixo X
            for (eixoY = 0; eixoY < 4; eixoY++) {
                System.out.print("🪵");
            }
            // Quebra de linha
            System.out.println(" ");
        }
    }
}
