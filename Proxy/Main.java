public class Main {
    public static void main(String[] args) {
        // Chamando a classe com o vídeo e proxy para acessar o vídeo
        YoutubeVideo meuVideo = new ProxyVideo("Primeiro vídeo do canal!");
        
        // Solicitando exibição
        meuVideo.assistir();
    }
}