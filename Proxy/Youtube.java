// Classe que carrega os dados do objeto
class Youtube implements YoutubeVideo {
    // Objeto desejado pelo usuário
    private String video;
    
    // Construtor carregando o vídeo
    public Youtube(String video){
        this.video = video;
        carregarVideo();
    }

    // Método que confirmar a ação
    public void carregarVideo(){
        System.out.println("Carregando vídeo: " + video);
    }
    
    // Sobrescreve o método assistir após aprovação pelo proxy
    @Override
    public void assistir(){
        System.out.println("Assistindo: " + video);
    }
}